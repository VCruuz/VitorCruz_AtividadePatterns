package decorator;

import notifier.Notifier;

public abstract class NotifierDecorator implements Notifier {

    protected final Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }
}
