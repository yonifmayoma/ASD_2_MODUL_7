package TUGAS_7;
public class QueueApp {
    public static void main(String[]  args){
            Queue antrian = new Queue(10);
            antrian.masuk(40);
            antrian.lihat();
            antrian.masuk(33);
            antrian.lihat();   
            System.out.println("nilai yang paling depan = " + antrian.peekDepan());
            antrian.masuk(60);
            antrian.lihat();
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
            System.out.println("yang diambil dari antrian = " + antrian.keluar());
            antrian.lihat();
            antrian.masuk(54);
            antrian.lihat();
            System.out.println("nilai yang paling depan = " + antrian.peekDepan());
    }
}
