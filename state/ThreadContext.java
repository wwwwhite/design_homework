package state;

public class ThreadContext {
    private ThreadState threadState;

    public ThreadContext()
    {
        threadState = new NewState();
    }
    public ThreadState getThreadState(){
        return threadState;
    }

    public void setThreadState(ThreadState threadState){
        this.threadState = threadState;
    }
    public void start()
    {
        ((NewState)threadState).start(this);
    }
}
