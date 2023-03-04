package posttest1;


public class Characteristics {
    
    // property
    protected String name;
    protected String countryOfOrigin;
    protected String machineType;
    protected String aircraftType;
    protected int combatRange;
    protected int numberOfWeapon;
    protected int bombCapasity;
    protected int radarRange;
    
    // method khusus
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

