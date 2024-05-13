class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : candyType) {
                hs.add(x);
        }
        return Math.min(candyType.length / 2, hs.size());
    }
}
