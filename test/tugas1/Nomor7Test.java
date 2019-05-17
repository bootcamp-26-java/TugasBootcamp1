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
    
    @Test
    public void testRandomChar() {
        String random = fungsi.getRandom(25, false);
        assertTrue(random.length() == 25);
        String random2 = fungsi.getRandom(90, false);
        assertTrue(random2.length() == 90);
        assertFalse(random2.length() == 70);
    }
}
