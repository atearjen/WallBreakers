class Solution {
   public int findCircleNum(int[][] M) {

	if(M == null || M.length == 0) {
		return 0;
	}
	boolean[] visited = new boolean[M.length];

	int circles = 0;

	for(int i = 0; i < M.length; i++) {
		Stack<Integer> stkFriendsGroup = new Stack<>();
		if(!visited[i]) {
			circles += findCircleNumHelper(M, i, visited, stkFriendsGroup);
		}

	}

	return circles;
}

    private int findCircleNumHelper(int[][] M, int row, boolean[] visited,Stack<Integer> stkFriendsGroup) {


	for (int j = 0; j < M[0].length; j++) {
		if (!visited[j] && M[row][j] == 1) {
			visited[j] = true;
			stkFriendsGroup.push(j);
			findCircleNumHelper(M, j,  visited, stkFriendsGroup);
		}

	}
	    if(!stkFriendsGroup.isEmpty()) {
		    stkFriendsGroup.pop();
	    }


	    if(stkFriendsGroup.isEmpty()) {
		    return 1;
	    }
	    else {
		    return 0;
	    }
    }
}
