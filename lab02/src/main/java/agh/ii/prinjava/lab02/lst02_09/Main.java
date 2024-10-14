package agh.ii.prinjava.lab02.lst02_09;

/**
 * I31 contract
 */


/**
 * I31 contract implementation 1 (service provider 1))
 */


/**
 * I31 contract implementation 2 (service provider 2))
 */

/**
 * I) Factory pattern (another solution below)
 * Factory class
 */


/**
 * I31 (service) consumer
 */




/**
 * II) Factory pattern (an interface static method based solution)
 * <p>I41 contract
 */


/**
 * I41 contract implementation 1 (service provider 1))
 */


/**
 * I41 contract implementation 2 (service provider 2))
 */


/**
 * I41 (service) consumer
 */


public class Main {

    private static void demo1() {
        System.out.println("demo1...");
        C33 c331 = new C33(I31Factory.build("I31Impl1"));
        C33 c332 = new C33(I31Factory.build("I31Impl2"));
        c331.run();
        c332.run();
    }

    private static void demo2() {
        System.out.println("demo2...");
        C41 c411 = new C41(I41.build(I41_TYPE.C41_IMPL_1));
        C41 c412 = new C41(I41.build(I41_TYPE.C41_IMPL_2));
        c411.run();
        c412.run();
    }

    public static void main(String[] args) {
        demo1();
        System.out.println();
        demo2();
    }
}
