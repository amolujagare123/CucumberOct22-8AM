package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@blank")
    public void beforeScenario()
    {
        System.out.println("========>>>> beforeScenario ");
    }

    @After  ("@blank")
    public void afterScenario()
    {
        System.out.println("========>>>> afterScenario ");
    }
}
