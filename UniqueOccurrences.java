class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> dico = new HashMap<>();
        for (int i : arr) {
            dico.put(i, dico.getOrDefault(i, 0) + 1);
        }
        Set<Integer> occurencesSet = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : dico.entrySet()) {
            if (!occurencesSet.add(entry.getValue())) {
                return false;
            }
        }
        return true;

    }
}
