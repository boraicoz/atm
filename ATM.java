import java.util.Scanner;
public class ATM {


    public static void main(String[] args) {
       String password,username;
       int balance=2000,choose,price,right=5;
        Scanner in=new Scanner(System.in);
       while(right>0){
           System.out.print("Kullanici Adinizi Giriniz:");
           username=in.next();
           System.out.print("Sifrenizi Giriniz:");
           password=in.next();
           if(username.equals("patika")&&password.equals("java"))
           {
               do{
               System.out.print("1-)Para Yatirma" +
                       "\n2-)Para Cekme" +
                       "\n3-)Bakiye Goruntule" +
                       "\n4-)Cikis");
               System.out.print("\nYapmak Istediginiz Islem:");
               choose = in.nextInt();
               switch(choose)
               {
                   case 1:
                       System.out.print("Yatirilacak Para Miktari");
                       price=in.nextInt();
                       balance+=price;
                       break;
                   case 2:
                       System.out.print("Cekilecek Para Miktari:");
                       price=in.nextInt();
                       if(price>balance)
                       {
                           System.out.print("Bakiye Yetersiz.");
                       }
                       else
                           balance-=price;
                       break;
                   case 3:
                       System.out.println("Bakiyeniz:"+balance);
                       break;

               }
           }while(choose!=4);
               System.out.print("Hoscakalin Tekrar Bekleriz.");
               break;

           }
           else {
               right--;
               System.out.println("Kullanici Adiniz Veya Sifreniz Yanlis.");
               switch (right) {
                   case 0:
                       System.out.println("Kartiniz Bloke Edilmiştir.");
                       break;
                   default:
                       System.out.println("Kalan Hakkiniz:" + right);
               }
           }
       }




    }
}
