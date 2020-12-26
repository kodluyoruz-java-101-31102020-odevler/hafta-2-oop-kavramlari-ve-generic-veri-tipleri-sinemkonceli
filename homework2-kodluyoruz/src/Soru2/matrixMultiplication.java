package Soru2;

import java.util.Random;

public class matrixMultiplication {
	public static void main(String args[]) 
	 {
		 Random rnd = new Random();
	        int a = 2, b = 3, c = 3, d = 4, rndNum, saveNum = 0;
	        int[][] aMatrix = new int[a][b];
	        for (int i = 0; i < a; i++) 
	        {
	            for (int j = 0; j < b; j++)
	            {
	                rndNum = rnd.nextInt(11);
	                if (rndNum == 0)
	                    rndNum++;
	                aMatrix[i][j] = rndNum;
	                System.out.print(aMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        int[][] bMatrix = new int[c][d];
	        for (int i = 0; i < c; i++) 
	        {
	            for (int j = 0; j < d; j++)
	            {
	                rndNum = rnd.nextInt(11);
	                if (rndNum == 0)
	                    rndNum++;
	                bMatrix[i][j] = rndNum;
	                System.out.print(bMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        int[][] sMatrix = new int[a][d];

	        for(int i = 0; i < d; i++) 
	        {

	            for(int j = 0; j< a; j++) {

	                sMatrix[j][i]=0;

	                for(int h = 0; h < c; h++) {

	                    sMatrix[j][i]=sMatrix[j][i] + aMatrix[j][h] * bMatrix[h][i];
	                }
	            }
	        }
	        System.out.println();
	        System.out.println("Matris Çarpım Sonucu");
	        for (int i = 0; i < 2; i++) 
	        {
	            for (int j = 0; j < 4; j++)
	            {
	                System.out.print(sMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
