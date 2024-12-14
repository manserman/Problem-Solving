class FrequencySort {
    public String frequencySort(String s) {
          Map<Character, Integer> frequence= new HashMap<>();
        List<Integer> list= new ArrayList<>();
       PriorityQueue<Map.Entry<Character, Integer>> tas = 
                new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for(int i=0;i< s.length();i++){
            if(frequence.containsKey(s.charAt(i)))
              frequence.put(s.charAt(i), frequence.get(s.charAt(i))+1);
            else
            frequence.put(s.charAt(i),1);
        }
        for(Map.Entry<Character, Integer> entry : frequence.entrySet()){
            tas.add(entry);
        }
        StringBuilder sBuilder= new StringBuilder("");
        while(!tas.isEmpty()){
            Map.Entry<Character, Integer> entry= tas.poll();
            int nb=entry.getValue();
            for(int i=0;i<nb;i++) {
                sBuilder.append(entry.getKey());
            }
        }
        return sBuilder.toString();
        
    }
}
