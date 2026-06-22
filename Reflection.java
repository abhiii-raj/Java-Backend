import java.lang.reflect;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Reflection {
    public static void main(String args[]){
        // // Reflection for pre-defined
        // Class<?> clazz = Class.forName("java.lang.String");
        // Method methods[] = clazz.getDeclaredMethods();

        // for(Method method : methods){
        //     System.out.println(method.getName());
        // }

        // Filed fields[] = clazz.getDeclaredField();
        // for(Field field : fields){
        //     System.oyt.println(fields.getName());
        // }

        // Constructor<?> constructors[] = clazz.getDeclaredConstructors();
        // for(Constructor constructor : constructors){
        //     System.out.println(constructor.getName());
        // }

        // for pre-defined classes
        Class<Student> claxx = Student.class;
        // hey i want to inspect this class

        Method methods[] = claxx.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }

        Field fields[] = claxx.getDeclaredFields();
        for(Field  field : fields){
            System.out.println(field.getName());
        }
        
        Constructor<?> constructors[] = claxx.getDeclaredConstructrs();
        for(Constructor constructor : constructors){
            System.out.prinltn(constructor.getName());
        }

    }
}

class Student{
    private String name;
    private int age;
    private double marks;

    public Student(){
        System.out.println("constructor");
    }

    private void privateMethods(){
        System.out.println("private method");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }
}
