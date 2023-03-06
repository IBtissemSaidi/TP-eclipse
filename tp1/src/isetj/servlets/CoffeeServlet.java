package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoffeeServlet
 */
@WebServlet("/CoffeeServlet")
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoffeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typeremarque = request.getParameter(".....");
		String texteremarque = request.getParameter("....");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Star bucks coffee</title></head>");
		out.println("<body><img src='coffe-2.jpg'  border='0' height='200' width='200'>");
		out.println("<p>Merci de nous avoir fait parvenir la remarque suivante concernant");
		out.println("<b>"+typeremarque+"<b>");
		out.println("<p>"+texteremarque);
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
