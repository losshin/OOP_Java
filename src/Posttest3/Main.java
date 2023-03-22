package posttest3;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{   
    static int id = 1;
    // set arrayList
    static ArrayList<MilitaryAircraft> aircraft = new ArrayList<>();
    // set objek
    static MilitaryAircraft getMA = new MilitaryAircraft();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        boolean bool = true;
        while(bool) {
            System.out.println("\n Aircraft Registration System");
            System.out.print("\n1. Create\n2. Read\n3. Update\n4. Delete\n5. exit\nPilihan : ");
            try{
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
                        System.out.println("\n     End Program\n");
                        bool = false;
                        break;
                }
            } catch(NumberFormatException err) {
                System.out.println("Number Please...");
            }
        }
    }
    
    private static void create() throws IOException {   
        System.out.println("\n==== Registration Aircraft ====");
        System.out.print("Masukkan Nama Aircraft : ");
        getMA.setName(br.readLine());
        System.out.print("Asal Negara            : ");
        getMA.setCountryOfOrigin(br.readLine());
        System.out.print("Jenis Mesin            : ");
        getMA.setMachineType(br.readLine());
        System.out.print("Jarak Tempuh           : ");
        getMA.setCombatRange(Integer.parseInt(br.readLine()));;
        System.out.print("Jangkauan Radar        : ");
        getMA.radarRange = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Senjata         : ");
        getMA.numberOfWeapon = Integer.parseInt(br.readLine());
        System.out.print("Kapasitas Bom          : ");
        getMA.bombCapasity = Integer.parseInt(br.readLine());
        
        // untuk Fighter
        if(getMA.numberOfWeapon <= 20 && getMA.radarRange < 20000 && getMA.bombCapasity <= 6) {
           aircraft.add(new FighterAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "FIGHTER", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
            getMA.message(1);
            
        // untuk Bomber
        } else if(getMA.numberOfWeapon <= 6 && getMA.radarRange >= 20000 && getMA.bombCapasity >= 6) {
           aircraft.add(new BomberAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "BOMBER", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
            getMA.message(2);
            
        // untuk AWACS
        } else if(getMA.numberOfWeapon <= 4 && getMA.radarRange > 20000 && getMA.bombCapasity <= 6) {
           aircraft.add(new AwacsAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "AWACS", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
            getMA.message(3);
            
        // UFO(Unidentified Flying Object)
        } else {
            getMA.message(0);
        }
    }
    
    private static void read() throws IOException {
        System.out.println("\n==== Registered Aircraft ====");
        if (aircraft.isEmpty()) {
            getMA.message(404);
        } else {
            for(int i = 0; i < aircraft.size(); i++) {
                System.out.println("\nID              : " + (i+1));
                System.out.println("Nama            : " + aircraft.get(i).getName());
                System.out.println("Jenis           : " + aircraft.get(i).getAircraftType());
                System.out.println("Asal Negara     : " + aircraft.get(i).getCountryOfOrigin());            
                System.out.println("Jenis Mesin     : " + aircraft.get(i).getMachineType());            
                System.out.println("Jarak Tempuh    : " + aircraft.get(i).getCombatRange());            
                System.out.println("Jangkauan Radar : " + aircraft.get(i).radarRange);            
                System.out.println("Jumlah Senjata  : " + aircraft.get(i).numberOfWeapon);            
                System.out.println("Kapasitas Bom   : " + aircraft.get(i).bombCapasity);                            
            }
        }
        System.out.println("\n=============================");
    }
    
    private static void update() throws IOException {        
        read();
        if(aircraft.isEmpty()) {
        } else {
            System.out.print("\nMasukkan ID : ");
            int i = Integer.parseInt(br.readLine());
            printEdit();
            
            // untuk Fighter
            if(getMA.numberOfWeapon <= 20 && getMA.radarRange < 20000 && getMA.bombCapasity <= 6) {
               aircraft.set( i-1, new FighterAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "FIGHTER", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
               getMA.message(5);

            // untuk Bomber
            } else if(getMA.numberOfWeapon <= 6 && getMA.radarRange < 20000 && getMA.bombCapasity >= 6) {
               aircraft.set( i-1, new BomberAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "BOMBER", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
               getMA.message(5);

            // untuk AWACS
            } else if(getMA.numberOfWeapon <= 4 && getMA.radarRange > 20000 && getMA.bombCapasity <= 6) {
               aircraft.set( i-1, new AwacsAircraft(getMA.getName(), getMA.getCountryOfOrigin(), getMA.getMachineType(), "AWACS", getMA.getCombatRange(), getMA.numberOfWeapon, getMA.radarRange, getMA.bombCapasity));
               getMA.message(5);

            // UFO(Unidentified Flying Object)
            } else {
                getMA.message(0);
            }
        }
    }
    
    private static void delete() throws IOException {
        read();
        if (aircraft.isEmpty()) {
        } else {
            System.out.print("\nMasukkan ID : ");
            int i = Integer.parseInt(br.readLine());
            if(i > aircraft.size()) {
                getMA.message(404);
            } else {
                aircraft.remove(i-1);
                getMA.message(4);
            }
        }
    }
    
    private static void printEdit() throws IOException {
        System.out.println("\n==== Registration Aircraft ====");
        System.out.print("Masukkan Nama Aircraft : ");
        getMA.setName(br.readLine()); 
        System.out.print("Asal Negara            : ");
        getMA.setCountryOfOrigin(br.readLine());
        System.out.print("Jenis Mesin            : ");
        getMA.setMachineType(br.readLine());
        System.out.print("Jarak Tempuh           : ");
        getMA.setCombatRange(Integer.parseInt(br.readLine()));
        System.out.print("Jangkauan Radar        : ");
        getMA.radarRange = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Senjata         : ");
        getMA.numberOfWeapon = Integer.parseInt(br.readLine());
        System.out.print("Kapasitas Bom          : ");
        getMA.bombCapasity = Integer.parseInt(br.readLine());
    }
}
