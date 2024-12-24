class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1)
            set1.add(i);
        for (int i : nums2)
            set2.add(i);
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (set2.contains(i)) {
                it.remove(); 
                set2.remove(i);
            }
        }

        List<List<Integer>> diff = new ArrayList<>();
        diff.add(new ArrayList<>(set1));
        diff.add(new ArrayList<>(set2));
        return diff;

    }
}
