/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class DumbRandom extends Estrategia {

    ArrayList<int[]> puntosDisponibles=new ArrayList();;
    int contDisp;

    public DumbRandom() {
        super();
        int[] punto = new int[2];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                punto[0] = i;
                punto[1] = j;
                puntosDisponibles.add(punto);
            }
        }
        contDisp = 0;
    }

    public DumbRandom(int x, int y) {
        super(x, y);
    }

    @Override
    public int[] siguientePunto(boolean impactoAnterior) {
        int[] coord = new int[2];
        int aux;

        aux = (int) (Math.random() * (10000 - contDisp));
        
        contDisp++;
        coord=puntosDisponibles.remove(aux);
        oponente[coord[0]][coord[1]] = 1;
        return coord;
    }

}
