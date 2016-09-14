/**
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm.
 * The bubble- sort algorithm makes several passes through the array.
 * On each pass, successive neighboring pairs are compared.
 * If a pair is not in order, its values are swapped; otherwise,
 * the values remain unchanged. The technique is called a bubble sort or sinking sort because
 * the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom.
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
public class ex7_18 {
    public static void main(String[] args) {
        double[] myList = {6,5,4,3,2,40,1,8,7,9,4};
        for (double e:bubbleSort(myList))
            System.out.println(e);
    }

    public static double[] bubbleSort(double[] myList){
        double tmp;
        for(int i = 0; i < myList.length -1; i++){
            for(int j = 0; j < myList.length -1; j++){
                if(myList[j] > myList[j+1]){
                    tmp = myList[j];
                    myList[j] = myList[j+1];
                    myList[j+1] = tmp;
                }
            }
        }
        return myList;
    }
}
