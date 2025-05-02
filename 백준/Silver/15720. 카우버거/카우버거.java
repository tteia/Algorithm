import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        Integer[] burgers = new Integer[B];
        Integer[] sides = new Integer[C];
        Integer[] drinks = new Integer[D];

        for (int i = 0; i < B; i++) {
            burgers[i] = sc.nextInt();
        }

        for (int i = 0; i < C; i++) {
            sides[i] = sc.nextInt();
        }

        for (int i = 0; i < D; i++) {
            drinks[i] = sc.nextInt();
        }

        Arrays.sort(burgers, Collections.reverseOrder());
        Arrays.sort(sides, Collections.reverseOrder());
        Arrays.sort(drinks, Collections.reverseOrder());

        int totalPrice = 0;
        for (int price : burgers) totalPrice += price;
        for (int price : sides) totalPrice += price;
        for (int price : drinks) totalPrice += price;

        int setCount = Math.min(B, Math.min(C, D));
        int discountedPrice = 0;

        for (int i = 0; i < setCount; i++) {
            int setSum = burgers[i] + sides[i] + drinks[i];
            discountedPrice += setSum * 0.9;
        }

        for (int i = setCount; i < B; i++) discountedPrice += burgers[i];
        for (int i = setCount; i < C; i++) discountedPrice += sides[i];
        for (int i = setCount; i < D; i++) discountedPrice += drinks[i];

        System.out.println(totalPrice);
        System.out.println(discountedPrice);
    }
}
