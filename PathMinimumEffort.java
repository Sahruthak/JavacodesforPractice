class PathMinimumEffort {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;

        int[][] efforts = new int[m][n]; // distance matrix
        for(int[] effort: efforts) // fill matrix with inf
            Arrays.fill(effort, Integer.MAX_VALUE);
        efforts[0][0] = 0; // distance from starting node to self

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b)->a[2]-b[2]);
        heap.offer(new int[]{0, 0, 0});

        while(!heap.isEmpty())    {
            int[] curr = heap.poll();
            int x  = curr[0];
            int y  = curr[1];
            int eff= curr[2];
            for(int[] dir:directions){ // move to all the directions
                int newX = x+dir[0];
                int newY = y+dir[1];
                if(newX < 0 || newX >= m || newY <0 || newY >=n) // outside matrix
                    continue;

                int newEff = Math.max(eff, Math.abs(heights[x][y]-heights[newX][newY]));
                if(efforts[newX][newY] > newEff){
                    efforts[newX][newY] = newEff;
                    heap.offer(new int[]{newX, newY, newEff});
                }
            }
        }
        return efforts[m-1][n-1];
    }
}
