/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Marcelo
 */
public class DatabaseManager {

    public void saveData() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Guardando datos en la base de datos: " + config.getDatabaseUrl());
    }
}
