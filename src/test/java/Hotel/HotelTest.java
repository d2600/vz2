package Hotel;

import com.test.vz2.employee.Employee;
import com.test.vz2.hotel.HotelMain;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HotelTest {

    @Test
    void setHotelTest () {
        HotelMain hotelMain = new HotelMain();
        double actual = hotelMain.setTestHotel();
        assertThat (actual).isEqualTo(325);
    }
}
