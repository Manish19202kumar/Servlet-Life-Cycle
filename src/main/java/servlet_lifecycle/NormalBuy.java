package servlet_lifecycle;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NormalBuy extends HttpServlet {
protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
	int shirtPrice=Integer.parseInt(getServletContext().getInitParameter("shirt"));
	int shoePrice=Integer.parseInt(getServletContext().getInitParameter("shoe"));
	int watchPrice=Integer.parseInt(getServletContext().getInitParameter("watch"));

int discount=Integer.parseInt(getServletConfig().getInitParameter("discount"));;
String product=req.getParameter("product");

resp.getWriter().print("<h1>you have selected: "+product+" </h1>");
resp.getWriter().print("<h1>Discount is: "+discount+" </h1>");

if(product.equalsIgnoreCase("shirt"))
{
	resp.getWriter().print("<h1>Acutal price is:"+shirtPrice+"</h1>");
	resp.getWriter().print("<h1>Total price is:"+(shirtPrice-discount)+"</h1>");

}

else if(product.equalsIgnoreCase("shoe"))
{
	resp.getWriter().print("<h1>Acutal price is:"+shoePrice + "</h1>");
	resp.getWriter().print("<h1>Total price is:"+(shoePrice-discount) + "</h1>");
}
else 
{
	resp.getWriter().print("<h1>Acutal price is:"+watchPrice + "</h1>");
	resp.getWriter().print("<h1>Total price is:"+(watchPrice-discount) + "</h1>");
}
}
}
