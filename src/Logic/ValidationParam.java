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
public class ValidationParam {

    /**
     *
     * @param polinom
     * @return если вид полинома верный
     */
    public boolean chekPolinomMSeq(int[] polinom) {

        if (polinom[0] != 1) {
            return false;

        }

        for (int i = 0; i < polinom.length; i++) {

            if ((polinom[i] != 0) || (polinom[i] != 1)) {

                return false;
            }

        }

        return true;
    }

    public boolean chekSizeDecMatx(int rowMatrxDec, int colMartxDec, int periodGMW) {

        int temp = rowMatrxDec * colMartxDec;
        if (temp != periodGMW) {
            return false;
        }
        return true;
    }

    public boolean chekFormatВasicSequence(int[] basicSequence) {
        for (int i = 0; i < basicSequence.length; i++) {

            if ((basicSequence[i] != 0) || (basicSequence[i] != 1)) {

                return false;
            }

        }

        return true;
    }

    public boolean chekSizeВasicSequence(int colMartxDec, int[] basicSequence) {

        if (basicSequence.length != colMartxDec) {
            return false;
        }

        return true;
    }
}
