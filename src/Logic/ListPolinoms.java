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
public class ListPolinoms {
/**
 * 
 * @param powPolinom - степень полинома
 * @return список полиномов данной степени
 */
    public List<int[]> getListPolinom(int powPolinom) {

        List<int[]> list = new ArrayList<>();
        switch (powPolinom) {
            case 3:
                list = fillThree();
                break;
            case 4:
                list = fillFour();
                break;
            case 5:
                list = fillFive();
                break;
            case 6:
                list = fillSix();
            case 7:
                list = fillSeven();
        }

       
//        List<int[]> eight = new ArrayList<>();
//        List<int[]> nine = new ArrayList<>();
//        List<int[]> ten = new ArrayList<>();
//        List<int[]> eleven = new ArrayList<>();

        return list;
    }

    public List<int[]> fillThree() {
        List<int[]> three = new ArrayList<>();
        int[] a = {1, 0, 1};
        int[] b = {1, 1, 0};
        three.add(a);
        three.add(b);
        return three;
    }

    public List<int[]> fillFour() {
        List<int[]> four = new ArrayList<>();
        int[] a = {1, 0, 0, 1};
        int[] b = {1, 1, 0, 0};
        four.add(a);
        four.add(b);

        return four;
    }

    public List<int[]> fillFive() {

        List<int[]> five = new ArrayList<>();

        int[] a = {1, 0, 0, 1, 0};
        five.add(a);
        int[] b = {1, 0, 1, 0, 0};
        five.add(b);
        int[] c = {1, 0, 1, 1, 1};
        five.add(c);
        int[] d = {1, 1, 0, 1, 1};
        five.add(d);
        int[] i = {1, 1, 1, 0, 1};
        five.add(i);
        int[] f = {1, 1, 1, 1, 0};
        five.add(f);

        return five;

    }

    public List<int[]> fillSix() {
        List<int[]> six = new ArrayList<>();

        int[] a = {1, 0, 0, 0, 0, 1};
        six.add(a);
        int[] b = {1, 0, 1, 0, 1, 1};
        six.add(b);
        int[] c = {1, 0, 1, 1, 0, 1};
        six.add(c);
        int[] d = {1, 1, 0, 0, 0, 0};
        six.add(d);
        int[] i = {1, 1, 0, 0, 1, 1};
        six.add(i);
        int[] f = {1, 1, 0, 1, 1, 0};
        six.add(f);
        int[] g = {1, 1, 1, 0, 0, 1};
        six.add(g);

        return six;

    }

    public List<int[]> fillSeven() {
        List<int[]> seven = new ArrayList<>();

        int[] a = {1, 0, 0, 0, 0, 0, 1};
        seven.add(a);
        int[] b = {1, 0, 0, 0, 1, 0, 0};
        seven.add(b);
        int[] c = {1, 0, 0, 0, 1, 1, 1};
        seven.add(c);
        int[] d = {1, 0, 0, 1, 0, 0, 0};
        seven.add(d);
        int[] f = {1, 0, 0, 1, 1, 1, 0};
        seven.add(f);
        int[] i = {1, 0, 1, 0, 0, 1, 1};
        seven.add(i);
        int[] h = {1, 0, 1, 0, 1, 0, 1};
        seven.add(h);
        int[] g = {1, 0, 1, 1, 1, 0, 0};
        seven.add(g);
        int[] v = {1, 0, 1, 1, 1, 1, 1};
        seven.add(v);
        int[] s = {1, 1, 0, 0, 0, 0, 0};
        seven.add(s);
        int[] q = {1, 1, 0, 0, 1, 0, 1};
        seven.add(q);
        int[] w = {1, 1, 0, 1, 0, 0, 1};
        seven.add(w);
        int[] e = {1, 1, 0, 1, 0, 1, 0};
        seven.add(e);
        int[] r = {1, 1, 1, 0, 0, 1, 0};
        seven.add(r);
        int[] t = {1, 1, 1, 0, 1, 1, 1};
        seven.add(t);
        int[] y = {1, 1, 1, 1, 0, 0, 0};
        seven.add(y);
        int[] u = {1, 1, 1, 1, 0, 1, 1};
        seven.add(u);
        int[] o = {1, 1, 1, 1, 1, 1, 0};
        seven.add(o);

        return seven;

    }

}
