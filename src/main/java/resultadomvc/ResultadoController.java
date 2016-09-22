package resultadomvc;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/resultado")
public class ResultadoController extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    //Preparação dos parâmetros.
    
    String nome = req.getParameter("nome");
    //float peso = pesoStr == null || pesoStr.isEmpty() ? 0 : Float.parseFloat(pesoStr);

    String frequenciaStr = req.getParameter("frequencia");
    float frequencia = frequenciaStr == null || frequenciaStr.isEmpty()? 0 : Float.parseFloat(frequenciaStr);

    String notaStr = req.getParameter("nota");
    float nota = notaStr == null || notaStr.isEmpty()? 0 : Float.parseFloat(notaStr);

    //Chamada ao Model.
    String resultado = ResultadoModel.resultadoFinal(frequencia, nota);

    //Passagem de atributos para o JSP.
    req.setAttribute("resultadoFinal", resultado);
    req.setAttribute("nome", nome);

    //Chamando o JSP.
    String nextJsp = "/index.jsp";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
    dispatcher.forward(req, resp);
  }
}
