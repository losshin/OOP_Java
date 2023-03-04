/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rag
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        // set objek
        ArrayList Train = new ArrayList<>();
        ArrayList Carriage = new ArrayList<>();
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n Input Data Kereta(Nama dan Gerbong)");
            System.out.print("1. Create\n2. Read\n3. Update\n4. Delete\nPilihan : ");
            int in = scan.nextInt();
            
            switch(in) {
                case 1:
                    String name;
                    int indx;
                    int carr;

                    System.out.print("Masukkan Nama kereta : ");
                    name = br.readLine();
                    System.out.print("Jumlah Gerbong : ");
                    carr = Integer.parseInt(br.readLine());
                    System.out.print("");

                    Create crt = new Create(name,carr);

                    Train.add(crt.name);
                    Carriage.add(crt.carriage);
                    break;

                case 2:
                    for(int i = 0; i < Train.size(); i++) {
                       System.out.println("Nama Kereta : " + Train.get(i));
                       System.out.println("Jumlah Gerbong : " + Carriage.get(i));
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Indeks yang ingin diganti : ");
                    indx = Integer.parseInt(br.readLine());
                    System.out.print("Nama ganti : ");
                    name = br.readLine();
                    System.out.print("Jumlah Gerbong : ");
                    int carriage = Integer.parseInt(br.readLine());

                    Update upd = new Update(indx, name, carriage);
                    Train.set(upd.index,upd.name);
                    Carriage.set(upd.index, upd.jumlah_gerbong);

                    break;

                case 4:
                    System.out.println("Indeks yang dihapus");
                    indx = Integer.parseInt(br.readLine());
                    Delete del = new Delete(indx);
                    Train.remove(del.index);
                    Carriage.remove(del.index);
                    del.Success();
                    break;

                default:
                    System.out.println("\n     Game Over\n");
                    break;
            }
            break;
        }
    }    
}
