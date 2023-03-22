package posttest3;

class MilitaryAircraft {
    // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Country Of Origin
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
    // MachineType
    public String getMachineType() {
        return machineType;
    }
    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }
    // AircraftType
    public String getAircraftType() {
        return aircraftType;
    }
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
    // Combat Range
    public int getCombatRange() {
        return combatRange;
    }
    public void setCombatRange(int combatRange) {
        this.combatRange = combatRange;
    }
    
    // property
    private String name;
    private String countryOfOrigin;
    private String machineType;
    private String aircraftType;
    private int combatRange;
    protected int numberOfWeapon;
    protected int radarRange;
    protected int bombCapasity;

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

// childClass Bomber Aircraft
class BomberAircraft extends MilitaryAircraft {    
    private int bombCapasity;
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

// childClass Figthter Aircraft
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

// childClass AWACS Aircraft
class AwacsAircraft extends MilitaryAircraft {
    private int radarRange = super.radarRange;
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