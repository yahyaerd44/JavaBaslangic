package Day7;

import java.util.Scanner;

public class C07_Pratik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üç basamaklı sayi giriniz");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        sayi = sayi / 10;

        int onlar = sayi % 10;
        sayi = sayi / 10;

        int yuzler = sayi % 10;

        switch (yuzler) {
            case 1: {
                System.out.print("yüzler");
                break;
            }
            case 2: {
                System.out.print("ikiyüz");
                break;
            }
            case 3: {
                System.out.print("üçyüz");
                break;
            }
            case 4: {
                System.out.print("DörtYüz");
                break;
            }
            case 5: {
                System.out.print("Beşyüz");
                break;
            }
            case 6: {
                System.out.print("Altıyüz");
                break;
            }
            case 7: {
                System.out.print("Yediyüz");
                break;
            }
            case 8: {
                System.out.print("SekizYüz");
                break;
            }
            case 9: {
                System.out.print("Dokuzyüz");
                break;
            }
        }
        System.out.print(" ");
        switch (onlar) {
            case 1: {
                System.out.print("on");
                break;
            }
            case 2: {
                System.out.print("yirmi");
                break;
            }
            case 3: {
                System.out.print("otuz");
                break;
            }
            case 4: {
                System.out.print("kırk");
                break;
            }
            case 5: {
                System.out.print("elli");
                break;
            }
            case 6: {
                System.out.print("altmış");
                break;
            }
            case 7: {
                System.out.print("Yetmiş");
                break;
            }
            case 8: {
                System.out.print("Seksen");
                break;
            }
            case 9: {
                System.out.print("Doksan");
                break;


            }
        }
        System.out.print(" ");
        switch (birler) {
                case 1: {
                    System.out.print("bir");
                    break;
                }
                case 2: {
                    System.out.print("iki");
                    break;
                }
                case 3: {
                    System.out.print("üç");
                    break;
                }
                case 4: {
                    System.out.print("dört");
                    break;
                }
                case 5: {
                    System.out.print("beş");
                    break;
                }
                case 6: {
                    System.out.print("altı");
                    break;
                }
                case 7: {
                    System.out.print("Yedi");
                    break;
                }
                case 8: {
                    System.out.print("Sekiz");
                    break;
                }
                case 9: {
                    System.out.print("Dokuz");
                    break;


                }
                default:
                    System.out.print("brovaaaaa");
            }
        }


        }