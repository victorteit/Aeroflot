package aeroflot.dbtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDatabaseConnection
 */
@WebServlet("/TestDatabaseConnection")
public class TestDatabaseConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= "root";
		String pass= "12345678";
		String jdbcurl = "jdbc:mysql://localhost:3306/aeroflot";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database" + jdbcurl);
	
			Class.forName(driver);
			
			Connection myConnection = DriverManager.getConnection(jdbcurl, user, pass);
			out.println("Connection is succesfull!");
			
			myConnection.close();
			
		} catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
		
	}

}
