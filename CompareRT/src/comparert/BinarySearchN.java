
package comparert;

/**
 *
 * @author cemal
 */
public class BinarySearchN {
    
    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (arr[m] == x) {
                return m;
            }

            if (arr[m] < x) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }

        return -1;
    }
    
}
