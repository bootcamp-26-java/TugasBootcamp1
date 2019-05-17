/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class Nomor3Test {
    
    public Nomor3Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
    public void isPrima(){
         assertEquals(Arrays.asList(2, 3, 5, 7), Nomor3.prima(10));
    }
    
    @Test
    public void testFibo() {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8),Nomor3.fibo(10));
        assertEquals(Arrays.asList(0, 1, 1, 2,3),Nomor3.fibo(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5),Nomor3.fibo(7));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13),Nomor3.fibo(15));
    
}
}
