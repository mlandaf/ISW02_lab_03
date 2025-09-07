/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio03.main;

import ejercicio_01.solucion.FPSFactory;
import ejercicio_01.solucion.GameFactory;
import ejercicio_01.solucion.RPGFactory;
import ejercicio_02.solucion.Character;
import ejercicio_02.solucion.GameElementFactory;
import ejercicio_02.solucion.MobileFactory;
import ejercicio_02.solucion.PCFactory;
import ejercicio_02.solucion.Weapon;
import ejercicio_03.solucion.DatabaseManager;
import ejercicio_03.solucion.GameConfig;
import ejercicio_03.solucion.GameSession;
import ejercicio_03.solucion.NetworkManager;
/**
 *
 * @author Marcelo
 */
public class MainLaboratorio03 {
    public static void main(String[] args) {
      
    // EJERCICIO 1:
        System.out.println("EJERCICIO 1");
        GameFactory rpgFactory = new RPGFactory();
        GameFactory fpsFactory = new FPSFactory();
        
        rpgFactory.playGame();
        fpsFactory.playGame();
        System.out.println();
        
    // EJERCICIO 2:
        System.out.println("EJERCICIO 2");
        System.out.println();
        System.out.println("=== JUEGO EN PC ===");

        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createWeapon();

        System.out.println("Creado -> " + pcWarrior.getInfo());
        System.out.println("Creado -> " + pcSword.getInfo());

        pcWarrior.attack();
        pcSword.use();

        System.out.println();

        // ===== Prueba con la familia Mobile =====
        System.out.println("=== JUEGO EN MOBILE ===");

        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createWeapon();

        System.out.println("Creado -> " + mobileWarrior.getInfo());
        System.out.println("Creado -> " + mobileSword.getInfo());

        mobileWarrior.attack();
        mobileSword.use();
        System.out.println();
        
     // EJERCICIO 3
        System.out.println("EJERCICIO 3");
        System.out.println();
        GameConfig config = GameConfig.getInstance();
        config.setDebugMode(true);
        config.setMaxPlayers(20);

        // Clientes que usan la misma instancia
        GameSession session = new GameSession();
        session.startSession();

        NetworkManager network = new NetworkManager();
        network.connect();

        DatabaseManager db = new DatabaseManager();
        db.saveData();

        System.out.println("Máximo de jugadores permitidos: " + config.getMaxPlayers());
    }
}
