import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DriverTest {
    Driver driver;
    @BeforeEach
    public void setUp(){
        driver = new Driver("Lewis Hamilton");

    }
    @Test
    public void canDrive(){
        assertThat(driver.drive("drivable")).isEqualTo("This vehicle is drivable");
    }
}
