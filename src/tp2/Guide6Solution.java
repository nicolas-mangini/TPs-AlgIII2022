package tp2;

import tp2.utilsTP2.Survey;

public class Guide6Solution implements Guide6 {
    @Override
    public int[] exercise_1_j(int[] a) {
        int[] reverse = new int[a.length];
        int aux = a.length;
        for (int i = 0; i < a.length; i++) {
            reverse[aux - 1] = a[i];
            aux--;
        }
        return reverse;
    }

    @Override
    public boolean exercise_4(int[] a) {
        boolean isGaspariforme = true;
        int sum = 0;
        if (a[0] < 0) {
            return false;
        }
        for (int i = 0; i < a.length - 1; i++) {
            sum += a[i];
            if (sum < 0) {
                isGaspariforme = false;
            }
        }
        if (sum + a[a.length - 1] != 0) {
            isGaspariforme = false;
        }
        return isGaspariforme;
    }

    @Override
    public int[] exercise_6(int[] infraction) {
        int[] s = new int[infraction.length];
        for (int i = 0; i < s.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + infraction[j];
                s[i] = sum;
            }
        }
        return s;
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        int interviewedPeople = 0;
        for (int i = 0; i < surveys.length; i++) {
            if (surveys[i].sex == 2 && surveys[i].type == 1) {
                interviewedPeople++;
            }
        }
        return (double) interviewedPeople / (double) surveys.length;
    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        int sumOfAges = 0;
        for (int i = 0; i < surveys.length; i++) {
            sumOfAges += surveys[i].age;
        }
        return ((double) sumOfAges / (double) surveys.length);
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        int interviewedPeople = 0;
        for (int i = 0; i < surveys.length; i++) {
            if (surveys[i].age > 21 && surveys[i].type == 2) {
                interviewedPeople++;
            }
        }
        return interviewedPeople;
    }
}
