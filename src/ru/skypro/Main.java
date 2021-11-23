package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        byte a = -89;
        short b = 30_000;
        int c = 2_000_111_222;
        long d = -9_111_222_333_444_555_666L;

        float e = 1.17f;
        double f = -3.684765389283658101;

        char g = 'a';
        boolean h = false;



        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double generalWeight = boxerOne + boxerTwo;
        double differenceInWeight = boxerTwo - boxerOne;

        System.out.println("Общий вес двух боксеров составляет " + generalWeight + " кг!");
        System.out.println("Разница в весе двух боксеров составляет " + differenceInWeight + " кг!");



        int bananasAmount = 5;
        int bananaGramWeight = 80;
        int bananasWeightBreakfast = 5 * 80;

        System.out.println("Бананов в завтраке " + bananasWeightBreakfast + " грамм");

        int iceCreamAmount = 2;
        int iceCreamWeight = 100;
        int iceCreamWeightBreakfast = 2 * 100;

        System.out.println("Мороженого в завтраке " + iceCreamWeightBreakfast + " грамм");

        int eggsAmount = 4;
        int eggWeight = 70;
        int eggsWeightBreakfast = 4 * 70;

        System.out.println("Яиц в завтраке " + eggsWeightBreakfast + " грамм");

        float mlGramRatio = 105 /(100 * 1.0f);
        System.out.println("Соотношение милилитров к граммам 1 к  " + mlGramRatio);

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

        int minDaily = 250;
        int maxDaily = 500;

        int daysMin = needToLoseInGrams / maxDaily;
        int daysMax = needToLoseInGrams / minDaily;

        System.out.println("Чтобы похудеть, спортсмену потребуется минимум " + daysMin + " дней и максимум " + daysMax);

        int daysAverage = (daysMin + daysMax) / 2;

        System.out.println("В среднем спортсмену потребуется " + daysAverage + " день, чтобы похудеть");



        int mashaPerMonth = 67_760;
        int denisPerMonth = 83_690;
        int kristinaPerMonth = 76_230;

        int increaseRate = 10;

        float newSalaryRatio = 1 + (increaseRate / 100f);

        int mashaNewPerMonth = (int) (mashaPerMonth * newSalaryRatio);
        int denisNewPerMonth = (int) (denisPerMonth * newSalaryRatio);
        int kristinaNewPerMonth = (int) (kristinaPerMonth * newSalaryRatio);

        int mashaDifferenceRate = mashaNewPerMonth - mashaPerMonth;
        int denisDifferenceRate = denisNewPerMonth - denisPerMonth;
        int kristinaDifferenceRate = kristinaNewPerMonth - kristinaPerMonth;

        System.out.println("После увеличения зарплаты Маша стала получать " + mashaNewPerMonth +". Это на " + mashaDifferenceRate + " больше, чем в прошлом году.");

        System.out.println("После увеличения зарплаты Денис стал получать " + denisNewPerMonth +". Это на " + denisDifferenceRate + " больше, чем в прошлом году.");

        System.out.println("После увеличения зарплаты Кристина стала получать " + kristinaNewPerMonth +". Это на " + kristinaDifferenceRate + " больше, чем в прошлом году.");
    }
}

