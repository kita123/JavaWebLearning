package jp.itacademy.sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieCounterServlet
 */
@WebServlet("/cookieCounter")
public class CookieCounterServlet extends HttpServlet {
	private static final int SECONDS_PER_YEAR=365*24*60*60;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count=0;
		Cookie[]cookies=req.getCookies();
		if(cookies!=null){
			for(Cookie c:cookies){
				if(c.getName().equals("Count")){
					count=Integer.parseInt(c.getValue());
				}
			}	
		}
		
		++count;
		Cookie cookie=new Cookie("Count",String.valueOf(count));
		cookie.setMaxAge(SECONDS_PER_YEAR);
		res.addCookie(cookie);
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=utf-8'>");
		out.println("<p>Ç†Ç»ÇΩÇÃñKñ‚âÒêîÅF"+count+"âÒ</P>");
	}

		
		
		
		
			
	
	
	

  /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
