public class DuckTestDrive{
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says: ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says: ");
        testDuck(mallardDuck);

        System.out.println("The turkey that wanted to act as a duck says: ");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}