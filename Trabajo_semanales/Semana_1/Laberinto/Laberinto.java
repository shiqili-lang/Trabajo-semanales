package Semana_1.Laberinto;

public class Laberinto {

    public static char[][] laberinto = {
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            { '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            { '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#' },
            { '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', 'S', ' ', '#', ' ', '#' },
            { '#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#' },
            { '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#' },
            { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
 
    };
    
    public static int [] incx = {0,-1,0,1};
    public static int [] incy = {-1,0,1,0};

    public static void mostrar(){
        for(int i =0; i< laberinto.length; i++){
            for(int j=0; j<laberinto.length; j++){
                System.out.print(laberinto[i][j]+ " ");

            }System.out.println();
        }
    }
    public static boolean buscar(int x, int y){
        for(int i=0; i< 4; i++){
            int nx= x+ incx[i];
            int ny= y+ incy[i];
            if(laberinto[nx][ny]== 'S'){
            return true;
        }
            if(laberinto[nx][ny]== ' '){
                laberinto[nx][ny]= 'X';
                if(buscar(nx, ny)){
                    laberinto[nx][ny]= '*';
                    return true;
                }
            }
        }
        return false;
    }
}
