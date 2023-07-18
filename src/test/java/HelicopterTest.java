import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {
private Helicopter helicopter;
@BeforeEach
    public void setUp(){
    helicopter = new Helicopter("Black Hawk");

}
@Test
    public void canDoHover(){
    assertThat(helicopter.canHover()).isEqualTo(true);
}
@Test
    public void canRepair(){
    assertThat(helicopter.repair()).isEqualTo("Repairing a helicopter");
}
}

