package com.example.lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AggregatorsTests {

    @Test
    public void Max_Typical()
    {
        assertEquals(
                6,
                Aggregators.Max(new int[] {1, 4, 6, 2})
        );
    }

    @Test
    public void Max_SameData()
    {
        assertEquals(
                1,
                Aggregators.Max(new int[] {1, 1, 1, 1})
        );
    }

    @Test
    public void Max_WithNegatives()
    {
        assertEquals(
                -1,
                Aggregators.Max(new int[] {-1, -4, -5})
        );
    }

    @Test
    public void Max_WithNegativesAndPositive()
    {
        assertEquals(
                9,
                Aggregators.Max(new int[] {-1, -4, -5, 2, 1, 9})
        );
    }

    @Test
    public void Min_Typical()
    {
        assertEquals(
                1,
                Aggregators.Min(new int[] {1, 4, 6, 2})
        );
    }

    @Test
    public void Min_SameData()
    {
        assertEquals(
                1,
                Aggregators.Min(new int[] {1, 1, 1, 1})
        );
    }

    @Test
    public void Min_WithNegatives()
    {
        assertEquals(
                -5,
                Aggregators.Min(new int[] {-1, -4, -5})
        );
    }

    @Test
    public void Min_WithNegativesAndPositive()
    {
        assertEquals(
                -5,
                Aggregators.Min(new int[] {-1, -4, -5, 2, 1, 9})
        );
    }

}
