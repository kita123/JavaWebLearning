package jp.itacademy.samples.filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/filter/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		req.getRequestDispatcher("/WEB-INF/filter/login_form.jsp")
			.forward(req, res);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String account=req.getParameter("account");
		String pass=req.getParameter("pass");
		
		if(account !=null
			&& pass !=null
			&& account.trim().length() !=0
			&& account.equals(pass)){
			
			HttpSession session=req.getSession();
			session.setAttribute("account",account);
			req.getRequestDispatcher("/WEB-INF/filter/login_ok.jsp")
				.forward(req, res);
		}else{
			req.setAttribute("error",
					"アカウントまたはパスワードが正しくありません");
			req.getRequestDispatcher("/WEB-INF/filter/login_form.jsp")
				.forward(req, res);
				
			}
	
	}

}
