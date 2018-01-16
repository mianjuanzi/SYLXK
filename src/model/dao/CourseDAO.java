package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.vo.Course;
import model.vo.Student;
import util.DBManager;

public class CourseDAO {
	public List<Course> queryAll() {
		List<Course> list = new ArrayList<Course>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from course";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Course cou = new Course();
				cou.setCid(rs.getString("cid"));
				cou.setName(rs.getString("name"));
				cou.setTid(rs.getString("tid"));
				cou.setTime(rs.getString("time"));
				cou.setContent(rs.getString("content"));
				cou.setReq(rs.getString("req"));
				cou.setTest(rs.getString("test"));
				cou.setTag(rs.getString("tag"));
				
				list.add(cou);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	public List<Course> querybytid(String tid) {
		List<Course> list = new ArrayList<Course>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from course where tid='"+tid+"' and tag='已通过'";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Course cou = new Course();
				cou.setCid(rs.getString("cid"));
				cou.setName(rs.getString("name"));
				cou.setTid(rs.getString("tid"));
				cou.setTime(rs.getString("time"));
				cou.setContent(rs.getString("content"));
				cou.setReq(rs.getString("req"));
				cou.setTest(rs.getString("test"));
				cou.setTag(rs.getString("tag"));
				
				list.add(cou);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	public List<Course> querypass() {
		List<Course> list = new ArrayList<Course>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from course where tag='已通过'";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Course cou = new Course();
				cou.setCid(rs.getString("cid"));
				cou.setName(rs.getString("name"));
				cou.setTid(rs.getString("tid"));
				cou.setTime(rs.getString("time"));
				cou.setContent(rs.getString("content"));
				cou.setReq(rs.getString("req"));
				cou.setTest(rs.getString("test"));
				cou.setTag(rs.getString("tag"));
				
				list.add(cou);
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	public boolean pass(String cid)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="UPDATE `sylxk`.`course` SET `tag` = '已通过' WHERE `course`.`cid` = '"+cid+"'" ;
		
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
	public String seeknamebyid(String id)
	{
		DBManager db = new DBManager();
		String ret = null;
		String sql = "select * from course where cid='"+id+"'";
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			if(rs.next()) {
				
				
				ret= rs.getString("name");
			}
			rs.close();
			db.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	public boolean selectclass(String sid,String cid)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		
		String sql="INSERT INTO `sel` (`cid`, `sid`) VALUES ('"+cid+"', '"+sid+"');";
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
	public boolean insertCourse(Course cou){
		boolean ret=false;
		DBManager db=new DBManager();
		
		String sql="insert into course (`cid`, `name`, `tid`, `time`, `content`, `req`, `test`)";
		sql+="values(";
		sql+="'"+cou.getCid()+"',";
		sql+="'"+cou.getName()+"',";
		sql+="'"+cou.getTid()+"',";
		sql+="'"+cou.getTime()+"',";
		sql+="'"+cou.getContent()+"',";
		sql+="'"+cou.getReq()+"',";
		sql+="'"+cou.getTest()+"'";
		
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
	public boolean unpass(String cid)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="UPDATE `sylxk`.`course` SET `tag` = '未通过' WHERE `course`.`cid` = '"+cid+"'" ;
		
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
