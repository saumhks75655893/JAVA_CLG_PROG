package ownJava.OOPS.MethodOverloadingAndMethodOverriding;

class Bank{
    public static void RateOfInterest(){
        System.out.println("Generally rate of interest is 5%");
    }
}

class SBI{
    public static void RateOfInterest(){
        System.out.println("Rate of interest is 6.5%");
    }
}

class PNB{
    public static void RateOfInterest(){
        System.out.println("Rate of interest for PNB is 6%");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.RateOfInterest();
        SBI s = new SBI();
        s.RateOfInterest();
        PNB p = new PNB();
        p.RateOfInterest();
    }
}
