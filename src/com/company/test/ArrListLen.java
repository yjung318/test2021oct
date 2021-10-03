package com.company.test;

// yumiko's change
public class ArrListLen {


    public static void main(String[] args) {
        int list[] = new int[]{1,4,-1,3,2};

        ArrListLen ar = new ArrListLen();
        int count = ar.solution(list);

        System.out.println("linked count: " + count);
    }


    public int solution(int[] list) {
        int idx = 0;
        int count = 1;
        for (; count<list.length+1; count++) {
            int value = list[idx];
            if (value<1) {
                break;
            }
            idx = value;
        }
        return count;
    }
}
