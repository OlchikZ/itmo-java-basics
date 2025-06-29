package itmo.java.basics.lessons.lesson7;

public class OuterClass {
    private int a;
    private int b;

    private static String name = "Mike";

    public void setParams(final int x, final int y) {
        this.a = x;
        this.b = y;
    }

    class InnerClass {
        //        private int a;
        public void sumAndPrint() {
            setParams(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public void innerClassMethodCall() {
        InnerClass innerClass = new InnerClass();
        innerClass.sumAndPrint();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.innerClassMethodCall();
    }

    static class NestedStaticClass {
        public void nestedStaticClassMethod() {
            System.out.println("Static nested");
            System.out.println(name);
//            System.out.println("sum = " + (a + b)); невозможно обратиться к нестатическим полям
        }
    }
}