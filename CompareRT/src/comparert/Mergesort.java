/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparert;

/**
 *
 * @author cemal
 */
public class Mergesort {

    int[] arrays;
    int[] temp;
    int array;

    void sort(int[] values) {
        this.arrays = values;
        array = values.length;
        this.temp = new int[array];
        mergesort(0, array - 1);
    }

    void mergesort(int l, int h) {

        if (l < h) {

            int mid = l + (h - l) / 2;
            mergesort(l, mid);
            mergesort(mid + 1, h);
            merge(l, mid, h);
        }
    }

    void merge(int l, int mid, int h) {

        for (int i = l; i <= h; i++) {
            temp[i] = arrays[i];
        }

        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= h) {
            if (temp[i] <= temp[j]) {
                arrays[k] = temp[i];
                i++;
            } else {
                arrays[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arrays[k] = temp[i];
            k++;
            i++;
        }

    }

    
}
