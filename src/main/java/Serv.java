import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Serv extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer=resp.getWriter();

        writer.println("<HTML>");
        writer.println("<HEAD>");
        writer.println(" <title>Car srvice</title>");
        writer.println("</HEAD>");
        writer.println("<body>");
        writer.println("<h5><p>style One</p></h5>");
        writer.println("</body>");
        writer.println("</HTML>");



    }
}
