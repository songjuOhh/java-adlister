package controllers;

import dao.Ads;
import dao.DaoFactory;
import model.Ad;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.ListAdsServlet", value = "/ads")
public class ListAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> ads = adsDao.all();
        System.out.println(ads.get(0).getDescription());

        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
