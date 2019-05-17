package tugas1;
import java.util.*;
public class Nomor6 {

    public static void main(String args[]) {

        ArrayList<int[]> tiles = new ArrayList<int[]>();
        Random gen = new Random();
        /**
         * Menambah kartu pada domino pada arraylist tiles
         */   
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                tiles.add(new int[]{i, j});
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
        //dibuat perulangan player
        int[][] player1_tiles = new int[4][28];
        int[][] player2_tiles = new int[4][28];
        int[][] player3_tiles = new int[4][28];
        int[][] player4_tiles = new int[4][28];
        int[][] player5_tiles = new int[4][28];
        int[][] player6_tiles = new int[4][28];
        int[][] sisa_tiles = new int[4][28];
        //dibuat perulangan tile
        int[] tile1 = null;
        int[] tile2 = null;
        int[] tile3 = null;
        int[] tile4 = null;
        int[] tile5 = null;
        int[] tile6 = null;
        int[] tilesisa = null;
        
        /**
         * Menyimpan kartu yang berbeda pada masing2 pemain
         * setiap menyimpan suatu kartu maka kartu tsb akan dihapus, agar tdk sama dgn player lainnya
         */
        for (int i = 0; i < player1_tiles.length; i++) {
            tile1 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile1);
            tile2 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile2);
            tile3 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile3);
            tile4 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile4);
            tile5 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile5);
            tile6 = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tile6);
            tilesisa = tiles.get(gen.nextInt(tiles.size()));
            tiles.remove(tilesisa);

            player1_tiles[i] = tile1;
            player2_tiles[i] = tile2;
            player3_tiles[i] = tile3;
            player4_tiles[i] = tile4;
            player5_tiles[i] = tile5;
            player6_tiles[i] = tile6;
            sisa_tiles[i] = tilesisa;
        }
        
        /**
         * Mencetak masing2 kartu yg diperoleh setiap
         */
        System.out.println("\nTile\tPlayer 1\tPlayer 2\tPlayer 3\tPlayer 4\tPlayer 5\tPlayer 6\tSisa Kartu");
        for (int i = 0; i < player1_tiles.length; i++) {
            System.out.print((i + 1) + ":  \t   ");
            for (int j = 0; j < player1_tiles[i].length; j++) {
                System.out.print(player1_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < player2_tiles[i].length; j++) {
                System.out.print(player2_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < player3_tiles[i].length; j++) {
                System.out.print(player3_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < player4_tiles[i].length; j++) {
                System.out.print(player4_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < player5_tiles[i].length; j++) {
                System.out.print(player5_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < player6_tiles[i].length; j++) {
                System.out.print(player6_tiles[i][j] + " ");
            }
            System.out.print("\t\t");

            for (int j = 0; j < sisa_tiles[i].length; j++) {
                System.out.print(sisa_tiles[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();
    }
}
