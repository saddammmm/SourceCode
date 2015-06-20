/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Saddam
 */
public class Sherlock {
    public static void printBin(String soFar, int iterations) {
    if(iterations == 0) {
        System.out.println(soFar);
    }
    else {
        printBin(soFar + "0", iterations - 1);
        printBin(soFar + "1", iterations - 1);
    }
}
    public static void main(String args[])
    {
        printBin("", 20);
        
    }
    
}
