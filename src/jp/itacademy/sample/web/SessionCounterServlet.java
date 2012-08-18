package jp.itacademy.sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCounterServlet
 */
@WebServlet("/sessionCounter")
public class SessionCounterServlet extends HttpServlet {
	private static final String COUNTER_KEY = "SESSION_COUNTER";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionCounterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		Integer count = (Integer) session.getAttribute(COUNTER_KEY);
		if (count == null) {
			count = 1;
		} else {
			count += 1;
		}
		session.setAttribute(COUNTER_KEY, count);

		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.print("<meta  charset=\"utf-8\">");
		out.print("<p>ñKñ‚âÒêîÅF" + count + "âÒ</p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
