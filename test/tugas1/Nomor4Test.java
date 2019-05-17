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
 * @author WINDOWS 10
 */
public class Nomor4Test {
    
    public Nomor4Test() {
    }

    /**
     * Test of Pecah method, of class Nomor4.
     */
    @Test
    public void testPecah() {
        Nomor4 Pecahan = new Nomor4();
        Object array = Pecahan.toString();
        assertEquals(Pecahan, Pecahan);
        assertSame(Pecahan, Pecahan);
      
    }

    /**
     * Test of main method, of class Nomor4.
     */
    @Test
    public void testMain() {
    }
    
}
