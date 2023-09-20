package hellojpa;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Period {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Period() {

    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    private void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    private LocalDateTime getEndDate() {
        return endDate;
    }

    private void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
