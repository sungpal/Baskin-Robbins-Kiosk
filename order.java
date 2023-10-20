import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class order {
    public static List<String[]> orderList = new ArrayList<>();
    static int nextOrderIndex = 0;
    static int waitNumber = 0;
    static double wholeOrderPrice = 0;
    static double total = 0;

    public static void add(String mainmenu, String product, String flavor, String price) {
        String[] order = {mainmenu, product, flavor, price};
        orderList.add(order);
        nextOrderIndex++;
    }

    public static void order_print() {
        total = 0;
        System.out.println("\n아래와 같이 주문 하시겠습니까? \n\n" +
                "------------------------------------------[ Orders ]------------------------------------------");

        for (String[] order : orderList) {
            System.out.print(order[0] + " - " + order[1] + " - W " + order[3]);
            total += Double.parseDouble(order[3]);
            if (order[2] != null) {
                System.out.print(" ( flavor: " + order[2] + " )");
            }
            System.out.println();
        }
        System.out.println("" +
                "----------------------------------------------------------------------------------------------"+
                "\n [ Total ] \n W " + String.format("%.1f", total) +
                "\n\n 1. 주문         2. 메뉴판");

    }

    public static void clearCart() {
        wholeOrderPrice += total;
        waitNumber++;
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기번호는 [ " + waitNumber + " ] 번 입니다.");

        System.out.println("\n다음 주문을 위해 장바구니를 깨끗이 비우는 중...\n");
        orderList.clear();

        try {
            Thread.sleep(3000); // 3초 대기
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        nextOrderIndex = 0;
    }
}
