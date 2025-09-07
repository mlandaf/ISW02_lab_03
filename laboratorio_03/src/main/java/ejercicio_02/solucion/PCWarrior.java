/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Marcelo
 */
public class PCWarrior extends Character {
    public PCWarrior() { super("PC Warrior", "PC"); }

    @Override public void attack() {
        System.out.println(getInfo() + " ataca con teclado y ratón.");
    }
}