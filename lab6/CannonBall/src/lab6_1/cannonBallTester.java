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
public class cannonBallTester {
    public static void main(String[] args) {
        CannonBall ball = new CannonBall(100); //กำหนดความเร็วตั้งต้นให้ลูกกระสุนปืนใหญ่มีค่าเป็น 100 m/sec
        ball.simulatedFlight();
        ball.getSimulatedTime();
        System.out.print(String.format("Final distance:%.3f", ball.getSimulatedDistance(),"Total time:%.2f",ball.getSimulatedTime()));
        System.out.println(String.format("  Total time:%.2f",ball.getSimulatedTime()));
        System.out.println(String.format("Distance from calculus equation:%.3f", ball.calculusFlight(ball.getSimulatedTime())));
}
} 
    

