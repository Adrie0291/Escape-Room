package EscapeRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w grze. Masz 3 opcje do wyboru");
        Door door = new Door();
        Key key = new Key();
        Window windows = new Window();
        menu();
        start(door, key, windows);


    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Otworzyć drzwi");
        System.out.println("2. Zabrać klucz");
        System.out.println("3. Otworzyć okno");
    }

    public static void menu2() {
        System.out.println();
        System.out.println("Masz 2 opcje do wyboru");
        System.out.println("1. Otworzyć drzwi");
        System.out.println("3. Otworzyć okno");
    }

    public static void start(Door door, Key key, Window windows) {
        boolean work = true;


        int option;

        do {
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    actionDoor(door, key);
                    if (key.isMoveKey() == true) {
                        work = false;
                    }
                    break;

                case 2:
                    actionKey(key);

                    break;
                case 3:
                    actionWindow(windows);
                    break;
                default:
                    System.out.println("Jeszcze raz");
            }
        } while (work);

    }

    public static void actionDoor(Door door, Key key) {
        if (key.isMoveKey() == true) {
            System.out.println("Drzwi są otwarte");
            System.out.println("Gratulacje. Jesteś wolny");

        } else {
            System.out.println("Drzwi są zamknięte.");
            menu();
        }


    }

    public static void actionKey(Key key) {
        key.takeKey();
        System.out.println("Wziąłeś klucz! ");
        menu2();
    }

    public static void actionWindow(Window window) {
        if (window.isClose()) {
            window.openWindow();
            System.out.println("Okno jest otwarte");
            menu();
        } else {
            window.CloseWindow();
            System.out.println("okno jest zamkniete");
            menu();
        }
    }
}