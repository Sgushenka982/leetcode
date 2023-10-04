/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


        Constraints:

        nums1.length == m
        nums2.length == n
        0 <= m <= 1000
        0 <= n <= 1000
        1 <= m + n <= 2000
        -106 <= nums1[i], nums2[i] <= 106*/

package tasks;

import java.util.Map;

public class MedianOfTwoSortedArrays__4 implements Task {
    @Override
    public String execute(Map params) {
        return String.valueOf(findMedianSortedArrays((int[]) params.get("list1"),(int[]) params.get("list2")));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        // Partition nums1 and nums2
        int partition1 = nums1.length / 2;
        int partition2 = (nums1.length + nums2.length + 1) / 2 - partition1;

        while (partition1 <= nums1.length) {
            // Find the maximum elements on the left of the partition
            int maxLeft1 = partition1 > 0 ? nums1[partition1 - 1] : Integer.MIN_VALUE;
            int maxLeft2 = partition2 > 0 ? nums2[partition2 - 1] : Integer.MIN_VALUE;
            int maxLeft = Math.max(maxLeft1, maxLeft2);

            // Find the minimum elements on the right of the partition
            int minRight1 = partition1 < nums1.length ? nums1[partition1] : Integer.MAX_VALUE;
            int minRight2 = partition2 < nums2.length ? nums2[partition2] : Integer.MAX_VALUE;
            int minRight = Math.min(minRight1, minRight2);

            // Check if the partition is correct
            if (maxLeft <= minRight) {
                // If the total length is even, return the average of the two middle elements
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (maxLeft + minRight) / 2.0;
                }
                // If the total length is odd, return the middle element
                else {
                    return maxLeft;
                }
            }
            if (maxLeft1 > minRight2) {
                partition1--;
                partition2++;
            } else {
                partition1++;
                partition2--;
            }
        }

        return 0.0;


    }
}
