/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solucion;

/**
 *
 * @author Marcelo
 */
public class FPSGame extends Game {
    public FPSGame() {
        super("FPS");
    }

    @Override
    public void start() {
        System.out.println("Iniciando FPS: cargando mapas y munición...");
    }
}