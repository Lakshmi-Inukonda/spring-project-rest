/**
 * 
 */
package com.tcs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.PreparedStatement;
import com.tcs.bean.Student;
import com.tcs.constant.SQLConstants;
import com.tcs.utils.DBUtils;

/**
 * @author VENKY_HARI
 *
 */

@Repository
@Component
public class StudentDAOImpl implements StudentDAOInterface{
	
	@Override
	public Student getstudentRegNo(Long studentRegNo) throws StudentNotRegisteredException {
		Connection conn = DBUtils.getConnection();
		PreparedStatement stmnt = null;
		int studentId = 0;
		try {
			stmnt = conn.prepareStatement(SQLConstants.GET_STUDENT_REG_NO);
			stmnt.setInt(1, 101);
			ResultSet rs = stmnt.executeQuery();
			String role = "";
			if (rs.next()) {
				role = rs.getString(1);
			}

			stmnt = conn.prepareStatement(SQLConstants.ADD_STUDENT);
			stmnt.setString(1, student.getstudentRegNo());
			stmnt.setString(2, student.getPassword());
			stmnt.setString(3, role);

			int rows = stmnt.executeUpdate();
			if (rows == 1) {

				PreparedStatement stmntStud = conn.prepareStatement(SQLConstants.ADD_STUDENT,
						Statement.RETURN_GENERATED_KEYS);

				stmntStud.setString(1, student.getName());
				stmntStud.setString(2, student.getEmailId());
				stmntStud.setString(3, student.getBranchName());
				stmntStud.setString(4, student.getAddress());
				stmntStud.setBoolean(5, false);
				stmntStud.setInt(6, 3);
				stmntStud.executeUpdate();
				ResultSet results = stmntStud.getGeneratedKeys();
				if (results.next())
					studentId = results.getInt(1);
			}

		} catch (SQLException ex) {
			logger.error(ex.getMessage());
			throw new StudentNotRegisteredException(student.getName());
		}
        
        
		return studentId;
	}

	// Dummy database. Initialize with some dummy values.
	private static List<Student> Students;
	{
		Students = new ArrayList<Student>();
		Students.add(new Student(101, "John", 1, "CSE"));
		Students.add(new Student(201, "Russ", 3, "ECE"));
		Students.add(new Student(301, "Kate", 1, "MECH"));
		Students.add(new Student(401, "Viral", 5, "CSE"));
	}
	
	@Override
	public List list() {
		return Students;
	}
	
	//@Override
//	public Student getstudentRegNo(Long studentRegNo) {
//	
//		for (Student c : Students) {
//			if (c.getStudentRegNo()==studentRegNo) {
//				return c;
//			}
//		}
//		return null;
//	}

	@Override
	public Student create(Student Student) {
		// TODO Auto-generated method stub
		Student.setStudentRegNo(System.currentTimeMillis());
		Students.add(Student);
		return Student;
	}

	@Override
	public Long delete(Long studentRegNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Long studentRegNo, Student Student) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void insert(Student Student) {
		// TODO Auto-generated method stub
		
	}
}
