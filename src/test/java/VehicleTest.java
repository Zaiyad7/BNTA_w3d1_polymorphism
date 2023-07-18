import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {
    Vehicle vehicle;
    @BeforeEach
    public void setUp(){
        vehicle = new Car("Nissan");

    }
    @Test
    public void canDrive(){
        assertThat(vehicle.drive("drivable")).isEqualTo("This is drivable");
    }
}

