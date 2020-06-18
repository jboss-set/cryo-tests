import java.io.File;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class RegressionTest {
    @Test
    public void testRegressiveFiles() {
        File f= new File("./");
        File existence = new File(f,"regression.txt");
        if(existence.exists()) {
            throw new RuntimeException();
        }
    }
}
