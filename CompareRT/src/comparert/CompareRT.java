
package comparert;

import java.util.Random;
import java.util.Scanner;

/**
 * 16070006087
 * Cemal Ünal
 */
public class CompareRT {

    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);

        BinarySearchN binarym = new BinarySearchN();
        BinarySearchN binaryi = new BinarySearchN();

        int s = generator.nextInt(2000);
        System.out.println("aranan integer " + s);

        System.out.println("How many number inputs n ?");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(2000);
        }

        Mergesort merge = new Mergesort();

        long startTimeM = System.nanoTime();
        merge.sort(arr);
        long endTimeM = System.nanoTime();
   
        long startTimeBM = System.nanoTime();
        int resultm = binarym.binarySearch(arr, s);
        long endTimeBM = System.nanoTime();
        System.out.println();
        if (resultm == -1) {
            System.out.println("Number not found with Binary search");
        } else {
            System.out.println("Number found at " + "index " + resultm);
        }

        System.out.println("Mergesort time elapsed " + (endTimeM - startTimeM) + " nanoseconds ");
        System.out.println("Binary search in Mergesort time elapsed " + (endTimeBM - startTimeBM) + " nanoseconds ");
        //---------------------------------------------------------------------------
        Insertionsort insert = new Insertionsort();
        int[] arr2 = new int[n];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = generator.nextInt(2000);
        }

        long startTimeI = System.nanoTime();
        insert.sort(arr2);
        long endTimeI = System.nanoTime();
        
        long startTimeBI = System.nanoTime();
        int resulti = binaryi.binarySearch(arr2, s);
        long endTimeBI = System.nanoTime();
        System.out.println();
        if (resulti == -1) {
            System.out.println("Number not found with Binary search");
        } else {
            System.out.println("Number found at " + "index " + resulti);
        }
        
        System.out.println("Insertionsort time elapsed " + (endTimeI - startTimeI) + " nanoseconds ");
        System.out.println("Binary search in Insertionsort time elapsed " + (endTimeBI - startTimeBI) + " nanoseconds ");
    }

}
