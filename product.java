import java.util.ArrayList;
import java.util.List;

public class product extends menu {
    public static List<String[]> wholeOrderList = new ArrayList<>();
    public static void check_list(int mainNum, int productNum) {
        String productName = "";
        String productDescription = "";
        String price = "";
        String menuName = name[mainNum - 1];

        if (mainNum == 2) {
            productName = cakeData[productNum - 1][0];
            price = cakeData[productNum - 1][1];
            productDescription = cakeData[productNum - 1][2];
        } else if (mainNum == 3) {
            productName = beverageData[productNum - 1][0];
            price = beverageData[productNum - 1][1];
            productDescription = beverageData[productNum - 1][2];
        } else if (mainNum == 4) {
            productName = coffeeData[productNum - 1][0];
            price = coffeeData[productNum - 1][1];
            productDescription = coffeeData[productNum - 1][2];
        }

//        String[] order = {menuName, price, productName, productDescription};
//        wholeOrderList.add(order);

        System.out.println("\n\"" + menuName + " | " + price + " | " + productName + " | " + productDescription + "\"");
        System.out.println("\n 위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                "1. 확인         2. 취소\n");

    }

    public static void iceCream_check_list(int mainNum, int sizeNum, int flavorNum) {
        String menuName = name[mainNum - 1];
        String sizeName = sizeData[sizeNum - 1][0];
        String flavorName = flavorData[flavorNum - 1][0];
        String flavorDescription = flavorData[flavorNum - 1][1];

        String[] order = {menuName, sizeData[sizeNum - 1][1], sizeName, flavorName, flavorDescription};
        wholeOrderList.add(order);

        System.out.println("\n\"" + menuName + " | " + sizeName + " | " + flavorName + " | " + flavorDescription + "\"");
        System.out.println("\n위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                "1. 확인         2. 취소\n");

    }

    public static void check(int mainNum, int productNum, int checkNum) {
        if (checkNum == 1) {
            if (mainNum == 2) {
                System.out.println("\n" + name[mainNum - 1] + " | " + cakeData[productNum - 1][0] + " 이/가 장바구니에 추가되었습니다\n");
                order.add(name[mainNum - 1], cakeData[productNum - 1][0], null, cakeData[productNum - 1][1]);
            } else if (mainNum == 3) {
                System.out.println("\n" + name[mainNum - 1] + " | " + beverageData[productNum - 1][0] + " 이/가 장바구니에 추가되었습니다\n");
                order.add(name[mainNum - 1], beverageData[productNum - 1][0], null, beverageData[productNum - 1][1]);
            } else if (mainNum == 4) {
                System.out.println("\n" + name[mainNum - 1] + " | " + coffeeData[productNum - 1][0] + " 이/가 장바구니에 추가되었습니다\n");
                order.add(name[mainNum - 1], coffeeData[productNum - 1][0], null, coffeeData[productNum - 1][1]);
            }
        } else if (checkNum == 2) {
            System.out.println("취소하셨습니다.");
        } else {
            System.out.println("잘못된 접근입니다. ");
        }
    }

    public static void iceCream_check(int mainNum, int sizeNum, int flavorNum, int checkNum) {
        if (checkNum == 1) {
            System.out.println(name[mainNum - 1] + " | " + sizeData[sizeNum - 1][0] + " | " + flavorData[flavorNum - 1][0] + " 이/가 장바구니에 추가되었습니다\n");
            order.add(name[mainNum - 1], sizeData[sizeNum - 1][0], flavorData[flavorNum - 1][0], sizeData[sizeNum - 1][1]);
        } else if (checkNum == 2) {
            System.out.println("취소하셨습니다.");
        } else {
            System.out.println("잘못된 접근입니다. ");
        }
    }
}
