array is sorted or not


public static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
           
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
