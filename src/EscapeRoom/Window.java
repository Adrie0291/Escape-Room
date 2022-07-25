package EscapeRoom;

public class Window {
    private boolean isClose = true;

    public boolean isClose() {
        return isClose;
    }

    public void openWindow() {
        isClose = false;

    }
    public void CloseWindow(){
        isClose = true;
    }
}
