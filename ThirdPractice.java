/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matakuliah;

import java.util.Scanner;

/**
 *
 * @author rag
 */
public class ThirdPractice {
    public static void main(String[] args){
        System.out.println("\nTugas 2");
        System.out.println("\n1. Penebak tanggal ULTAH");
        first();
        System.out.println("\n2. Berat Massa Badan (IMB)");
        second();
    }
    
    private static void first(){
        
        Scanner scan = new Scanner(System.in);

        int i = 0; int x = 0; int y = 0; int z = 0;
        int[] Set1 = new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
        int[] Set2 = new int[]{2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31};
        int[] Set3 = new int[]{4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31};
        int[] Set4 = new int[]{8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31};
        int[] Set5 = new int[]{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

        // arrayList
        int[][] setList = {Set1, Set2, Set3, Set4, Set5};

        for(int[] arr: setList){
            System.out.println("\nSet " + (x+1));
            for(int n: arr){
                i++;
                if(i%4 == 0){
                    System.out.println(n);
                } else {
                    System.out.print(n + " ");
                }
            }
            System.out.printf("Apakah tanggal ULTAH kamu di Set %d? ", x+1);
            String select = scan.nextLine();

            if(select.contentEquals("y")){
                y += 1;
                switch(y){
                    case 1:
                        z += Set1[0];
                        break;
                    case 2:
                        z += Set2[0];
                        break;
                    case 3:
                        z += Set3[0];
                        break;
                    case 4:
                        z += Set4[0];
                        break;
                    case 5:
                        z += Set5[0];
                        break;
                    default:
                        break;
                }
            } else {
                y += 1;
                z += 0;
            }
            x++;
        }
        System.out.println("\nTebakan ULTAH kamu pada tanggal " + z);
    }
    
    private static void second(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan : ");
        double beratBadan = scan.nextDouble() * 0.45359237;

        System.out.print("Masukkan tinggi badan : ");
        double tinggiBadan = scan.nextDouble() * 0.0254;

        double imb = beratBadan / (tinggiBadan * tinggiBadan);

        System.out.printf("IMB Anda adalah %.2f\n", imb);

        if (imb < 16) {
            System.out.println("Sangat Kurus");
        } else if (imb < 18) {
            System.out.println("Kurus");
        } else if (imb < 24) {
            System.out.println("Normal");
        } else if (imb < 29) {
            System.out.println("Gemuk");
        } else if (imb < 35) {
            System.out.println("Sangat Gemuk");
        } else {
            System.out.println("Terlalu Gemuk");
        }
    }
}
