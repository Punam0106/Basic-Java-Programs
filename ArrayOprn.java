class ArrayOprn {

    public static void main(String[] args) {

        int[] numbers = {5,2,9,1,5};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array elements = " + sum);

    }
}