package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Login extends MilitaryAircraft{

    static private String name;
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
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public void signIn() throws IOException {
        System.out.print("Airbase Name        : ");
        setName(br.readLine());
        System.out.print("Registration Number : ");
        setAirReg(Integer.parseInt(br.readLine()));
        
        if (getName().contains(name) && getAirReg() == airReg) {
            signIn(getName());
        } else {
            System.out.println("False");
        }
    }
    
    private void signIn(String name) {
        System.out.printf("--> Welcome %s\n", name);
    }
}

/*
Note: Program Login sederhana diatas tidak mengacu pada penyimpanan array, hanya penyimpanan pada 
      variabel yang berlaku sekali. Sehingga, tidak disarankan untuk di ikuti sepenuhnya.
      !!! HANYA UNTUK REFERENSI !!!
*/
