package posttest1;

public class MilitaryAircraft{

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the countryOfOrigin
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * @param countryOfOrigin the countryOfOrigin to set
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * @return the machineType
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * @param machineType the machineType to set
     */
    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    /**
     * @return the aircraftType
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * @param aircraftType the aircraftType to set
     */
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    /**
     * @return the combatRange
     */
    public int getCombatRange() {
        return combatRange;
    }

    /**
     * @param combatRange the combatRange to set
     */
    public void setCombatRange(int combatRange) {
        this.combatRange = combatRange;
    }

    /**
     * @return the numberOfWeapon
     */
    public int getNumberOfWeapon() {
        return numberOfWeapon;
    }

    /**
     * @param numberOfWeapon the numberOfWeapon to set
     */
    public void setNumberOfWeapon(int numberOfWeapon) {
        this.numberOfWeapon = numberOfWeapon;
    }

    /**
     * @return the bombCapasity
     */
    public int getBombCapasity() {
        return bombCapasity;
    }

    /**
     * @param bombCapasity the bombCapasity to set
     */
    public void setBombCapasity(int bombCapasity) {
        this.bombCapasity = bombCapasity;
    }

    /**
     * @return the radarRange
     */
    public int getRadarRange() {
        return radarRange;
    }

    /**
     * @param radarRange the radarRange to set
     */
    public void setRadarRange(int radarRange) {
        this.radarRange = radarRange;
    }
    
    // property
    private String name;
    private String countryOfOrigin;
    private String machineType;
    private String aircraftType;
    private int combatRange;
    private int numberOfWeapon;
    private int bombCapasity;
    private int radarRange;
    
    
    public MilitaryAircraft(String namePlane, String Country, String machineType, String aircraftType, 
            int combatRange, int numberOfWeapon, int bombCapasity, int radarRange) {
        this.name = namePlane;
        this.countryOfOrigin = Country;
        this.machineType = machineType;
        this.aircraftType = aircraftType;
        this.combatRange = combatRange;
        this.numberOfWeapon = numberOfWeapon;
        this.bombCapasity = bombCapasity;
        this.radarRange = radarRange;
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // method khusus untuk pesan
    public void message(int i) {
        switch (i) {
            case 1:
                System.out.println("\nPenambahan Data Fighter Aircraft Berhasil...\n");
                break;
            case 2:
                System.out.println("\nPenambahan Data Bomber Aircraft Berhasil...\n");
                break;
            case 3:
                System.out.println("\nPenambahan Data AWACS Aircraft Berhasil...\n");
                break;
            case 4:
                System.out.println("\nDELETED\n");
                break;
            case 404:
                System.out.println("\nNOT FOUND\n");
                break;
            default:
                System.out.println("\n...UFO(Unindentified Flying Object)...\n");
                break;
        }
    }   
    
    
}


class getFighterAircraft {
    private String nama, countrys, machineType;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public String getcountry() {
        return countrys;
    }
    public String getMachineType() {
        return machineType;
    }
}
