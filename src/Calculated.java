public class Calculated {
    String strNums;

    public Calculated(String strNums) {
        this.strNums = strNums;
    }

    boolean checker() {
        return strNums.matches("\\d+([+]|[-]|[*]|[/])(-)?\\d+");
    }

    private String[] splitForSign() {
        return strNums.split("[-]|[+]|[*]|[/]");
    }

    public int computeNums() {
        String sign = strNums.replaceAll("\\d+", "");
        String[] splitValue = splitForSign();
        int num1 = Integer.parseInt(splitValue[0]);
        int num2 = Integer.parseInt(splitValue[1]);
        char whatSign = sign.charAt(0);
        return switch (whatSign) {
            case 43 -> num1 + num2;
            case 45 -> num1 - num2;
            case 42 -> num1 * num2;
            case 47 -> num1 / num2;
            default -> 0;
        };
    }


    public String computeRoman() {
        String sign = strNums.replaceAll("[IVXLC]+", "");
        String[] splitValue = splitForSign();
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String resultRoman = "";
        String[] romanNums = new String[]{"РИМСКИЙ НОЛЬ.", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        for (int i = 0; i < romanNums.length; i++) {
            if (splitValue[0].equals(romanNums[i])) {
                num1 = i;
                break;
            }
        }
        if (num1 == 0) {
            System.out.println("Вы ввели неправильные римские цифры. Повторите попытку.");
            System.exit(0);
        }
        for (int i = 0; i < romanNums.length; i++) {
            if (splitValue[1].equals(romanNums[i])) {
                num2 = i;
                break;
            }
        }
        if (num2 == 0) {
            System.out.println("Вы ввели неправильные римские цифры. Повторите попытку.");
            System.exit(0);
        }
        char whatSign = sign.charAt(0);
        result = switch (whatSign) {
            case 43 -> num1 + num2;
            case 45 -> num1 - num2;
            case 42 -> num1 * num2;
            case 47 -> num1 / num2;
            default -> 0;
        };
        if (result < 0) {
            System.out.println("Римские цифры не могут быть отрицательными. Повторите попытку с другими числами.");
            System.exit(0);
        } else {
            for (int i = 0; i < romanNums.length; i++) {
                if (i == result) {
                    resultRoman = romanNums[i];
                    break;
                }
            }
        }
        return resultRoman;
    }
}
