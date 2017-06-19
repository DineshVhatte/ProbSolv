package oddevenprinter;

class TaskEvenOdd implements Runnable {

    int number=1;
    Printer print;

    TaskEvenOdd(Printer print){
        this.print = print;
    }

    @Override
    public void run() {

        System.out.println("Run method");
        while(number<10){

            if(number%2 == 0){
                System.out.println("Number is :"+ number);
                print.printEven(number);
                number+=2;
            }
            else {
                System.out.println("Number is :"+ number);
                print.printOdd(number);
                number+=2;
            }
        }

      }

    }
