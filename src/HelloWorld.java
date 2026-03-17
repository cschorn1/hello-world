import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Como gostaria de ser chamado: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", seja bem vindo!");

        System.out.println("Por favor, informe seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura =  scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite seu Estado Civil: ");
        String estCivil = scanner.nextLine();

        scanner.close();

        System.out.println(nome + ", essas são suas informações: ");
        System.out.println("Nome: " + nomeCompleto + ". Cpf: " + cpf + ". Idade: " + idade + " anos . Peso: " + peso + "kg. Altura: " + altura + "m. Estado Civil: " + estCivil + ".");



    }

}
