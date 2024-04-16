import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        ConvertirValor conversor = new ConvertirValor();
        ConsultaApi consulta = new ConsultaApi();
        while (opcion != 7) {
            System.out.println("""
                    **************************************************
                    Sea bienvenido/a al Conversor de Monedas =] \n
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir 
                    Elija una opcion valida: \n
                    **************************************************
                    """);
            opcion = lectura.nextInt();
            if (opcion != 7) {
                System.out.println("Ingrese el valor que deseas convertir: ");
                int valor = lectura.nextInt();
                if (opcion == 1) {
                    double valorApi = consulta.obtenerMoneda("USD").conversion_rates().ARS;
                    conversor.obtenerValorConvertido(valorApi, valor, "USD", "ARS");
                } else if (opcion == 2) {
                    double valorApi = consulta.obtenerMoneda("ARS").conversion_rates().USD;
                    conversor.obtenerValorConvertido(valorApi, valor, "ARS", "USD");
                } else if (opcion == 3) {
                    double valorApi = consulta.obtenerMoneda("USD").conversion_rates().BRL;
                    conversor.obtenerValorConvertido(valorApi, valor, "USD", "BRL");
                } else if (opcion == 4) {
                    double valorApi = consulta.obtenerMoneda("BRL").conversion_rates().USD;
                    conversor.obtenerValorConvertido(valorApi, valor, "BRL", "USD");
                } else if (opcion == 5) {
                    double valorApi = consulta.obtenerMoneda("USD").conversion_rates().COP;
                    conversor.obtenerValorConvertido(valorApi, valor, "USD", "COP");
                } else {
                    double valorApi = consulta.obtenerMoneda("COP").conversion_rates().USD;
                    conversor.obtenerValorConvertido(valorApi, valor, "COP", "USD");
                }
            }
        }
    }
}
