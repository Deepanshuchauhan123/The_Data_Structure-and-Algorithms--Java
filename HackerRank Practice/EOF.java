import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EOF{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;sc.hasNext()==true;i++){
            System.out.println(i+" "+sc.nextLine());
        }   
    }
}