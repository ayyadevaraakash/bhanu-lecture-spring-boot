public class SolveThird {
    public static void main(String[] args) {
        Runnable videoFeature = () -> {
            for(int i=0;i<1_000_000;i++){
                System.out.println("Video is playing");
            }
        };

        Runnable musicFeature = () -> {
            for(int i=0;i<1_000_000;i++){
                System.out.println("Music is playing");
            }
        };

        Thread obj1 = new Thread(videoFeature);
        Thread obj2 = new Thread(musicFeature);

        obj1.start();
        obj2.start();
    }
}
