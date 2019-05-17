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
 * @author ACER
 */
public class Nomor7Test {
    
    public Nomor7Test() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Nomor7 fungsi = new Nomor7();
    
    /**
     * Test dari method getRandom() dengan kondisi parameter unique adalah false
     */
    @Test
    public void testRandomCharFalse() {
        String random = fungsi.getRandom(20, false);
        assertTrue(random.length() == 20);
        String random2 = fungsi.getRandom(90, false);
        assertTrue(random2.length() == 90);
        assertFalse(random2.length() == 70);
    }
    
    /**
     * Test dari method getRandom() dengan kondisi parameter unique adalah true
     */
    @Test
    public void testRandomCharTrue() {
        String random = fungsi.getRandom(25, true);
        assertTrue(random.length() == 25);
        String random2 = fungsi.getRandom(100, true);
        
        //cek jika dimasukan nilai lebih dari yang dilimitkan
        assertFalse(random2.length() == 0);
        assertFalse(random2.length() == 0);
        assertNotNull("return exception more than allowed of n",random2);
        //hasil tidak mengambalikan nilai 100
        //hasil tidak null, karena mengembalikan pesan bahwa angka yang dimasukkan
        //melebihi yang diijinkan
    }
}
