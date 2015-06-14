/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stacy
 */
public class GenGMW {

    public List<int[]> getListGMW(int[] ruleSwap, List<int[]> baseSeq) {

        List<int[]> listGMW = new ArrayList<>();
        RuleSwap r = new RuleSwap();

        List<int[]> listShift = new ArrayList<>();
        //  int [][] decGMW = new int[baseSeq.get(1).length][ruleSwap.length];
        // вариант для построчного отображение...потом декомпозировать

        //   int[][] decGMW = new int[ruleSwap.length][baseSeq.get(1).length];
        List<int[]> tempList = new ArrayList<>();

        int[] nullString = new int[baseSeq.get(0).length];

        // формируем нудевую строку
        for (int i = 0; i < nullString.length; i++) {
            nullString[i] = 0;
        }
        int intex = 0;

        for (int i = 0; i < baseSeq.size(); i++) {
            listShift = r.formAllCombination(baseSeq.get(i));

            for (int j = 0; j < ruleSwap.length; j++) {

                if (ruleSwap[j] == -1) {
                    tempList.add(nullString);
                    continue;
                }
                intex = ruleSwap[j];
                tempList.add(listShift.get(intex));

            }
            int[][] temp = getMatx(tempList);

            int[][] decTemp = r.transposeMatx(temp);
            int[] oneLine = getStringFromMatx(decTemp);
            listGMW.add(oneLine);
            tempList.clear();
            listShift.clear();
        }

        //return tempList;
        return listGMW;
    }

    public int[][] getMatx(List<int[]> list) {

        int[][] matx = new int[list.size()][list.get(0).length];
        int[] temp = new int[list.get(0).length];
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            for (int j = 0; j < list.get(0).length; j++) {

                matx[i][j] = temp[j];

            }
        }

        return matx;
    }

    public int[] getStringFromMatx(int[][] mas) {

        int[] str = new int[mas.length * mas[0].length];
        int count = 0;

        for (int j = 0; j < mas.length; j++) {
            for (int k = 0; k < mas[0].length; k++) {
                str[count] = mas[j][k];
                count++;

            }
        }

        return str;

    }
}
