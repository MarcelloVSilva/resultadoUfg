package resultadomvc;
public class ResultadoModel {
  
  public static String resultadoFinal(float frequencia, float nota) {
    if (frequencia<75 && nota<6.0){
      return "Reprovado por frequencia e nota";
    }else if (frequencia>=75 && nota<6.0){
      return "Reprovado por nota";
    }else if (frequencia<75 && nota>=6.0){
      return "Reprovado por frequencia";
    }else return "Aprovado";
  }
}

