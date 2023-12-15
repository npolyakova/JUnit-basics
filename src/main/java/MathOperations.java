public class MathOperations {
    public int sum(){
        int a = 2;
        int b = 3;
        return a + b;
    }

    public int multiply10(int a) {
        return a * 10;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int divide100(int a) {
        return this.divide(100, a);
    }

    public String sumStrings(int res) {
        return "Результат вычисления = " + res;
    }

}
