import com.xworkz.service.MobileService;
import com.xworkz.service.MobileServiceImpl;
import com.xworkz.things.Mobile;

import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mobile mobile =   new Mobile();
        mobile.setBrandName("MI");
        mobile.setReleaseDate(LocalDate.now());
        mobile.setReleaseTime(LocalTime.now());
        System.out.println(mobile);

        MobileService service = new MobileServiceImpl();
        service.checkCondition(mobile);
    }
}