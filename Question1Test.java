import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Question1Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    
    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
  
    }
    @Test
    public void testPrint(){
        Question1.main(new String[]{"a"});
        Assert.assertEquals("Hello World!", out.toString().trim());
    }
    
    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }
}
