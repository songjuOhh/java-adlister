import lecture.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "PersonIndexServlet", value = "/people")
public class PersonIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Person p1 = new Person("Songju Oh", 28);
        Person p2 = new Person("Cavin Ngoc", 29);
        Person p3 = new Person("Minsun Jung", 20);

        List<Object> people = new ArrayList<>(Arrays.asList(
                p1,p2,p3
        ));
        request.setAttribute("people", people);
        request.getRequestDispatcher("/people.jsp").forward(request, response); // Fetching a file(/names.jsp) to a server

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
