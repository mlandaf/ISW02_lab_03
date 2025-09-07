/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Marcelo
 */
public class GameSession {

    public void startSession() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Iniciando sesión con base de datos: " + config.getDatabaseUrl());
        System.out.println("Modo debug: " + config.isDebugMode());
    }
}
