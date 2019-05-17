/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import tugas1.Nomor5;

/**
 *
 * @author Arif Fridasari
 */
public class TestNomor5 {
    public TestNomor5() {
    }
     @Test
     public void test5() {
          Nomor5 obj = new Nomor5();
          assertEquals(Arrays.asList("15","14","13","12","11","10","09","08","07","06","05","04","03"),obj.decrement(15,3));
     }
}
