public class Task10 {

    public static void main(String[] args){
        commonCharacters("house" , "computers");

    }
    public static void commonCharacters(String string1, String string2) {

        String string3 = string1;
        String string4 = string2;
        StringBuilder commonLetter = new StringBuilder();
        System.out.print("Common Characters:" + " ");

        if (string1.length() > string2.length()) {
            string3 = string2;
            string4 = string1;
        }
        for (int x = 0; x < string3.length(); x++) {
            String str5 = Character.toString(string3.charAt(x));

            for (int y = 0; y < string4.length(); y++) {
                String string6 = Character.toString(string4.charAt(y));

                if (str5.equals(string6)) {
                    commonLetter.append(str5).append(",");
                }
            }
        }
        commonLetter = new StringBuilder(commonLetter.substring(0, commonLetter.length() - 1));
        System.out.println(commonLetter);
    }
}
