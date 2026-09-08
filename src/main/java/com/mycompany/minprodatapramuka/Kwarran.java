
package com.mycompany.minprodatapramuka;

/**
 *
 * @author ASUS TUF
 */
public class Kwarran {
   int idKwarran;
   String namaKwarran;
   
   public Kwarran(int idKwarran, String namaKwarran) {
       this.idKwarran = idKwarran;
       this.namaKwarran = namaKwarran;
   }
   
   public void tampilkanData() {
       System.out.println("ID Kwarran: " + idKwarran);
       System.out.println("Nama Kwarran: " + namaKwarran);
   }
}
