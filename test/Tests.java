/*
 * Author: Scott Kirkpatrick
 * Date: 4/13/2018
 * Overview: Tests for the greedy algorithm.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author z79x595
 */
public class Tests {
    
    public Tests() {
    }
    /*
    @Test
    public void UScoinTest(){
        int CoinSet[] = {1,5,10,25};
        int[] arr1 = {1,1,1,1,5,10,25,25};
        assertArrayEquals(arr1, Dynamic.makeChange(CoinSet, 69));
        int[] arr2 = {1,1,10,25};
        assertArrayEquals(arr2, Dynamic.makeChange(CoinSet, 37));
        int[] arr3 = {};
        assertArrayEquals(arr3, Dynamic.makeChange(CoinSet, 0));
        int[] arr4 = {25,25,25,25};
        assertArrayEquals(arr4, Dynamic.makeChange(CoinSet, 100));
    }
    
    @Test
    public void BritishcoinTest(){
        int CoinSet[] = {1,2,5,10,20,50};
        int arr1[] = {1,2,5,10,20,50};
        assertArrayEquals(arr1, Dynamic.makeChange(CoinSet, 88));
        int arr2[] = {2,5};
        assertArrayEquals(arr2, Dynamic.makeChange(CoinSet, 7));
        int arr3[] = {2,5,20,20};
        assertArrayEquals(arr3, Dynamic.makeChange(CoinSet, 47));
    }
    
    @Test
    public void PrimescoinTest(){
        int CoinSet[] = {1,2,3,5,7,11,13,17,19,23};
        int arr1[] = {11,23,23};
        assertArrayEquals(arr1, Dynamic.makeChange(CoinSet, 57));
    }
    */
    @Test
    public void WeirdcoinTest(){
        int CoinSet[] = {1,7,12,32};
        int arr1[] = {7,12,12,32,32};
        assertArrayEquals(arr1, Dynamic.makeChange(CoinSet, 95));
        int arr2[] = {12,12,12};
        assertArrayEquals(arr2, Dynamic.makeChange(CoinSet, 36));
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void nullCoins(){
        int CoinSet[] = {};
        Dynamic.makeChange(CoinSet, 1);
    }

}
