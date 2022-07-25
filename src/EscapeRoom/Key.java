package EscapeRoom;

public class Key {
    private boolean moveKey = false;

    public void takeKey() {
        moveKey = true;
    }

    public boolean isMoveKey() {
        return moveKey;
    }
}
