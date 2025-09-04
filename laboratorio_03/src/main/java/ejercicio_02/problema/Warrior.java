/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.problema;

/**
 *
 * @author jacks
 */
public class Warrior extends Character {

    public Warrior(String platform) {
        this.name = "Guerrero";
        this.platform = platform;
    }

    @Override
    public void attack() {
        if (platform.equals("PC")) {
            System.out.println("Guerrero PC ataca con efectos en HD");
        } else {
            System.out.println("Guerrero Mobile ataca con efectos básicos");
        }
    }
}
