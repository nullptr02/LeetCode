package Algorithms;

import java.util.Arrays;
import java.util.TreeMap;

public class JobScheduling {
    public TreeMap<Integer, Integer> jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;
        int[][] jobs = new int[n][];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        int res = 0;
        for (int[] job : jobs) {
            int cur = dp.floorEntry(job[0]).getValue() + job[2];
            if (cur > res) {
                dp.put(job[1], res = cur);
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        JobScheduling u = new JobScheduling();

        int[] n = {1, 2, 3, 3};
        int[] m = {3, 4, 5, 6};
        int[] o = {50, 10, 40, 70};


        System.out.println(u.jobScheduling(n, m, o));
    }
}
