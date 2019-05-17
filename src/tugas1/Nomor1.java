/*
 * Arif Fridasari Mengerjakan Nomor 1 Bagian Method Pemangkatan dan Kombinasi;
 */
package tugas1;

/**
 * Class Nomor1 yang digunakan untuk membuat nilai kembali dengan dua variabel a
 * dan b untuk menentukan nilai kombinasi dan perpangkatan dengan nama fungsi
 * kombinasi dan pangkat.
 *
 * @author ARIF FRIDASARI
 */
public class Nomor1 {

    /**
     * Nomor1 kombinasi yang digunakan untuk mencari nilai kombinasi dari 2 buah
     * nilai a dan b
     *
     * @param a
     * @param b
     * @return
     */
    public int kombinasi(int atas, int bawah) {
        return faktorial(atas) / (faktorial((atas) - (bawah)) * faktorial(bawah));

//        int awal = 1;
//        int btsbwh = 1;
//        int bts = 1;
//        for (int f = a; f >= 1; f--) {
//            awal *= f;
//        }
//        int bwh = (a - b);
//        for (int h = bwh; h >= 1; h--) {
//            btsbwh *= h;
//        }
//        for (int j = b; j >= 1; j--) {
//            bts *= j;
//        }
//        int hasilkom = (awal / (btsbwh * bts));
//        return hasilkom;
    }

    /**
     * Nomor1 pangkat untuk menghitung nilai pangkat dari nilai a dan nilai
     * pangkatnya b
     *
     * @param a
     * @param b
     * @return
     * @ARIF FRIDASARI
     */
    public double pangkat(double a, double b) {
        double hasilpem = 1;
        double z = 1;
        while (z <= b) {
//            if (b > 0) {
//                hasilpem *= a;
//            } else {
//                hasilpem /= a;
//            }
            hasilpem=(b > 0) ? hasilpem * a : hasilpem / a;

            z++;
        }

//        String nama = (true)?"dave":"lain";
        
        
//        if (b > 0) {
//            while (z <= b) {
//                hasilpem = hasilpem * a;
//                z++;
//            }
//        } else {
//            while (z <= Math.abs(b)) {
//                hasilpem = hasilpem / a;
//                z++;
//            }
//        }
        return hasilpem;
    }

    /**
     *
     * @author erik
     */
    /**
     * digunakan untuk melakukan perkalian sesuai dengan batas faktorial (b)
     * return digunakan untuk mengembalikan nilai hasil ke dalam
     * perkalian,sampai nilainya benar benar 0
     *
     * @param base
     * @return
     */
    public static int faktorial(int base) {
        int hasil = 1;
        for (int b = base; b >= 1; b--) {
            hasil *= b;
        }
        return hasil;
    }

    /**
     *
     * @author erik
     */
    /**
     *
     * @param x digunakan untuk melakukan penandaan berapa kali looping
     * dilakukan
     * @param a angka yang digunakan untuk melakuka penjumlahan dengan hasil
     * sesuai dari looping x
     * @return digunakan untuk mengembalikan nilai hasil ke dalam looping sampai
     * looping habis
     */
    public static int kali(int x, int a) {
        int hasil = 0;
        for (int c = 1; c <= Math.abs(x); c++) {
            if (x < 0) {
                hasil -= a;
            } else {
                hasil += a;
            }
        }
        return hasil;
    }

    /**
     *
     * @author erik
     */
    /**
     *
     * @param atas digunakan untuk menjadi angka yang dilakukan perkalian
     * looping
     * @param bawah digunakan untuk mencari batas dari looping yang dilakukan
     * pada angka atas dengan
     * @return
     */
    public static int permutasi(int atas, int bawah) {
        return faktorial(atas) / faktorial(atas - bawah);
    }

    public static void main(String[] args) {
        Nomor1 fungsi = new Nomor1();
        System.out.println("Hasil Pemangkatan : " + fungsi.pangkat(5, 4));
        System.out.println("Hasil Pemangkatan : " + fungsi.pangkat(5, 0));
        System.out.println("Hasil Kombinasi : " + fungsi.kombinasi(5, 4));
        System.out.println("Hasil faktorial : " + fungsi.faktorial(0));
        System.out.println("Hasil Perkalian : " + fungsi.kali(5, 4));
        System.out.println("Hasil Perkalian : " + fungsi.kali(-5, 4));
        System.out.println("Hasil Perkalian : " + fungsi.kali(5, -4));
        System.out.println("Hasil Perkalian : " + fungsi.kali(-5, -4));
        System.out.println("Hasil Permutasi : " + fungsi.permutasi(5, 2));

    }

}
