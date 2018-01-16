package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	//˽�г�Ա�����Ķ���
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement stm=null;
	private ResultSet rs=null;
	
	// ���췽����ʵ�ּ���jdbc�����࣬���������ݿ������
	public DBManager() {
		// 1.����jdbc������
		String className = "com.mysql.jdbc.Driver"; // �������������·��
		try {
			Class.forName(className);
			// 2.���������ݿ������
			String conUrl = "jdbc:mysql://localhost:3306/sylxk"
					+ "?useUnicode=true&characterEncoding=utf-8";
			String dbUser = "root";
			String dbPassword = "";
			con = DriverManager
					.getConnection(conUrl, dbUser, dbPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
	
	public ResultSet executeQuery(String sql) throws SQLException{
		stm=con.createStatement();
		rs=stm.executeQuery(sql);
		return rs;
	}
	
	//ʵ�ֲ�ѯ���sql����ִ�й���
	/*
	public ResultSet executeQuery(String sql,String params[]) throws SQLException{
		ps = con.prepareStatement(sql);
		// ִ�����ǰ����Բ������и�ֵ,�����±��1��ʼ
		for(int i=1;i<params.length+1;i++){
			ps.setString(i, params[i-1]);	
		}
		
		  //ִ����䣬 ����ǲ�ѯ���,�����executeQuery����������resultset���� ����Ƿǲ�ѯ�����ӡ��޸ġ�ɾ���ȣ���䣬
		 //�����executeUpdate����������һ������
		 
		rs = ps.executeQuery();
		return rs;
	}
*/
	
	/*
	//ʵ�ַǲ�ѯ���sql����ִ�й���
	public int executeUpdate(String sql, String params[]) throws SQLException {
		ps = con.prepareStatement(sql);
		// ִ�����ǰ����Բ������и�ֵ,�����±��1��ʼ
		for (int i = 1; i < params.length + 1; i++) {
			ps.setString(i, params[i - 1]);
		}
		/*
		 * ִ����䣬 ����ǲ�ѯ���,�����executeQuery����������resultset���� ����Ƿǲ�ѯ�����ӡ��޸ġ�ɾ���ȣ���䣬
		 * �����executeUpdate����������һ������
		 
		int count = ps.executeUpdate();
		return count;
	}
*/
	
	public int executeUpdate(String sql) throws SQLException{
		stm=con.createStatement();
		int count = stm.executeUpdate(sql);
		return count;
	}
	
	//��Դ���ͷ�
	public void close() throws SQLException{
		if (rs != null)
			rs.close();
		/*
		if (ps != null)
			ps.close();
		*/
		if (stm != null)
			stm.close();
		if (con != null)
			con.close();
	}

}
