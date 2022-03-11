class pivotIndex {
    private static int findPivotIndex(int[] arr){
        int leftSum = 0;
        int sum = 0;

        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            //update the sum to get the right sum
            sum = sum - arr[i];

            //Check if leftsum = sum
            if(leftSum == sum){
                return i;
            }

            //update the left sum for next iteration
            leftSum = leftSum + arr[i];
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array = {5, 5 , 6, 3, 5, 2};

        if (findPivotIndex(array) != -1){
            System.out.println("The pivot index number is: " + findPivotIndex(array));
        }
        else
            System.out.println("There is no pivot index number in this array");
    }
}



