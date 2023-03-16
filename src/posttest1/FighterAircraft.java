/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author rag
 */

public class FighterAircraft extends Characteristics {
    private int jumlahSenjata;
    
    public FighterAircraft(String namePlane, String Country, String machineType, String aircraftType, int jumlahSenjata) {
        this.name = namePlane;
        this.countryOfOrigin = Country;
        this.machineType = machineType;
        this.aircraftType = aircraftType;
        this.jumlahSenjata = jumlahSenjata;
    }
    
    public int jumlahSenjata() {
        return jumlahSenjata;
    }
}
