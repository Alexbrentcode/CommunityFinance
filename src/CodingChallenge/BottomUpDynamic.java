package CodingChallenge;

import java.math.BigDecimal;
import java.util.Arrays;

public class BottomUpDynamic {

    public static int testFunction(int amount){
        int[] coins = new int[]{1, 2, 5, 10, 20, 50, 100, 500, 1000, 20000};
        int[] outputChange = new int[amount];
        int newAmount = (int) amount;
        int[] dynamicArr = new int[newAmount+1];
        Arrays.fill(dynamicArr, Integer.MAX_VALUE);
        dynamicArr[0] = 0;
        for(int i = 0; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    dynamicArr[i] = Math.min(dynamicArr[i], 1 + dynamicArr[(i - coins[j])]);
                    outputChange[j] = coins[j];
                }
            }
        }
        System.out.println(outputChange[0]);
        System.out.println(outputChange[1]);
        System.out.println(outputChange[2]);
        return dynamicArr[amount];
    }

    public static void main(String[] args) {
        System.out.println(testFunction(585));

    }

}
