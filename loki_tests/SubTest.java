import org.junit.Test;

import static org.junit.Assert.*;

public class SubTest {
    @Test
    public void test_add(){
        Sub s=new Sub();
        assertEquals(7,s.sub(9,2));
    }

}