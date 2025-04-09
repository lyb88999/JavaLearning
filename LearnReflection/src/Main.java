import com.lyb.reflect.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person("lyb", 20, "male");
        Class clazz = Person.class;

        Field nameField = clazz.getField("name");
        System.out.println(nameField.get(p));
        nameField.set(p,"lybReflect");
        System.out.println(p.name);

        System.out.println("----------------");
        printFields(clazz);

        Method setAgeMethod = clazz.getMethod("setAge", int.class);
        setAgeMethod.invoke(p,21);
        System.out.println(p);


        // 静态变量
        Field staticField = clazz.getField("STATIC_VARIABLE");
        System.out.println(staticField.get(null));
    }

    public static void printFields(Class clazz){
        System.out.println(clazz.getName()+"里面的field:");
        for(Field field : clazz.getFields()){
            System.out.println(field.getName()+" "+field.getType());
        }
    }
}