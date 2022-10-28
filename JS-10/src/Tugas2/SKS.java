package Tugas2;

public class SKS {
    public static void main(String[] args){
        Mahasiswa informatika = new Mahasiswa();

        informatika.nama = "Joni";
        informatika.nim = "12345";
        informatika.semester = 5;
        informatika.ip = 3.50f;
        informatika.status = " ";

        if(informatika.ip >= 3.5){
            informatika.status = "Anda berhak mengontak 24 SKS pada Semester V";
            }
        else if(informatika.ip >= 3.0){
                informatika.status = "Anda berhak mengontak 22 SKS pada Semester V";
            }
        else if(informatika.ip >= 2.5){
            informatika.status = "Anda berhak mengontak 20 SKS pada Semester V";
            }
        else if(informatika.ip >= 2.0){
            informatika.status = "Anda berhak mengontak 18 SKS pada Semester V";
            }
        else if(informatika.ip < 2.0){
            informatika.status = "Anda berhak mengontak 15 SKS pada Semester V";
            }

        System.out.println("Data Mahasiswa");
        System.out.println("Nama Mahasiswa\t: "+ informatika.nama);
        System.out.println("NIM\t: "+ informatika.nim);
        System.out.println("Semester\t: "+ informatika.semester);
        System.out.println("IP Semester ini\t: "+ informatika.ip);
        System.out.println(informatika.status);
    }
}
