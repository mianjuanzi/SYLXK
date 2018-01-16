package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.Course;
import model.vo.Select;
import util.DBManager;

public class SelectDAO {
	public List<Select> queryAll() {
		List<Select> list = new ArrayList<Select>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from sel";
		CourseDAO dao1=new CourseDAO();
		StudentDAO dao2=new StudentDAO();
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Select cou = new Select();
				cou.setCid(rs.getString("cid"));
				String c=dao1.seeknamebyid(cou.getCid());
				cou.setCname(c);
				
				
				cou.setSid(rs.getString("sid"));
				c=dao2.seeknamebyid(rs.getString("sid"));
				cou.setSname(c);
				
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
	public List<Select> querybycid(String cid) {
		List<Select> list = new ArrayList<Select>();
		/*
		 * 
		 */
		DBManager db = new DBManager();
		String sql = "select * from sel where cid='"+cid+"'";
		CourseDAO dao1=new CourseDAO();
		StudentDAO dao2=new StudentDAO();
		ResultSet rs;
		try {
			rs = db.executeQuery(sql);
			while (rs.next()) {
				Select cou = new Select();
				cou.setCid(rs.getString("cid"));
				String c=dao1.seeknamebyid(cou.getCid());
				cou.setCname(c);
				
				
				cou.setSid(rs.getString("sid"));
				c=dao2.seeknamebyid(rs.getString("sid"));
				cou.setSname(c);
				
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
}
