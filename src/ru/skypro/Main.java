package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte a = -89;
        short b = 30_000;
        int c = 2_000_111_222;
        long d = -9_111_222_333_444_555_666L;

        float e = 1.17f;
        double f = -3.684765389283658101;

        char g = 'a';
        boolean h = false;


        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        double differenceInWeight = secondBoxerWeight - firstBoxerWeight;

        System.out.println("Общий вес двух боксеров составляет " + totalWeight + " кг!");
        System.out.println("Разница в весе двух боксеров составляет " + differenceInWeight + " кг!");


        int bananasAmount = 5;
        int bananaGramWeight = 80;
        int bananasWeightBreakfast = bananasAmount * bananaGramWeight;

        System.out.println("Бананов в завтраке " + bananasWeightBreakfast + " грамм");

        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int iceCreamWeightBreakfast = iceCreamAmount * iceCreamWeight;

        System.out.println("Мороженого в завтраке " + iceCreamWeightBreakfast + " грамм");

        int eggsAmount = 4;
        int eggWeight = 70;
        int eggsWeightBreakfast = eggsAmount * eggWeight;

        System.out.println("Яиц в завтраке " + eggsWeightBreakfast + " грамм");

        int wilkWeight = 100;
        float mlGramRatio = 105 /(wilkWeight * 1.0f);
        System.out.println("Соотношение милилитров к граммам 1 к " + mlGramRatio);

        float milkWeightInMl = 200;
        float milkWeightInGr = milkWeightInMl * mlGramRatio;
        System.out.println("Молока в завтраке " + milkWeightInGr + " грамм");

        float allBreakfast = bananasWeightBreakfast + iceCreamWeightBreakfast + eggsWeightBreakfast + milkWeightInGr;

        System.out.println("Весь завтрак составил " + allBreakfast + " грамм");

        float gramInKg = 1_000;

        System.out.println("В одном килограмме " + gramInKg + " грамм");

        float allBreakfastInKg = allBreakfast / gramInKg;

        System.out.println("Завтрак составил " + allBreakfastInKg + " килограмм");


        int needToLoseKg = 7;
        int gramsInKg = 1_000;

        int needToLoseInGrams = needToLoseKg * gramsInKg;

        System.out.println("Спортсмену необходимо скинуть " + needToLoseInGrams + " грамм");

        int minDailyLoose = 250;
        int maxDailyLoose = 500;

        int daysMin = needToLoseInGrams / maxDailyLoose;
        int daysMax = needToLoseInGrams / minDailyLoose;

        System.out.println("Чтобы похудеть, спортсмену потребуется минимум " + daysMin + " дней и максимум " + daysMax);

        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("В среднем спортсмену потребуется " + daysAverage + " дней, чтобы похудеть");


        int mashaMonthSalary = 67_760;
        int denisMonthSalary = 83_690;
        int kristinaMonthSalary = 76_230;

        int increasePercent = 10;

        float newSalaryRatio = 1 + (increasePercent / 100f);

        float mashaNewPerMonth = mashaMonthSalary * newSalaryRatio;
        float denisNewPerMonth = denisMonthSalary * newSalaryRatio;
        float kristinaNewPerMonth = kristinaMonthSalary * newSalaryRatio;

        float mashaDifferenceRate = mashaNewPerMonth - mashaMonthSalary;
        float denisDifferenceRate = denisNewPerMonth - denisMonthSalary;
        float kristinaDifferenceRate = kristinaNewPerMonth - kristinaMonthSalary;

        System.out.println("После увеличения зарплаты Маша стала получать " + mashaNewPerMonth +". Годовой доход вырос на " + mashaDifferenceRate * 12 + " рублей.");

        System.out.println("После увеличения зарплаты Денис стал получать " + denisNewPerMonth +". Годовой доход вырос на " + denisDifferenceRate * 12 + " рублей.");

        System.out.println("После увеличения зарплаты Кристина стала получать " + kristinaNewPerMonth +". Годовой доход вырос на " + kristinaDifferenceRate * 12 + " рублей.");
    }
}