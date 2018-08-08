package homework0807.payment;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Employee em1= new Employee(15482318 , "Carl" , 1520);
        Employee em2= new Employee(15487265 , "Alex" , 2000);
        Client cl1= new Client(41254163 , "Facebook", 15000);
        Client cl2= new Client(41254512 , "Google" , 20000);
        Payment[] arr = new Payment[12];
        arr[0] = em1.bankAccount();
        arr[1] = em2.bankAccount();
        arr[2] = cl1.bankAccount();
        arr[3] = cl2.bankAccount();
        arr[4] = em1.accountOwner();
        arr[5] = em2.accountOwner();
        arr[6] = cl1.accountOwner();
        arr[7] = cl2.accountOwner();
        arr[8] = em1.amount();
        arr[9] = em2.amount();
        arr[10] = cl1.amount();
        arr[11] = cl2.amount();

        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
//        System.out.println(Arrays.toString(arr));
        for(Payment i : arr){
            System.out.println(i);
        }
    }
}
