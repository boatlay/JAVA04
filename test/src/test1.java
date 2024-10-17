public class test1 {
    public static void main(String[] args) {
        int year =2024;
        int x = Leapyear(year);
        if (x == 1) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }
    }

    public static int Leapyear(int year) {
        if ((year % 4 == 0 && year % 100!= 0) || year % 400 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}