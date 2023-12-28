public class Main {

    public static void main(String[] args) {

        int loopIterator = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (loopIterator <= finishNumber) {
            loopIterator++;
            if (isEvenNumber(loopIterator)) {
                System.out.println(loopIterator + " is an even number");
                evenCount++;
                if (evenCount >= 5) {
                    System.out.println("Five matches found");
                    break;
                }

            } else {
                if (isEvenNumber(loopIterator)) {
                    continue;
                }
                oddCount++;

            }

        }
        System.out.println("The total number of even numbers found is " + evenCount);
        System.out.println("The total number of odd numbers is " + oddCount);
    }

    public static boolean isEvenNumber(int parameter) {
        if ((parameter % 2) == 0) {
            return true;
        } else return false;
    }
}




