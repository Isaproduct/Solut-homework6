package ChainofResponsibility;
public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handle(String issue);

    protected void escalate(String issue) throws Exception {
        if (nextHandler == null) {
            throw new Exception("Request cannot be handled: " + issue);
        }
        nextHandler.handle(issue);
    }
    //dee

    protected void log(String s, String issue) {
    }
}
