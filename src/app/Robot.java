/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Fernando Suares
 */
public class Robot {
    private int x, y, mapx, mapy;
    private String direcao;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMapx() {
        return this.mapx;
    }

    public void setMapx(int mapx) {
        this.mapx = mapx;
    }

    public int getMapy() {
        return this.mapy;
    }

    public void setMapy(int mapy) {
        this.mapy = mapy;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    
   /* public Robot(int x, int y, int mapx, int mapy, String direcao){
        this.x = x;
        this.y = y;
        this.mapx = mapx;
        this.mapy = mapy;
        this.direcao = direcao;
    }*/
    public Robot(String direcao){
        this.direcao = direcao;
    }
    
    public void mostrarPosicao(){
        System.out.println("X: " + this.x + " Y: " + this.y);
    }
    
    public void norte(){
        this.setY(this.getY() + 1);
    }
    
    public void sul(){
        this.setY(this.getY() - 1);
    }
    
    public void leste(){
        this.setX(this.getX() + 1);
    }
    
    public void oeste(){
        this.setX(this.getX() - 1);
    }
    
    public void girarPara(String direcao){
        switch(direcao){
            case "N" -> this.direcao="N";
            case "S" -> this.direcao="S";
            case "L" -> this.direcao="L";
            case "O" -> this.direcao="O";
        }
    }
    
    public void andar(){
        if(this.direcao == "N"){
            if (this.getY() < this.getMapy()){
                norte();
            }
            else{
                System.out.println("Movimento invalido...");
                System.out.println("Necessario virar o robo...");
            }
        }
        
        if(this.direcao == "S"){
            if (this.getY() > 1){
                sul();
            }
            else{
                System.out.println("Movimento invalido...");
                System.out.println("Necessario virar o robo...");
            }
        }
        
        if(this.direcao == "L"){
            if (this.getX() < this.getMapx()){
                leste();
            }
            else{
                System.out.println("Movimento invalido...");
                System.out.println("Necessario virar o robo...");
            }
        }
        
        if(this.direcao == "O"){
            if (this.getX() > 1){
                norte();
            }
            else{
                System.out.println("Movimento invalido...");
                System.out.println("Necessario virar o robo...");
            }
        }
        
        /*switch(this.direcao){
            case "N" -> norte();
            case "S" -> sul();
            case "L" -> leste();
            case "O" -> oeste();
        }*/
    }
}
