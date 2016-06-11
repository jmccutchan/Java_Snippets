/* Iterate through the elements in an array using a counter controlled loop
* 
*/
package java_arrays;

/**
 *
 * @author jamesmccutchan
 */
public class java_array_barchart {

    /**
     * @param args the command line arguments
     * Init array with default values of zero
     */
    public static void main(String[] args) {
        
        int[] arr = {0,0,0,0,0,1,2,4,6,5};
        
        System.out.println("Grade distribution");
        
        for (int counter = 0; counter < arr.length; counter++)
        {
            
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("_d-_d: ", counter * 10, counter * 10 + 9);
            
            for (int stars = 0; stars < arr[counter]; stars++)
                System.out.print("*");
            
            System.out.println();
        }    
                
        // TODO code application logic here
    }
    
}
