package com.mycompany.minprodatapramuka;

/**
 *
 * @author ASUS TUF
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Minprodatapramuka {
    
    @SuppressWarnings("empty-statement")
    public static void main (String[]args){
         Scanner input = new Scanner(System.in);

        
        ArrayList<AnggotaPramuka>anggotaPramuka = new ArrayList<>();
        ArrayList<GugusDepan>gugusDepan = new ArrayList<>();
        ArrayList<Kwarran>kwarran = new ArrayList<>();
        
        int pilihan;
        
        do{
            System.out.println("Keanggotaan Pramuka");
            System.out.println("1. Gugus Depan");
            System.out.println("2. Kwartir Ranting");
            System.out.println("3. Anggota Pramuka");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            
            pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan){
                
                // GUGUS DEPAN
                
                case 1:
                    int pilihanGugusDepan;
                    
                    do{
                        System.out.println("Gugus Depan");
                        System.out.println("1. Tambah Gugus Depan");
                        System.out.println("2. Lihat Gugus Depan");
                        System.out.println("3. Update Gugus Depan");
                        System.out.println("4. Hapus Gugus Depan");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih Menu: ");
                        
                        pilihanGugusDepan = input.nextInt();
                        input.nextLine();
                        
                        switch (pilihanGugusDepan) {
                            //Create
                            case 1:
                                System.out.print("Nomor Gugus Depan: ");
                                int kodeGugusDepan = input.nextInt();
                                input.nextLine();
                                
                                System.out.print("Nama Gugus Depan: ");
                                String namaGugusDepan = input.nextLine();
                                
                                System.out.print("Pangkalan: ");
                                String pangkalan = input.nextLine();
                                
                                gugusDepan.add(
                                    new GugusDepan(kodeGugusDepan, namaGugusDepan, pangkalan)
                                );
                                
                                System.out.println("Data Gudep Berhasil Ditambahkan");
                                break;
                                
                            //Read
                            case 2:
                                if(gugusDepan.isEmpty()){
                                    System.out.println("Belum Ada Gudep yang Terdaftar");
                                }else{
                                    System.out.println("Daftar Gugus Depan Terdaftar:");
                                    
                                    for(int i=0; i < gugusDepan.size(); i++){
                                        GugusDepan f = gugusDepan.get(i);
                                        
                                        System.out.println(
                                        (i+1)+ "."+
                                        f.kodeGugusDepan + "|" +
                                        f.namaGugusDepan + "|" +
                                        f.pangkalan
                                        );
                                    }
                                }
                                break;
                            
                            //Update
                            case 3:
                                if(gugusDepan.isEmpty()){
                                    System.out.println("Belum Ada Gudep yang Terdaftar");
                                }else{
                                    System.out.print("Nomor Gudep yang Ingin Diubah: ");
                                    int no = input.nextInt();
                                    input.nextLine();
                                    
                                    if (no >= 1 && no <= gugusDepan.size()){
                                        GugusDepan f = gugusDepan.get(no-1);
                                        
                                        System.out.print("Nomor Gugus Depan Baru: ");
                                        f.kodeGugusDepan = input.nextInt();
                                        input.nextLine();
                                        
                                        System.out.print("Nama Gugus Depan Baru: ");
                                        f.namaGugusDepan = input.nextLine();
                                        
                                        System.out.print("Pangkalan Baru: ");
                                        f.pangkalan = input.nextLine();
                                        
                                        System.out.println("Data Gugus Depan Telah Diubah");
                                    }else{
                                        System.out.println("Data Gugus Depan Tidak Tersedia");
                                    }
                                }
                                break;
                            
                                //Delete
                            case 4:
                                if(gugusDepan.isEmpty()){
                                    System.out.println("Belum ada Gudep yang Terdaftar");
                                }else{
                                    System.out.print("Nomor Gugus Depan: ");
                                    int no = input.nextInt();
                                    
                                    if(no >= 1 && no <= gugusDepan.size()){
                                        gugusDepan.remove(no-1);
                                        System.out.println("Gugus Depan Telah Dihapus");
                                    }else{
                                        System.out.println("Gugus Depan Tidak Tersedia");
                                    }
                                }
                                break;
                        }
                    }while (pilihanGugusDepan !=5);
                    break;
                    
                //KWARRAN
                case 2:
                    int pilihanKwarran;

                    do{
                        System.out.println("Kwartir Ranting");
                        System.out.println("1. Tambah Kwarran");
                        System.out.println("2. Lihat Kwarran");
                        System.out.println("3. Update Kwarran");
                        System.out.println("4. Hapus Kwarran");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih Menu: ");

                            pilihanKwarran = input.nextInt();
                            input.nextLine();

                            switch (pilihanKwarran){

                                //Create
                                case 1:
                                    System.out.print("ID Kwarran: ");
                                    int idKwarran = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Nama Kwarran: ");
                                    String namaKwarran = input.nextLine();

                                    kwarran.add(
                                    new Kwarran(idKwarran, namaKwarran)
                                    );
                                    System.out.println("Data Kwaarran Telah Ditambahkan");
                                    break;
                                    
                                //Read
                                case 2:
                                    if(kwarran.isEmpty()){
                                    System.out.println("Belum Ada Gudep yang Terdaftar");
                                }else{
                                    System.out.println("Daftar Gugus Depan Terdaftar:");
                                    
                                    for(int i=0; i < kwarran.size(); i++){
                                        Kwarran f = kwarran.get(i);
                                        
                                        System.out.println(
                                        (i+1)+ "." + f.idKwarran + "|" + f.namaKwarran);
                                    }
                                }
                                break;
                                
                                //Update
                                case 3:
                                    if(kwarran.isEmpty()){
                                    System.out.println("Belum Ada Kwarran yang Terdaftar");
                                }else{
                                    System.out.print("Nomor Kwarran yang Ingin Diubah: ");
                                    int no = input.nextInt();
                                    input.nextLine();
                                    
                                    if (no >= 1 && no <= kwarran.size()){
                                        Kwarran f = kwarran.get(no-1);
                                        
                                        System.out.print("Nomor Kwartir Ranting Baru: ");
                                        f.idKwarran = input.nextInt();
                                        input.nextLine();
                                        
                                        System.out.print("Nama Kwartir Ranting Baru: ");
                                        f.namaKwarran = input.nextLine();
                                        
                                        System.out.println("Data Kwartir Ranting Telah Diubah");
                                    }else{
                                        System.out.println("Data Kwartir Ranting Tidak Tersedia");
                                    }
                                }
                                break;
                                
                                //Delete
                                case 4:
                                    if(kwarran.isEmpty()){
                                    System.out.println("Belum ada Kwarran yang Terdaftar");
                                }else{
                                    System.out.print("Nomor Kwartir Ranting: ");
                                    int no = input.nextInt();
                                    input.nextLine();
                                    
                                    if(no >= 1 && no <= kwarran.size()){
                                        kwarran.remove(no-1);
                                        System.out.println("Kwartir Ranting Telah Dihapus");
                                    }else{
                                        System.out.println("Kwarran Tidak Tersedia");
                                    }
                                }
                                break;
        }
                            }while (pilihanKwarran !=5);
                            break;
                            
                            //ANGGOTA PRAMUKA
            case 3:          
                int pilihanAnggotaPramuka;

                    do{
                        System.out.println("Anggota Pramuka");
                        System.out.println("1. Tambah Anggota");
                        System.out.println("2. Lihat Anggota");
                        System.out.println("3. Update Anggota");
                        System.out.println("4. Hapus Anggota");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih Menu: ");

                            pilihanAnggotaPramuka = input.nextInt();
                            input.nextLine();

                            switch (pilihanAnggotaPramuka){
                                
                            //Create
                            case 1:
                            System.out.print("ID Anggota: ");
                                    int idAnggota = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Nama Anggota Pramuka: ");
                                    String namaAnggota = input.nextLine();
                                    
                                    System.out.print("Jenis Kelamin: ");
                                    String jenisKelamin = input.nextLine();
                                    
                                    System.out.print("Nomor Gugus Depan: ");
                                    int kodeGugusDepan = input.nextInt();
                                    input.nextLine();
                                    
                                    System.out.print("ID Kwartir Ranting: ");
                                    int idKwarran = input.nextInt();
                                    input.nextLine();

                                    anggotaPramuka.add(
                                    new AnggotaPramuka(idAnggota, namaAnggota,jenisKelamin, kodeGugusDepan, idKwarran)
                                    );
                                    System.out.println("Data Anggota Telah Ditambahkan");
                                    break;
                                    
                            //Read
                            case 2:
                            if(anggotaPramuka.isEmpty()){
                                    System.out.println("Belum Ada Anggota yang Terdaftar");
                                }else{
                                    System.out.println("Daftar Anggota yang Terdaftar:");
                                    
                                    for(int i=0; i < anggotaPramuka.size(); i++){
                                        AnggotaPramuka f = anggotaPramuka.get(i);
                                        
                                        System.out.println(
                                        (i+1)+ "."+ f.idAnggota + "|" + f.namaAnggota + "|" + f.jenisKelamin + "|" + f.kodeGugusDepan + "|" + f.idKwarran);
                                    }
                                }
                                break;
                                    
                            //Update
                            case 3:
                            if(anggotaPramuka.isEmpty()){
                                    System.out.println("Belum Ada Anggota yang Terdaftar");
                                }else{
                                    System.out.print("ID Anggota yang Ingin Diubah: ");
                                    int no = input.nextInt();
                                    input.nextLine();
                                    
                                    if (no >= 1 && no <= anggotaPramuka.size()){
                                        AnggotaPramuka f = anggotaPramuka.get(no-1);
                                        
                                        System.out.print("ID Anggota Pramuka Baru: ");
                                        f.idAnggota = input.nextInt();
                                        input.nextLine();
                                        
                                        System.out.print("Nama Anggota Pramuka Baru: ");
                                        f.namaAnggota = input.nextLine();
                                        
                                        System.out.print("Jenis Kelamin: ");
                                        f.jenisKelamin = input.nextLine();
                                        
                                        System.out.print("Nomor Gugus Depan Baru: ");
                                        f.kodeGugusDepan = input.nextInt();
                                        input.nextLine();
                                        
                                        System.out.print("ID Kwartir Ranting Baru: ");
                                        f.idKwarran = input.nextInt();
                                        input.nextLine();
                                        
                                        
                                        System.out.println("Data Kwartir Ranting Telah Diubah");
                                    }else{
                                        System.out.println("Data Kwartir Ranting Tidak Tersedia");
                                    }
                                }
                                break;
                                
                                //Delete
                                case 4:
                                if(anggotaPramuka.isEmpty()){
                                    System.out.println("Belum ada Anggota yang Terdaftar");
                                }else{
                                    System.out.print("ID Anggota Pramuka: ");
                                    int no = input.nextInt();
                                    
                                    if(no >= 1 && no <= anggotaPramuka.size()){
                                        anggotaPramuka.remove(no-1);
                                        System.out.println("Anggota Telah Dihapus");
                                    }else{
                                        System.out.println("Anggota Tidak Tersedia");
                                    }
                                }
                                break;
                            }
                        }while (pilihanAnggotaPramuka !=5);
                        break;
                            
                            
                case 4:
                    System.out.print("Program Selesai");
                    break;
                default:
                    System.out.print("Input tidak valid");
                }        
                            
                }while (pilihan !=4);
                input.close();
    }
}

        
        
                                
                            
        
