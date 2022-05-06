/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import java.util.Scanner;
/**
 *
 * @author Fernando Suares
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Digite:");
        System.out.println("A posicao do robo em X/Y");
        System.out.println("O limite do mapa X/Y");
        System.out.println("(Separados por espaços)");
        Robot rbt = new Robot(scan.nextInt(), scan.nextInt(), scan.nextInt(), 
                              scan.nextInt(), "N");*/
        
        Robot rbt = new Robot("N");
        System.out.println("Digite o limite do campo(X): ");
        rbt.setMapx(scan.nextInt());
        System.out.println("");
        System.out.println("Digite o limite do campo(Y): ");
        rbt.setMapy(scan.nextInt());
        System.out.println("");
        System.out.println("Digite o valor X para o robo: ");
        rbt.setX(scan.nextInt());
        System.out.println("");
        System.out.println("Digite o valor Y para o robo: ");
        rbt.setY(scan.nextInt());
   
        int control = 5;
        
        while(control != 4){
            System.out.println("");
            System.out.println("-MENU-");
            System.out.println("1 - Girar Robo");
            System.out.println("2 - Andar");
            System.out.println("3 - Posicao robo");
            System.out.println("4 - Sair\n");
            control = scan.nextInt();
            
            switch(control){
                case 1: 
                    System.out.println("\nDIRECOES");
                    System.out.println("1 / 2 / 3 / 4");
                    System.out.println("N / S / L / O\n");
                    int dir = scan.nextInt();
                    if (dir == 1 || dir == 2 || dir == 3 || dir == 4){
                        String dirStr = "";
                        switch(dir){
                            case 1 -> dirStr = "N";
                            case 2 -> dirStr = "S";
                            case 3 -> dirStr = "L";
                            case 4 -> dirStr = "O";
                        }
                        
                        rbt.girarPara(dirStr);
                        System.out.println("\nDirecao: " + rbt.getDirecao());
                        System.out.println("\n");
                    }
                    else{
                        System.out.println("Opcao invalida...");
                    }
                    //rbt.girarPara(scan.next());
                    break;
                    
                case 2: 
                    System.out.println("");
                    rbt.andar();
                    rbt.mostrarPosicao();
                    break; 
                    
                case 3:
                    System.out.println("");
                    rbt.mostrarPosicao();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
            }
        }
    }
    
}
