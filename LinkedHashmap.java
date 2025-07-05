class Solution {
    public int findLucky(int[] arr) {
        int result=-1;     
        LinkedHashMap<Integer,Integer> valFrequency=new LinkedHashMap<>();
        for(int i :arr)
        {
            valFrequency.put(i,valFrequency.getOrDefault(i,0)+1);

        }
        for (int i :valFrequency.keySet())
        {
            if(i==valFrequency.get(i))
            { 
                result=Math.max(result,i);

            }
        }
       return result; 
    }
}
