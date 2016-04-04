package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int result;
        int numberOfNames = this.getName().split(" ").length;
        result = this.getAge() + numberOfNames;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateB() {
        int result;
        result = this.getLocation().length() + this.getIncome();
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateC() {
        int result;
        int a = this.calculateA();
        int b = this.calculateB();
        result = a + b - this.getHeight();
        while(result < 0){
            result += 10;
        }
        return result;
    }

    public int calculateD() {
        int result;
        int a = this.calculateA();
        int b = this.calculateB();
        int c = this.calculateC();
        if(a > 5){
            a += b;
        }
        else {
            a += c;
        }
        a -= this.getIncome();
        while(a < 0){
            a += 10;
        }
        result = a;
        return result;
    }

    public int calculateE() {
        double result;
        result = this.getAge() * this.getIncome();
        result *= this.getIncome();
        result *= this.getHeight();
        result = Math.sqrt(result);
        while(result >= 10){
            result /= 2;
        }
        result = Math.round(result);
        return (int)result;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
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
