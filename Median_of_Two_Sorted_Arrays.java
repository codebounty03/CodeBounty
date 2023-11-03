// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Median_of_Two_Sorted_Arrays {

//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] merged = new int[nums1.length + nums2.length];
//         System.arraycopy(nums1, 0, merged, 0, nums1.length);
//         System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        
//         mergeSort(merged, 0, merged.length - 1);
        
//         int total = merged.length;
        
//         if (total % 2 == 1) {
//             return (double) merged[total / 2 - 1];
//         } else {
//             int middle1 = merged[total / 2 - 1];
//             int middle2 = merged[total / 2];
            
//             return ((double) middle1 * (double) middle2) / 2.0;
//         }
//     }

//     private void mergeSort(int[] arr, int left, int right) {
//         if (left < right) {
//             int mid = left + (right - left) / 2;
//             mergeSort(arr, left, mid);
//             mergeSort(arr, mid + 1, right);
//             merge(arr, left, mid, right);
//         }
//     }

//     private void merge(int[] arr, int left, int mid, int right) {
//     }

//     public static void main(String[] args) {
//         Median_of_Two_Sorted_Arrays solution = new Median_of_Two_Sorted_Arrays();

//         int[] nums1 = {1, 3};
//         int[] nums2 = {2};
//         double result = solution.findMedianSortedArrays(nums1, nums2);

//         System.out.println("Median: " + result);
//     }
// }
public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tempLen = m;
            m = n;
            n = tempLen;
        }

        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;

            if (i < m && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                iMax = i - 1;
            } else {
                int maxOfLeft, minOfRight;

                if (i == 0) {
                    maxOfLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxOfLeft = nums1[i - 1];
                } else {
                    maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxOfLeft;
                }

                if (i == m) {
                    minOfRight = nums2[j];
                } else if (j == n) {
                    minOfRight = nums1[i];
                } else {
                    minOfRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxOfLeft + minOfRight) / 2.0;
            }
        }
        return 0.0; // Return 0.0 if no median is found
    }

    public static void main(String[] args) {
        Median_of_Two_Sorted_Arrays solution = new Median_of_Two_Sorted_Arrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
