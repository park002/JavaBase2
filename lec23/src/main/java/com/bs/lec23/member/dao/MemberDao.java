package com.bs.lec23.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.bs.lec23.member.Member;

@Repository
public class MemberDao implements IMemberDao {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/springtest";
	private String userid = "root";
	private String userpw = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	@Override
	public int memberInsert(Member member) { //커맨드 객체 사용중 A A A
		int result = 0;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
			String sql = "INSERT INTO member (memId, memPw, memMail) values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemId()); //AAA
			pstmt.setString(2, member.getMemPw());	
			pstmt.setString(3, member.getMemMail());
			result = pstmt.executeUpdate();
			System.out.println("result=>"+result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

	@Override
	public Member memberSelect(Member member) { //커맨드 객체 사용중 //id,pw A A 
		Member mem = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
			String sql = "SELECT * FROM member WHERE memId = ? AND memPw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPw());
			rs = pstmt.executeQuery();
			
			while (rs.next()) { //현재 레코드에 값이 있다면 true
				String memId = rs.getString("memid");
				String memPw = rs.getString("mempw");
				String memMail = rs.getString("memMail");
				int memPurcNum = rs.getInt("memPurcNum");
				
				mem = new Member(); // 새로운 Member()객체 참조 
				
				mem.setMemId(memId);
				mem.setMemPw(memPw);
				mem.setMemMail(memMail);
				mem.setMemPurcNum(memPurcNum);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return mem;
		
	}

	@Override
	public int memberUpdate(Member member) {
		
		int result = 0;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
			String sql = "UPDATE member SET memPw = ?, memMail = ? WHERE memId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemPw());
			pstmt.setString(2, member.getMemMail());
			pstmt.setString(3, member.getMemId());
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

	@Override
	public int memberDelete(Member member) {
		int result = 0;
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, userpw);
			String sql = "delete from member where memId=? AND memPw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPw());
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}

}