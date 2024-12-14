class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
           List<int[]> intervalFinal= new ArrayList<>();
           int nbLignes = intervals.length;
           int position=0;
          while (position < nbLignes && intervals[position][1] < newInterval[0]) {
            intervalFinal.add(intervals[position]);
            position++;
        }

           int[] precedent= newInterval;
           for(int i=position; i<nbLignes; i++){
            if(intervals[i][0]<=precedent[1]){
            precedent[1]= Math.max(precedent[1], intervals[i][1]);
            precedent[0]= Math.min(precedent[0], intervals[i][0]);
            }
            else{
            intervalFinal.add(precedent);
            precedent=intervals[i];
            }
           }
            intervalFinal.add(precedent);
            return intervalFinal.toArray(new int[0][]);
        
    }
        
    }
