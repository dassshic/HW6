public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int money = 15000;
        int total = 0;
        int percent;
        int month = 0;
        while (total <= 2459000) {
            percent = (int) (total * 0.01);
            total = total + money + percent;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("task2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task3");
        int populationY = 12_000_000;
        int year = 0;
        int calulation = populationY / 1_000;
        int birthrate = 17;
        int mortalityRate = -8;
        while (year < 10) {
            calulation = calulation + birthrate + mortalityRate;
            year++;
            populationY = calulation * 1000;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }

        System.out.println("task4");
        int capital = 15000;
        float bankPercent = 0.07f;
        int monthsToAcumulate = 0;
        while (capital <= 12_000_000) {
            capital = (int) (capital + capital * bankPercent);
            monthsToAcumulate++;
            System.out.println("месяц " + monthsToAcumulate + ", накопленная сумма " + capital);
        }

        System.out.println("task5");
        capital = 15000;
        monthsToAcumulate = 0;
        while (capital <= 12_000_000) {
            capital = (int) (capital + capital * bankPercent);
            monthsToAcumulate++;
            if (monthsToAcumulate % 6 == 0) {
                System.out.println(" месяц " + monthsToAcumulate + ", накопленная сумма " + capital);
            }
        }

        System.out.println("task6");
        capital = 15000;
        monthsToAcumulate = 0;
        float totalYears = 0;
        while (totalYears < 9) {
            capital = (int) (capital + capital * bankPercent);
            monthsToAcumulate++;
            if (monthsToAcumulate % 6 == 0) {
                System.out.println(" месяц " + monthsToAcumulate + ", накопленная сумма " + capital);
                totalYears = totalYears + 0.5f;
            }
        }
        System.out.println("task7");
        int friday = 2;
        for (int days = 0; days < 31; days++) {
            if ((days - 2)%7 == 0) {
                System.out.println("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("task8");
        int twoHundredYearsBefore  =  1822;
        int hundredYearsAfter = 2122;
        for (int years = 0; years < hundredYearsAfter; years=years+79) {
            if (years > twoHundredYearsBefore) {
                System.out.println(years);
            }
        }
        System.out.println("task9");
        int two = 2;
        int result;
        for (int multiplier = 1; multiplier < 11; multiplier++) {
            result = two*multiplier;
            System.out.println(two + "*" + multiplier + "=" +result);
        }
    }
}