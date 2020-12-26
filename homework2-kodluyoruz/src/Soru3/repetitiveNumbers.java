package Soru3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class repetitiveNumbers {

	public static void main(String[] args) {
        Random rnd = new Random();

        int[] numbers = new int[10];
        int saveNum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rnd.nextInt(11);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 1; j < numbers.length; j++) 
            {
                if (i != j) {
                    if (numbers[i] == numbers[j]) {
                        saveNum = numbers[i];
                    }
                    else
                    {
                        continue;
                    }
                    if (list.contains(saveNum) == false)
                    {
                        list.add(saveNum);
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
