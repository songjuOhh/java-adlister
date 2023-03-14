package lecture;

import dao.DaoFactory;
import dao.Products;
import models.Product2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductsServlet", value = "/products")
public class ProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Products productsDao = DaoFactory.getProductsDao();
        List<Product2> product2s = productsDao.all();

        request.setAttribute("products", product2s);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        Product2 product2 = new Product2(name, price);

//        List<Product> products = Product.getProducts();
//        //creating variable reference so below can be more simplified

////        Product.getProducts().add(product);
//        products.add(product);
        Products productsDao = DaoFactory.getProductsDao();
        productsDao.insert(product2);
        List<Product2> products = productsDao.all();



        request.setAttribute("products", products);
        request.getRequestDispatcher("/products2.jsp").forward(request, response);
    }
}
