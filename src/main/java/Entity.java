import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity {
    private int shouldBeDetected;
    private String shouldNotBeDetected;

    @JsonProperty
    public int getShouldBeDetected() {
        return shouldBeDetected;
    }

    public void setShouldBeDetected(int shouldBeDetected) {
        this.shouldBeDetected = shouldBeDetected;
    }

    public String getShouldNotBeDetected() {
        return shouldNotBeDetected;
    }

    public void setShouldNotBeDetected(String shouldNotBeDetected) {
        this.shouldNotBeDetected = shouldNotBeDetected;
    }
}
