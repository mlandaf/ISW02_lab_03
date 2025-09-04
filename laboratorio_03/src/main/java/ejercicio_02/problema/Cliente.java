/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02.problema;

/**
 *
 * @author jacks
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameElementCreator creator = new GameElementCreator();

        // ❌ PROBLEMA: Nada garantiza que sean compatibles
        Character pcWarrior = creator.createCharacter("PC", "Warrior");
        Weapon mobileSwold = creator.createWeapon("Mobile", "Sword"); // Error de compatibilidad!

        pcWarrior.attack();
        mobileSwold.use(); // Inconsistencia visual!
    }

}
