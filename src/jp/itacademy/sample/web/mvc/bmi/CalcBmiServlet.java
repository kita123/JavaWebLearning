package jp.itacademy.sample.web.mvc.bmi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcBmiServlet
 */
@WebServlet("/mvc/calcBmi")
public class CalcBmiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcBmiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double weight;
		double height;
		try{
			weight=Double.parseDouble(req.getParameter("weight"));
			height=Double.parseDouble(req.getParameter("height"));
		}catch(Exception e){
			req.setAttribute("error","ÉpÉâÉÅÅ[É^Ç™ê≥ÇµÇ≠Ç†ÇËÇ‹ÇπÇÒ");
			req.getRequestDispatcher("/WEB-INF/mvc/bmi/error.jsp")
				.forward(req, res);
			return;
		}
		
		Person person=new Person(height,weight);
		req.setAttribute("person", person);
		
		req.getRequestDispatcher("/WEB-INF/mvc/bmi/result.jsp")
			.forward(req, res);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
