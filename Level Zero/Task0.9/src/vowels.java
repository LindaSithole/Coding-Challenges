
class Task1 {
    
    public static void main(String[] args) {

        String str = "Umuzi";
        System.out.print("Vowels:");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                System.out.print(" " + str.charAt(i));
            }
        }
    }
}

