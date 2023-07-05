import java.util.List;

public class ZoneBankHolidayService implements BankHolidayService{
    public boolean isWorking(EventDate event, String zoneUser){
        return true;
    }
}
