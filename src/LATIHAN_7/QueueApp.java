package LATIHAN_7;
public class QueueApp {
    public static void main(String[]  args){
            Queue antrian = new Queue(10);
            antrian.masuk(73);
            antrian.lihat();
            antrian.masuk(45);
            antrian.lihat();
            antrian.masuk(80);
            antrian.lihat();   
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
    }
}
