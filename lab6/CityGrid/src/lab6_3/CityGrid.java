/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

import java.util.Random;

/**
 *
 * @author USER
 */
public class CityGrid {
    private int xCoor;
    private int yCoor;
    private int gridSize;
    private int xSize;
    private int ySize;
    public CityGrid(int x,int y){
        xSize=x;
        ySize=y;
        gridSize=x*y;
        xCoor=x/2;
        yCoor=y/2;
    }
    public void walk(){
        Random gen = new Random();
        int walk = gen.nextInt(4);
        switch (walk){
            case 0:xCoor++;break;
            case 1:xCoor--;break;
            case 2:yCoor++;break;
            case 3: yCoor--;break;
        }
    }
    public boolean isInCity(){
        if(xCoor<0 || yCoor<0 || xCoor>xSize || yCoor>xSize){
            return false;
        }else{
            return true;
        
        }
    }
    public void reset(){
        xCoor = xSize/2;
        yCoor = ySize/2;
    }
}
