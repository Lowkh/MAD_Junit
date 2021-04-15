import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Question2Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ByteArrayInputStream in = new ByteArrayInputStream("10\n".getBytes());
    

    
    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
  
    }
    @Test
    public void testPrint(){
        System.setIn(in);
        System.setIn(in);
        Question2.main(new String[]{"a"});
        System.setIn(in);
        System.setIn(in);
        Assert.assertEquals("0.1", out.toString().trim());
    }
    
    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }
}
