public class Kadane{
    public static void main(String[] args) {
        int[] arr = {3,-4,5,4,-1,7,-8};
        int curr_sum = 0, max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            max_sum = Math.max(max_sum, curr_sum);

            curr_sum = curr_sum < 0 ? 0 : curr_sum;
        }

        System.out.println(max_sum);

    }
}