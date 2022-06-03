public class Worker {
    private OnTaskDoneListener feedback;
    private OnErrorListener errorer;

    public Worker(OnTaskDoneListener feedback, OnErrorListener errorer) {
        this.feedback = feedback;
        this.errorer = errorer;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorer.error("Task " + i + " is failed");
            } else {
                feedback.onDone("Task " + i + " is done");
            }
        }
    }
}
