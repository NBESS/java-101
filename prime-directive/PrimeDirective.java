// Import statement: 
import java.util.ArrayList;

class PrimeDirective {

    // Methods
    public Boolean isPrime(int number) {

        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
    
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false;
        } 
    }
    return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public ArrayList<Integer> filterByType(int[] number, String type){
        if (type == "even") {
            System.out.println("Will return even numbers");
        } else if (type == "odd") {
            System.out.println("Will return odd numbers");
        }

        ArrayList<Integer> filteredList = new ArrayList<Integer>();

        return filteredList;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.onlyPrimes(numbers));
        pd.filterByType(numbers, "even");
        pd.filterByType(numbers, "odd");

    }
}