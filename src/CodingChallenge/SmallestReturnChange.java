package CodingChallenge;

public class SmallestReturnChange {

    public static Integer calculateTimeDiff(String timeIn, String timeOut) {
        String[] tempTimeIn = timeIn.toString().split(":");
        String[] tempTimeOut = timeOut.toString().split(":");

        int timeInMins = (Integer.parseInt(tempTimeIn[0]) * 60) + Integer.parseInt(tempTimeIn[1]);
        int timeOutMins = 0;

        if(Integer.parseInt(tempTimeIn[0]) > Integer.parseInt(tempTimeOut[0])) {
            timeOutMins = (Integer.parseInt(tempTimeOut[0]) * 60) + Integer.parseInt(tempTimeOut[1]) + 1440;
//            System.out.println("Path A");

        } else if(Integer.parseInt(tempTimeIn[0]) < Integer.parseInt(tempTimeOut[0])) {
            timeOutMins = (Integer.parseInt(tempTimeOut[0]) * 60) + Integer.parseInt(tempTimeOut[1]);
//            System.out.println("Path B");

        } else if(Integer.parseInt(tempTimeIn[1]) > Integer.parseInt(tempTimeOut[1])){
            timeOutMins = (Integer.parseInt(tempTimeOut[0]) * 60) + Integer.parseInt(tempTimeOut[1]) + 1440;
//            System.out.println("Path C");

        } else{
            timeOutMins = (Integer.parseInt(tempTimeOut[0]) * 60) + Integer.parseInt(tempTimeOut[1]);
//            System.out.println("Path D");
            }
        return  (timeOutMins - timeInMins);
    }

    public static double calculateCost(double time){
        if(time <= 60){
            return 3.00;
        }
        double totalCost = (time - 60) * 0.01;
        totalCost = totalCost * 100;
        totalCost = Math.round(totalCost);
        totalCost = totalCost / 100;
        return totalCost + 3.00;
    }

    public static void main(String[] args) {
        System.out.println(calculateCost(calculateTimeDiff("16:14", "19:09")));

    }
}
