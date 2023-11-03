import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median_of_Two_Sorted_Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        mergeSort(merged, 0, merged.length - 1);

        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2 + 1];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];

            return ((double) middle1 * (double) middle2) / 2.0;
        }
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
    }

    public static void main(String[] args) {
        Median_of_Two_Sorted_Arrays solution = new Median_of_Two_Sorted_Arrays();

        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double result = solution.findMedianSortedArrays(nums1, nums2);

        System.out.println("Median: " + result);
    }
}
