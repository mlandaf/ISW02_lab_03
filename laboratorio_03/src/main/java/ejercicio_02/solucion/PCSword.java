/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Marcelo
 */
public class PCSword extends Weapon {
    public PCSword() { super("PC Sword", "PC"); }

    @Override public void use() {
        System.out.println(getInfo() + " se usa con clic derecho.");
    }
}
