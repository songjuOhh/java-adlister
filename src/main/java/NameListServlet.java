import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "NameListServlet", value = "/names")
public class NameListServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> names = new ArrayList<>(Arrays.asList(
                "Songju",
                "Said",
                "Randy"
        ));
        request.setAttribute("names", names);

        //send a response based on the names.jsp
        request.getRequestDispatcher("/names.jsp").forward(request, response); // Fetching a file(/names.jsp) to a server
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
