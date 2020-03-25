package com.marekczelij;

public class MethodCurrier {

        // private Object Number;

        public void setValue (int i) {
            System.out.println(i);
            i = i + 5;
            System.out.println(i);
        }

        public void setValue (float f) {
            System.out.println(f);
            f = f + 7;
            System.out.println(f);
        }

        public void setValue (Number n) {
            n.showValue();
            n.setValue(n.x+7);
            n.showValue();
        }

}
