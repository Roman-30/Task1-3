package untitled;

import java.util.Scanner;

public class Main {

    public static int inputnumber() {
        System.out.print("Еnter a three-digit number : ");
        Scanner enter = new Scanner(System.in);
        int initialnumber = enter.nextInt();
        System.out.println("Initial number : " + initialnumber);
        return initialnumber;
    }

    public static int actone(int initialnumber) {
        int unit = initialnumber % 10;
        return unit;
    }

    public static int acttwo(int initialnumber, int unit) {
        int hundreds = (initialnumber - unit) / 10;
        hundreds %= 10;
        return hundreds;
    }

    public static int actthree(int initialnumber, int unit, int hundreds) {
        int thousand = (((initialnumber - unit) / 10) - hundreds) / 10;
        return thousand;
    }

    public static int numbergenerator(int thousand, int hundreds, int unit) {
        int reversenumber = unit * 100 + hundreds * 10 + thousand;
        return reversenumber;
    }

    public static void main(String[] args) {
        int initialnumber = inputnumber();
        int unit = actone(initialnumber);
        int hundreds = acttwo(initialnumber, unit);
        int thousand = actthree(initialnumber, unit, hundreds);
        System.out.println("Reverse number : " + numbergenerator(thousand, hundreds, unit));

    }
}
