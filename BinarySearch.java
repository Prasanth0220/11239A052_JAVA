public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 4, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            }
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Not found");
    }
}
