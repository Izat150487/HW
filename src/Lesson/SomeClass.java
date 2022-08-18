package Lesson;

public class SomeClass <T>{
    private String name;
    private  int var;

    public SomeClass(String name, int var) {
        this.name = name;
        this.var = var;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                ", var=" + var +
                '}';
    }
}
