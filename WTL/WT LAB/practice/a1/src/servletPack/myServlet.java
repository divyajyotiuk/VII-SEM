package servletPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            /* TODO output your page here. You may use following sample code. */
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet CalculateTax</title>");            
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h1>Servlet CalculateTax at " + request.getContextPath() + "</h1>");
	           double income=Double.parseDouble(request.getParameter("income"));
	           String username=request.getParameter("username");
	           double tax=0;
	           if(income<=250000)
	           {
	               tax=0;
	           }
	           else if(income>250000 && income<=500000)
	           {
	               tax=income*0.10;
	           }
	           else
	           {
	               tax=income*0.20;
	           }
	           out.println("<h1>Name: "+username+"</h1>");
	           out.println("<h1>Income: "+income+"</h1>");
	           out.println("<h1>Tax: "+tax+"</h1>");
	           out.println("<h1>Total: "+(tax+income)+"</h1>");
	            out.println("</body>");
	            out.println("</html>");
	        }
	    }

	    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	    /**
	     * Handles the HTTP <code>GET</code> method.
	     *
	     * @param request servlet request
	     * @param response servlet response
	     * @throws ServletException if a servlet-specific error occurs
	     * @throws IOException if an I/O error occurs
	     */
	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	       // processRequest(request, response);
	    }

	    /**
	     * Handles the HTTP <code>POST</code> method.
	     *
	     * @param request servlet request
	     * @param response servlet response
	     * @throws ServletException if a servlet-specific error occurs
	     * @throws IOException if an I/O error occurs
	     */
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	       // processRequest(request, response);
	    	// response.setContentType("text/html;charset=UTF-8");
		        try (PrintWriter out = response.getWriter()) {
		           
		           double income=Double.parseDouble(request.getParameter("income"));
		           String username=request.getParameter("username");
		           double tax=0;
		           if(income<=250000)
		           {
		               tax=0;
		           }
		           else if(income>250000 && income<=500000)
		           {
		               tax=income*0.10;
		           }
		           else
		           {
		               tax=income*0.20;
		           }
//		          
		           out.println("Name: "+username);
		           out.println("Income: "+income);
		           out.println("Tax: "+tax);
		           out.println("Total: "+(tax+income));
		        }
	    }


}
