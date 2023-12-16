package reservaasientos;

import java.util.Scanner;

public class ReservaAsientos {
    
    
    public static void main(String[] args) {
        
        int M = 10, N = 10, fila = 0, asiento = 0;
        char asientos[][] = new char[M][N];
        boolean salir = false;
        String respuestaSalir, respuestaLugar;
        Scanner teclado = new Scanner(System.in);
        
        for(int f = 0; f < M; f++){
            for(int c = 0; c < N; c++){
                asientos[f][c] = 'L';
            }
        }
        
        System.out.println("BIENVENIDO AL SISTEMA");
        
        while(!salir){
            
            System.out.println("Desea ver asientos disponibles? si/no");
            respuestaLugar = teclado.next();
            if(respuestaLugar.equalsIgnoreCase("si"))
                dibujarMapaAsientos(asientos);
            
            
            System.out.println("Ingrese fila y asiento a reservar");

            boolean filaValida = false;
            while(!filaValida){
                System.out.print("Fila(entre 0 y 9): ");
                fila = teclado.nextInt();
                if(fila >= 0 && fila <= 9)
                    filaValida = true;
            }
            
            boolean columnaValida = false;
            while(!columnaValida){
                System.out.print("Asiento(entre 0 y 9): ");
                asiento = teclado.nextInt();
                if(asiento >= 0 && asiento <= 9)
                    columnaValida = true;
            }
            
            if(asientos[fila][asiento] == 'L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            }else 
                System.out.println("El asiento esta ocupado. Por favor elija otro");
            
            System.out.println("Desea finalizar la reserva? si/no");
            respuestaSalir = teclado.next();
            if(respuestaSalir.equalsIgnoreCase("si"))
                salir = true;
            
        }
        
    }
    
    static void dibujarMapaAsientos(char asientos[][]){
        for(int f = 0; f < 10; f++){
            System.out.print(f + " ");
            for(int c = 0; c < 10; c++){
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
            
    }
    
}
