/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author rag
 */
class Create {
    String name;
    int carriage;
    
    public Create(String name, int carriage) {
        this.name = name;
        this.carriage = carriage;
    }
    
    void Success(){
        System.out.printf("Nama Kereta : %s \nJumlah Gerbong : %d\n Berhasil Dibuat", this.name, this.carriage);
    }
}

class Update {
    // property
    int index;
    String name;
    int jumlah_gerbong;
   
    // method khusus
    public Update(int index, String name, int jumlah_gerbong) {
        this.index = index;
        this.name = name;
        this.jumlah_gerbong = jumlah_gerbong;
    }
    
    void su(){
        System.out.printf("Nama : %s \nJumlah Gerbong : %d", this.name, this.jumlah_gerbong);
    }
}

class Delete {
    int index;
    
    public Delete(int index) {
        this.index = index;
    }
    
    void Success() {
        System.out.println("Data Berhasil Di Hapus");
    }
}