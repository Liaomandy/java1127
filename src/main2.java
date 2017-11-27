public class main2 {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 12 || a < 1 || b > 31 || b < 1) {
            System.out.println("ERROR");
        } else {


            if (a <= 2 || a == 1 || b <= 21) {
                System.out.println("水瓶座");
            } else {
                if (a == 3 || a == 2 || b <= 21) {
                    System.out.println("雙魚座");
                } else {
                    if (a == 4 || a == 5 || b <= 21) {
                        System.out.println("牡羊座");
                    } else {
                        if (a == 5 || a == 4 || b <= 21) {
                            System.out.println("金牛座");
                        } else {
                            if (a == 6 || a == 5 || b <= 21) {
                                System.out.println("雙子座");
                            } else {
                                if (a == 7 || a == 6 || b <= 21) {
                                    System.out.println("巨蟹座");
                                } else {
                                    if (a == 8 || a == 7 || b <= 21) {
                                        System.out.println("獅子座");
                                    } else {
                                        if (a == 9 || a == 8 || b <= 21) {
                                            System.out.println("處女座");
                                        } else {
                                            if (a == 10 || a == 9 || b <= 21) {
                                                System.out.println("天秤座");
                                            } else {
                                                if (a == 11 || a == 10 || b <= 21) {
                                                    System.out.println("天蠍座");
                                                } else {
                                                    if (a == 12 || a == 11 || b <= 21) {
                                                        System.out.println("射手座");
                                                    } else {
                                                        if (a == 12 || a == 1 || b <= 21) {
                                                            System.out.println("摩羯座");

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}