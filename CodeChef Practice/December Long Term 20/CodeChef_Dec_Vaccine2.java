import java.util.Scanner;

public class CodeChef_Dec_Vaccine2{

    public static void main(String[] args) throws java.lang.Exception {
        int testcases, people, limit, age[];

        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();
        try {
            
            for (int i = 0; i < testcases; i++) {
                int grp_risk = 0, grp_nrml = 0;
                people = sc.nextInt();
                age = new int[people];
                limit = sc.nextInt();
                for (int j = 0; j < people; j++) {
                    age[j] = sc.nextInt();
                    if (age[j] >= 80 || age[j] <= 9)
                        grp_risk++;
                    else
                        grp_nrml++;
                }

                if (grp_nrml % limit == 0 && grp_nrml >= limit)
                    grp_nrml = grp_nrml / limit;
                else if (grp_nrml < limit && grp_nrml > 0)
                    grp_nrml = 1;
                else if (grp_nrml == 0) {
                } else
                    grp_nrml = grp_nrml / limit + 1;


                if (grp_risk % limit == 0 && grp_risk >= limit)
                    grp_risk = grp_risk / limit;
                else if (grp_risk < limit && grp_risk > 0)
                    grp_risk = 1;
                else if (grp_risk == 0) {
                } else
                    grp_risk = grp_risk / limit + 1;

                if (i != 0)
                    System.out.println();

                System.out.print(grp_nrml + grp_risk);
            }
        } catch (Exception e) {
            return;
        }
    }
}