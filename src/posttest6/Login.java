package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Login extends MilitaryAircraft implements validation{
    final private String name = "CELL43l";
    private int airReg;
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
    
    @Override
    public void valid(){
        System.out.println("Valid");
    }
    
    @Override
    public void invalid(){
        System.out.println("Invalid");
    }
    
    public void signIn() throws IOException {
        while (true) {
            System.out.print("Airbase Name        : ");
            setName(br.readLine());
            if (getName().contains(name)) {
                while (true) {
                    try {
                        System.out.print("Registration Number : ");
                        setAirReg(Integer.parseInt(br.readLine()));
                        if (getAirReg() == airReg) {
                            valid();
                            signIn(getName());
                            break;
                        } else {
                            invalid();
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("Number Please...");
                    }
                }
                break;
            } else {
                invalid();
            }
        }
    }
    
    private void signIn(String name) {
        System.out.printf("--> Welcome %s\n", getName());
    }
}

interface validation {
    void valid();
    void invalid();
}


/*
Note: Program Login sederhana diatas tidak mengacu pada penyimpanan array, hanya penyimpanan pada 
      variabel yang berlaku sekali. Sehingga, tidak disarankan untuk di ikuti sepenuhnya.
      !!! HANYA UNTUK REFERENSI !!!
*/
