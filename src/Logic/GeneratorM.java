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
public class GeneratorM {

// Функция сдвига на единицу (РАБОТАЕТ) сдвиг влево
    public static int[] shiftleft(int[] mas) {

        int[] temp = new int[mas.length];

        for (int i = 0; i <= mas.length - 1; i++) {

            if (i == 0) {
                temp[mas.length - 1] = mas[i];
            } else {
                temp[i - 1] = mas[i];
            }
        }
        mas = temp;
        return mas;
    }
// Функция сдвига на единицу (РАБОТАЕТ) сдвиг впрово

    public static int[] shiftright(int[] mas) {

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
     * @param sequence
     * @return перевернутую последовательность
     */
    public  int [] upendM (int[] sequence){
        
        int[] upendM = new int[sequence.length];
        for (int i=0; i< sequence.length; i++){
            
            upendM[i]= sequence[sequence.length-1-i];
            
        }
        
        
        return upendM;
        
    }
   

    //генерация М-последовательности (РАБОТАЕТ)
    public int[] gen_M( int[] pol) {

       int[] polinom = new int[pol.length];
       
       for(int i=0; i<pol.length;i++){
            polinom[i]= pol[pol.length-1-i];
       }
      
        //устанавливаем начальное состоние регистра
        int[] initial_state = new int[polinom.length];
        for (int i = 0; i <= initial_state.length - 1; i++) {
            if (i < initial_state.length - 1) {
                initial_state[i] = 0;
            } else {
                initial_state[i] = 1;
            }
        }
        
           
//********************ДЛЯ ПОЛИНОМА****************************
        //сколько 1 в полиноме
        int count = 0;
        for (int i = 0; i <= polinom.length - 1; i++) {
            if (polinom[i] == 1) {
                count++;
            }
        }

        // ищем где 1 в полиноме
        int[] masIndexOnes = new int[count];
        int temp = 0;
        for (int i = 0; i < count; i++) {

            for (int j = temp; j <= polinom.length - 1; j++) {

                if (polinom[j] == 1) {
                    masIndexOnes[i] = j;
                    temp++;
                    break;
                } else {
                    temp++;
                }
            }

        }
//*********************************************************

        //**************** РЕГИСТР С ОБРАТНОЙ СВЯЗЬЮ***************
       
        int length_M =  (int) Math.pow(2, polinom.length) -1 ;
        int[] M = new int[length_M];
        int sum = 0; // сумма на круге региcтра
        for (int i = 0; i <= length_M - 1; i++) {

            for (int j = 0; j <= initial_state.length - 1; j++) {

                for (int k = 0; k <= masIndexOnes.length - 1; k++) {

                    if (j == masIndexOnes[k]) {
                        sum = sum + initial_state[j];
                    }
                }
            }

            M[i] = sum % 2;

            sum = 0;

            initial_state = shiftright(initial_state);
            initial_state[0] = M[i];
        }
        
        int [] newM = upendM(M);
        
        return newM;
    }

 
// поиск минимума и позиции

    public static double[] min(double[][] mas) {

        double min = mas[0][0];
        double[] minIJ = new double[3];
        for (int i = 0; i <= mas.length - 1; i++) {
            for (int j = 0; j <= mas.length; j++) {

                if (min > mas[i][j]) {
                    min = mas[i][j];
                    minIJ[0] = min;
                    minIJ[1] = i;
                    minIJ[j] = j;
                }
            }
        }

        return minIJ;
    }

}
