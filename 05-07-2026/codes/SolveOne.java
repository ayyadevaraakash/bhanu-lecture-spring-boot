class VideoFeature extends Thread {
    public void run() {
        for(int i=0;i<1_000_000;i++){
            System.out.println("Video is playing");
        }
    }
}

class MusicFeature extends Thread {
    public void run() {
        for(int i=0;i<1_000_000;i++){
            System.out.println("Music is playing");
        }
    }
}

public class SolveOne {
    public static void main(String[] args) {
        VideoFeature videoFeature = new VideoFeature();
        MusicFeature musicFeature = new MusicFeature();

        videoFeature.start();
        musicFeature.start();
    }
}
