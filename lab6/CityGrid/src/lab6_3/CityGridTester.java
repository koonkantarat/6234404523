/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

/**
 *
 * @author USER
 */
public class CityGridTester {
    public static void main(String[] args) {
        CityGrid tester = new CityGrid(10,10);
        int max = 0;
        int walkSum = 0;
        for(int i=0;i<10000;i++){
            for(int j=0;j<1000;j++){
                tester.walk();
                if(tester.isInCity()!=true){
                    walkSum=walkSum+j;
                    if (j>max){
                       max=j; 
                    }
                    tester.reset();
                    break;
                }
            }
        }
        System.out.printf("Average number of steps that a person can take and is still in the city: %.2f",walkSum/10000.0 );
        System.out.println("\nMaximum number of steps that a person can take and is still in the city: "+max );
    }
}
