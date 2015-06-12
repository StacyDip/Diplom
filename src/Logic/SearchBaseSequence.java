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
public class SearchBaseSequence {

    /**
     *
     * @param sizeRowDecMatx
     * @return степень полинома для данной длины
     */
    public int getPowPolinom(int sizeRowDecMatx) {
        int pow = 1;
        int temp = sizeRowDecMatx + 1;
        int count = 2;
        do {
            count = count * 2;
            pow++;
        } while (count != temp);

        return pow;

    }
    

    /**
     *
     * @param sizeRowDecMatx - количество строк в матрице декомпозиции
     * @return все возможные последовательности данной длины
     */
    public List<int[]> formListSequence(int sizeRowDecMatx) {
        List<int[]> listSequence = new ArrayList<>();
        ListPolinoms polList = new ListPolinoms();
        List< int[]> listPolinom = polList.getListPolinom(getPowPolinom(sizeRowDecMatx));
        GeneratorM generM = new GeneratorM();

        for (int i = 0; i < listPolinom.size(); i++) {

            listSequence.add(generM.gen_M(listPolinom.get(i)));
        }

        return listSequence;
    }
/**
 * 
 * @param listSignal список полиномов
 * @param base - рабочая строка
 * @return  какая последовательность не подходит
 */
    public int chekSequence(List<int[]> listSignal, int [] base) {
      
         List<int[]> listBase = new ArrayList<>();
        RuleSwap r =  new RuleSwap();
        int delIndex = -1;
        // сформируем список всех сдвигов последовательности по которой идет сравнение 
        listBase = r.formAllCombination(base);
        for (int i =0; i<listSignal.size();i++){
            
            for (int j = 0; j< listBase.size(); j++){
                
                if (Arrays.equals (listBase.get(j),listSignal.get(i))){
                    delIndex = i;
                    break;
                }
                
            }
        }
        
        
        return delIndex;
    }
/**
 * 
 * @param sizeRowDecMatx - сколько строк в матрице декомпозиции
 * @param base - рабочая м-ка по каторой формируется правило сдвига
 * @return список базовых последовательностей
 */
    public List<int[]> getListSequence(int sizeRowDecMatx, int [] base) {
     //  List<int[]> listBaseSequence = new ArrayList<>();
        
          List<int[]> listAllM = new ArrayList<>();
          listAllM = formListSequence(sizeRowDecMatx);
          int idexDel = chekSequence(listAllM, base);
          if(idexDel <0){
              return listAllM;
              
          }
          else{
           listAllM.remove(idexDel);
        
        
        return listAllM;
          }
    }

}
