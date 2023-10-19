import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        while (true) {
            menu menu = new menu();
            Scanner sc = new Scanner(System.in);
            int mainmenu_num = sc.nextInt();
            int size_num = 0;
            int flavor_num = 0;
            int product_num = 0;
            int orderOrmenu = 0;
            int okOrcancel = 0;
            int backToMenu = 0;

            switch (mainmenu_num) {
                case 0:
                    System.out.println("" +
                            "        [ 총 판매상품 목록 현황 ]\n" +
                            "현재까지 총 판매된 상품 목록은 아래와 같습니다\n\n");

                    for (int i = 0; i < product.wholeOrderList.size(); i++) {
                        System.out.println("- " + String.format("%-25s | W %s", product.wholeOrderList.get(i)[2], product.wholeOrderList.get(i)[1]));
                    }

                    System.out.println("" +
                            "\n        [ 총 판매금액 현황 ] \n" +
                            "현재까지 총 판매된 금액은 [ W " + String.format("%.1f", order.wholeOrderPrice) + " ] 입니다\n" +
                            "\n 1. 돌아가기\n");

                    backToMenu = sc.nextInt();
                    if (backToMenu == 1) {
                        continue;
                    }
                case 1:
                    menu.iceCreamSize();
                    size_num = sc.nextInt();
                    menu.iceCream();
                    flavor_num = sc.nextInt();
                    product.iceCream_check_list(mainmenu_num, size_num, flavor_num);
                    int check_num = sc.nextInt();
                    product.iceCream_check(mainmenu_num, size_num, flavor_num, check_num);
                    break;

                case 2:
                    menu.iceCreamCake();
                    break;

                case 3:
                    menu.beverage();
                    break;

                case 4:
                    menu.coffee();
                    break;

                case 5:
                    order.order_print();
                    orderOrmenu = sc.nextInt();
                    if (orderOrmenu == 1) {
                        if (order.nextOrderIndex == 0) {
                            System.out.println("" +
                                    "※※※※※※※※※※※※※※※※※※※※※※※※\n" +
                                    "장바구니에 원하시는 상품을 담아주세요!\n" +
                                    "※※※※※※※※※※※※※※※※※※※※※※※※\n");
                            continue;
                        }
                        order.clearCart();
                        continue;
                    } else {
                        System.out.println("\n메뉴판으로 돌아갑니다\n");
                        continue;
                    }
                case 6:
                    System.out.println("\n" +
                            " 진행하던 주문을 취소하시겠습니까? " +
                            "\n 1. 확인        2. 취소");
                    okOrcancel = sc.nextInt();

                    if (okOrcancel == 1) {
                        order.orderList.clear();
                        order.nextOrderIndex = 0;
                        System.out.println("\n 진행하던 주문이 취소되었습니다.\n");
                        continue;

                    } else if (okOrcancel == 2) {
                        continue;
                    }
                default:
                    System.out.println("잘못된 접급입니다.");
                    break;
            }
            if (mainmenu_num != 1 && okOrcancel == 0) {
                product_num = sc.nextInt();
                product.check_list(mainmenu_num, product_num);

                int check_num = sc.nextInt();
                product.check(mainmenu_num, product_num, check_num);
            }
        }
    }
}
