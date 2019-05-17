package tugas1;

import org.junit.Test;
import static org.junit.Assert.*;
import tugas1.Nomor2;

/**
 *
 * @author Gede
 */
public class Nomor2Test {
    Nomor2 coba = new Nomor2();
    @Test
    public void testDecimaltoBinary() {
        assertEquals("1100100", coba.DecimaltoBinary(100));
        assertEquals("1111101000", coba.DecimaltoBinary(1000));
        assertEquals("1111111111111111111111111111111111111111111111111111111111111111", coba.DecimaltoBinary(-1));
        
    }
    
    @Test
    public void testDecimaltoHexa() {
        assertEquals("96", coba.DecimaltoHexa(150));
        assertEquals("3E8", coba.DecimaltoHexa(1000));
        assertEquals("FFFFFFFFFFFFFFFF", coba.DecimaltoHexa(-9));
    }
    @Test
    public void testDecimaltoOctal() {
        assertEquals(37, coba.DecimaltoOctal(31));
        assertEquals(1750, coba.DecimaltoOctal(1000));
        assertEquals(1, coba.DecimaltoOctal(-1)); 
    }
    @Test
    public void testBinarytoDecimal() {
        assertEquals(1, coba.BinerToDecimal("1"));
        assertEquals(8, coba.BinerToDecimal("1000"));
    }
    @Test
    public void testHexatoDecimal() {
        assertEquals(158, coba.HexaToDecimal("9E"));  
        assertEquals(2538, coba.HexaToDecimal("9EA"));
        assertEquals(-1, coba.HexaToDecimal("FFFFFFFFFFFFFFFF"));
    }
    @Test
    public void testOctaltoDecimal() {
        assertEquals(31, coba.OctalToDecimal("37"));
        assertEquals(512, coba.OctalToDecimal("1000"));
        assertEquals(1, coba.OctalToDecimal("-1"));
    }
    
}
