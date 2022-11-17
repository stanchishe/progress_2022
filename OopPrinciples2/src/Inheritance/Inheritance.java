package Inheritance;

//IS-A HAS-A
class Math { //SUPER
    public int add(int a, int b) {
        return a + b;
    }
}

class MathAdv extends Math { //SUB
    public int sub(int a, int b) {
        return a - b;
    }
}

class MathVeryAdv extends MathAdv {
    public int multi(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        MathVeryAdv math = new MathVeryAdv();
        math.add(4, 7);
        math.sub(65, 7);
        math.div(10,2);
        math.multi(4, 5);

    }
}