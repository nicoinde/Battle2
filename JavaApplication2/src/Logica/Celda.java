/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Nico
 */
public class Celda {

    
    private int actual= 0;
    private boolean chosen;

    public Celda() {
        actual=0;
        chosen=false;
    }
    public Celda(int i) {
        actual=i; 
        chosen=false;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void reset() {
        chosen = false;
        actual=0;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    
}
