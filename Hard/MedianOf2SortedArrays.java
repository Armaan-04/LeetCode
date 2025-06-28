import java.util.Arrays;

class MedianOf2SortedArrays{
    public double findMedianSortedArrays(int[] nums1 , int[] nums2){
        int n = nums1.length;
        int m = nums2.length;

        int [] merged = new int [n + m];
        int k = 0; //index tracker of the merged array
        for ( int i = 0 ; i < n ; i++){
            merged[k++] = nums1 [i]; //adds the values of nums1 to k and then increments k's value by 1;
        }
        for( int i = 0 ; i < m ; i++){
            merged[k++] = nums2 [i];
        }
        Arrays.sort(merged);

        int total = merged.length;

        if (total % 2 == 1){  //For odd case
            return (double) merged [total / 2];
        }
        else { //For even case
            int mid1 = merged[total / 2 - 1];
            int mid2 = merged[total / 2];
            return ((double) mid1 + (double) mid2) / 2 ;
        }
    }

    public static void main (String [] args){
        MedianOf2SortedArrays obj = new MedianOf2SortedArrays();
        int[] nums1 = {2,3,1,1,1,1,6};
        int[] nums2 = {5,6};

        double median = obj.findMedianSortedArrays(nums1 , nums2);
        System.out.println("The median is: " +median);
    }
}