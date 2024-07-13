public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 55000;
        System.out.println("Значение переменной а с типом int равно " + a);
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 300;
        System.out.println("Значение переменной c с типом short равно " + c);
        long v = 8999999L;
        System.out.println("Значение переменной v с типом long равно " + v);
        float m = 0.45f;
        System.out.println("Значение переменной m с типом float равно " + m);
        double y = 45.12345678123;
        System.out.println("Значение переменной y с типом double равно " + y);

        System.out.println("Задание 2");
        int milkk = 27897;
        System.out.println(milkk);
        byte k = 67;
        System.out.println(k);
        short cat = 569;
        System.out.println(cat);
        long dog = 987678965549L;
        System.out.println(dog);
        short T = -159;
        System.out.println(T);
        float E = 2.786f;
        System.out.println(E);
        double O = 27.12;
        System.out.println(O);

        System.out.println("Задание 3");
        byte LudmillaStudents = 23;
        byte AnnaStudents = 27;
        byte EkaterinaStudents = 30;
        short paper = 480;
        int group = LudmillaStudents + AnnaStudents + EkaterinaStudents;
        int paperStudents = paper / group;
        System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги");

        System.out.println("Задание 4");
        byte performanceMin2 = 16;
        int performanceMin = performanceMin2 / 2;
        int performanceMin20 = performanceMin * 20;
        byte dayHour = 24;
        int dayMin = dayHour * 60;
        int performanceDay = dayMin * performanceMin;
        int dayMin3 = dayMin * 3;
        long performanceDay3 = dayMin3 * performanceMin;
        byte month = 30;
        int dayMin30 = dayMin * month;
        long performanceMonth = dayMin30 * performanceMin;
        System.out.println("За 20 минут машина произвела " + performanceMin20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performanceDay3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + performanceMonth + " штук бутылок");

        System.out.println("Задание 5");
        byte paints = 120;
        byte whitePaintRoom = 2;
        byte brownPaintRoom = 4;
        int roomPaint = whitePaintRoom + brownPaintRoom;
        int room = paints / roomPaint;
        int whitePaint = room * whitePaintRoom;
        int brownPaint = room * brownPaintRoom;
        System.out.println("В школе, где " + room + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задание 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int banana5 = banana * 5;
        int milk2 = milk * 2;
        int iceCream2 = iceCream * 2;
        int egg4 = egg * 4;
        int gramsRecipe = banana5 + milk2 + iceCream2 + egg4;
        double kg = 1000;
        double kgRecipe = gramsRecipe / kg;
        System.out.println("Спортсмены съедают за завтрак " + gramsRecipe + " граммов, либо же " + kgRecipe + " килограмм");

        System.out.println("Задание 7");
        byte weight = 7;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int weightLossAverage = (weightLossMin + weightLossMax) / 2;
        int kgg = 1000;
        int weightGr = weight * kgg;
        int weightLossMinDay = weightGr / weightLossMin;
        int weightLossMaxDay = weightGr / weightLossMax;
        int weightLossAverageDay = weightGr / weightLossAverage;
        System.out.println("При потери весе в " + weightLossMin + " грамм в день, спортсмену понадобиться " + weightLossMinDay + " дней");
        System.out.println("При потери весе в " + weightLossMax + " грамм в день, спортсмену понадобиться " + weightLossMaxDay + " дней");
        System.out.println("При средней потери весе в " + weightLossAverage + " грамм в день, спортсмену понадобиться " + weightLossAverageDay + " дней");

        System.out.println("Задание 8");
        int Masha = 67760;
        int Denis = 83690;
        int Cristina = 76230;
        byte year = 12;
        double increaseAmountM = Masha * 1.1;
        double increaseAmountD = Denis * 1.1;
        double increaseAmountC = Cristina * 1.1;
        double yearNew = (increaseAmountM + increaseAmountD + increaseAmountC) * year;
        double yearMashaNew = increaseAmountM * year;
        double yearDenisNew = increaseAmountD * year;
        double yearCristinaNew = increaseAmountC * year;
        double yearOld = (Masha + Denis + Cristina) * year;
        double yearOldMasha = Masha * year;
        double yearOldDenis = Denis * year;
        double yearOldCristina = Cristina * year;
        double difference = yearNew - yearOld;
        double differenceMasha = yearMashaNew - yearOldMasha;
        double differenceDenis = yearDenisNew - yearOldDenis;
        double differenceCristina = yearCristinaNew - yearOldCristina;
        System.out.println("Разница между годовым доходом с нынешней зарплатой и после повышения составляет " + difference);
        System.out.println("Маша теперь получает " + increaseAmountM + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseAmountD + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseAmountC + " рублей. Годовой доход вырос на " + differenceCristina + " рублей");}








}