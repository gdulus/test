package rps.game.player;

public final class PlayerFactory {

    public enum Type {
        COMPUTER,
        HUMAN
    }

    private PlayerFactory() {
    }

    public static Player produce(final Type type){
        if (type == null){
            throw new IllegalArgumentException("Can't build Player for null type");
        }

        switch (type){
            case COMPUTER:
                return new ComputerPlayer();
            case HUMAN:
                return new HumanPlayer();
            default:
                throw new IllegalArgumentException("Can't build player for type " + type);
        }
    }
}
