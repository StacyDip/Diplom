/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Stacy
 */
public class Parameters {

    private static Parameters _instance = null;

    private Parameters() {
    }

    public static synchronized Parameters getInstance() {
        if (_instance == null) {
            _instance = new Parameters();
        }
        return _instance;
    }

    public int getPeriodGMW() {
        return periodGMW;
    }

    public void setPeriodGMW(int periodGMW) {
        this.periodGMW = periodGMW;
    }

    public int getLenghtGMW() {
        return lenghtGMW;
    }

    public void setLenghtGMW(int lenghtGMW) {
        this.lenghtGMW = lenghtGMW;
    }

    public int[] getPolinomMSeq() {
        return polinomMSeq;
    }

    public void setPolinomMSeq(int[] polinomMSeq) {
        this.polinomMSeq = polinomMSeq;
    }

    public int[] getBasicSequence() {
        return basicSequence;
    }

    public void setBasicSequence(int[] basicSequence) {
        this.basicSequence = basicSequence;
    }

    public int getRowMatrxDec() {
        return rowMatrxDec;
    }

    public void setRowMatrxDec(int rowMatrxDec) {
        this.rowMatrxDec = rowMatrxDec;
    }

    public int getColMatrxDec() {
        return colMatrxDec;
    }

    public void setColMatrxDec(int colMatrxDec) {
        this.colMatrxDec = colMatrxDec;
    }

    public boolean isDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(boolean displayMode) {
        this.displayMode = displayMode;
    }

    public boolean isSavingMode() {
        return savingMode;
    }

    public void setSavingMode(boolean savingMode) {
        this.savingMode = savingMode;
    }

    int periodGMW;
    int lenghtGMW;
    int[] polinomMSeq;
    int[] basicSequence;
    int rowMatrxDec;
    int colMatrxDec;
    boolean displayMode;
    boolean savingMode;
}
