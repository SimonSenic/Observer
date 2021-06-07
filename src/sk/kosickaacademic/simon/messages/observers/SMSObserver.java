package sk.kosickaacademic.simon.messages.observers;

import sk.kosickaacademic.simon.messages.Subject;

public class SMSObserver extends Observer{

    public SMSObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getPriority()==3)
            System.out.println("SMS: " +subject.getMessage());
    }
}
