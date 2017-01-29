package Homework2_1;


import java.util.Arrays;

public class ArraysStatsCalculator {

    /*
     * SUM FUNCTIONS
     */

    public static long sum(int[] array){
        long sumValue = 0L; // Sum of the array's elements can be larger then maximum int value
        for (int i : array) {
            sumValue+=i;
        }
        return sumValue;
    }

    public static double sum(double[] array){
        double sumValue = 0D;
        for (double i : array) {
            sumValue+=i;
        }
        return sumValue;
    }

    /*
     * MIN FUNCTIONS
     */

    public static int min(int[] array){
        int minValue=array[0]; // Set minimum to a first array element's value
        for (int i = 1; i < array.length; i++) { // Going through the array
            int currentValue = array[i]; // Current value for comparison
            if(currentValue<minValue){
                minValue = currentValue; // If current element is less then min., set min. = current element's value
            }
        }
        return minValue;
    }

    public static double min(double[] array){
        double minValue=array[0]; // Set minimum to a first array element's value
        for (int i = 1; i < array.length; i++) { // Going through the array
            double currentValue = array[i]; // Current value for comparison
            if(currentValue<minValue){
                minValue = currentValue; // If current element is less then min., set min. = current element's value
            }
        }
        return minValue;
    }

    /*
     * MAX FUNCTIONS
     */

