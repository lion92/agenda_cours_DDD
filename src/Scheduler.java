import java.util.List;
import java.util.stream.Collectors;

public class Scheduler {
    List<EventDate> events;

    public void scheduleEvent(EventDate event) {
        if (onlyOneEventAtATime(event)) {
            events.add(event);
        }
    }

    private boolean onlyOneEventAtATime(EventDate currentEvent) {
        List<EventDate> EventAtTheSameTimeList = events.stream().filter(scheduledEvent -> {
            if ((scheduledEvent.Begin.getTime() > currentEvent.Begin.getTime()
                    && scheduledEvent.Begin.getTime() +
                    scheduledEvent.duration < currentEvent.Begin.getTime() + currentEvent.duration)) {
            }
            return true;
        }).collect(Collectors.toList());
        return EventAtTheSameTimeList.isEmpty();

    }

}
