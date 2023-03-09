import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LectureServlet", value = "/lecture")
public class LectureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String world = request.getParameter("hello");
        System.out.println(world);
        response.getWriter().println("<h1>Hello, Zenith!</h1>");



//        PrintWriter out = res.getWriter();
//        out.println("<h1 style='color:red'>Hello World</h1><br><h2>This is a smaller heading</h2><br><a href='/login'>LoginPage</a><script>alert('hello!')</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
