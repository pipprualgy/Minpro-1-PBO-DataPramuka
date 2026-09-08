
package com.mycompany.minprodatapramuka;

/**
 *
 * @author ASUS TUF
 */
public class GugusDepan {
    int kodeGugusDepan;
    String namaGugusDepan;
    String pangkalan;
    
    public GugusDepan(int kodeGugusDepan, String namaGugusDepan, String Pangkalan) {
        this.kodeGugusDepan = kodeGugusDepan;
        this.namaGugusDepan = namaGugusDepan;
        this.pangkalan = Pangkalan;
    }
    
    public void tampilkanData(){
        System.out.println("Kode Gugus Depan: " + kodeGugusDepan);
        System.out.println("NamaGugus Depan: " + namaGugusDepan);
        System.out.println("Pangkalan: " + pangkalan);
    }
}
   