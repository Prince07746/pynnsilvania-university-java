package pynnsilvania.OOP;


import java.util.Arrays;

public class arraysD {
    public static void main(String[] args){

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(Arrays.toString(numbers));
        for(int i:numbers){
            System.out.print(i);
        }

        System.out.println();

        int[] numbers2 = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(numbers2));
        for(int i:numbers2){
            System.out.print(i);
        }




    }
}
