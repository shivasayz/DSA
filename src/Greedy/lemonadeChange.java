package Greedy;

public class lemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.println(isChangeAvailable((bills)));
    }

    static boolean isChangeAvailable(int[] bills){
        int five = 0, ten = 0;

        for(int ele: bills){
            if (ele == 5) five++;
            else if (ele == 10){
                if (five != 0){
                    five--;
                    ten++;
                } else {
                    return false;
                }
            }
            else {
                if (ten != 0 && five != 0){
                    ten--;
                    five--;
                } else if (five > 3) five =- 3;
                else return false;
            }
        }
        return true;
    }
}
