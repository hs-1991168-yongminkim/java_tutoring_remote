package test;

import part1.aaa;
import part1.bbb;
import part1.ccc;

public class Main {
    public static void main(String[] args) {

        aaa a = new aaa();
        a.ddd();

        aaa b = new aaa();
        b.eee();

        bbb c = new aaa();
        c.eee();

        ccc d = new aaa();
        d.fff();

        ccc e = new aaa() {
            @Override
            public void eee(){
                System.out.println();
            }
        };


    }

}