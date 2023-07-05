public class EventBusiness {
    private float begin;
    private float duration;
    private Zone zoneUser;

    public EventBusiness(float begin, float duration, Zone zoneUser) {
        this.begin = begin;
        this.duration = duration;
        this.zoneUser = zoneUser;
    }

    public boolean isBankHoliday(BankHolidayService bankHolidayService, EventDate event, Zone zoneUser){

        return bankHolidayService.isWorking(event,"France");


    }
}
