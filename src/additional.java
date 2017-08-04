import java.util.*;

class Additional
{

    public static void main (String[] args) throws java.lang.Exception
    {

        //System.out.println(nThFibonacciWordSeries(8));
        // writePrimeNumbers(100);
        //insertionSort(15);
    ArrayList<String> dataInput = new ArrayList<String>();

    dataInput.add("Jeż");
    dataInput.add("Żaba");
    dataInput.add("Żaba");
    dataInput.add("Żaba");
    dataInput.add("Żaba");
    dataInput.add("Miś");
    dataInput.add("Jeż");
    dataInput.add("Miś");
    dataInput.add("Jeż");
    dataInput.add("Jeż");

    HashMap<String, Integer> abacus = new HashMap<String, Integer>();

        for (String word: dataInput) {
            if(abacus.containsKey(word)){
                abacus.put(word, abacus.get(word) + 1 );
            }
            else{
                abacus.put(word , 1 );
            }

        }

        for(Map.Entry<String,Integer> entry : abacus.entrySet()){
            System.out.println("Wyraz " + entry.getKey() + " wystąpił " + entry.getValue() + " razy");
        }


    }



    public static void insertionSort (int n){
        Random generator = new Random();
        int[] tableToSort = new int[n];

        for( int i = 0; i< n; i++){
            tableToSort[i] = generator.nextInt(1001);
        }

        System.out.println("Tablica przed sortowaniem: ");
        showArray(tableToSort);


        int min = 0, index = 0 , max = tableToSort.length, valueToPut = 0;

        System.out.println();
        for(int i = tableToSort.length -1; i >= 0 ; i--){
            System.out.println("Okrążenie " + i);
            min = i;
            max = tableToSort.length;
            while(max - min > 1) {
                if((min + max) % 2 == 0) index = (min + max) /2;
                else index = ((min + max) / 2) + 1;
                if (tableToSort[i] <= tableToSort[index]) max = index;
                else min = index;
            }

            valueToPut = tableToSort[i];
            for (int j = i ; j < min; j++ ){
                tableToSort[j] = tableToSort[j+1];
            }
            tableToSort[min] = valueToPut;

            System.out.println("Index = " + index + " Tablica w trakcie sortowania: ");
            showArray(tableToSort);
            System.out.println();

        }
        System.out.println();
        System.out.println("Tablica po posortowaniu: ");
        showArray(tableToSort);
    }

    public static void showArray(int array[]){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }

    public static void writePrimeNumbers(int n){
        int[] primeNumberList = new int[n+1];

        for (int i = 0; i <= n; i++){
            primeNumberList[i] = i;
        }


        for(int i = 2; i <= Math.sqrt(n); i++ ){
            if(primeNumberList[i] != 0) {
                for (int counter = i; counter + i <= n; counter = counter + i) {
                    primeNumberList[counter + i] = 0;
                }
            }
        }

        for (int i = 2; i <= n; i++){
            if(primeNumberList[i] != 0) {
                System.out.print(primeNumberList[i] + " ");
            }
        }

    }

    public static ArrayList<Integer> primeNumbers(int n){
        ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            primeNumberList.add(i);
        }
        return primeNumberList;
    }

    public static int nThFibonacciWordSeries(int lenght){
        int result = 0;
        if (lenght == 0){
            return 0;
        }
        else {
            if (lenght == 1 || lenght == 2) {
                return 1;
            } else {
                int last = 1, beforeLast = 1, helpful = 0;

                for (int i = 1; i < lenght - 1; i++) {
                    result = last + beforeLast;
                    beforeLast = last;
                    last = result;
                }
            }
        }
        return result;
    }
}
