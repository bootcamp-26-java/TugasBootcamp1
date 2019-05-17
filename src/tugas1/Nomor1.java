/*
 * Arif Fridasari Mengerjakan Nomor 1 Bagian Method Pemangkatan dan Kombinasi;
 */
package tugas1;

public class Nomor1 {
    /**
     * Kombinasi
     * Create : Arif 
     * Rumus : Kombinasi = Faktorial Batas Atas / Faktorial (Batas Atas - Batas Bawah) * Faktorial Batas Bawah
     * Merupakan Method untuk menghitung Nilai Kombinasi dari dua buah inputan
     * @param atas merupakan parameter input nilai awal dari kombinasi yang digunakan sebagai batas atas
     * @param bawah merupakan parameter input nilai awal dari kombinasi yang digunakan sebagai batas bawah 
     * @return 
     */
    public int kombinasi(int atas, int bawah) {
        return faktorial(atas) / (faktorial((atas) - (bawah)) * faktorial(bawah));
    }

    /**
     * Pemangkatan
     * Create : Arif 
     * Rumus : Pemangkatan = Nilai base ^ Nilai atas
     * Merupakan Method untuk menghitung Pemangkatan dengan inputan bilangan double base dan atas
     * @param base merupakan parameter inputan yang digunakan sebagai nilai awal atau nilai yang akan dipangkatkan
     * @param atas merupakan parameter inputan yang digunakan sebagai pangkat.
     * @return 
     */
    public double pangkat(double base, double atas) {
        double hasilpem = 1;
        double z = 1;
        while (z <= atas) {
            hasilpem=(atas > 0) ? hasilpem * base : hasilpem / base;
            z++;
        }
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