    public static int max(int[] array){
        int maxValue=array[0]; // Set max to a first array element's value
        for (int i = 1; i < array.length; i++) { // Going through the array
            int currentValue = array[i]; // Current value for comparison
            if(currentValue>maxValue){
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
        }
        return maxValue;
    }

    public static double max(double[] array){
        double maxValue=array[0]; // Set max to a first array element's value
        for (int i = 1; i < array.length; i++) { // Going through the array
            double currentValue = array[i]; // Current value for comparison
            if(currentValue>maxValue){
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
        }
        return maxValue;
    }

    /*
     * MAX POSITIVE FUNCTIONS
     */

    public static int maxPositive(int[] array){
        //if there haven't been found any positive number in the array, method returns 0
        int maxValue=0; // To avoid compilation error I have to initialize maxValue by 0
        for (int currentValue : array) { // Going through the array
            if (currentValue > maxValue) {
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
        }
            return maxValue;
    }

    public static double maxPositive(double[] array){
        double maxValue=0; // To avoid compilation error I have to initialize maxValue by 0
        for (double currentValue : array) { // Going through the array
            if (currentValue > maxValue) {
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
        }
        return maxValue;
    }

    /*
     * MULTIPLICATION FUNCTIONS
     */

    public static long multiplication(int[] array){
        long multValue = 1L; //multiplication can be larger then max int value
        for (int currentValue : array) {
            multValue*=currentValue;
        }
        return multValue;
    }

    public static double multiplication(double[] array){
        double multValue = 1D; //multiplication can be larger then max int value
        for (double currentValue : array) {
            multValue*=currentValue;
        }
        return multValue;
    }

    /*
     * MODULUS FUNCTIONS
     */

    public static double modulus(int[] array){
        //modulus of first and last element
        return (double)array[0]%(double)array[array.length-1];//cast to double to avoid Division by zero error
    }

    public static double modulus(double[] array){
        //modulus of first and last element
        return array[0]%array[array.length-1];
    }

    /*
     * SECOND LARGEST FUNCTIONS
     *
     * мне пришлось добавить else на случай, если первый элемент массива сразу будет самым большим.
     *
     */

    public static int secondLargest(int[] array){
        int maxValue=array[0]; // Set max to a first array element's value
        int secondLargest=array[0]; //Second largest value
        for (int i = 1; i < array.length; i++) { // Going through the array
            int currentValue = array[i]; // Current value for comparison
            if(currentValue>maxValue){
                secondLargest = maxValue; // Set secondLargest to previous max. value
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
            else if(secondLargest==maxValue){
                secondLargest=currentValue; //If array contains more then 1 value, secondLargest must not be equal to maxValue
            }
            else if(currentValue>secondLargest){
                secondLargest=currentValue; //If currentValue < maxValue and currentValue > secondLargest set secondLargest = currentValue
            }
        }
        return secondLargest;
    }

    public static double secondLargest(double[] array){
        double maxValue=array[0]; // Set max to a first array element's value
        double secondLargest=array[0]; //Second largest value
        for (int i = 1; i < array.length; i++) { // Going through the array
            double currentValue = array[i]; // Current value for comparison
            if(currentValue>maxValue){
                secondLargest = maxValue; // Set secondLargest to previous max. value
                maxValue = currentValue; // If current element is larger then max., set max. = current element's value
            }
            else if(secondLargest==maxValue){
                secondLargest=currentValue; //If array contains more then 1 value, secondLargest must not be equal to maxValue
            }
            else if(currentValue>secondLargest){
                secondLargest=currentValue; //If currentValue < maxValue and currentValue > secondLargest set secondLargest = currentValue
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        //тест1 просто массивы разных чисел (положительных и отрицательных)

        int[] intArray={-1,2,5,10,2,3,7,8,4,9};
        double[] dblArray={-1D,2D,5D,10D,2D,3D,7D,8D,4D,9D};

        System.out.println("ТЕСТ 1. Разные числа");
        System.out.println("int array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double array:");
        System.out.println(Arrays.toString(dblArray)+"\n");
        //sum
        System.out.println("sum");
        System.out.println(sum(intArray));//49
        System.out.println(sum(dblArray));//49.0
        //min
        System.out.println("min");
        System.out.println(min(intArray));//-1
        System.out.println(min(dblArray));//-1.0
        //max
        System.out.println("max");
        System.out.println(max(intArray));//10
        System.out.println(max(dblArray));//10.0
        //maxPositive
        System.out.println("maxPositive");
        System.out.println(maxPositive(intArray));//10
        System.out.println(maxPositive(dblArray));//10.0
        //modulus
        System.out.println("modulus");
        System.out.println(modulus(intArray));//-1
        System.out.println(modulus(dblArray));//-1.0
        //secondLargest
        System.out.println("secondLargest");
        System.out.println(secondLargest(intArray));//9
        System.out.println(secondLargest(dblArray));//9.0

        //тест2 все отрицательные

        intArray=new int[]{-1,-2,-5,-10,-2,-3,-7,-8,-4,-9};
        dblArray=new double[]{-1D,-2D,-5D,-10D,-2D,-3D,-7D,-8D,-4D,-9D};

        System.out.println("\nТЕСТ 2. Все отрицательные");

        System.out.println("int array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double array:");
        System.out.println(Arrays.toString(dblArray)+"\n");

        //sum
        System.out.println("sum");
        System.out.println(sum(intArray));//-51
        System.out.println(sum(dblArray));//-51.0
        //min
        System.out.println("min");
        System.out.println(min(intArray));//-10
        System.out.println(min(dblArray));//-10.0
        //max
        System.out.println("max");
        System.out.println(max(intArray));//-1
        System.out.println(max(dblArray));//-1
        //maxPositive
        System.out.println("maxPositive");
        System.out.println(maxPositive(intArray));//0
        System.out.println(maxPositive(dblArray));//0.0
        //modulus
        System.out.println("modulus");
        System.out.println(modulus(intArray));//-1
        System.out.println(modulus(dblArray));//-1.0
        //secondLargest
        System.out.println("secondLargest");
        System.out.println(secondLargest(intArray));//-2
        System.out.println(secondLargest(dblArray));//-2.0

        //тест3 массив нулей

        intArray=new int[]{0,0,0,0,0,0,0,0,0,0};
        dblArray=new double[]{0D,0D,0D,0D,0D,0D,0D,0D,0D,0D};

        System.out.println("\nТЕСТ 3. Массив нулей");

        System.out.println("int array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double array:");
        System.out.println(Arrays.toString(dblArray)+"\n");

        //sum
        System.out.println("sum");
        System.out.println(sum(intArray));//0
        System.out.println(sum(dblArray));//0.0
        //min
        System.out.println("min");
        System.out.println(min(intArray));//0
        System.out.println(min(dblArray));//0.0
        //max
        System.out.println("max");
        System.out.println(max(intArray));//0
        System.out.println(max(dblArray));//0
        //maxPositive
        System.out.println("maxPositive");
        System.out.println(maxPositive(intArray));//0
        System.out.println(maxPositive(dblArray));//0.0
        //modulus
        System.out.println("modulus");
        System.out.println(modulus(intArray));//NaN
        System.out.println(modulus(dblArray));//NaN
        //secondLargest
        System.out.println("secondLargest");
        System.out.println(secondLargest(intArray));//0
        System.out.println(secondLargest(dblArray));//0.0

        //тест4 другой массив разных чисел

        intArray=new int[]{16,2,5,4,-8,-6,4,1,0,7};
        dblArray=new double[]{16D,2D,5D,4D,-8D,-6D,4D,1D,0D,7D};

        System.out.println("\nТЕСТ 4. Другой массив разных чисел");

        System.out.println("int array:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("double array:");
        System.out.println(Arrays.toString(dblArray)+"\n");

        //sum
        System.out.println("sum");
        System.out.println(sum(intArray));//25
        System.out.println(sum(dblArray));//25.0
        //min
        System.out.println("min");
        System.out.println(min(intArray));//-8
        System.out.println(min(dblArray));//-8.0
        //max
        System.out.println("max");
        System.out.println(max(intArray));//16
        System.out.println(max(dblArray));//16.0
        //maxPositive
        System.out.println("maxPositive");
        System.out.println(maxPositive(intArray));//16
        System.out.println(maxPositive(dblArray));//16.0
        //modulus
        System.out.println("modulus");
        System.out.println(modulus(intArray));//2
        System.out.println(modulus(dblArray));//2.0
        //secondLargest
        System.out.println("secondLargest");
        System.out.println(secondLargest(intArray));//7
        System.out.println(secondLargest(dblArray));//7.0

    }



}
