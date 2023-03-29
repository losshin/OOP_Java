package posttest4;

// superClass
class MilitaryAircraft {
    // property
    private String name;
    private String countryOfOrigin;
    private String machineType;
    private String aircraftType;
    private int combatRange;
    protected int numberOfWeapon;
    protected int radarRange;
    protected int bombCapasity;
    
    // Setter/Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCountryOfOrigin() { 
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public String getMachineType() {
        return machineType;
    }
    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
    
    public String getAircraftType() {
        return aircraftType;
    }
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getCombatRange() {
        return combatRange;
    }
    public void setCombatRange(int combatRange) {
        this.combatRange = combatRange;
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
            case 5:    
                System.out.println("\nUPDATED\n");
                break;
            case 404:
                System.out.print("\nNOT FOUND\n");
                break;
            default:
                System.out.println("\n...UFO(Unindentified Flying Object)...\n");
                break;
        }
    }    
}

// subClass Bomber Aircraft
class BomberAircraft extends MilitaryAircraft { 
    public BomberAircraft(String namePlane, String Country, String machineType, String aircraftType, int combatRange, int numberOfWeapon, int radarRange, int bombCapasity) {
        this.setName(namePlane);
        this.setCountryOfOrigin(Country);
        this.setMachineType(machineType);
        this.setAircraftType(aircraftType);
        this.setCombatRange(combatRange);
        this.numberOfWeapon = numberOfWeapon;
        this.radarRange = radarRange;
        this.bombCapasity = bombCapasity;
    }    
}

// subClass Figthter Aircraft
class FighterAircraft extends MilitaryAircraft {
    public FighterAircraft(String namePlane, String Country, String machineType, String aircraftType, int combatRange, int numberOfWeapon, int radarRange, int bombCapasity) {
        this.setName(namePlane);
        this.setCountryOfOrigin(Country);
        this.setMachineType(machineType);
        this.setAircraftType(aircraftType);
        this.setCombatRange(combatRange);
        this.numberOfWeapon = numberOfWeapon;
        this.radarRange = radarRange;
        this.bombCapasity = bombCapasity;
    }    
}

// subClass AWACS Aircraft
class AwacsAircraft extends MilitaryAircraft {
    public AwacsAircraft(String namePlane, String Country, String machineType, String aircraftType, int combatRange, int numberOfWeapon, int radarRange, int bombCapasity) {
        this.setName(namePlane);
        this.setCountryOfOrigin(Country);
        this.setMachineType(machineType);
        this.setAircraftType(aircraftType);
        this.setCombatRange(combatRange);
        this.numberOfWeapon = numberOfWeapon;
        this.radarRange = radarRange;
        this.bombCapasity = bombCapasity;
    }    
}
