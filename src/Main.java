import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Aces Bankasına Hoşgeldiniz!");

                while (true) {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlem ? : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("İşleminiz başarılı ile gerçekleşmiştir" );
                            System.out.println("Güncel bakiyeniz :" + balance );
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();


                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("İşleminiz başarılı ile gerçekleşmiştir");
                                System.out.println("Güncel bakiyeniz " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            return;
                        default:
                            System.out.println("Geçersiz işlem.");
                    }
                }
            } else {
                right--;
                System.out.println("Kullanıcı adı veya parola hatalı! Kalan hakkınız: " + right);
            }
        }
        System.out.println("Giriş hakkınız bitti. Lütfen daha sonra tekrar deneyin.");
    }
}
