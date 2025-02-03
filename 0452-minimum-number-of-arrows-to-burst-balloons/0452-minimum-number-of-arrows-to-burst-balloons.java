class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length, count = 0;
		if (n == 0)
			return 0;
		Arrays.sort(points, Comparator.comparingInt(i -> i[1]));
		LinkedList<int[]> merged = new LinkedList<int[]>();
		for (int[] i : points) {
			if (merged.isEmpty() || i[0] > merged.getLast()[1]) {
				merged.add(i);
				count++; 
			}
		}
		return count;
    }
}