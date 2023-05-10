package testProject;
//check .allure
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddItems_TC.class,
        Filter_TC.class
})


public class RunReports {

}
