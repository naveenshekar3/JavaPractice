package javaPrograms;

public class MultiThreadPrint {

    int number =1;
    int maxNum = 6;

    public synchronized void oddNumber() throws InterruptedException {
        while (number<=maxNum){
            while (number%2 == 0){
                wait();
            }

            if (number<=maxNum){
                System.out.println(number);
                number++;
                notifyAll();
            }
        }
    }

    public synchronized void evenNumber() throws InterruptedException {
        while (number<=maxNum){
            while (number%2 !=0){
                wait();
            }

            if (number<=maxNum){
                System.out.println(number);
                number++;
                notifyAll();
            }
        }
    }

    public synchronized void donePrint() throws InterruptedException {
        while (number<=maxNum){
            wait();
        }
        System.out.println("DONE");
    }

    public static void main(String[] args) {
        MultiThreadPrint printer = new MultiThreadPrint();

        Thread printOdd = new Thread( () -> {
            try {
                printer.oddNumber();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread printEven = new Thread( () -> {
            try {
                printer.evenNumber();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread printDone = new Thread( () -> {
            try {
                printer.donePrint();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        printOdd.start();
        printEven.start();
        printDone.start();
    }
}
