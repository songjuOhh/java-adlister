import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", value = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("pizza-order.jsp").forward(request,response); //get response
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println(  request.getParameter("crust"));
        System.out.println(  request.getParameter("sauce"));
        System.out.println( request.getParameter("size"));
        String[] toppings = request.getParameterValues("toppings");
        for (String topping : toppings) {
            System.out.print(topping);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println( request.getParameter("address"));

    }

}
