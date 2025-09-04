/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.problema;

/**
 *
 * @author jacks
 */
public abstract class Character {

    protected String name;
    protected String platform;

    public abstract void attack();

    public String getInfo() {
        return "Personaje: " + name + " | Plataforma: " + platform;
    }
}
