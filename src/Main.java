
public class Main {

    public static void main(String[] args) {

    /*    int[] dizi={3,4,5,3,4,6,7,8,6,98,4,2,2};
        System.out.println("Dizideki tekrarlanan elemanlar: ");

        for (int i = 0; i < dizi.length-1 ; i++) {
            for (int j = i+1; j < dizi.length ; j++) {
                if (dizi[i]==dizi[j]){
                    System.out.print(dizi[i]+ " ");
                }

            }

        }

     */

        //DİZİDEKİ TEKRARLANAN ÇİFT ELEMANLAR:

        int [] dizi={2,2,5,5,21,33,98,34,98,34,22,12};
        System.out.println("Dizideki tekrarlanan çift elemanlar: ");

        for (int i = 0; i < dizi.length-1 ; i++) {
            for (int j = i+1; j < dizi.length ; j++) {
                if (dizi[i]==dizi[j] && dizi[i]%2==0){
                    System.out.print(dizi[i] + " ");
                }

            }

        }

    }
    }