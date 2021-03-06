package rps.gui.i18n;

public final class MessageProviderFactory {

    public enum Type {
        SIMPLE
    }

    private MessageProviderFactory() {
    }

    public static MessageProvider produce(final Type type) {
        if (type == null){
            throw new IllegalArgumentException("Can't build MessageProvider for null type");
        }

        switch (type){
            case SIMPLE:
                return new SimpleMessageProvider();
            default:
                throw new IllegalArgumentException("Can't build MessageProvider for type " + type);
        }
    }
}
