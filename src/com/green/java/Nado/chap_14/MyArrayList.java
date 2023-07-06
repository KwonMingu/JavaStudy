package com.green.java.Nado.chap_14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);

}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

interface MyFunction2 {
    int apply(int p);
}

public class MyArrayList {
    private int[] arr;


    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = val;
        for (int i = 0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;

    }
    public void forEach(MyConsumer consumer) {
        for (int i = 0; i < this.arr.length; i++) {
            consumer.accept(this.arr[i]);
        }

    }

    public MyArrayList filter(MyPredicate predicate) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.arr.length; i++) {
            if (i >0) {sb.append(","); }
            sb.append(this.arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public MyArrayList map(MyFunction2 fn) {
        MyArrayList temp = new MyArrayList();
        for (int i = 0; i < this.arr.length; i++) {
            int val = fn.apply(this.arr[i]);
            temp.add(val);

        }
        return temp;
    }

    public void removeIf(MyPredicate predicate) {
        int idx = 0;
        int[] temp = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            int val = this.arr[i];
            boolean b = predicate.test(val);
            if (b== false) {
                temp[idx] = val;
                idx++;
            }
        }
        int[] temp2 = new int[idx];

        this.arr = temp2;

    }


    public void replaceAll(MyFunction2 mFn) {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = mFn.apply(this.arr[i]);
        }
    }
}
