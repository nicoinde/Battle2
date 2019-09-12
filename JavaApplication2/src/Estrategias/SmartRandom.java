/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategias;

import java.util.*;

/**
 *
 * @author Nico
 */
public class SmartRandom extends Estrategia{

    private ArrayList<int[]> puntosDeInteres=new ArrayList();
    ArrayList<int[]> puntosDisponibles=new ArrayList();
    int contDisp;


    public SmartRandom() {
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
    
    
    
    @Override
    public int[] siguientePunto(boolean impactoAnterior) {
        
        int[] coord= new int [2];
        if(!init){
            int aux;
            aux = (int) (Math.random() * (10000 - contDisp));
        
        contDisp++;
        coord=puntosDisponibles.remove(aux);
        oponente[coord[0]][coord[1]] = 1;

        lastShootX=coord[0];
        lastShootY=coord[1];
        
        oponente[coord[0]][coord[1]] = 1;
        init=false;
        return coord;
        }
        
        if(impactoAnterior){
            if(oponente[lastShootX-1][lastShootY]==0){
                coord[0]=lastShootX-1;
                coord[1]=lastShootY;
                puntosDeInteres.add(coord);
            }
            if(oponente[lastShootX+1][lastShootY]==0){
                coord[0]=lastShootX+1;
                coord[1]=lastShootY;
                puntosDeInteres.add(coord);
            }
            if(oponente[lastShootX][lastShootY-1]==0){
                coord[0]=lastShootX;
                coord[1]=lastShootY-1;
                puntosDeInteres.add(coord);
            }
            if(oponente[lastShootX][lastShootY+1]==0){
                coord[0]=lastShootX;
                coord[1]=lastShootY+1;
                puntosDeInteres.add(coord);
            }
        }
        
        if(puntosDeInteres.isEmpty()){
                    int aux;
            aux = (int) (Math.random() * (10000 - contDisp));
        
        contDisp++;
        coord=puntosDisponibles.remove(aux);
        oponente[coord[0]][coord[1]] = 1;

        lastShootX=coord[0];
        lastShootY=coord[1];
        
        oponente[coord[0]][coord[1]] = 1;
        } else{
            coord=puntosDeInteres.remove(0);
            puntosDisponibles.remove(coord);
            lastShootX=coord[0];
            lastShootY=coord[1];
            oponente[coord[0]][coord[1]] = 1;
        }
        
        return coord;
    }

    
}
