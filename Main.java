import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Membuat objek BT */
        BinaryTree2 bt = new BinaryTree2();
        /* Melakukan operasi pada pohon */
        System.out.println("Uji Pohon Biner\n");
        char ch;
        do {
            System.out.println("\nOperasi Pohon Biner\n");
            System.out.println("1. Masukkan ");
            System.out.println("2. Cari");
            System.out.println("3. Hitung jumlah simpul");
            System.out.println("4. Periksa apakah kosong");

            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan elemen bilangan bulat");
                    bt.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Masukkan elemen bilangan bulat untuk dicari");
                    System.out.println("Hasil pencarian : " + (bt.search(scan.nextInt()) ? "Ditemukan" : "Tidak ditemukan"));
                    break;
                case 3:
                    System.out.println("Jumlah simpul = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Status kosong = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Masukan Salah \n ");
                    break;
            }
            /* Menampilkan pohon */
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nApakah Anda ingin melanjutkan (Ketik y atau n)\n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
