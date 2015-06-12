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
public class RuleSwap {

    /**
     *
     * @param mas
     * @return сдвинутый массив
     */
    public static int[] shift(int[] mas) {

        int[] temp = new int[mas.length];

        for (int i = mas.length - 1; i >= 0; i--) {

            if (i == mas.length - 1) {
                temp[0] = mas[i];

            } else {
                temp[i + 1] = mas[i];
            }
        }
        mas = temp;
        return mas;
    }

    /**
     *
     * @param matx
     * @return транспонированная матрица
     */
    public int[][] transposeMatx(int[][] matx) {

        int[][] transpMatx = new int[matx[0].length][matx.length];

        for (int i = 0; i < matx[0].length; i++) {

            for (int j = 0; j < matx.length; j++) {

                transpMatx[i][j] = matx[j][i];

            }

        }

        return transpMatx;
    }

    /**
     *
     * @param decMatx
     * @return номер нулевого столбца в матрице декомпозиции
     */
    public int findNullCol(int[][] decMatx) {
        int numberCol = 0;

        int[][] tempMatx = transposeMatx(decMatx);

        int count = 0;
        for (int i = 0; i < tempMatx.length; i++) {
            for (int j = 0; j < tempMatx[0].length; j++) {

                if (tempMatx[i][j] == 0) {
                    count++;
                }
            }

            if (count == tempMatx[0].length) {
                numberCol = i;
                break;
            }
            count = 0;
        }

        return numberCol;
    }

    /**
     *
     * @param mas
     * @return список всех сдвигов
     */
    public List<int[]> formAllCombination(int[] mas) {

        List<int[]> listCombination = new ArrayList<>();
        int[] temp = mas;
        listCombination.add(mas);
        for (int i = 0; i < mas.length - 1; i++) {
            temp = shift(temp);
            listCombination.add(temp.clone());
        }

        return listCombination;
    }

    /**
     *
     * @param mas
     * @return преобразование массива с список строк
     */
    public List<int[]> convertTOList(int[][] mas) {

        List<int[]> listRow = new ArrayList<>();

        int[] tempRow = new int[mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                tempRow[j] = mas[i][j];

            }
            listRow.add(tempRow.clone());
        }
        return listRow;
    }

    /**
     *
     * @param decMatx
     * @param masCombination
     * @return правило перестановок
     */
    public int[] getRuleSwap(int[][] decMatx) {

        int[] ruleSwap = new int[decMatx[0].length];

        List<int[]> listRow = new ArrayList<>();
        // номер столбца с которого формируется правило

        // вручную задаю номер столбца (3) - для проверки
        int numberCol = 3;

        //номер нулевого столбца
        int nullCol = findNullCol(decMatx);

       // ***************** РАССКОМЕНТИРОВАТЬ****************
        // автоматом получаем ( ПРАВИЛЬНЫЙ ВАРИАНТ)
      /*  if (nullCol==0){
         int  numberCol =1;
         }
         else  {  int numberCol = 0;}
      
         */
        int[][] temp = transposeMatx(decMatx);
        int[] base = new int[temp[0].length];
        for (int i = 0; i < base.length; i++) {
            // на ее основе формируем все сдвиги  
            base[i] = temp[numberCol][i];
        }

        List<int[]> listCombination = formAllCombination(base);
        List<int[]> listConvertMatx = convertTOList(temp);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < listCombination.size(); j++) {

                if (i == nullCol) {
                    ruleSwap[i] = -1;
                    continue;
                }
                if (Arrays.equals(listConvertMatx.get(i), listCombination.get(j))) {
                    ruleSwap[i] = j;

                }

            }

        }

        return ruleSwap;
    }
}
