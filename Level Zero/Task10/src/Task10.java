public class Task10 {

        public static void common_chars(String str_1, String str_2){
            int[] array_1 = new int[26];
            int[] array_2 = new int[26];
            int str_len_1 = str_1.length();
            int str_len_2 = str_2.length();
            System.out.print("Vowels:" + " ");
            for (int i = 0 ; i < str_len_1 ; i++)
                array_1[str_1.charAt(i) - 'a'] += 1;
            for (int i = 0 ; i < str_len_2 ; i++)
                array_2[str_2.charAt(i) - 'a'] += 1;
            for (int i = 0 ; i < 26 ; i++){
                if (array_1[i] != 0 && array_2[i] != 0){
                    for (int j = 0; j < Math.min(array_1[i], array_2[i]) ; j++) str_1 = str_1.substring(0, str_1.length() -1);
                    str_2 = str_2.substring(0, str_2.length() -1);
                        System.out.print(((char )(i +'a')+",")) ;
        }
}

        }


    public static void main(String[] args) {

        String my_str_1 = "house";
        String my_str_2 = "computers";

        common_chars(my_str_1, my_str_2);
    }
}

