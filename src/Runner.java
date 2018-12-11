public class Runner {

    public static void main(String[] args){

        Digits digits1 = new Digits(7);
        System.out.println(digits1.isStrictlyIncreasing());

        Digits digits2 = new Digits(65310);
        System.out.println(digits2.isStrictlyIncreasing());

        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());

        System.out.println(digits2.getDigitList());

    }
}
