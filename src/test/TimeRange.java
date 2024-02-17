package test;

import java.util.Date;
import java.util.Calendar;

public class TimeRange {

    private Date startTime;
    private Date endTime;

    public TimeRange(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isOverlapping(TimeRange otherTimeRange) {
        return startTime.before(otherTimeRange.endTime) && endTime.after(otherTimeRange.startTime);
    }

    public void deleteTimeRange(TimeRange otherTimeRange) {
        if (isOverlapping(otherTimeRange)) {
            if (startTime.before(otherTimeRange.startTime)) {
                startTime = otherTimeRange.endTime;
            } else {
                endTime = otherTimeRange.startTime;
            }
        }
    }

    public static void main(String[] args) {
        TimeRange timeRange1 = new TimeRange(new Date(1699381800), new Date(1699385400));
        TimeRange timeRange2 = new TimeRange(new Date(1699383600), new Date(1699384500));

        timeRange1.deleteTimeRange(timeRange2);

        System.out.println(timeRange1.getStartTime());
        System.out.println(timeRange1.getEndTime());
    }
}