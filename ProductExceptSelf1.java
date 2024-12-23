class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Étape 1 : Calcul des produits préfixes
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Étape 2 : Calcul des produits suffixes en place
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix; // Combinaison du produit préfixe et suffixe
            suffix *= nums[i];   // Mise à jour du produit suffixe
        }
        
        return result;
    }
}
