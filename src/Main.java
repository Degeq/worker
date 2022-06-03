public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener printer = System.out::println;
        OnErrorListener errorer = System.out::println;
        Worker worker = new Worker(printer, errorer);

        worker.start();
    }
}
