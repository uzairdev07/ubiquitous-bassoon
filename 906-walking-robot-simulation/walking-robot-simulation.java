class Solution {

    final int HASH = 60001;

    int hash(int x, int y) {
        return x + HASH * y;
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Integer> os = new HashSet<>();

        for (int[] obs : obstacles) {
            os.add(hash(obs[0], obs[1]));
        }

        int[][] dirs = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        int[] currPos = {0, 0};
        int max = 0;
        int currDir = 0;

        for (int cmd : commands) {
            if (cmd == -1) {
                currDir = (currDir + 1) % 4;
                continue;
            } 
            if (cmd == -2) {
                currDir = (currDir + 3) % 4;
                continue;
            }

            int[] direction = dirs[currDir];

            for (int s = 0; s < cmd; s++) {
                int nx = currPos[0] + direction[0];
                int ny = currPos[1] + direction[1];
                if (os.contains(hash(nx, ny))) {
                    break;
                }

                currPos[0] = nx;
                currPos[1] = ny;
            }

            max = Math.max(
                max, 
                currPos[0] * currPos[0] +
                currPos[1] * currPos[1]
            );
        }
        return max;

    }
}