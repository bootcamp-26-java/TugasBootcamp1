/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class Nomor1Test {

    public Nomor1Test() {
    }

    @Test
     public void test1() {
         Nomor1 obj = new Nomor1();
         /**
          * Create : Arif Fridasari
          * Test Untuk Pemangkatan
          */
         assertEquals(625.0, obj.pangkat(5.0, 4.0), 0);
         assertEquals(0.125, obj.pangkat(2.0, -3.0), 0);
         assertEquals(81.0, obj.pangkat(9.0, 2.0), 0);
         
         /**
          * Create : Arif Fridasari
          * Test Untuk Kombinasi
          */
         assertEquals(5, obj.kombinasi(5, 4));
         assertEquals(35, obj.kombinasi(7, 3));
         assertEquals(84, obj.kombinasi(9, 3));
     }
     
     /**
    *
    * @author erik
    */
     
     /**
     * Test of Faktorial, of class Nomor1.
     */
     @Test
    public void testFaktorial() {
        assertEquals(40320, Nomor1.faktorial(8));
        assertEquals(6, Nomor1.faktorial(3));
        assertEquals(2, Nomor1.faktorial(2));
    }
    
    /**
    *
    * @author erik
    */
     
     /**
     * Test of Perkalian, of class Nomor1.
     */
    @Test
    public void testPerkalian() {
        assertEquals(20, Nomor1.kali(5,4));
        assertEquals(-20, Nomor1.kali(-5,4));
        assertEquals(-20, Nomor1.kali(5,-4));
        assertEquals(20, Nomor1.kali(-5,-4));
    }
    /**
    *
    * @author erik
    */
     
     /**
     * Test of Permutasi, of class Nomor1.
     */
    @Test
    public void testPermutasi() {
        assertEquals(120, Nomor1.permutasi(5, 4));
        assertEquals(60, Nomor1.permutasi(5, 3));
        assertEquals(20, Nomor1.permutasi(5, 2));
        assertEquals(5, Nomor1.permutasi(5, 1));
    }    
    
    
    /**
     * Test of main method, of class Nomor1.
     */
   
}
