/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Stacy
 */
public class DecompositionMatrix {

    /**
     *
     * @param mas
     * @return розиция минимального значения в строке
     */
    public int getPosMin(int[] mas) {
        int count =0;
        int position = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (position > mas[i]) {
                position = mas [i];
                count ++;
            }
            
        }
        
        return count;
    }

    /**
     *
     * @param periodGMW
     * @return размеры декомпозиционной матрицы
     */
    public int[] serchSizeMatx(int periodGMW) {
        
        int[] sizeMatrix = new int[2];
        int[] listCol = new int[20];
        
        int pow = 3;
        for (int i = 0; i < listCol.length; i++) {
            // System.out.println(" " + pow);
            listCol[i] = (int) ((Math.pow(2, pow)) - 1);
            pow++;
            
        }
        
        List<int[]> listSize = new ArrayList<>();
        for (int i = 0; i < listCol.length; i++) {
            if ((periodGMW % listCol[i] == 0) && (periodGMW != listCol[i])) {
                int temp = periodGMW / listCol[i];
                sizeMatrix[0] = listCol[i];
                sizeMatrix[1] = temp;
                listSize.add(sizeMatrix.clone());
                
            }
        }
        //список разностей
        int[] flag = new int[listSize.size()];
        for (int i = 0; i < flag.length; i++) {
            int[] row = listSize.get(i);
            flag[i] = Math.abs(row[0] - row[1]);
// System.out.println(" " + Arrays.toString(flag));
        }
        
      
        int minPos = getPosMin(flag);
     
      //  System.out.println("" + Arrays.toString(listSize.get(minPos)));
       sizeMatrix  = listSize.get(minPos);
       
   
        return sizeMatrix;
        
    }

    /**
     *
     * @param sizeDecMatx
     * @param seqM
     * @return декомпозиционная матрица
     */
    public int[][] getDecMatx(int[] sizeDecMatx, int[] seqM) {
        
        int[][] decompositionMatx = new int[sizeDecMatx[0]][sizeDecMatx[1]];
        
        int count = 0;
        for (int i = 0; i < sizeDecMatx[0]; i++) {
            
            for (int j = 0; j < sizeDecMatx[1]; j++) {
                
                decompositionMatx[i][j] = seqM[count];
                count++;
            }
        }
        
        return decompositionMatx;
    }

    /**
     *
     * @param decMatx
     * @return последовательность из декомпозиционной матрицы
     */
    public int[] getReDecSeq(int[][] decMatx) {
        int[] seq = new int[decMatx.length * decMatx[0].length];
        int count = 0;
        for (int[] decMatx1 : decMatx) {
            for (int j = 0; j < decMatx[0].length; j++) {
                seq[count] = decMatx1[j];
                count++;
            }
        }
        
        return seq;
        
    }
    
}
