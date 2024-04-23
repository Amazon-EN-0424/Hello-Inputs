import java.time.Instant;

public class Logger {

    public void log(String message) {
        var time = Instant.now();
        System.out.println(time + " -- Message: " + message);
    }
}
