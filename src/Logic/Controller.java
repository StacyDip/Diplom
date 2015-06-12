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
    
    private Controller() {
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
       
    int[] mSequence = new int [periodGMW];
       
    GeneratorM generator = new GeneratorM();
    mSequence = generator.gen_M(polinomMSeq);
    
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
        
        return listResivedSignals;
        
    }
    public double[] persentMes;
    private List<int[]> listSeq;
    
    public List<int[]> listResivedSignals;
    
    public double[] transmitSignal ;
    
    
    public   double[] signalAfterLink;

    public double[] getSignalAfterLink() {
        return signalAfterLink;
    }

    public double[] getTransmitSignal() {
        return transmitSignal;
    }
    
    public List<int[]> getListSignals() {
        return listResivedSignals;
    }
    
    public double[] getPersentMes() {
        return persentMes;
    }
    
    public List<int[]> getListSeq() {
        return listSeq;
    }
}
