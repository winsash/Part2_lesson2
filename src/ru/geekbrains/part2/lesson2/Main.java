package ru.geekbrains.part2.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ArrSize;
        String [][] MyArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        ArrSize = sc.nextInt();
        try {
            MyArray = makeArray(ArrSize);
            transformToInt(MyArray);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }

    public static String[][] makeArray(int ArrSize) throws MyArraySizeException{
        int CorrectArrSize = 4;
        if (ArrSize != CorrectArrSize)
        {
            throw new MyArraySizeException("Wrong size of array. Correct size is: " + CorrectArrSize);
        }
        else{
            String [][] MyArray = {{"sd","2","3","4"}, {"5","6","7","8"}, {"9","10","11","12"},{"5","6","7","8"}};
            return MyArray;
        }
    }
    public static void transformToInt (String [][] MyArray)
    {
        int [][] MyIntArray = new int[4][4];
        int i=0;
        int j=0;
        try {
            for (i=0; i<4;i++)
            {
                for (j=0; j<4; j++)
                {
                    MyIntArray[i][j] = Integer.parseInt(MyArray[i][j]);
                }
            }
        }
        catch (NumberFormatException e)
        {
            throw new MyArrayDataException("This is not integer: " + MyArray[i][j] + " Coordinates: " + i + " " + j, e);
        }

    }
}
