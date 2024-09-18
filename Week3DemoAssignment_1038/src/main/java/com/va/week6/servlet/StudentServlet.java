package com.va.week6.servlet;

import java.io.IOException;

import com.va.week6.dao.StudentDao;
import com.va.week6.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class StudentServlet
 */
//WebServlet("/StudentServlet")
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private com.va.week6.dao.StudentDao stDao;
	public void init() {
		stDao = new StudentDao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String grade = request.getParameter("grade");

		Student st = new Student();
		// initializes the values to the user!! 
		st.setFirstname(firstName);
		st.setLastname(lastName);
		st.setGrade(grade);
		

		try {
			stDao.registerStudent(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("StudentInfo.jsp");
	}

}
