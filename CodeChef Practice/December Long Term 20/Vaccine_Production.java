import java.util.Scanner;

public class Vaccine_Production{

    public static void main(String[] args) throws java.lang.Exception {
        int day1, day2, vacc1, vacc2, demand, pre = 1, maxdays, amount, mindays = 0;

        Scanner sc = new Scanner(System.in);

        try {
            day1 = sc.nextInt();
            vacc1 = sc.nextInt();
            day2 = sc.nextInt();
            vacc2 = sc.nextInt();
            demand = sc.nextInt();

            if (day1 > day2) {
                pre = day1 - day2;
                amount = pre * vacc2;
                maxdays = day1;
                mindays = day2;
                pre = vacc2;
            } else if (day1 == day2) {
                amount = 0;
                maxdays = day1;
            } else {
                pre = day2 - day1;
                amount = pre * vacc1;
                mindays = day1;
                maxdays = day2;
                pre = vacc1;
            }

            if (demand <= amount) {
                if (demand % pre == 0)
                    System.out.println(demand / pre + mindays - 1);
                else
                    System.out.println(demand / pre + mindays);
            } else {
                amount = demand - amount;

                if (amount % (vacc1 + vacc2) != 0) {
                    pre = amount / (vacc1 + vacc2) + 1;
                } else
                    pre = amount / (vacc1 + vacc2);

                System.out.println(pre + maxdays - 1);
            }
        } catch (Exception e) {
            return;
        }
    }
}