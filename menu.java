public class menu {
    static String[][] menuData = {
            {"Icecream", "아이스크림의 기준, 배스킨라빈스"},
            {"Icecream Cake", "아이와 어른이 좋아하는 아이스크림을 하나의 케이크에서 모두 즐기세요"},
            {"Beverage", "아이스크림으로 즐기는 배스킨라빈스만의 음료"},
            {"Coffee", "마일드하고 부드러운 배스킨라빈스만의 시그니처 블렌드"},
    };

    static String[][] sizeData = {
            {"SingleRegular", "3.9", "한가지 맛을 센스있게 즐길수 있는 사이즈"},
            {"SingleKing", "4.7", "좋아하는 맛 한가지만 듬뿍 맛볼 수 있는 사이즈"},
            {"DoubleJunior", "5.1", "두가지 맛을 조금씩 한번에 즐기는 사이즈"},
            {"DoubleRegular", "7.3", "아이스크림 매니아를 위한 진정한 더블 사이즈"},
            {"Pint", "9.8", "3가지 맛을 골라먹는 재미가 있는 사이즈"},
            {"Quart", "18.5", "4가지 맛을 골라먹는 재미가 있는 사이즈"},
            {"Family", "26.0", "5가지 맛을 나눠먹는 재미가 있는 사이즈"},
            {"Half Gallon", "31.5", "5가지 맛을 나눠먹는 재미가 있는 사이즈"}
    };

    static String[][] flavorData = {
            {"PUSS IN BOOTS", "밀크 초콜릿,다크 초콜릿, 화이트 무스 세 가지 아이스크림에 달콤 바삭한 초코볼이 더해진 아이스크림"},
            {"ALMOND BON BON", "입안 가득 즐거운 초콜릿, 아몬드로 더욱 달콤하게"},
            {"MINT CHOCOLATE CHIP", "쿨한 당신의 선택! 상쾌한 민트향에 초코칩까지"},
            {"SHOOTING STAR", "톡톡 터지는 팝핑 캔디와 스프링클 캔디,상큼한 체리 시럽이 들어있는 제품"},
            {"DARK CHOCO KNIGHT", "마침내, 최강의 초콜릿을 만나다"},
            {"31 YOGURT", "유산균이 살아있는 오리지널 요거트 아이스크림"},
            {"NEW YORK CHEESECAKE ", "부드럽게 즐기는 뉴욕식 정통 치즈케이크 아이스크림"},
            {"LOVE STRUCK STRAWBERRY", "크런치 초콜릿, 치즈 케이크, 스트로베리가 듬뿍 들어있는 아이스크림"}
    };

    static String[][] cakeData = {
            {"PICK WHAT YOU WANT", "28.0", "다양한 맛을 골라먹는 재미가 있는 아이스크림 케이크"},
            {"DUAL WHAT YOU WANT NO.9", " 29.0", "16가지 베스트 플레이버로 구성된 풍성한 볼륨감의 베스트셀러 케이크"},
            {"MINI HAPPY BIRTHDAY CAKE", "24.0", "레트로 감성과 레터링 초콜릿으로 더욱 예쁜 미니 케이크"},
            {"27 CUBE WHAT YOU WANT", "29.0", "톡9가지 맛 아이스크림 바이트를 초콜릿 판 위에 쌓아올려 전체 다 취식 가능한 실속있는 케이크"},
            {"WHAT YOU WANT TO SHARE ", "33.0", "다양한 종류의 데코와 아이스크림을 트레이로 편리하게 나눠먹고, 보관까지 쉬운 케이크"}
    };

    static String[][] beverageData = {
            {"MOM IS AN ALIEN BLAST", "5.8", "배스킨라빈스의 대표 아이스크림 ‘엄마는 외계인’ 아이스크림으로 만든 BR의 시그니처 블라스트"},
            {"WHAT YOU WANT SHAKE", "5.8", "내가 원하는 아이스크림으로 만드는 나만의 쉐이크"},
            {"ALMOND BON BON BLAST", "5.8", "고소하고 부드러운 바닐라 풍미에 식감이 일품인 초콜릿 코팅 아몬드가 토핑된 블라스트"},
            {"PEACH ICED TEA", "2.0", "스리랑카산 홍차를 우려 만든 깔끔하고 시원한 아이스티"},
            {"CAPPUCCINO BLAST MOCHA", "5.3", "달콤한 초코시럽이 첨가되어 더욱 깊고 풍부한 맛이 특징"}
    };

    static String[][] coffeeData = {
            {"AMERICANO", "2.8", "카페브리즈 커피의 매력을 시원하고 부드럽게 즐길 수 있는 아메리카노"},
            {"VANILLA BEAN LATTE", "3.8", "크리미한 벨벳밀크에 바닐라빈이 더해진 풍부하고 달콤한 라떼"},
            {"CAFE LATTE", "3.3", "풍부하고 강렬한 에스프레소에 차가운 우유를 더해 더욱 고소한 카페라떼"},
            {"ICE CARAMEL MACCHIATO", "3.8", "카라멜의 풍부한 향과 진한 달콤함을 느낄 수 있는 카라멜 마끼아또"},
            {"ICE CREAM LATTE", "5.4", "써니블렌드로 만든 아이스 카페 라떼 위에 바닐라 아이스크림을 올려 커피 향과 아이스크림의 조화를 즐길 수 있는 아이스크림 라떼"}
    };
    static String[] name = new String[menuData.length];
    static String[] description = new String[menuData.length];

    public menu() {
        for (int i = 0; i < menuData.length; i++) {
            name[i] = menuData[i][0];
            description[i] = menuData[i][1];

        }
        System.out.println(
                "\"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                        "\n-----------------------------------[ BASKIN MENU ]-----------------------------------" +
                        "\n" +
                        "1. Icecream          | 아이스크림의 기준, 배스킨라빈스\n" +
                        "2. Icecream Cake     | 아이와 어른이 좋아하는 아이스크림을 하나의 케이크에서 모두 즐기세요\n" +
                        "3. Beverage          | 아이스크림으로 즐기는 배스킨라빈스만의 음료\n" +
                        "4. Coffee            | 마일드하고 부드러운 배스킨라빈스만의 시그니처 블렌드\n" +
                        "\n-----------------------------------[ ORDER MENU ]-----------------------------------" +
                        "\n" +
                        "5. Order             | 장바구니를 확인 후 주문합니다.\n" +
                        "6. Cancel            | 진행중인 주문을 취소합니다." +
                        "\n------------------------------------------------------------------------------------"
        );
    }
    public void iceCreamSize() {
        System.out.println(
                "\n \"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 상품사이즈 메뉴판을 보시고 사이즈를 골라 입력해주세요.\n" +
                        "\n" +
                        "                      [ Icecream Size MENU ]\n" +
                        "----------------------------cone & cup----------------------------\n" +
                        "1. SingleRegular   | W 3.9  | 한가지 맛을 센스있게 즐길수 있는 사이즈\n" +
                        "2. SingleKing      | W 4.7  | 좋아하는 맛 한가지만 듬뿍 맛볼 수 있는 사이즈\n" +
                        "3. DoubleJunior    | W 5.1  | 두가지 맛을 조금씩 한번에 즐기는 사이즈\n" +
                        "4. DoubleRegular   | W 7.3  | 아이스크림 매니아를 위한 진정한 더블 사이즈\n" +
                        "----------------------------hand pack----------------------------\n" +
                        "5. Pint            | W 9.8  | 3가지 맛을 골라먹는 재미가 있는 사이즈\n" +
                        "6. Quart           | W 18.5 | 4가지 맛을 골라먹는 재미가 있는 사이즈\n" +
                        "7. Family          | W 26.0 | 5가지 맛을 나눠먹는 재미가 있는 사이즈\n" +
                        "8. Half Gallon     | W 31.5 | 5가지 맛을 나눠먹는 재미가 있는 사이즈\n" +
                        "-----------------------------------------------------------------"
        );
    }

    public void iceCream() {
        System.out.println(
                "\n \"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 아이스크림 메뉴판을 보시고 맛을 골라 입력해주세요.\n" +
                        "\n" +
                        "------------------------------------------------[ Icecream MENU ]------------------------------------------------\n" +
                        "1. PUSS IN BOOTS           | 밀크 초콜릿, 다크 초콜릿, 화이트 무스 세 가지 아이스크림에 달콤 바삭한 초코볼이 더해진 아이스크림\n" +
                        "2. ALMOND BON BON          | 입안 가득 즐거운 초콜릿, 아몬드로 더욱 달콤하게\n" +
                        "3. MINT CHOCOLATE CHIP     | 쿨한 당신의 선택! 상쾌한 민트향에 초코칩까지\n" +
                        "4. SHOOTING STAR           | 톡톡 터지는 팝핑 캔디와 스프링클 캔디,상큼한 체리 시럽이 들어있는 제품\n" +
                        "5. DARK CHOCO KNIGHT       | 마침내, 최강의 초콜릿을 만나다\n" +
                        "6. 31 YOGURT               | 유산균이 살아있는 오리지널 요거트 아이스크림\n" +
                        "7. NEW YORK CHEESECAKE     | 부드럽게 즐기는 뉴욕식 정통 치즈케이크 아이스크림\n" +
                        "8. LOVE STRUCK STRAWBERRY  | 크런치 초콜릿, 치즈 케이크, 스트로베리가 듬뿍 들어있는 아이스크림\n" +
                        "-----------------------------------------------------------------------------------------------------------------"
        );

    }

    public void iceCreamCake() {
        System.out.println(
                "\n \"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 아이스크림케이크 메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                        "\n" +
                        "---------------------------------------------------[ IceCream Cake MENU ]---------------------------------------------------\n" +
                        "1. PICK WHAT YOU WANT           | W 28.0  | 다양한 맛을 골라먹는 재미가 있는 아이스크림 케이크\n" +
                        "2. DUAL WHAT YOU WANT NO.9      | W 29.0  | 16가지 베스트 플레이버로 구성된 풍성한 볼륨감의 베스트셀러 케이크\n" +
                        "3. MINI HAPPY BIRTHDAY CAKE     | W 24.0  | 레트로 감성과 레터링 초콜릿으로 더욱 예쁜 미니 케이크\n" +
                        "4. 27 CUBE WHAT YOU WANT        | W 29.0  | 톡9가지 맛 아이스크림 바이트를 초콜릿 판 위에 쌓아올려 전체 다 취식 가능한 실속있는 케이크\n" +
                        "5. WHAT YOU WANT TO SHARE       | W 33.0  | 다양한 종류의 데코와 아이스크림을 트레이로 편리하게 나눠먹고, 보관까지 쉬운 케이크\n" +
                        "----------------------------------------------------------------------------------------------------------------------------"
        );

    }

    public void beverage() {
        System.out.println(
                "\n \"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 음료 메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                        "\n" +
                        "--------------------------------------------------[ IceCream Cake MENU ]--------------------------------------------------\n" +
                        "1. MOM IS AN ALIEN BLAST        | W 5.4  | 배스킨라빈스의 대표 아이스크림 ‘엄마는 외계인’ 아이스크림으로 만든 BR의 시그니처 블라스트\n" +
                        "2. WHAT YOU WANT SHAKE          | W 5.1  | 내가 원하는 아이스크림으로 만드는 나만의 쉐이크!\n" +
                        "3. ALMOND BON BON BLAST         | W 2.4  | 고소하고 부드러운 바닐라 풍미에 식감이 일품인 초콜릿 코팅 아몬드가 토핑된 블라스트\n" +
                        "4. PEACH ICED TEA               | W 2.9  | 스리랑카산 홍차를 우려 만든 깔끔하고 시원한 아이스티\n" +
                        "5. CAPPUCCINO BLAST MOCHA       | W 5.4  | 달콤한 초코시럽이 첨가되어 더욱 깊고 풍부한 맛이 특징\n" +
                        "--------------------------------------------------------------------------------------------------------------------------"
        );
    }

    public void coffee() {
        System.out.println(
                "\n \"Baskinrobbins 에 오신걸 환영합니다.\"\n" +
                        "아래 커피 메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                        "\n" +
                        "------------------------------------------------------------------[ IceCream Cake MENU ]------------------------------------------------------------------\n" +
                        "1. AMERICANO                    | W 2.8  | 카페브리즈 커피의 매력을 시원하고 부드럽게 즐길 수 있는 아메리카노\n" +
                        "2. VANILLA BEAN LATTE           | W 5.1  | 크리미한 벨벳밀크에 바닐라빈이 더해진 풍부하고 달콤한 라떼\n" +
                        "3. CAFE LATTE                   | W 2.4  | 풍부하고 강렬한 에스프레소에 차가운 우유를 더해 더욱 고소한 카페라떼\n" +
                        "4. ICE CARAMEL MACCHIATO        | W 2.9  | 카라멜의 풍부한 향과 진한 달콤함을 느낄 수 있는 카라멜 마끼아또\n" +
                        "5. ICE CREAM LATTE              | W 5.4  | 써니블렌드로 만든 아이스 카페 라떼 위에 바닐라 아이스크림을 올려 커피 향과 아이스크림의 조화를 즐길 수 있는 아이스크림 라떼\n" +
                        "----------------------------------------------------------------------------------------------------------------------------------------------------------"
        );
    }
}