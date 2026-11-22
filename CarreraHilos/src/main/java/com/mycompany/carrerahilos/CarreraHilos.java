/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrerahilos;

/**
 *
 * @author sanmo
 */
public class CarreraHilos extends ventana{
    
    private boolean hayGanador = false;
    private String ganador = "";
    public CarreraHilos(){

        ciclon.setMajorTickSpacing(25);
        ciclon.setPaintTicks(true);
        ciclon.setPaintLabels(true);
        
        rayoVeloz.setMinorTickSpacing(25);
        rayoVeloz.setPaintTicks(true);
        
        centella.setMinorTickSpacing(25);
        centella.setPaintTicks(true);
        
        furiaPura.setMinorTickSpacing(25);
        furiaPura.setPaintTicks(true);
        
        tatacoa.setMinorTickSpacing(25);
        tatacoa.setPaintTicks(true);
    }            

    
    public static void main(String[] args) {
        CarreraHilos carrera = new CarreraHilos();
        carrera.setVisible(true);
    }
}
