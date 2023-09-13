import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio, numeroDigitado, tentativas=0;
        numeroAleatorio= new Random().nextInt(100);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Adivinhe o numero: ");
            numeroDigitado = scanner.nextInt();
            tentativas++;

            if(numeroDigitado<numeroAleatorio){
                System.out.println("O número digitado é menor que o número aleatório");
            } else if (numeroDigitado>numeroAleatorio) {
                System.out.println("O número digitado é maior que o número aleatório");
            }else{
                System.out.println("Você acertou com " + tentativas+"!!");
                break;
            }
        }

    }
}