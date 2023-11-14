import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;

public class Dec2HexTest {
    
    public Dec2HexTest() {}
    
    Dec2Hex dec2Hex;

    @Before
    public void setUp() {
        dec2Hex = new Dec2Hex();
    }

    @Test 
    public void testConversion() {
        Dec2Hex.setArg1(15);
        Assert.assertEquals("Regular Conversion should work", "F", Dec2Hex.convertToHex(15));
    }
}
