import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void test_add(){
        Add a=new Add();
        assertEquals(7,a.add(2,3));
    }

}