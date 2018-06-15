public class Main {
  public static void main(String[] args) {
    int[] listOfNumbers = {3,1,9,1,4,5};
    int[] sortedList = bubbleSort(listOfNumbers);
    for(int i = 0; i < sortedList.length; i++){
      System.out.print(sortedList[i]);  
    }
  }
  public static int[] bubbleSort(int[] numbers){
    // Lenght of the array
    int n = numbers.length;
    // Temp number for stashing on a swap
    int temp = 0;
    
    // Loop through every number (outter)
    for(int i = 0; i < n; i++){
      // loop through every number inner
      for(int j = 1; j < n; j++){
        // System.out.println(j);
        // Check ith time through the list, if
        // the current number (j) is bigger than the next number (j+1`)
        if(numbers[j] < numbers[j-1]){
          // if it is... stash current number because we are about to overwrite it
          temp = numbers[j];
          // move the smaller number to the left
          numbers[j] = numbers[j-1];
          // grab the bigger number we stashed in temp, and put it in j+1
          numbers[j-1] = temp;
        }
      }
    }
    return numbers;
  }
}