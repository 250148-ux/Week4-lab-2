import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        /// Porblem 4
        /*StopWatch sw = new StopWatch();
        MathTool a = new MathTool();

        sw.start();
        for (int i = 0; i < 1_000_000; i++) {
            a.factorialRecursive(20);
        }
        sw.stop();
        System.out.println("Recursive time: " + sw.getElapsedTime() + " ms");

        sw.start();
        for (int i = 0; i < 1_000_000; i++) {
            a.factorialIterative(20);
        }
        sw.stop();
        System.out.println("Iterative time: " + sw.getElapsedTime() + " ms");*/

        /// Problem 3
        /*StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();
        userA.walk(3000);
        userA.walk(2000);
        userB.walk(5000);

        System.out.printf("User A: %d%nUser B: %d%nGlobal steps: %d%n",
                userA.getIndividualSteps(),
                userB.getIndividualSteps(),
                StepCounter.getTotalStepsAllUsers());
        StepCounter.resetGlobalSteps();
        System.out.printf("%nAfter reset:%nUser A: %d%nUser B: %d%nGlobal steps: %d%n",
                userA.getIndividualSteps(),
                userB.getIndividualSteps(),
                StepCounter.getTotalStepsAllUsers());*/

        /// Problem 2
        /*Sensor[] sensors = new Sensor[5];

        for (int i = 0; i < sensors.length; i++) {
            double reading = Math.random()*120-60;
            sensors[i] = new Sensor("Lab", reading);
        }
        double total=0;
        for (Sensor s:sensors){
            total+=s.getReading();
        }
        double average=total/ sensors.length;

        for (Sensor s : sensors) {
            System.out.printf("Location: %s | Reading: %.2f%n", s.getLocation(), s.getReading());
        }
        System.out.printf("%nAverage Temperature: %.2f%n", average);*/

        /// Problem 1
        /*LibraryBook book1= new LibraryBook();
        book1.setBookTitle("The Lord of the Rings");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setPages(1178);

        LibraryBook book2 = new LibraryBook();
        book2.setBookTitle("A Short Story");
        book2.setAuthor("John Doe");
        book2.setPages(-25);

        System.out.println("Pages for book1: " + book1.getPages());
        System.out.println("Is Thick: " + book1.isThick());
        System.out.println("Pages for book2: " + book2.getPages());
        System.out.println("Is Thick: " + book2.isThick());*/
    }
}