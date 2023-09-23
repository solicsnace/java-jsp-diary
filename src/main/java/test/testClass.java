package test;

import net.sourceforge.jwebunit.util.TestingEngineRegistry;
import org.junit.*;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
import junit.framework.TestCase;
import net.sourceforge.jwebunit.junit.WebTester;
import net.sourceforge.jwebunit.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testClass extends TestCase
{
    static WebTester tester;

    private static String url = "http://localhost:80/";

    @BeforeAll
    public static void start()
    {
        tester = new WebTester();
        tester.setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT);
        tester.getTestContext().setBaseUrl(url);
    }

    @Test
    public void testMainPage() throws Exception
    {
        tester.beginAt("/register");
    }
}