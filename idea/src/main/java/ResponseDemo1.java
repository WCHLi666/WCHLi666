import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class ResponseDemo1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("5秒以后页面跳转！");
        response.setHeader("Refresh", "5;url=/com.dreamtank.idea/JDBCUtils");
    }
}
