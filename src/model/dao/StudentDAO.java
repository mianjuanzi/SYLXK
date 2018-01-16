package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

import model.vo.Student;

public class StudentDAO {
	public boolean checkLogin(String id,String password)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="select * from student where sid='"+id+"'" ;
		sql+=" and pwd='"+password+"'";
//		String sql="SELECT * FROM 'admin' WHERE id='123' and pwd='123'";
		System.out.println(sql);
		try {
			ResultSet rs=db.executeQuery(sql);
			if(rs.next())
				ret=true;
			else
				ret=false;
			rs.close();
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ret;
		
	}
	public boolean change(String sid,String name,String mail,String qq,String tel)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="UPDATE `student` SET `name` = '"+name+"', `mail` = '"+mail+"', `qq` = '"+qq+"', `tel` = '"+tel+"' WHERE `sid` = '"+sid+"';" ;
		
//		String sql="SELECT * FROM 'admin' WHERE id='123' and pwd='123'";
		System.out.println(sql);
		try {
			int rs=db.executeUpdate(sql);
			if(rs!=0)
				ret=true;
			else
				ret=false;
			
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ret;
		
	}
//	public List<Student> queryByGender(String gender) {
//		List<Student> list = new ArrayList<Student>();
//		/*
//		 * 
//		 */
//		DBManager db = new DBManager();
//		String sql = "select * from tstudent where gender='" + gender + "'";
//		ResultSet rs;
//		try {
//			rs = db.executeQuery(sql);
//			while (rs.next()) {
//				Student stu = new Student();
//				stu.setSno(rs.getString("sno"));
//				stu.setSname(rs.getString("sname"));
//				stu.setGender(rs.getString("gender"));
//				stu.setBirth(rs.getString("birth"));
//				stu.setScore(rs.getFloat("score"));
//				list.add(stu);
//			}
//			rs.close();
//			db.close();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return list;
//
//	}
//	
	public boolean insertStudent(Student stu){
		boolean ret=false;
		DBManager db=new DBManager();
		String sql="insert into student (sid,pwd,name,sex,major,stuclass,mail,qq,tel)";
		sql+="values(";
		sql+="'"+stu.getSid()+"',";
		sql+="'"+stu.getPwd()+"',";
		sql+="'"+stu.getName()+"',";
		sql+="'"+stu.getSex()+"',";
		sql+="'"+stu.getMajor()+"',";
		sql+="'"+stu.getStuclass()+"',";
		sql+="'"+stu.getMail()+"',";
		sql+="'"+stu.getQq()+"',";
		sql+="'"+stu.getTel()+"'";
		
		sql+=");";
		System.out.println(sql);
		
				
		try {
			db.executeUpdate(sql);
			db.close();
			ret=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
		
		
	}
	
	public boolean checkSnoExist(String sno){
		boolean ret=false;
		DBManager db = new DBManager();
		String sql = "select * from tstudent where sno='" + sno + "'";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			if(rs.next())
				ret=true;
			rs.close();
			db.close();
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return ret;
	}
	public String seeknamebyid(String id)
	{
		Student stu=new Student();
		DBManager db=new DBManager();
		String sql="select * from student where sid='"+id+"'" ;
		System.out.println(sql);
		try {
			ResultSet rs=db.executeQuery(sql);
			if(rs.next())
			{
				return  rs.getString("name");
				
			}
				
			rs.close();
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "";
	}
	


}
