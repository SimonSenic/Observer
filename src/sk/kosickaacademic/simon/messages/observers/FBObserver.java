package sk.kosickaacademic.simon.messages.observers;

import sk.kosickaacademic.simon.messages.Subject;

public class FBObserver extends Observer{

    public FBObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getPriority()>1 && subject.getPriority()<4)
            System.out.println("Facebook: " +subject.getMessage());
    }
}
