package JavaTest;

import java.util.Scanner;

public class test9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double TAX = 0.1;
        
        System.out.print("商品の単価を入力してください: ");
        double price = sc.nextDouble();
        
        System.out.print("購入個数を入力してください: ");
        int num = sc.nextInt();
        
        // 割引前の合計金額
        double sum = price * num;
        double total = sum;
        
        
        
        double priceOff1 = 0;
        if(num >= 5) {
            priceOff1 = num * 100;
        } else if(num >= 3) {
            priceOff1 = num * 50;
        }
        
        
        total -= priceOff1;
        
        
        
        double priceOff2 = 0;
        if(total >= 10000) {
            priceOff2 = total * 0.1;
        } else if(total >= 5000) {
            priceOff2 = total * 0.05;  
        }
        
        
        
        total -= priceOff2;
        
        
        
        // 総割引額
        double priceOff = priceOff1 + priceOff2;
        
        // 割引後の価格
        double totalAll = sum - priceOff;
        
        // 消費税
        double taxPrice = totalAll * TAX;
        double totalPrice = totalAll + taxPrice;
        
        
        System.out.println();
        System.out.println("商品の単価: " + price);
        System.out.println("購入個数: " + num );
        System.out.println("割引前の合計金額: " + sum );
        System.out.println("割引額: " + priceOff );
        System.out.println("割引後の価格: " + totalAll );
        System.out.println("消費税額: " + taxPrice  );
        System.out.println("税込価格: " + totalPrice);
        
    }
}