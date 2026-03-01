package Smenana_3;
import java.util.Random;

public class Alagoritmo {
     public static long ordenar(int[] ord) {
        long comparaciones = 0;
        int n = ord.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (ord[j] > ord[j + 1]) {
                    int temp = ord[j];
                    ord[j] = ord[j + 1];
                    ord[j + 1] = temp;
                }
            }
        }
        return comparaciones;
    }
    
}
class Seleccion {

        public static long ordenar(int[] ord) {
            long comparaciones = 0;
            int n = ord.length;
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    comparaciones++;
                    if (ord[j] < ord[min]) {
                        min = j;
                    }
                }
                int temp = ord[min];
                ord[min] = ord[i];
                ord[i] = temp;
            }
            return comparaciones;
        }
    }
   

