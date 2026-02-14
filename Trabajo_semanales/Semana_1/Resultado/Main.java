package Semana_1.Resultado;
import Semana_1.Contador.Contador;

public class Main {
    public static void main(String[] args) {
        int numero = 122312321;
        int digito = 2;
        System.out.println("El dígito " + digito + " aparece " + Contador.contarDigito(numero, digito) + " veces.");
    }
}
