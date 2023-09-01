package lesson;

public class TestObject {

    int defaultAge = 26;

    TestObject () {
    }
     TestObject (int currentAge) {
        defaultAge = currentAge;
    }

    int getAge () {
        return defaultAge;
    }

    int setAge (int newAge) {
        return  defaultAge = newAge;
    }

    public static void main(String[] args) {

        TestObject Tola = new TestObject();
        System.out.println(Tola.getAge());

        Tola.setAge(50);
        System.out.println(Tola.getAge());
    }

}
