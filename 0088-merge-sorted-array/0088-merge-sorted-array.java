class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int valueAtP1,valueAtP2;
        int valAtP1;
        for(int i=nums1.length-1;i>=0;i--)
        {
            if(p1>=0)
            {
                valueAtP1=nums1[p1];
            }
            else
            {
                valueAtP1=Integer.MIN_VALUE;
            }
            if(p2>=0)
            {
                valueAtP2=nums2[p2];
            }
            else
            {
                valueAtP2=Integer.MIN_VALUE;
            }
            if(valueAtP1<valueAtP2)
            {
                nums1[i]=valueAtP2;
                p2--;
            }
            else
            {
                nums1[i]=valueAtP1;
                p1--;
            }
        }
    }
}