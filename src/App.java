import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Scanner retornar = new Scanner(System.in);
        String yn;
        int opcao = 0;
        int a;
        int b;
        int result;
        System.out.println("Seja bem-vindo a sua calculadora multifuncional!!");
        System.out.println("Selecione a função desejada");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        opcao = valor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Insira o primeiro número da soma");
                a = numero.nextInt();
                System.out.println("Insira o segundo número da soma");
                b = numero.nextInt();
                result = a + b;
                System.out.println("O resultado da sua operação é: " + result);
                break;
            case 2:
                System.out.println("Insira o primeiro número da subtração");
                a = numero.nextInt();
                System.out.println("Insira o segundo número da subtração");
                b = numero.nextInt();
                result = a - b;
                System.out.println("O resultado da sua operação é: " + result);
                break;
            case 3:
                System.out.println("Insira o primeiro número da multiplicação");
                a = numero.nextInt();
                System.out.println("Insira o segundo número da multiplicação");
                b = numero.nextInt();
                result = a * b;
                System.out.println("O resultado da sua operação é: " + result);
                break;
            case 4:
                System.out.println("Insira o primeiro número da divisão");
                a = numero.nextInt();
                System.out.println("Insira o segundo número da divisão");
                b = numero.nextInt();
                result = a / b;
                System.out.println("O resultado da sua operação é: " + result);
                break;
            default:
                System.out.println("Operação não encontrada!");
                break;
        }
    }
}
