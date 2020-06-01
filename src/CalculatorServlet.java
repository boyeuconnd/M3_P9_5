import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat( request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        double discount_price = price*discount*0.01;
        double final_price = price - discount_price;
        PrintWriter writer = response.getWriter();
        writer.println("<html lang =\"en\">");
        writer.println("<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "</head>");
        writer.println(description +"<br> Price on list: "+price+"<br>");
        writer.println("Discount: "+discount_price+" $<br>");
        writer.println("Money to pay: "+final_price+" $");
        writer.println("</html>");
//        writer.println();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
