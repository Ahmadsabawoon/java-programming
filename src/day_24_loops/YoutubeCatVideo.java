package day_24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: Worlds smallest cat - BBC");
        int second = 0;
        while (second <= 117) {
            System.out.println("\"Watching youtube video: second \" - " + second);
            second++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat video, lets start another one");
    }
}







