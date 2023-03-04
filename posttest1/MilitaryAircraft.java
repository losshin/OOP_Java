package posttest1;


public class MilitaryAircraft extends Characteristics {
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
}
