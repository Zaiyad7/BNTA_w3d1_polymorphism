import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {
    private Dealership dealership;

    @BeforeEach
    public void setUp(){
        dealership = new Dealership();
    }
    @Test
    public void canCountVehicles(){
        assertThat(dealership.countVehicles()).isEqualTo(0);
    }
    @Test
    public void canAddVehicle(){
        Vehicle vehicle = new Car("Car");
        dealership.addVehicle(vehicle);
        assertThat(dealership.countVehicles()).isEqualTo(1);
    }
}
