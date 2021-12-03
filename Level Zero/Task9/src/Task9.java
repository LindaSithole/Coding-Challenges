

class Task9 {
    
    public static void main(String[] args) {
        vowelsInAString("Umuzi");
    }

    public static void vowelsInAString(String str){
        System.out.print("Vowels:" + " ");
        StringBuilder string1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
            {
                string1.append(str.charAt(i)).append(",");
            }
        }
        String result = string1.substring(0, string1.length()-1);
        System.out.println(result);
    }
}

