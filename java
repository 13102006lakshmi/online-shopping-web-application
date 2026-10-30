import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class OnlineShopServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        Map<String, Double> products = new LinkedHashMap<>();
        products.put("Notebook", 45.0);
        products.put("Pen", 10.0);
        products.put("Backpack", 650.0);
 
        out.println("<html><body>");
        out.println("<h3>Online Shop - Product List</h3>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Product</th><th>Price (Rs.)</th></tr>");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            out.println("<tr><td>" + entry.getKey() + "</td><td>"
                    + entry.getValue() + "</td></tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }
}
