package lab4;
import lab4.Lab4.Patient;
import lab4.Lab4.Hospital;

public class Main {
    public static void main(String args[]) {
        try {
            Patient p = new Patient.Builder()
                    .setFirstName("F")
                    .setMiddleName("MName")
                    .setLastName("LName")
                    .setAddress("address")
                    .setAge(30)
                    .setSocialGroup("Group1")
                    .setBloodGroup("A0").build();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
