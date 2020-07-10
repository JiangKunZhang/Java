package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/10 17:34
 */
@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Set-Cookie","today=2020-07-09");

        resp.setContentType("text/plain; charset=utf-8");
        resp.getWriter().println("种下cookie: today=2020-07-09");
    }
}
