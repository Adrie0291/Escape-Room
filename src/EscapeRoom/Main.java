package EscapeRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        Key key = new Key();
        Window windows = new Window();
        start();
        game(door, key, windows);

    }

    public static void start() {

        System.out.println("Witaj w grze. Masz 3 opcje do wyboru");
        System.out.println("1. Otworzyć drzwi");
        System.out.println("2. Zabrać klucz");
        System.out.println("3. Otworzyć okno");
    }

    public static void game(Door door, Key key, Window windows) {
        int option;
        do {
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Wybrałeś drzwi. Co dalej ?");
                    if (key.moveKey) {
                        System.out.println("Drzwi są zamknięte");
                    } else if (key.moveKey == true) {
                        door.isOpen();
                        System.out.println("Drzwi są otwarte gratulacje ! ");
                    }
                    break;
                case 2:
                    System.out.println("Wybrałeś klucz. Co dalej ?");
                    key.takeKey();
                    break;
                case 3:
                    windows.openWindow();
                    System.out.println("Wybrałeś okno.Co dalej ?");
                    break;
                default:
                    System.out.println("Jeszcze raz");
            }
        } while (option != 5);
    }
}