class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null) {
            return null;
        }
        Stack<Integer> finalStack = new Stack();
        int previous = asteroids[0];
        finalStack.push(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            boolean endCollision = false;
            while (!finalStack.isEmpty() && !endCollision) {
                if (finalStack.peek() > 0 && asteroids[i] < 0) {
                    if (Math.abs(finalStack.peek()) == Math.abs(asteroids[i])) {
                        finalStack.pop();
                        endCollision = true;
                    } else if (Math.abs(finalStack.peek()) < Math.abs(asteroids[i])) {
                        finalStack.pop();
                    } else {
                        endCollision = true;
                    }
                } else {
                    finalStack.push(asteroids[i]);
                    endCollision = true;
                }
            }

            if (finalStack.isEmpty() && !endCollision) {
                finalStack.push(asteroids[i]);
            }

        }
        int[] intArray = new int[finalStack.size()];
        for (int i = 0; i < finalStack.size(); i++) {
            intArray[i] = finalStack.get(i);
        }
        return intArray;

    }
}
