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
public class Controller {
    
    private static Controller _instance = null;
    
    public Controller() {
    }
    
    public static synchronized Controller getInstance() {
        if (_instance == null) {
            _instance = new Controller();
        }
        return _instance;
    }
    
    public List<int[]> startGenerate(Parameters parameters) {
        
        
    int periodGMW = parameters.getPeriodGMW();
    int lenghtGMW= parameters.getLenghtGMW();
    int[] polinomMSeq = parameters.getPolinomMSeq();
    int[] basicSequence = parameters.getBasicSequence();
    int rowMatrxDec= parameters.getRowMatrxDec();
    int colMatrxDec =parameters.getColMatrxDec();
    boolean displayMode= parameters.displayMode;
    boolean savingMode = parameters.savingMode;
       
    // *********получаем М-последовательность*********
    int[] mSequence = new int [periodGMW];
       
    GeneratorM generator = new GeneratorM();
    mSequence = generator.gen_M(polinomMSeq);
    
     System.out.println("М- последовательность");
     System.out.println(Arrays.toString( mSequence));
    //***************формируем декомпозиционную матрицу**************
    
    DecompositionMatrix decompos= new DecompositionMatrix();
    int []sizeDecMatx = new int[2];
    if(rowMatrxDec == -1){
        sizeDecMatx = decompos.serchSizeMatx(periodGMW);
    }
    else{
        sizeDecMatx[0]=rowMatrxDec;
        sizeDecMatx[1]= colMatrxDec;
    }
   int[][] decMatx =  decompos.getDecMatx(sizeDecMatx, mSequence);
    
        System.out.println("Размеры декомпозиционной матрицы");
            System.out.println("J : " +sizeDecMatx[0] + "  S : " + sizeDecMatx[1]);
        System.out.println("Декомпозиционная матрица");
    System.out.println(Arrays.deepToString(decMatx));
   //*************получаем правило перестановок*****************
   
   RuleSwap swapper =  new RuleSwap();
   
   int [] ruleSwap = swapper.getRuleSwap(decMatx);
   
    System.out.println("Правило перестановок");
      System.out.println(Arrays.toString( ruleSwap));
   //*********!!!!!!!!!!!!!!!!!!!!!!!!!!!***********
   int [] startSeq = swapper.getBase();
   
    System.out.println("Стартовая строка( с нее формируем правило)");
   System.out.println(Arrays.toString( startSeq));
   //********************ищем базисные последовательности********
   List <int []> listBaseSeq = new ArrayList<>();
   
   if(basicSequence[0]==-1){
       SearchBaseSequence serchBase =  new SearchBaseSequence();
       
       listBaseSeq = serchBase.getListSequence(sizeDecMatx[0], startSeq);
       
   }
   else{
       listBaseSeq.add(basicSequence);
   }
     System.out.println("Список базисных последовательностей");
      for ( int i=0; i< listBaseSeq.size(); i++){
        
        System.out.println(" " +  Arrays.toString (listBaseSeq.get(i)));
    }
     
   //************************ Формируем список GMW *******************
   GenGMW generatorGMW = new GenGMW();
   
   List<int[]> listGMW = new ArrayList<>();
   listGMW = generatorGMW.getListGMW(ruleSwap, listBaseSeq);
    System.out.println("Список GMW");
     for ( int i=0; i< listGMW.size(); i++){
        
        System.out.println(" " +  Arrays.toString (listGMW.get(i)));
    }
    
     return listGMW;
    // список передаваемых сигналов
//       List<int[]> listSignals = parameters.getListMessages();
//        List<int[]> listSignals2 = new ArrayList<>();
//        
//        parameters.setStartListSignals(listSignals);
//        
//        GeneratorM generator = new GeneratorM();
//        Transmitter transmitter = Transmitter.getInstance();
//        Link link = new Link();
//        Receiver reciver =  Receiver.getInstance();
//        
//        System.out.println("Список сообщений");
//        for (int j = 0; j <= listSignals.size() - 1; j++) {
//            int[] temp = listSignals.get(j);
//            listSignals2.add(temp.clone());
//            System.out.println(Arrays.toString(listSignals.get(j)));
//        }
//        System.out.println(" ");
//        
//        listSeq = generator.ensembleSeq(numberCanals, length_M, firstPolinom, secondPolinom);
//        
//        System.out.println("Ансамбль последоваетльностей ");
//        for (int i = 0; i <= listSeq.size() - 1; i++) {
//            System.out.println(Arrays.toString(listSeq.get(i)));
//        }
//        
//        transmitSignal = transmitter.modulation(new ArrayList<int []>(listSignals), listSeq);
//        
//        System.out.println("Передаваемый сигнал");
//        System.out.println(Arrays.toString(transmitSignal));
//        System.out.println(" ");
//        
//       signalAfterLink = link.addNoise(transmitSignal, percentNoise, amplitude);
//        
//        System.out.println("Сигнал после прохождения по каналу");
//        System.out.println(Arrays.toString(signalAfterLink));
//        System.out.println(" ");
//        
//        int maxSignal = (int) (amplitude * numberCanals);
//        int minSignal = (int) (amplitude * numberCanals * (-1));
//        
//      listResivedSignals = reciver.demodulation(listSeq, signalAfterLink, percentThreshold, minADC, maxADC, bitADC, maxSignal, minSignal);
//        
//        System.out.println("Полученные сигналы");
//        for (int i = 0; i <= listResivedSignals.size() - 1; i++) {
//            System.out.println(Arrays.toString(listResivedSignals.get(i)));
//        }
//        
//       // Analyzer  analyzer = new Analyzer.;
//        persentMes = Analyzer.getInstance().comcomparingMessages(listSignals2, listResivedSignals);
        
//        return listResivedSignals;
//        
//    }
//    public double[] persentMes;
//    private List<int[]> listSeq;
//    
//    public List<int[]> listResivedSignals;
//    
//    public double[] transmitSignal ;
//    
//    
//    public   double[] signalAfterLink;
//
//    public double[] getSignalAfterLink() {
//        return signalAfterLink;
//    }
//
//    public double[] getTransmitSignal() {
//        return transmitSignal;
//    }
//    
//    public List<int[]> getListSignals() {
//        return listResivedSignals;
//    }
//    
//    public double[] getPersentMes() {
//        return persentMes;
//    }
//    
//    public List<int[]> getListSeq() {
//        return listSeq;
   }
}
