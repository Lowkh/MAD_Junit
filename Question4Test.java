import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Question4Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
  
    
    @Before
    public void setStreams() {
        System.setOut(new PrintStream(out));
  
    }
  
    @Test
    public void TriangleTest() {
      String testVal = "3\n";
      byte[] testVal_bytes = testVal.getBytes();
      provideInput(testVal_bytes);
      Question4.main(new String[]{"a"});
      Assert.assertEquals("***\r\n**\r\n*", out.toString().trim());
    }
  
    private void provideInput(byte[] int_bytes){
      ByteArrayInputStream testIn = new ByteArrayInputStream(int_bytes);
      System.setIn(testIn);
    }
  
    @After
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }
}
