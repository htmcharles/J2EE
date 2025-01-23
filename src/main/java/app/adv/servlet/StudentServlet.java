package app.adv.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String course = request.getParameter("course");
        String email = request.getParameter("email");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display the student details
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Student Details</title></head>");
        out.println("<body>");
        out.println("<h1>Student Details</h1>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Course:</strong> " + course + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
