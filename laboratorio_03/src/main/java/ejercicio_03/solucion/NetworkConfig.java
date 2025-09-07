/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Marcelo
 */
public enum NetworkConfig {
    INSTANCE; // única instancia

    private String serverUrl = "https://game.server.com";

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void connect() {
        System.out.println("Conectando al servidor: " + serverUrl);
    }
}
