package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.ContratoServiceTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {

}