import java.util.Vector;

public class BubbleSortOptimized {

    // Optimized Bubble Sort algorithm with early termination
    public static void bubbleSortOptimized(Vector<Integer> input) {
        int arraySize = input.size();
        boolean isSwapped = true;

        while (isSwapped) {
            isSwapped = false;

            for (int i = 0; i < arraySize - 1; i++) {
                if (input.elementAt(i) > input.elementAt(i + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = input.elementAt(i);
                    input.setElementAt(input.elementAt(i + 1), i);
                    input.setElementAt(temp, i + 1);
                    isSwapped = true;  // Set the flag to indicate swapping occurred
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of Optimized Bubble Sort
        Vector<Integer> myData = new Vector<Integer>();

        // Populate the vector with data
        myData.addElement(18);
        myData.addElement(7);
        myData.addElement(27);
        // Add more elements as needed...

        // Call the Optimized Bubble Sort method
        bubbleSortOptimized(myData);

        // Print the sorted data
        System.out.println("Sorted Data:");
        for (int i = 0; i < myData.size(); i++) {
            System.out.println(myData.elementAt(i));
        }
    }
}
