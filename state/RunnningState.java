package state;

public class RunnningState extends ThreadState{
    public RunningState()
    {
        state = StateSet.RUNNING;
        System.out.println("运行状态");
    }
    public void suspend(ThreadContext tc)
    {
        System.out.println("调用suspend方法");
        if(state==StateSet.RANNABLE)
            tc.setThreadState(new BlockedState());
        else
            System.out.println("当前状态不是运行状态");
    }
}
