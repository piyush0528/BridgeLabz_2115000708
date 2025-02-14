public class MergeSort {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for (int i = 0; i < n1; i++)
            leftArr[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = prices[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k] = leftArr[i];
                i++;
            } else {
                prices[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            prices[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            prices[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] bookPrices = {450, 200, 300, 150, 500, 250};
        System.out.println("Original Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("\nSorted Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
