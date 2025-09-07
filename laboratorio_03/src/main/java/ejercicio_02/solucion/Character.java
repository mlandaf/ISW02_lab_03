/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Marcelo
 */
public abstract class Character {
    protected final String name;
    protected final String platform;

    protected Character(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public String getInfo() { return name + " [" + platform + "]"; }

    public abstract void attack();
}