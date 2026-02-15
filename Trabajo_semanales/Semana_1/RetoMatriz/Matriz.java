package Semana_1.RetoMatriz;

public class Matriz {
    int [][] m = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    

    public static void recorrerMatriz(int [][] m, int i, int j){

        if(i!=m.length-1 | j!=m[i].length-1){ //la i tiene que ser distinto de la longitud i // j diferente de la columna i // menos 1 poeque va del o al 2
            if(j==m[1].length-1){
                i++;//salta a la siguiente linia
                j=0;
                System.out.println("");
            }else{
                j++;
            }

            recorrerMatriz(m, i, j);
                                    

        }
        System.out.println(m[i][j]+" ");


        recorrerMatriz(m,0,0);
    }
    
     
    
}
