import java.util.Date;

public class EventDate {
    final Date Begin;
    final float duration;
    final Type typeEvent;

    public EventDate(Date begin, float duration, Type typeEvent) {
        Begin = begin;
        this.duration = duration;
        this.typeEvent = typeEvent;
    }

}
