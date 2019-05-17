package tugas1;


public class Nomor4 {
    /**
     * author Dan!
     * Method Pecah digunakan untuk menentukan pecahan uang berdasarkan nominal
     * @param uang merupakan nilai inputan
     * @return nilai kembalian dari method Pecah merupakan sisa berupa angka
     */
    
        public static int Pecah(int uang){
        int[] pecah = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100}; //membuat array
        int jml;

        //looping untuk menghitung pecahan uang
        for (int i = 0; i < 10; i++) {
            jml = uang / pecah[i]; //menentukan jumlah lembar uang
            uang = uang - (pecah[i] * jml); //menentukan sisa uang
            System.out.println("Uang Pecahan " + pecah[i] + " sebanyak " + jml+" lembar"); //menampilkan hasil
        }

        return uang; //nilai kembalian

    }
    
    public static void main(String[] args) {
        System.out.println(Pecah(176600)); //membuat masukan

    }
    
}
