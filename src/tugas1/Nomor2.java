package tugas1;

/**
 * Class ini menkonversikan desimal dari/ke biner, hexa, octal
 * @author ASUS
 */
public class Nomor2 {

    public static void main(String[] args) {
        Nomor2 fungsi = new Nomor2();
        System.out.println(fungsi.DecimaltoBinary(100));
        System.out.println(fungsi.DecimaltoHexa(150));
        System.out.println(fungsi.DecimaltoOctal(31));
        System.out.println(fungsi.BinerToDecimal(1));
        System.out.println(fungsi.HexaToDecimal("9E"));
        System.out.println(fungsi.OctalToDecimal(37));

    }
    /**
     * Mengkonversikan bilangan desimal ke bilangan biner
     * String temp untuk menyimpan String return kembalian nilai
     * 
     * @param decimal
     * @return 
     * By Gede
     */
    public String DecimaltoBinary(int decimal) {
        String hasil = "";
        while (decimal > 0) {
            hasil = decimal % 2 + hasil;
            decimal = decimal / 2;
        }
        return hasil;
    }
    /**
     * Mengkonversikan bilangan desimal ke bilangan hexadesimal
     * @param decimal
     * 
     * @return 
     * By Gede
     */
    public String DecimaltoHexa(int decimal) {
        String hasil = "";
        int sisa;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            sisa = decimal % 16;
            hasil = hexa[sisa] + hasil;
            decimal = decimal / 16;
        }
        return hasil;
    }
    /**
     * Mengkonversikan bilangan desimal ke bilangan octal
     * @param decimal
     * @return 
     * By Gede
     */
    public int DecimaltoOctal(int decimal) {
        int i = 1, sisa, hasil = 0;
        while (decimal != 0) {
            sisa = decimal % 8;
            hasil = hasil + sisa * i;
            decimal = decimal / 8;
            i = i * 10;
        }
        return hasil;
    }
    
    /**
     * Untuk membantu memangkatkan
     * @param n
     * @param power
     * @return 
     */
     public int calcPow(int n, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= n;
        }
        return result;
    }
     
     /**
      * Untuk Konversi Bilangan Biner ke Desimal
      * @param biner
      * @return 
      */
     public int BinerToDecimal(int biner){
       int pangkat = 0;
       int desimal = 0;
       int temp;
       while (true) {           
           if (biner == 0) {
               break;
           } else {
               temp = biner%10;
               desimal += temp * calcPow(2, pangkat);
               //desimal += temp * pangkat^2;
               biner = biner/10;
               pangkat++;
           }
       }
       return desimal;
   }
    
     /**
      * Untuk Konversi dari Bilangan Hexadesimal ke Desimal
      * @param hexa
      * @return 
      */
    public int HexaToDecimal(String hexa){
       String digits = "0123456789ABCDEF";
       hexa = hexa.toUpperCase();
       int val = 0;
       char c;
       int d;   
       for (int i = 0; i < hexa.length(); i++) {
           c = hexa.charAt(i);
           d = digits.indexOf(c);
           val = 16*val + d;
       }
       return val;
   }
    
    /**
     * Untuk Konversi dari Bilangan Octal ke bilangan desimal
     * @param oktal
     * @return 
     */
    public int OctalToDecimal(int oktal){
       
       int desimal = 0;
       int i = 0;
       int tmp;
       
       while (oktal != 0) {      
           tmp = oktal%10;
           //desimal += tmp * Math.pow(8, i);
           desimal += tmp * calcPow(8, i);
           oktal = oktal / 10;
           i++;
       }
       return desimal;
   }

}

