public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 47;
        int b = 13;
        int c = a / b;
        int d = a % b;
        System.out.println(c + " и " + d +" остаток");

        int e = 345;
        int f = e / 100;
        int g = (e % 100) / 10;
        int h = e % 10;
        System.out.println("сумма цифр числа " + e + " равна " + (f + g + h));

        int flowers = 4899;
        int card = 157;
        int summa = flowers + card;
        int discount = 10;
        double discountRub = summa * (discount / 100d);
        double summaWithDis = summa - discountRub;
        System.out.println("Сумма двух покупок с учетом скидки " + summaWithDis + " рублей");
        System.out.println("Скидка составила " + discountRub + " рублей");

        int orangesRub = 73;
        int discountO = 15;
        double orangesDis = orangesRub - orangesRub * (discountO / 100d);
        int weightOranges = 10;
        int bananasRub = 95;
        int weightBananas = 2;
        double summaOrBa = orangesDis * weightOranges + bananasRub * weightBananas;
        System.out.println(summaOrBa);

    }
}