public class Calculator {
    public static void main(String[] args) {
        Input input = new Input();
        Calculated calculated = new Calculated(input.expression());

        if (calculated.checker()) {
            System.out.println(calculated.computeNums());
        } else {
            System.out.println(calculated.computeRoman());
        }

    }
}
