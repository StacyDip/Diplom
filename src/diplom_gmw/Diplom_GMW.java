/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplom_gmw;

import Logic.Controller;
import Logic.DecompositionMatrix;
import Logic.GenGMW;
import Logic.GeneratorM;
import Logic.ListPolinoms;
import Logic.Parameters;
import Logic.RuleSwap;
import Logic.SearchBaseSequence;
import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.sound.midi.ControllerEventListener;

/**
 *
 * @author Stacy
 */
public class Diplom_GMW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
//       // sizeDecMatx.toString();
//        System.out.println(""+Arrays.deepToString(sizeDecMatx));
//     int[][] decompositionMatx = new int[sizeDecMatx.length] [sizeDecMatx[0].length]; 
//        System.out.println(""+Arrays.deepToString(decompositionMatx));
//      int a=10;
//      

// int[] seq =  new int[decMatx.length *decMatx[0].length];      
//    
// int count=0;
// int i=0;
//   for(int j = 0; j< decMatx.length;j++){
//            for (int k=0; k< decMatx[0].length; k++){
//              seq[i]=  decMatx[j][k];
//                i++;
//            }
//        }
// 
// 
  //   int[][] matx = {{2, 1,3}, {0, 6, 9}, { 45, 48,4},{8,6,4}};
 //        int[][] transpMatx = new int[matx[0].length][matx.length];
         
//         int temp;
//          for (int i=0;i<matx[0].length; i++){
//            
//            for (int j=0; j< matx.length; j++){
//                
//                temp = matx[j][i];
//                System.out.println(""+ temp);
//                
//            }
//            
//        }
//         
// int[][]a = {{0,0,0,1},
//             {0,0,0,0},
//             {1,0,0,1}
//            };
//// int[] s = {0,0,1,1,1,0,1}; 
// RuleSwap p = new RuleSwap();
//// List <int []> a = p.formAllCombination(s);
////for (int i = 0; i <= a.size() - 1; i++) {
////System.out.println(""+ Arrays.toString(a.get(i)) );
////    }
//     
//  int [][] test = { {0,0,0,0,0,1,0,0,0},
//                    {0,1,1,0,0,0,1,0,1},
//                    {0,0,1,1,1,1,0,1,0},
//                    {0,0,1,1,1,0,0,1,0},
//                    {0,1,0,1,1,0,1,1,1},
//                    {0,1,1,0,0,1,1,0,1},
//                    {0,1,0,1,1,1,1,1,1}};
//  
//     
//      
//     int[][] temp =p.transposeMatx(test);
//      int [] base = new int[temp[0].length];
//     int  numberCol =3;
//        for(int i = 0; i<base.length;i++){
//            
//            base[i]=temp[numberCol][i];
//          //  System.out.println(" " + Arrays.toString(base));
//        }
      
      
     // System.out.println(""+ Arrays.toString(base) );
      
//      List <int []> listCombination =  p.convertTOList(test);
//      for (int i = 0; i <= listCombination.size() - 1; i++) {
//System.out.println(""+ Arrays.toString(listCombination.get(i)) );
//    }
//      int [] rule = new int[test[0].length];
//      rule = p.getRuleSwap(test);
//        System.out.println(" " + Arrays.toString(rule));
//        
//        DecompositionMatrix d = new DecompositionMatrix();
//        
//       int [] f = d.serchSizeMatx(1023);
//      System.out.println(" " + Arrays.toString(f));
   
        
      
//       int [] polin= {1,0,0,0,0,1};
//       
//       
//        GeneratorM gen =  new GeneratorM();
//        int [] m = gen.gen_M(polin);
//        
//        
//        
//        System.out.println(" "+ Arrays.toString(m));
//     
//            DecompositionMatrix dec = new DecompositionMatrix();
//            int per = 63;
//           int []size  = dec.serchSizeMatx(per);
//            int [][] decMatx = dec.getDecMatx(size, m);
//     System.out.println(Arrays.deepToString(decMatx) );
//     
//     RuleSwap rul = new  RuleSwap();
//     int [] fff = rul.getRuleSwap(decMatx);
//     System.out.println(" \n");
//     System.out.println(" "+ Arrays.toString(fff));
                
           
   //ListPolinoms list =  new ListPolinoms();
//    List< int[]> a = new ArrayList<>();
//    a = list.getListPolinom(7);
//    
//    for ( int i=0; i< a.size(); i++){
//        
//        System.out.println(" ");
//        System.out.println(" " +  Arrays.toString (a.get(i)));
//    }
//         List< int[]> a = new ArrayList<>();
//   
//       
//    SearchBaseSequence d = new SearchBaseSequence();
//    int [] base = {0,0,1,1,1,0,1};   
//    a = d.getListSequence(7, base);
//    //a = d.formListSequence(7);
//       for ( int i=0; i< a.size(); i++){
//        
//        System.out.println(" ");
//        System.out.println(" " +  Arrays.toString (a.get(i)));
//    }
//         int [] base = {0,0,1,0,1,1,1}; 
//       int[] rule = {-1,2, 6,0,0,3,2,0,2};
//       List<int[]> listBaseSeq = new ArrayList<>();
//       listBaseSeq.add(base);
//       GenGMW gen = new GenGMW();
//        List< int[]> a = new ArrayList<>();
//       a= gen.getListGMW(rule, listBaseSeq);
//        for ( int i=0; i< a.size(); i++){
//        
//        System.out.println(" ");
//        System.out.println(" " +  Arrays.toString (a.get(i)));
//    }
//       
      int [] polinom = {1,1,1,0,1,1,1,1,1,0,0};
      int [] base = {-1,1,1,0,1,1,1}; 
        Parameters param =  new Parameters();
        
        param.setPeriodGMW(2046);
        param.setLenghtGMW(63);
        param.setPolinomMSeq(polinom);
        param.setBasicSequence(base);
        param.setRowMatrxDec(-1);
         Controller cont = new Controller();
         List <int[]> l =  new ArrayList<>();
         l = cont.startGenerate(param);
        
                
    }
}
