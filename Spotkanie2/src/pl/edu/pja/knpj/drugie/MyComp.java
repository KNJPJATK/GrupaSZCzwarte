package pl.edu.pja.knpj.drugie;

import java.util.Comparator;

/**
 * Created by tom on 24.03.2016.
 */
public class MyComp implements Comparator<Integer>{

    private COMP compType;

    public MyComp(COMP comp){
        compType = comp;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        switch (compType){
            case ByVal:

                return o1-o2;
            case ByValRev:
               return o2-o1;
            case ByNumOfDivs:
                return getNumOfDivs(o2)-getNumOfDivs(o1);
            case BySumOfDigs:
                return getSumofDigs(o2)-getSumofDigs(o1);
            default:
                return 0;

        }
    }

    private int getNumOfDivs(int num){
        int divs =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                divs++;
            }
        }
        return divs;
    }

    /**
     * bfnznxm,nc
     * @param num xcxcxcxc
     * @return xcxcxcxc
     */
    private int getSumofDigs(int num){
        if(num>0) {
            int sumOfDigs = 0;
            String numString = num + "";
            for (int i = 0; i < numString.length(); i++) {
                sumOfDigs += Integer.parseInt(numString.charAt(i) + "");
            }
            return sumOfDigs;
        }else {
            return 0;
        }

    }

    public enum COMP {
        ByVal,ByValRev, ByNumOfDivs, BySumOfDigs
    }
}
