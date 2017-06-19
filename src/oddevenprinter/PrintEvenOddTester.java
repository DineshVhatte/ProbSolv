package oddevenprinter;

public class PrintEvenOddTester {



    public static void main(String ... args){
        Printer print = new Printer(false);
        Thread t1 = new Thread(new TaskEvenOdd(print));
        Thread t2 = new Thread(new TaskEvenOdd(print));
        t1.start();
        t2.start();
    }


}