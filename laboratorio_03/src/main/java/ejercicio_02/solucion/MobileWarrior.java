/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Marcelo
 */
public class MobileWarrior extends Character {
    public MobileWarrior() { super("Mobile Warrior", "Mobile"); }

    @Override public void attack() {
        System.out.println(getInfo() + " ataca con controles táctiles.");
    }
}