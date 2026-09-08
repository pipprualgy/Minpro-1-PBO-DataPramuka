
package com.mycompany.minprodatapramuka;

/**
 *
 * @author ASUS TUF
 */
public class AnggotaPramuka {
    int idAnggota;
    String namaAnggota;
    String jenisKelamin;
    int kodeGugusDepan;
    int idKwarran;
    
    public AnggotaPramuka(int idAnggota, String namaAnggota, String jenisKelamin, int kodeGugusDepan, int idKwarran) {
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.jenisKelamin = jenisKelamin;
        this.kodeGugusDepan = kodeGugusDepan;
        this.idKwarran = idKwarran;
    }
    public void tampilkanData() {
        System.out.println("ID Anggota Pramuka: " + idAnggota);
        System.out.println("Nama Anggota Pramuka: " + namaAnggota);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Gugus Depan: " + kodeGugusDepan);
        System.out.println("Asal Kwarran: " + idKwarran);
    }
}
