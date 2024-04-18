public class Calculadora {

  public static void main(String args[]) {

       Double numero1 = Double.parseDouble(args[0]);
       String operacao = args[1];
       Double numero2 = Double.parseDouble(args[2]);

       if (operacao.equals("+")) {
         System.out.println(numero1 + numero2);

       } else if(operacao.equals("-")) {
         System.out.println(numero1 - numero2);

       
      } else if(operacao.equals("x")) {
         System.out.println(numero1 - numero2);

       
      } else if(operacao.equals("/")) {
         System.out.println(numero1 - numero2);

       
      }else{
      System.out.println("Operação inválida");
       }

   }

}