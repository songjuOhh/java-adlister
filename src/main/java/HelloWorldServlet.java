import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// User goes to https://localhost:8080/hello in the brower and sees "Hello World"

@WebServlet("/hello") // If you are using this path, you have to do this:
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)  throws IOException {

        String name = req.getParameter("name");

        if (name == null){
            res.getWriter().println("Hello, World");
        }else{
            res.getWriter().println("Hello," + name );
        }



//        PrintWriter out = res.getWriter();
//        out.println("<h1 style='color:red'>Hello World</h1><br><h2>This is a smaller heading</h2><br><a href='/login'>LoginPage</a><script>alert('hello!')</script>");
    }
}



