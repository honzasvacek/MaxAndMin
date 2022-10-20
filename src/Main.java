public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,5,8,9,0,5,99,6666,2,1,0,5,88,2};   //deklarace pole
        int result[] = MaxAndMin(arr);                      //uložení do pole result return funkce
        System.out.println("minimum is: " + result[0]);     //vypisování pole
        System.out.println("maximum is: " + result[1]);

    }
    public static int[] MaxAndMin(int arr[]){               //funcke dostane jako parametr pole čísel
        int max = -999999;
        int min = 9999999;
        for (int i = 0; i < arr.length; i++) {              //for czklus prochází pole
            if (arr[i] > max){                              //když je číslo větší než max, nastaví max na tu hodnotu
                max = arr[i];
            }
            if (arr[i] < min){                              //když je číslo menší než min, nastaví si min na tu hodnotu
                min = arr[i];
            }
        }

        return new int[] {min, max};                        //vrátí pole o dvou elementech - min a max
    }
}