package tugas1;

/**
 * Class ini menkonversikan desimal dari/ke biner, hexa, octal
 *
 * @author Gede
 */
public class Nomor2 {

    public static void main(String[] args) {
        Nomor2 fungsi = new Nomor2();
        System.out.println("Fungsi konversi ke biner : " + fungsi.DecimaltoBinary(12));
        System.out.println("Fungsi konversi ke Hexa : " + fungsi.DecimaltoHexa(30));
        System.out.println("Fungsi konversi ke oktal : " + fungsi.DecimaltoOctal(23));
        System.out.println("Fungsi konversi dari biner : " + fungsi.BinerToDecimal(1));
        System.out.println("Fungsi konversi dari Hexa : " + fungsi.HexaToDecimal("1A"));
        System.out.println("Fungsi konversi dari oktal : " + fungsi.OctalToDecimal(37));

    }

    /**
     * Mengkonversikan bilangan desimal ke bilangan biner String temp untuk
     * menyimpan String return kembalian nilai
     *
     * @param decimal
     * @return 
     */
    public String DecimaltoBinary(int decimal) {
        String hasil = "";
        if(decimal==0){
            return "0";
        }
        while (decimal > 0) {
            hasil = decimal % 2 + hasil;
            decimal = decimal / 2;
        }
        return hasil;
    }

    /**
     * Mengkonversikan bilangan desimal ke bilangan hexadesimal
     *
     * @param decimal
     *
     * @return By Gede
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
     *
     * @param decimal
     * @return By Gede
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
     * Method untuk perpangkatan
     *
     * @param n merupakan bilangan pokok yang akan di pangkatkan
     * @param power merupakan bilangan eksponen yang menentukan berapa kali
     * pangkat yang diinginkan
     * @return nilai yang dikembalikan adalah nilai n dikalikan sebanyak
     * perulangan nilai power yang dimasukan
     */
    public int calcPow(int n, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= n;
        }
        return result;
    }

    /**
     * Method untuk merubah bilangan biner ke desimal
     *
     * @param biner bilangan biner yang ingin dirubah ke desimal
     * @return nilai kembalian dari biner ke desimal dengan tipe data berupa
     * integer
     */
    public int BinerToDecimal(int biner) {
        int pangkat = 0;
        int desimal = 0;
        int temp;
        while (true) {
            if (biner == 0) {
                break;
            } else {
                temp = biner % 10;
                desimal += temp * calcPow(2, pangkat);
                //desimal += temp * pangkat^2;
                biner = biner / 10;
                pangkat++;
            }
        }
        return desimal;
    }

    /**
     * Method untuk merubah bilangan hexadesimal ke desimal
     *
     * @param hexa bilangan hexadesimal yang ingin dirubah ke desimal
     * @return nilai kembalian dari hexadesimal ke desimal dengan tipe data
     * berupa integer
     */
    public int HexaToDecimal(String hexa) {
        String digits = "0123456789ABCDEF";
        hexa = hexa.toUpperCase();
        int val = 0;
        char c;
        int d;
        for (int i = 0; i < hexa.length(); i++) {
            c = hexa.charAt(i);
            d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    /**
     * Method untuk merubah bilangan oktal ke desimal
     *
     * @param oktal bilangan oktal yang ingin dirubah ke desimal
     * @return nilai kembalian dari oktal ke desimal dengan tipe data integer
     */
    public int OctalToDecimal(int oktal) {

        int desimal = 0;
        int i = 0;
        int tmp;

        while (oktal != 0) {
            tmp = oktal % 10;
            //desimal += tmp * Math.pow(8, i);
            desimal += tmp * calcPow(8, i);
            oktal = oktal / 10;
            i++;
        }
        return desimal;
    }

}
