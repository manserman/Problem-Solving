class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length<=k)
        return nums;
        Map<Integer, Integer> frequence= new HashMap<>();
        List<Integer> list= new ArrayList<>();
       PriorityQueue<Map.Entry<Integer, Integer>> tas = 
                new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for(int i=0;i< nums.length;i++){
            if(frequence.containsKey(nums[i]))
              frequence.put(nums[i], frequence.get(nums[i])+1);
            else
            frequence.put(nums[i],1);
        }

        for (Map.Entry<Integer, Integer> entry : frequence.entrySet()) {
            tas.add(entry);
            if(tas.size()>k)
            tas.poll();
            
        }

        int[] tab= new int[k];
        int t=0;
        while(!tas.isEmpty()){
            tab[t]=tas.poll().getKey();
            t++;
        }
        
     return tab;
        
    }
}
