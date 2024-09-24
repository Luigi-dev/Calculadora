import java.util.Scanner;

//calculadora
public class Calculator {

    Scanner s = new Scanner(System.in);

    String operacao;


    public void defineOperacao() {
        System.out.println("Digite o numero corrspondente a operacao que voce deseja realizar: \n");
        System.out.println(" 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao \n");

        int numero = s.nextInt();

        switch(numero) {
            case 1:
                operacao = "Adicao";
                break;
            case 2:
                operacao = "Subtracao";
                break;
            case 3:
                operacao = "Multiplicacao";
                break;
            case 4:
                operacao = "Divisao";
                break;
        }

        System.out.println("Você selecionou: " + operacao +
                " digite 1 para confirmar ou 0 para escolher outra operacao \n");

        int confirma = s.nextInt();

        for(boolean valida = false; confirma != 0 && confirma != 1;) {
            System.out.println("A opcao que voce digitou nao e valida,"
                    + "por favor digite 0 ou 1.");
            confirma = s.nextInt();
            if(valida == true) {break;}
        }
        if(confirma == 0 || confirma == 1) {
            confirma(confirma, numero, operacao);
        }
    }

    private static double soma(double x, double y) {
        double resultado = x + y;
        return resultado;
    }

    private static double subtrai(double x, double y) {
        double resultado = x - y;
        return resultado;
    }

    private static double multiplica(double x, double y) {
        double resultado = x * y;
        return resultado;
    }

    private static double divide(double x, double y) {
        double resultado = x / y;
        return resultado;
    }

    private void confirma(int confirma, int numero, String operacao) {

        if (confirma == 1) {

            System.out.println("Digite o primero numero para realizar a " +
                    operacao);
            double x = s.nextDouble();
            System.out.println("Digite o segundo numero para realizar a " +
                    operacao);
            double y = s.nextDouble();


            switch(numero) {

                case 1:
                    System.out.println(soma(x,y));
                    break;

                case 2:
                    System.out.println(subtrai(x,y));
                    break;

                case 3:
                    System.out.println(multiplica(x,y));
                    break;

                case 4:
                    System.out.println(divide(x,y));
                    break;
            }

        }
        else if (confirma == 0) {
            defineOperacao();}
    }


}


