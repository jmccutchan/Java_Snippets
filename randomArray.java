/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays;

/**
 *
 * @author jamesmccutchan
 */
public class randomArray {
       
          public static void main(String[] args) {
              double[] storeMinimum = new double[5];
              double[] trialArray = new double[10];
              for (int i =0; i < storeMinimum.length; i++) {
                  randomize(trialArray);
                    
                  storeMinimum[i] = findMinimum(trialArray);
              }
              
              for (double minValue : storeMinimum)
                  System.out.printf("%.4f%n", minValue);
              
          }
          public static void randomize(double[] valArray) {
              for (int i = 0; i < valArray.length; i++)
                  valArray[i] = Math.random() * 100.0;
          }
          
          public static double findMinimum(double[] valArray) {
              double minValue = valArray[0];
              for (int i = 1; i < valArray.length; ++i)
                  minValue = Math.min(minValue, valArray[i]);
              return minValue;
          }
}