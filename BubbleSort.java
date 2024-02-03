import java.util.Vector;

public class BubbleSort {

    // Bubble Sort algorithm to sort a vector of integers
    public static void bubbleSort(Vector<Integer> input) {
        int arraySize = input.size();

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                // Swap elements if they are in the wrong order
                if (input.elementAt(j) > input.elementAt(j + 1)) {
                    int temp = input.elementAt(j);
                    input.setElementAt(input.elementAt(j + 1), j);
                    input.setElementAt(temp, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of Bubble Sort
        Vector<Integer> myData = new Vector<Integer>();

        // Populate the vector with data
        myData.addElement(18);
        myData.addElement(7);
        myData.addElement(27);
        myData.addElement(92);
        myData.addElement(4);
        myData.addElement(5);
        myData.addElement(16);
        myData.addElement(13);
        myData.addElement(100);
        myData.addElement(1);
        myData.addElement(12);
        myData.addElement(35);
        myData.addElement(43);
        myData.addElement(41);
        myData.addElement(29);
        myData.addElement(33);
        myData.addElement(98);
        myData.addElement(99);
        myData.addElement(67);
        myData.addElement(76);

        // Call the Bubble Sort method
        bubbleSort(myData);

        // Print the sorted data
        System.out.println("Sorted Data:");
        for (int i = 0; i < myData.size(); i++) {
            System.out.println(myData.elementAt(i));
        }
    }
}
