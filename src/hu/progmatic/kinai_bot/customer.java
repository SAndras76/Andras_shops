package hu.progmatic.kinai_bot;

import java.util.Objects;

public class customer {
    private final String id;
    private boolean isCash;
    private String name;
    private int age;

    public customer(boolean isCash) {
        this.isCash = isCash;
    }

    public customer(String id, boolean isCash, String name, int age) {
        this.id = id;
        this.isCash = isCash;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        customer customer = (customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "customer{" +
                "id='" + id + '\'' +
                ", isCash=" + isCash +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
