package Week8;
import java.util.Queue;
import java.util.LinkedList;

public class queueApp {

    public static void main(String[] args) {
        //  Create two queues
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        char let = 'A';
        int time = 0;
        int rn;
        String person = "" + let + let + let;

        //  Initialize queue 1
        queue1.add(person);
        
        while (time < 40) {
            rn = (int)(Math.random() * 10);

            //  Add new person to a random queue
            if (rn == 1 || rn == 2 || rn == 3) {
                let++;
                person = "" + let + let + let;
                if (Math.random() < 0.5) {
                    queue1.add(person);
                    System.out.println(person + " added to Queue 1.");
                } else {
                    queue2.add(person);
                    System.out.println(person + " added to Queue 2.");
                }
            }

            //  Poll people randomly from either queue
            if (rn == 4 || rn == 5 || rn == 6) {
                if (!queue1.isEmpty()) {
                    System.out.println(queue1.poll() + " left Queue 1.");
                }
            }
            if (rn == 7 || rn == 8 || rn == 9) {
                if (!queue2.isEmpty()) {
                    System.out.println(queue2.poll() + " left Queue 2.");
                }
            }

            //  Current state of both queues
            System.out.println("Time " + time + " : Queue 1 -> " + queue1 + " | Queue 2 -> " + queue2);
            time++;
        }
    }

}
