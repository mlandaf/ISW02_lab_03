/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Marcelo
 */
public class PCFactory extends GameElementFactory {

    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
}