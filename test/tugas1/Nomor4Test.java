
package tugas1;

import org.junit.Test;
import static org.junit.Assert.*;


public class Nomor4Test {
    
    public Nomor4Test() {
    }

    
    /**
     * author Dan!
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
