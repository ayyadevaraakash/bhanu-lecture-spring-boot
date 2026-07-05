public class SolveFourth {
    public static void main(String[] args) {
        Runnable videoFeature = () -> {
            for(int i=0;i<1_00_00;i++){
                System.out.println("Video is playing");
            }
        };

        Runnable musicFeature = () -> {
            for(int i=0;i<1_00_00;i++){
                System.out.println("Music is playing");
            }
        };

        Thread obj1 = new Thread(videoFeature);
        Thread obj2 = new Thread(musicFeature);

        obj1.start();
        obj2.start();

        // try {
        //     obj1.join();
        //     obj2.join();
        // } catch(Exception e) {}

        // obj1.setDaemon(true);
        // obj2.setDaemon(true);

        // obj1.setPriority(10);
        // obj2.setPriority(2);

        System.out.println("I am completed");
    }
}
