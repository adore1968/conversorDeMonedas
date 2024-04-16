public class ConvertirValor {
    public void obtenerValorConvertido(double valorApi, double valor, String monedaApi, String moneda) {
        double resultado = Math.round(valorApi * valor);
        System.out.println("El valor " + valor + " [" + monedaApi + "] corresponde al valor final de =>>> " + resultado + " [" + moneda + "]");
    }
}
