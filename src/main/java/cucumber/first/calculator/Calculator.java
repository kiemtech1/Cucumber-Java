package cucumber.first.calculator;


public class Calculator {

    private int result;
    private int subResult;
    private int mulResult;
    private int devResult;

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }

    public int getResult() {
        return result;
    }

    public void substract(int arg1, int arg2) {
        subResult = arg1 - arg2;
    }

    public int getSubResult() {
        return subResult;
    }

    public void multiple(int arg1, int arg2) {
        mulResult = arg1 * arg2;
    }
    public int getMulResult() {
        return mulResult;
    }
    public void devide(int arg1, int arg2) {
        devResult = arg1 / arg2;
    }
    public int getDevResult() {
        return devResult;
    }
}
