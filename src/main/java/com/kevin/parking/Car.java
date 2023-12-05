package com.kevin.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    LocalDateTime leave;
    private final String id;
    private final LocalDateTime enter;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuration() {
        Duration duration = Duration.between(enter, leave);
        return duration.toMinutes();
    }

    public void getLeave() {
        leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
