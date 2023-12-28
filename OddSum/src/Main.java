public class Main {

    public static void main(String[] args) {

        // Adjust the range as needed
        System.out.println(sumOdd(1,100));

    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }else if((number % 2) == 0){
            return false;
        }else{
            return true;
        }

    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }else return -1;

        return sum;
    }

}
