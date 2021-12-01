import lab4.Lab4.Patient;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Testing {

    @org.testng.annotations.Test(dataProvider = "falseName", expectedExceptions =IllegalArgumentException.class )
    public void falseFNameTest(String n) {
        Patient p=new Patient.Builder().setLastName("N").setMiddleName("M").build();
        assertEquals(p.getFirstName(), n);
    }

    @DataProvider
    public Object[][] falseName() {

        return new Object[][] {{""}};
    }

    @org.testng.annotations.Test(dataProvider = "trueName")
    public void trueFNameTest(String n) {
        Patient p=new Patient.Builder().setFirstName(n).setLastName("N").setMiddleName("M").build();
        assertEquals(p.getFirstName(), n);
    }

    @DataProvider
    public Object[][] trueName() {
        return new Object[][] {{"FName"}};
    }


    @org.testng.annotations.Test(dataProvider = "falseBloodGroup", expectedExceptions =IllegalArgumentException.class)
    public void falseBloodGroupTest(String b) {
        Patient p=new Patient.Builder().setBloodGroup(b).setFirstName("f").setLastName("N").setMiddleName("M").build();
        assertEquals(p.getBloodGroup(), b);
    }

    @DataProvider
    public Object[][] falseBloodGroup() {

        return new Object[][] {{"0"}};
    }

    @org.testng.annotations.Test(dataProvider = "trueBloodGroup")
    public void trueBloodGroupTest(String b) {
        Patient p=new Patient.Builder().setBloodGroup(b).setFirstName("F").setLastName("N").setMiddleName("M").build();
        assertEquals(p.getBloodGroup(), b);
    }

    @DataProvider
    public Object[][] trueBloodGroup() {
        return new Object[][] {{"00"}};

    }

    @org.testng.annotations.Test(dataProvider = "falseAge", expectedExceptions =IllegalArgumentException.class )
    public void falseAgeTest(int n) {
        Patient p=new Patient.Builder().setAge(n).setFirstName("f").setLastName("N").setMiddleName("M").build();
        assertEquals(p.getAge(), n);
    }

    @DataProvider
    public Object[][] falseAge() {

        return new Object[][] {{-1}};
    }

    @org.testng.annotations.Test(dataProvider = "trueAge")
    public void trueAgeTest(int n) {
        Patient p=new Patient.Builder().setAge(n).setFirstName("f").setLastName("N").setMiddleName("M").build();
        assertEquals(p.getAge(), n);
    }

    @DataProvider
    public Object[][] trueAge() {

        return new Object[][] {{18}};
    }
}
