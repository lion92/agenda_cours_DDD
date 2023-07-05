import java.util.Date;

public class Lunch {
    private final float duration;
    private final float minimalDuration;
    Date beginLunch;

    public Lunch(float duration, float minimalDuration, Date beginLunch) throws Exception {
        this.duration = duration;
        this.minimalDuration = minimalDuration;
        this.beginLunch = beginLunch;
        if(this.duration < this.minimalDuration){
            throw new Exception("Impossible de creer un repas de moins"+minimalDuration);
        }

    }
}
