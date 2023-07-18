import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    private Car car;
    @BeforeEach
    public void setUp(){
        car = new Car("Toyota");
    }
    @Test
    public void canDrift(){
        assertThat(car.drift()).isEqualTo("Car can drift");
    }
    @Test
    public void canRepair(){
        assertThat(car.repair()).isEqualTo("Repairing a car");
    }
    @Test
    public void canDriftType(){
        assertThat(car.drift("Braking")).isEqualTo("Car has Braking drifting");
    }

}
