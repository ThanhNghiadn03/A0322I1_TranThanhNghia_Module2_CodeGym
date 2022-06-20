package ss04_class_object_java.BaiTap.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch forTime = new StopWatch();
        forTime.start();
        long time1 = forTime.getStartTime();
        for (int i=0 ; i<100000 ; i++) {
            System.out.println("Text");
        }
        forTime.stop();
        long time2 = forTime.getEndTime();
        long elapsedTime = forTime.getElapsedTime();
        System.out.printf("Thời gian trước khi chạy vòng lặp : "+time1);
        System.out.printf("\n\nThời gian sau khi chạy vòng lặp : "+time2);
        System.out.printf("\n\n Tổng thời gian đã trôi qua : "+elapsedTime);
    }
}
