Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index.



class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
           int start =0, last=arr.length-1,index=-1,i;
           while(start <= last)
           {   i=(start+last)/2;
               if (k==arr[i])
               {
                   index=i;
                   last=i-1;
               }
               else if (k>arr[i])
               {
                   start=i+1;
                   
                   
               }
               else{
                   
                   last=i-1;
               }
           }
           
           return index;
    }
}


