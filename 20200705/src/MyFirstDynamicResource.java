import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/5 9:33
 */

public class MyFirstDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //1. 通过query string,取到 wd 这个 name所对应的 value
        String wd = req.getParameter("wd");

        //2. 返回的 Context-type 是 test/html; 字符集编码是 utf-8
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1>我是/s资源</h1>");
        writer.println("<p>用户要查找的关键字是：" + wd + "</p>");
    }
}
