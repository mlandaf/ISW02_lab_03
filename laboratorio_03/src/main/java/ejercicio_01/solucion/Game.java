/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solucion;

/**
 *
 * @author Marcelo
 */
public abstract class Game {
    protected String name;
    
    protected Game (String name){
        this.name = name;
    }
    
    public abstract void start();
    
    public String getInfo(){
        return "Game: " + name;
    }
    
}
