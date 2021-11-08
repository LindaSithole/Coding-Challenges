class Task6 {
    public static void main(String[] args) {
    }
    static int maximNumber(int num1, int num2, int num3) {
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else {
            if (num2 > num3)
                max = num2;
            else
                max = num3;
        }
        return max;
    }
}

