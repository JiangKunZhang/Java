import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/5 10:39
 */
public class HelloResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target = req.getParameter("target");


        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<p>Hello " + target + "</p>");    }
}
