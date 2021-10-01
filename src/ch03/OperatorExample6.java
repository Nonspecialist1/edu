package ch03;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class OperatorExample6 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 0; //나누기할 때, 0금지

        System.out.println(n1 / n2);
    }
}
