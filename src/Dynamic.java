


/*
 * Authors: Scott Kirkpatrick, James Eaton
 * Date: 4/20/18
 * Overview: Creates change for a value from a set of coins using dynamic programming methods
 */


public class Dynamic {
    
    public static int[] makeChange(int coinSet[], int target){
        if(coinSet == null || coinSet.length == 0){
            throw new IllegalArgumentException("No coin values given");
        }
        int minCoins[][] = new int[target+1][2];
        minCoins[0][0] = 0;
        int cents ;
        for(cents= 0; cents <= target; cents++){
            int coinCount = cents;
            for(int j:coinSet ){
                if(j <= cents){
                    if(minCoins[cents-j][0]+1 < coinCount){
                        coinCount = minCoins[cents-j][0]+1;
                        minCoins[cents][1] = j;
                    }
                }
            }
            minCoins[cents][0] = coinCount;
        }
        int change[] = new int[minCoins[target][0]];
        int remainder = target;
        for(int i = 0; i < minCoins[target][0]; i++){
            change[i] = minCoins[remainder][1];
            remainder -= change[i];
        }
        return change;
    }

}
