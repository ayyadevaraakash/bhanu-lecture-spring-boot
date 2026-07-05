import java.util.List;
import java.util.Vector;

class VideoFeature implements Runnable {
    private List<Integer> nums;

    public VideoFeature(List<Integer> nums) {
        this.nums = nums;
    }

    public void run() {
        for(int i=0;i<10000;i++){
            nums.add(i);
        }
    }
}

class MusicFeature implements Runnable {
    private List<Integer> nums;

    public MusicFeature(List<Integer> nums) {
        this.nums = nums;
    }

    public void run() {
        for(int i=0;i<10000;i++){
            nums.add(i);
        }
    }
}

public class SolveFifth {
    public static void main(String[] args) {
        List<Integer> nums = new Vector<>();
        
        Thread t1 = new Thread(new VideoFeature(nums));
        Thread t2 = new Thread(new MusicFeature(nums));
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println(nums.size());
    }
}


// class VideoFeature implements Runnable {
//     private List<Integer> nums;

//     public VideoFeature(List<Integer> nums) {
//         this.nums = nums;
//     }

//     public void run() {
//         synchronized(nums) {
//             for(int i=0;i<10000;i++){
//                 nums.add(i);
//             }
//         }
//     }
// }

// class MusicFeature implements Runnable {
//     private List<Integer> nums;

//     public MusicFeature(List<Integer> nums) {
//         this.nums = nums;
//     }

//     public void run() {
//         synchronized(nums) {
//             for(int i=0;i<10000;i++){
//                 nums.add(i);
//             }
//         }
//     }
// }
