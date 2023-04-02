package posttest5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Login extends MilitaryAircraft{
    private String name = "CELL43l";
    static private int airReg;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public int getAirReg() {
        return airReg;
    }
    public void setAirReg(int airReg) {
        this.airReg = airReg;
    }
    
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }
    
    public void signIn() throws IOException {
        System.out.print("Airbase Name        : ");
        setName(br.readLine());
        while (true) {
            try {
                System.out.print("Registration Number : ");
                setAirReg(Integer.parseInt(br.readLine()));

                if (getName().contains(name)&& getAirReg() == airReg) {
                    signIn(getName());
                    break;
                } else {
                    System.out.println("False");
                }
            } catch(NumberFormatException e) {
                System.out.println("Number Please...");
            }
        }
    }
    
    private void signIn(String name) {
        System.out.printf("--> Welcome %s\n", getName());
    }
}

/*
Note: Program Login sederhana diatas tidak mengacu pada penyimpanan array, hanya penyimpanan pada 
      variabel yang berlaku sekali. Sehingga, tidak disarankan untuk di ikuti sepenuhnya.
      !!! HANYA UNTUK REFERENSI !!!
*/
