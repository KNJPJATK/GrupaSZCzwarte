package pl.edu.pja.knpj.drugie;

import java.util.Arrays;

/**
 * Created by andrew on 24.03.2016.
 */
public class Comps {
    public static void main(String[] args){
        Integer[] a = {1,5,33,12,98,15};
        printTable("Original ", a);
        Arrays.sort(a,new MyComp(MyComp.COMP.ByVal));
        printTable("ByVal ", a);
        Arrays.sort(a,new MyComp(MyComp.COMP.ByValRev));
        printTable("ByValRev ", a);
        Arrays.sort(a,new MyComp(MyComp.COMP.ByNumOfDivs));
        printTable("ByNumOfDivs ", a);
        Arrays.sort(a, new MyComp(MyComp.COMP.BySumOfDigs));
        printTable("BySumOfDigs ", a);
    }

    static void printTable(String mess, Integer[] a){
        System.out.print(mess + "[ ");
        for (int d : a) System.out.print(d + " ");
        System.out.print("]\n");
    }
}
