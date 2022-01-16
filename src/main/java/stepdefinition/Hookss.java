package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookss {
    @Before
    public void beforeExecution()
    {
        System.out.println("%%%%%%===> before Execution");
    }

    @After
    public void afterExecution()
    {
        System.out.println("%%%%%%%%====> after execution");
    }

}
