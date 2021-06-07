package sk.kosickaacademic.simon.messages.observers;

import sk.kosickaacademic.simon.messages.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
