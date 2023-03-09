import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", value = "/count")
public class CounterServlet extends HttpServlet {
    public static int count;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String reset = request.getParameter("reset");
        if(reset != null){
            count = 0;
        }else{
            count++;
        }
        response.getWriter().println(count);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
