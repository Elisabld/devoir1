 package ca.etsmtl.gti525.devoir1;

 import java.io.* ;
 import java.text.* ;
 import java.util.* ;
 import javax.servlet.* ;
 import javax.servlet.http.* ;

 public Web  extends HttpServlet {

	 public  void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException  {
	
     Image image = (Image)request.getAttribute("image");

	}

	 public  void doPost(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException  {
	
		doGet(request, response) ;
	}
}

