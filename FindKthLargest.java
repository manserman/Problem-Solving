class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> tas= new PriorityQueue<>();
       for(int i=0;i<nums.length;i++){
        tas.add(nums[i]);
        if(tas.size()>k)
        tas.poll();
       }
      
       return tas.peek();
        
    }
}
