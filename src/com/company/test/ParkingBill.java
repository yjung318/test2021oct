package com.company.test;

public class ParkingBill {
    int ENTRANCE_FEE = 2;
    int FIRST_HOUR_FEE = 3;
    int REST_HOUR_FEE = 4;


    public static void main(String[] args) {

        ParkingBill sol = new ParkingBill();
        int cost = sol.solution("10:00", "13:21");
        System.out.println("Total cost: " + cost);

        cost = sol.solution("09:42", "11:42");
        System.out.println("Total cost: " + cost);
    }

    public int solution(String E, String L) {
        int cost = ENTRANCE_FEE;
        String[] entry = E.split(":");
        String[] leave = L.split(":");

        int hourDiff = Integer.parseInt(leave[0]) - Integer.parseInt(entry[0]);
        int minDiff = Integer.parseInt(leave[1]) - Integer.parseInt(entry[1]);

        if (minDiff < 0) {
            hourDiff--;
        }
        else if (minDiff>0) {
            hourDiff++;
        }

        cost += FIRST_HOUR_FEE;
        if (hourDiff > 1) {
            cost += (hourDiff-1) * REST_HOUR_FEE;
        }

        return cost;
    }
}
