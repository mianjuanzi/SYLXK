package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.Course;
import model.vo.Student;
import model.vo.Teacher;
import util.DBManager;


public class TeacherDAO {
	
	public boolean checkLogin(String id,String password)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="select * from teacher where tid='"+id+"'" ;
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
	public List<Teacher> queryTeacher() {
		List<Teacher> list = new ArrayList<Teacher>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from teacher";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Teacher tea = new Teacher();
				tea.setTid(rs.getString("tid"));
				tea.setName(rs.getString("name"));
				
				
				list.add(tea);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	public boolean insertTeacher(Teacher tea) {
		// TODO Auto-generated method stub
		boolean ret=false;
		DBManager db=new DBManager();
		String sql="insert into teacher (tid, pwd, name, sex, age, major, level, mail, qq, tel)";
		sql+="values(";
		sql+="'"+tea.getTid()+"',";
		sql+="'"+tea.getPwd()+"',";
		sql+="'"+tea.getName()+"',";
		sql+="'"+tea.getSex()+"',";
		sql+="'"+tea.getAge()+"',";
		sql+="'"+tea.getMajor()+"',";
		sql+="'"+tea.getLevel()+"',";
		sql+="'"+tea.getMail()+"',";
		sql+="'"+tea.getQq()+"',";
		sql+="'"+tea.getTel()+"'";
		
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
	public String seeknamebyid(String id)
	{
		Student stu=new Student();
		DBManager db=new DBManager();
		String sql="select * from teacher where tid='"+id+"'" ;
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
	public boolean change(String tid,String name,String mail,String qq,String tel)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="UPDATE `sylxk`.`teacher` SET `name` = '"+name+"', `mail` = '"+mail+"', `qq` = '"+qq+"', `tel` = '"+tel+"' WHERE `teacher`.`tid` = '"+tid+"';" ;
		
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
	
}
