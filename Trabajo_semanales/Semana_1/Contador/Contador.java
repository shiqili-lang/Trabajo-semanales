package Semana_1.Contador;

public class Contador {

    // Función recursiva que cuenta cuántas veces aparece 'digito' en 'numero'
  public static int contarDigito(int numero, int digito) {
        if (numero == 0) {
            return 0;
        }

        int ultimo = numero % 10; // obtener último dígito para compara al dígito buscado
        int cuenta = 0;

        if (ultimo == digito) {
            cuenta = 1; // si coincide, sumamos 1
        }

        return cuenta + contarDigito(numero / 10, digito); 
    }

}

