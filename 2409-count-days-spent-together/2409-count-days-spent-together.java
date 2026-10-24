class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int[] num_day = {0, 31, 59, 90, 120, 151,
                         181, 212, 243, 273, 304, 334};

        int a1 = Integer.parseInt(arriveAlice.substring(0, 2));
        int a2 = Integer.parseInt(arriveAlice.substring(3));
        int a3 = Integer.parseInt(leaveAlice.substring(0, 2));
        int a4 = Integer.parseInt(leaveAlice.substring(3));

        int b1 = Integer.parseInt(arriveBob.substring(0, 2));
        int b2 = Integer.parseInt(arriveBob.substring(3));
        int b3 = Integer.parseInt(leaveBob.substring(0, 2));
        int b4 = Integer.parseInt(leaveBob.substring(3));

        int aliceArrival = num_day[a1 - 1] + a2;
        int aliceLeave = num_day[a3 - 1] + a4;

        int bobArrival = num_day[b1 - 1] + b2;
        int bobLeave = num_day[b3 - 1] + b4;

        int start = Math.max(aliceArrival, bobArrival);
        int end = Math.min(aliceLeave, bobLeave);

        return Math.max(0, end - start + 1);
    }
}