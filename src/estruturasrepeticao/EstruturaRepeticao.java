package estruturasrepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Escolha um número(positivo): ");
        int num = sc.nextInt();

        while (num < 0) {
            System.out.println("Invalido. Por favor, digite um número positivo:");
            num = sc.nextInt();
        }

        System.out.println("Esta é a sequência crescente:\n");
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }

        System.out.println("\nEsta é a sequência decrescente:\n");
        for(int i = num; i >= 0; i--){
            System.out.println(i);
        }

        sc.close();


        if (nome.length() > 6) {
            System.out.println("\nSeu nome tem mais de 6 letras!\n");
            for (int i = 0; i < num; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println("\nSeu nome tem até 6 letras!\n");
            System.out.println(nome);
        }
    }
}
