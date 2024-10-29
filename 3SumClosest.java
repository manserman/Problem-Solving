class 3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       int somme=nums[0]+nums[1]+nums[2];
       int minDist=Math.abs(target-somme);
        for(int i= 0;i<nums.length-2;i++){
             int right= nums.length-1;
             int left=i+1;
             while(right>left){
                int localSomme= nums[i]+ nums[left]+nums[right];
                int dist=Math.abs( target-localSomme);
                if(dist==0)
                return localSomme;
               if(dist<minDist){
                minDist=dist;
                somme=localSomme;
                }
             
             if(localSomme>target)
             right--;
             else
             left++;
             }

        }
        
        return somme;
    }
 

    
}