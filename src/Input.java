import java.util.Locale;
import java.util.Scanner;

public class Input {
    Scanner inp = new Scanner(System.in);

    public String expression() {
        System.out.print("Ведите выражение для вычисления примера арабскими или римскими цифрами: ");
        String strInput = inp.nextLine().replaceAll("\s+", "").toUpperCase(Locale.ROOT);
        while (!strInput.matches("\\d+([+]|[-]|[*]|[/])\\d+|([IVXLC]+)([+]|[-]|[*]|[/])([IVXLC]+)")) {
            System.out.println("Введите Арабские или Римские цифры, и знак выражения между ними для вычисления.");
            System.exit(0);
            strInput = inp.nextLine().replaceAll("\s+", "").toUpperCase(Locale.ROOT);
        }
        return strInput;
    }


}
