import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();
            if (escolha == 5) {
                System.out.println("Obrigado por usar o programa. Até a próxima!");
                break;
            }
            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado;
            switch (escolha) {
                case 1:
                    resultado = adicionar(num1, num2);
                    System.out.println("Resultado da Adição: " + resultado);
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    System.out.println("Resultado da Subtração: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado da Multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                        System.out.println("Resultado da Divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
            System.out.print("Deseja realizar outra operação? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                System.out.println("Obrigado por usar o programa. Até a próxima!");
                break;
            }
        } while (true);
        scanner.close();
    }
    public static void exibirMenu() {
        System.out.println("Escolha uma operação:");
        System.out.println("1 – Adição");
        System.out.println("2 – Subtração");
        System.out.println("3 – Multiplicação");
        System.out.println("4 – Divisão");
        System.out.println("5 – Sair");
        System.out.print("Informe a opção (1/2/3/4/5): ");
    }
    public static double adicionar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}


