package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int secNumero = scanner.nextInt();

        scanner.close();

        limparTela();

        System.out.println("Você escolheu os números: " + primNumero + " e " + secNumero);

        if(primNumero == secNumero){
            System.out.println("Os números são iguais!");

        } else if (primNumero > secNumero){
            System.out.println("O número " + primNumero +" é maior!");

        } else {
            System.out.println("O numero " + secNumero + " é maior!");
        }
    }

    public static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
