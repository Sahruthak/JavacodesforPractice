class NetworkDelayTime{
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>(); // populate graph
        for(int[] time:times){
            map.putIfAbsent(time[0], new HashMap<>());
            map.get(time[0]).put(time[1], time[2]);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->(a[0]-b[0])); // create minheap      
        pq.add(new int[]{0, k}); // insert startin node
        boolean[] solved = new boolean[n+1];

        int res = 0;

        while(!pq.isEmpty()){
            int[] cur = pq.remove();
            int currentNode = cur[1];
            int currentDistance = cur[0];
            if(solved[currentNode]) continue;
            if(map.containsKey(currentNode)){
                for(int neighbor:map.get(currentNode).keySet()){
                    pq.add(new int[]{currentDistance + map.get(currentNode).get(neighbor), neighbor});
                }
            }
            solved[currentNode] = true;
            res = currentDistance;
            n--;
        }
        if(n == 0) return res;
        return -1;
    }
}
