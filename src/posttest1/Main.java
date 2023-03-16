package posttest1;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{   
    static int id = 1;
    // set arrayList
    static ArrayList<MilitaryAircraft> aircraft = new ArrayList<>();

    // set objek
    static Characteristics characteristics = new Characteristics();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static getFighterAircraft getFA = new getFighterAircraft();
    
    public static void main(String[] args) throws IOException {
        boolean bool = true;
        
        while(bool) {
            System.out.println("\n Aircraft Registration System");
            System.out.print("\n1. Create\n2. Read\n3. Update\n4. Delete\n5. exit\nPilihan : ");
            int menu = Integer.parseInt(br.readLine());
            switch(menu) {
                case 1:
                    create();
                    break;

                case 2:
                    read();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    delete();
                    break;

                default:
                    System.out.println("\n     Game Over\n");
                    bool = false;
                    break;
            }
        }
    }
    
    private static void create() throws IOException {   
        System.out.println("\n==== Registration Aircraft ====");
        System.out.print("Masukkan Nama Aircraft : ");
        getFA.setNama(br.readLine());
        System.out.print("Asal Negara            : ");
        characteristics.countryOfOrigin = br.readLine();
        System.out.print("Jenis Mesin            : ");
        characteristics.machineType = br.readLine();
        System.out.print("Jarak Tempuh           : ");
        characteristics.combatRange = Integer.parseInt(br.readLine());
        System.out.print("Jangkauan Radar        : ");
        characteristics.radarRange = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Senjata         : ");
        characteristics.numberOfWeapon = Integer.parseInt(br.readLine());
        System.out.print("Kapasitas Bom          : ");
        characteristics.bombCapasity = Integer.parseInt(br.readLine());
        
        // untuk Fighter
        if(characteristics.numberOfWeapon <= 20 && characteristics.radarRange < 20000 && characteristics.bombCapasity <= 6 && characteristics.combatRange <= 10000) {
            aircraft.add(new MilitaryAircraft(getFA.getNama(), characteristics.countryOfOrigin, characteristics.machineType, "FIGHTER", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
            characteristics.message(1);
            
        // untuk Bomber
        } else if(characteristics.numberOfWeapon <= 10 && characteristics.radarRange >= 20000 && characteristics.bombCapasity > 6 && characteristics.combatRange > 10000) {
            aircraft.add(new MilitaryAircraft(characteristics.name, characteristics.countryOfOrigin, characteristics.machineType, "BOMBER", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
            characteristics.message(2);
            
        // untuk AWACS
        } else if(characteristics.numberOfWeapon <= 10 && characteristics.radarRange >= 200000 && characteristics.bombCapasity < 4 && characteristics.combatRange > 10000) {
            aircraft.add(new MilitaryAircraft(characteristics.name, characteristics.countryOfOrigin, characteristics.machineType, "AWACS", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
            characteristics.message(3);
            
        // ketika tidak termasuk kriteria 3 jenis Aircraft diatas
        } else {
            characteristics.message(0);
        }
    }
    
    private static void read() throws IOException {
        System.out.println("\n==== Registered Aircraft ====");
        for(int i = 0; i < aircraft.size(); i++) {
            System.out.println("\nID              : " + (i+1));
            System.out.println("Nama            : " + aircraft.get(i).getName());
            System.out.println("Jenis           : " + aircraft.get(i).getAircraftType());
            System.out.println("Asal Negara     : " + aircraft.get(i).getCountryOfOrigin());            
            System.out.println("Jenis Mesin     : " + aircraft.get(i).getMachineType());            
            System.out.println("Jarak Tempuh    : " + aircraft.get(i).getCombatRange());            
            System.out.println("Jangkauan Radar : " + aircraft.get(i).getRadarRange());            
            System.out.println("Jumlah Senjata  : " + aircraft.get(i).getNumberOfWeapon());            
            System.out.println("Kapasitas Bom   : " + aircraft.get(i).getBombCapasity());;            
        }
        System.out.println("\n=============================");
    }
    
    private static void update() throws IOException {        
        read();
        System.out.print("\nMasukkan ID : ");
        int i = Integer.parseInt(br.readLine());
        if(i > aircraft.size()) {
            // untuk Fighter
            characteristics.message(404);
        } else {
            printEdit();
            // untuk Fighter
            if(characteristics.numberOfWeapon <= 20 && characteristics.radarRange <= 4000 && characteristics.bombCapasity <= 6 && characteristics.combatRange <= 6000) {
                aircraft.set(i-1,new MilitaryAircraft(characteristics.name, characteristics.countryOfOrigin, characteristics.machineType, "FIGHTER", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
                characteristics.message(1);

            // untuk Bomber
            } else if(characteristics.numberOfWeapon <= 10 && characteristics.radarRange >= 4000 && characteristics.bombCapasity > 6 && characteristics.combatRange >= 10000) {                    
                aircraft.set(i-1,new MilitaryAircraft(characteristics.name, characteristics.countryOfOrigin, characteristics.machineType, "BOMBER", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
                characteristics.message(2);

            // untuk AWACS
            } else if(characteristics.numberOfWeapon <= 10 && characteristics.radarRange >= 200000 && characteristics.bombCapasity <= 4 && characteristics.combatRange > 10000) {                                    
                aircraft.set(i-1,new MilitaryAircraft(characteristics.name, characteristics.countryOfOrigin, characteristics.machineType, "AWACS", characteristics.combatRange, characteristics.numberOfWeapon, characteristics.bombCapasity, characteristics.radarRange));
                characteristics.message(3);

            // ketika tidak termasuk kriteria 3 jenis Aircraft diatas
            } else {
                characteristics.message(0);
            }
        }
    }
    
    private static void delete() throws IOException {
        read();
        System.out.print("\nMasukkan ID : ");
        int i = Integer.parseInt(br.readLine());
        if(i > aircraft.size()) {
            characteristics.message(404);
        } else {
            aircraft.remove(i-1);
            characteristics.message(4);
        }
    }
    
    private static void printEdit() throws IOException {
        System.out.println("\n==== Registration Aircraft ====");
        System.out.print("Masukkan Nama Aircraft : ");
        getFA.setNama(br.readLine()); 
        System.out.print("Asal Negara            : ");
        characteristics.countryOfOrigin = br.readLine();
        System.out.print("Jenis Mesin            : ");
        characteristics.machineType = br.readLine();
        System.out.print("Jarak Tempuh           : ");
        characteristics.combatRange = Integer.parseInt(br.readLine());
        System.out.print("Jangkauan Radar        : ");
        characteristics.radarRange = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Senjata         : ");
        characteristics.numberOfWeapon = Integer.parseInt(br.readLine());
        System.out.print("Kapasitas Bom          : ");
        characteristics.bombCapasity = Integer.parseInt(br.readLine());
    }
}
