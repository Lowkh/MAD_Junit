import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Question2Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private  ByteArrayInputStream in;

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
  
    }

    public void provideInfo(String data){
      in = new ByteArrayInputStream(data.getBytes());
      System.setIn(in);
    }
    @Test
    public void BMITest(){

      Question2.main(new String[]{"a"});
      provideInfo("10\n");
      Assert.assertEquals("0.1", out.toString().trim());
      
    }
    
    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }
}
