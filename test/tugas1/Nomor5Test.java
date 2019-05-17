/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class Nomor5Test {
    
    public Nomor5Test() {
    }

    /**
     * Test of main method, of class Nomor5.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of increment method, of class Nomor5.
     */
    
    //Sindi
    @Test
    public void testIncrement() {
        assertEquals(Arrays.asList("02","03","04","05","06","07","08","09","10"),Nomor5.increment(2, 10));
        assertEquals(Arrays.asList("3","4","5","6","7"),Nomor5.increment(3, 7));
        assertEquals(Arrays.asList("2","3","4","5"),Nomor5.increment(2, 5));
        assertEquals(Arrays.asList("07","08","09","10"),Nomor5.increment(7, 10));
        assertEquals(Arrays.asList("13","14","15","16","17","18","19","20","21"),Nomor5.increment(13, 21));
    }

    /**
     * Test of decrement method, of class Nomor5.
     * Arif fridasari
     */
    @Test
    public void testDecrement() {
         assertEquals(Arrays.asList("15","14","13","12","11","10","09","08","07"),Nomor5.decrement(7,15));
         assertEquals(Arrays.asList("20","19","18","17","16","15"),Nomor5.decrement(15,20));
         assertEquals(Arrays.asList("21","20","19","18","17","16","15","14","13","12","11","10"),Nomor5.decrement(10,21));
         assertEquals(Arrays.asList("20","19","18","17","16","15"),Nomor5.decrement(15,20));
         assertEquals(Arrays.asList("9","8","7","6"),Nomor5.decrement(6,9));
    }
    
}
