// 12S24038 - Nicolas J Grace Butarbutar
// 12S24026 - Griselda Tabitha Nathania Hutahean

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, format, kategori, keterangan, ultimate;
        int tahun, stok;
        double harga, margin, rating, diskon;

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahun = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            format = input.nextLine();
            harga = Double.parseDouble(input.nextLine());
            margin = Double.parseDouble(input.nextLine());
            diskon = margin * -1 / harga;
            if (diskon >= (double) 40 / 100) {
                keterangan = "Once in a lifetime";
            } else {
                if (diskon >= (double) 20 / 100 && diskon < (double) 40 / 100) {
                    keterangan = "Never come twice";
                } else {
                    if (diskon > 0 && diskon < (double) 20 / 100) {
                        keterangan = "No Regret";
                    } else {
                        keterangan = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5 && rating < 4.7) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0 && rating < 4.5) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0 && rating < 4.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (kategori.equals("Best Pick") && keterangan.equals("Once in a lifetime")) {
                ultimate = "The ultimate best";
            } else {
                ultimate = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + keterangan + "|" + ultimate);
            iSBN = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
