package sk.kosickaacademic.simon.messages.observers;

import sk.kosickaacademic.simon.messages.Subject;

public class EmailObserver extends Observer{

    public EmailObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if(subject.getPriority()>0 && subject.getPriority()<4)
            System.out.println("Email: " +subject.getMessage());
    }
}
