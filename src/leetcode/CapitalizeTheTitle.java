package leetcode;

public class CapitalizeTheTitle {

    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));
    }

    private static String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() <= 2) {
                res.append(strings[i].toLowerCase());
            } else {
                StringBuilder tempSb = new StringBuilder();
                String temp = strings[i].toLowerCase();
                char first = strings[i].toUpperCase().charAt(0);
                tempSb.append(first);
                tempSb.append(temp.substring(1));
                res.append(tempSb.toString());
            }
            if (i != strings.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
