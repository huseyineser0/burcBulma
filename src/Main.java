import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

        Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

        Oğlak Burcu : 22 Aralık - 21 Ocak

        Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart
         */

        int gun, ay;
        String burc = "";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("ay girin: ");
        ay = scan.nextInt();

        System.out.println("gün girin: ");
        gun = scan.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (gun >= 1 && gun <= 28) {
                    if (gun < 20) {
                        burc = "kova";
                    } else {
                        burc = "balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "balık";
                    } else {
                        burc = "koç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "koç";
                    } else {
                        burc = "boğa";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "boğa";
                    } else {
                        burc = "ikizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "ikizler";
                    } else {
                        burc = "yengeç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "yengeç";
                    } else {
                        burc = "aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "aslan";
                    } else {
                        burc = "başak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "başak";
                    } else {
                        burc = "terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "terazi";
                    } else {
                        burc = "akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "akrep";
                    } else {
                        burc = "yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "yay";
                    } else {
                        burc = "oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("hatalı giriş yaptınız tekrar giriniz");
        } else {
            System.out.println("burcunuz :" + burc);
        }
    }
}
