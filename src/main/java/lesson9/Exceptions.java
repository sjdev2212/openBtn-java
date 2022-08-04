package lesson9;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println( dividirPorCero(4,0));
    }
    public static int dividirPorCero (int a ,int b) throws ArithmeticException {
   int resultado = a / b ;
   if (resultado == 0) {
       System.out.println("No se puede dividir por cero");
       throw new ArithmeticException();
   }
   else {
       return resultado;
   }
    }

}
