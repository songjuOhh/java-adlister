import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingGameServlet", value = "/guess")
public class GuessingGameServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guessInput.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int number = Integer.parseInt(request.getParameter("guess"));
        int randomNum = (int) (Math.random()*3)+1;
        if (number == randomNum) {
            response.sendRedirect("/win");
        } else {
            response.sendRedirect("/loss");
        }
    }

}
