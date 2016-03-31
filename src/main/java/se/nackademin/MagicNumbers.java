package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int result;
        result = name.length() - name.replaceAll(" ", "").length() + 1;
        result += age;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateB() {
        int result;
        result = location.length() + income;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateC() {
        int result;
        int a = calculateA();
        int b = calculateB();
        result = a + b - height;
        while(result < 0){
            result += 10;
        }
        return result;
    }

    public int calculateD() {
        int result;
        int a = calculateA();
        int b = calculateB();
        int c = calculateC();
        if(a > 5){
            a += b;
        }
        else {
            a += c;
        }
        a -= income;
        while(a < 0){
            a += 10;
        }
        result = a;
        return result;
    }

    public int calculateE() {
        double result;
        result = age * income;
        result *= income;
        result *= height;
        result = Math.sqrt(result);
        while(result >= 10){
            result /= 2;
        }
        result = Math.round(result);
        return (int)result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
