package jp.itacademy.sample.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowParametersServlet
 */
@WebServlet("/showParameters")
public class ShowParametersServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowParametersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	req.setCharacterEncoding("utf-8");
	res.setContentType("text/html;charset=utf-8");
	PrintWriter out=res.getWriter();
	out.println("<!DOCTYPE html>");
	out.println("<meta charset=\"utf-8\">");
	out.println("<title>show parameters</title>");
	out.println("<ul>");
	out.println("<li>name=" + req.getParameter("name")+"</li>");
	out.println("<li>pass=" + req.getParameter("pass")+"</li>");
	out.println("<li>plan=" + req.getParameter("plan")+"</li>");
	out.println("<li>like=" +
			Arrays.toString(req.getParameterValues("like"))+"</li>");
	out.println("<li>=payment" + req.getParameter("payment")+"</li>");
	out.println("<li>=comment" + req.getParameter("comment")+"</li>");
	out.println("<li>=token" + req.getParameter("token")+"</li>");
	out.println("</ul>");
	}
	
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(req,res);
	}

}
