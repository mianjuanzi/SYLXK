package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBManager;


//实现用户对象的每一个业务逻辑处理操作
public class UserDao {
	
	public boolean checkLogin(String id,String password)
	{
		boolean ret=false;
		
		DBManager db=new DBManager();
		String sql="select * from admin where id='"+id+"'" ;
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

}
