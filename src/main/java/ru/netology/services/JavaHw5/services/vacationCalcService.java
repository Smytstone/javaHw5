package ru.netology.services.JavaHw5.services;
public class vacationCalcService {
    public int vacationCalc(int income, int expence, int threshold) {
        int money = 0;
        int vacationMonths = 0;
        for (int i = 1; i < 12; i++) {
            if (money >= threshold) {
                money = (money - expence) / 3;
                vacationMonths += 1;
                continue;
            }
            money = money + income - expence;
        }
        return vacationMonths;

    }
}
