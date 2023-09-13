public class Main {
    public static void main(String[] args) {

        double temperaturaCelsius = 32.7;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("Celsius: %.2fº\nFahreinheit: %.2fº", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);
        int resultado = (int) temperaturaFahrenheit;
        System.out.println("Fahrenheit em inteiro: " + resultado);
    }
}