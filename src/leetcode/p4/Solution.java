package leetcode.p4;

public class Solution {
    public static void main(String[] args) {
        new Solution().findMedianSortedArrays(new int[] {3,7,19,27,53}, new int[]{16,25,33});
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArrays(nums1, 0, nums1.length, nums2, 0, nums2.length);
    }

    double findMedianSortedArrays(int[] nums1, int begin1, int end1, int[] nums2, int begin2, int end2) {
        if (getMedian(nums1) > getMedian(nums2)) {
            return findMedianSortedArrays(nums1, begin1, (nums1.length % 2 == 0) ? (begin1 + end1) / 2 + 1 : (begin1 + end1) / 2, nums2, (nums2.length % 2 == 0) ? (begin2 + end2) / 2 + 1 : (begin2 + end2) / 2, end2);
        } else {
            return findMedianSortedArrays(nums1, (nums1.length%2==0)?(begin1+end1)/2+1:(begin1+end1)/2, end1, nums2, begin2, (nums2.length%2==0)?(begin2+end2)/2+1:(begin2+end2)/2);
        }
    }

    double getMedian(int[] nums) {
        int mid = nums.length/2;
        return (nums.length==1) ? nums[0] : (nums.length%2 == 0) ? (nums[mid]+nums[mid+1])/2 : nums[mid];
    }
}
