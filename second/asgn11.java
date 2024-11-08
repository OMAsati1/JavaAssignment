package Assgn.second;

class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Number (Decimal): " + number);
        System.out.println("Number (Hexadecimal): " + Integer.toHexString(number));
        System.out.println("Number (Octal): " + Integer.toOctalString(number));
    }
}

public class asgn11 {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hexNum = new HexNum(255);

        System.out.println("Base class Num:");
        num.showNum();

        System.out.println("\nDerived class HexNum:");
        hexNum.showNum();
    }
}

