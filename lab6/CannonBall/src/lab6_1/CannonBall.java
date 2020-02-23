/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_1;

/**
 *
 * @author usci
 */
public class CannonBall {
    private double initV; 
    private double simS; 
    private double simT;  
    public static  double time = 0;
    public static final double g = 9.81;
    public static final double deltaT = 0.01;
    
    public CannonBall(double initV) {
        this.initV = initV;
    }
    
    public void simulatedFlight(){
        double initsV=initV;
        double distance=0;
        int time=1;
        while (initsV>0){
            double deltaS = initsV*deltaT;
            simT = simT+deltaT;
            simS = simS+deltaS;
            initsV=initsV-(g*deltaT);
            if (simT>=(double)time*1.000)
                {
                    System.out.printf("Distance on %d sec: %.3f", time,simS);
                    System.out.println();
                    time += 1;
            }
        }
    }        
    public double calculusFlight(double t){
        double s = (-0.5*g*(t*t))+(initV*t);
        return Math.round(s*1000)/1000.000;
    }
    public double getSimulatedTime(){
        return simT;
    }
    public double getSimulatedDistance(){
        return simS;
    }
}
