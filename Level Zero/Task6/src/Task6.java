class Task6 {
    public static void main(String[] args){
        MaximNumber(6,3,4);
    }
    static int MaximNumber(int num1, int num2, int num3 ){
        int max;
        if (num1 > num2 && num1 > num3) {
                max = num1;
        } else {
            if (num2 > num3)
                max = num2;
            else
                max = num3;
        }
        System.out.println("Largest Number : " + max);
        return max;
    }
}
