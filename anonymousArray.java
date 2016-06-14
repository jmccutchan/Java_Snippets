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
public class anonymousArray {
    public static void main(String[] args) {
        System.out.println("Minimum value: " + findMinimum(new int[] {3 ,5, 7, 2, 9}));
    }
    
    public static int findMinimum(int[] dataSeq) {
        int min = dataSeq[0];
        for (int index = 1; index < dataSeq.length; ++index)
            if (dataSeq[index] < min)
                min = dataSeq[index];
        return min;
    }
    
}
