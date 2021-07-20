class Solution1 {
    int[] reset;
    public Solution(int[] nums) 
    {
           reset = nums; 
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() 
    {
        return reset;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() 
    {
        List<Integer> al = new ArrayList(reset.length);
        //push all values of the original array onto an arraylist
        for(int i = 0; i < reset.length; i++)
        {
            al.add(reset[i]);
        }
        //shuffles the arraylist
        Collections.shuffle(al);
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}
