import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cash = 1000;
        int upload = 1500;
        int bonus = 0;
        int total = 0;

        if (upload > 1000) {
            bonus = upload / 100;
            total = cash + bonus + upload;
        } else
            total = cash + upload;

        System.out.println("Итого на счете = " + total);
        System.out.println("Из низ бонусов = " + bonus);

    }
}
