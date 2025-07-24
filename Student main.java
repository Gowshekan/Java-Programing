import java.lang.reflect.Array;

import java.util.Arrays;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        Integer size = Integer.parseInt(sc.nextLine());



        Integer id, mark1, mark2, mark3;

        String name;



        Student[] arr = new Student[size];



        for (int i = 0; i < size; i++) {

            String[] inp = sc.nextLine().split(" ");

            id = Integer.parseInt(inp[0]);

            Student s = new Student(

                    Integer.parseInt(inp[0]),

                    inp[1],

                    Integer.parseInt(inp[2]),

                    Integer.parseInt(inp[3]),

                    Integer.parseInt(inp[4]));

            arr[i] = s;

        }



        Arrays.sort(arr);



        int rank = 1;

        for (int i = size - 1; i >= 0; i--) {

            System.out.println("Rank: " + rank + " " + arr[i]);

            rank++;

        }

    }

}