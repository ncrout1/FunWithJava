class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        char [] array1=s1.toCharArray();
        char [] array2 =s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        s1=Arrays.toString(array1);
        s2=Arrays.toString(array2);
        if (s1.equalsIgnoreCase(s2))
        {
            return true;
        }
        else
        {
            return false;
        }

        // Your code here
    }
}
