package mvc.view;

import mvc.controler.Controller;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-25.
 */
public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("podaj cyfre");
            Integer choice = scanner.nextInt();
            Controller controller = new Controller();

            if (choice != null && choice > 0) {
                int result = controller.getFibValue(choice);
                System.out.println("FIB= " + result);
            } else {
                System.out.println("AVG = " + controller.average());
            }
        }
    }
}
