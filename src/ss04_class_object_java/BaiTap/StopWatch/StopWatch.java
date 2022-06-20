package ss04_class_object_java.BaiTap.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        long elapsedTime;
        elapsedTime = this.endTime - this.startTime;
        return elapsedTime;
    }
}
