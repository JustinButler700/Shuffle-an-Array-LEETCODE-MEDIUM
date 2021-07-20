class Solution2 {
    int[] reset;
    Random rnd = new Random();
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
        int[] shuffle = new int[reset.length];
        List<Integer> al = new ArrayList(reset.length);
        //push all values of the original array onto an arraylist
        for(int i = 0; i < reset.length; i++)
        {
            al.add(reset[i]);
        }
        //flush the arraylist  values to random spots on the shuffle array
        for(int i = 0; i < reset.length; i++)
        {
            int rand = rnd.nextInt(al.size());
            shuffle[i] = (int)al.get(rand);
            al.remove(rand);
        }
        return shuffle;
    }
}
