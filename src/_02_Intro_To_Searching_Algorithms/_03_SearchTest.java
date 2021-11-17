package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String array[] = {"hello","hi","wacha doing","pi = 3.14","a","x","like","as"};
        assertEquals(_01_LinearSearch.linearSearch(array,"pi = 3.14" ),3);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int array[] = {0,3,5,9,12,19,24,25,66,102,590};
        assertEquals(_02_BinarySearch.binarySearch(array, 0, array.length, 19),5);
    }
}
