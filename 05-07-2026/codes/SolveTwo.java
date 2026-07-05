class VideoFeature implements Runnable {
    public void run() {
        for(int i=0;i<1_000_000;i++){
            System.out.println("Video is playing");
        }
    }
}

class MusicFeature implements Runnable {
    public void run() {
        for(int i=0;i<1_000_000;i++){
            System.out.println("Music is playing");
        }
    }
}

public class SolveTwo {
    public static void main(String[] args) {
        Thread videoThread = new Thread(new VideoFeature());
        Thread musicThread = new Thread(new MusicFeature());

        videoThread.start();
        musicThread.start();
    }
}
