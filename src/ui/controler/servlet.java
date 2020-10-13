package ui.controler;
import model.db.DatabaseStudent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet")
public class servlet extends HttpServlet {

    DatabaseStudent databaseStudent = new DatabaseStudent();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("db",databaseStudent.getStudents());

        RequestDispatcher view = request.getRequestDispatcher("studentInfoOverzicht.jsp");
        view.forward(request,response);
    }
}
