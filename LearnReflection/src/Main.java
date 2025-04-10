import com.lyb.reflect.Category;
import com.lyb.reflect.Person;
import com.sun.security.jgss.GSSUtil;

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
        System.out.println("----------------");
        printMethods(clazz);
        System.out.println("----------------");

        Method setAgeMethod = clazz.getMethod("setAge", int.class);
        setAgeMethod.invoke(p,21);
        System.out.println(p);


        // 静态变量
        Field staticField = clazz.getField("STATIC_VARIABLE");
        System.out.println(staticField.get(null));

        Field hobbyField = clazz.getDeclaredField("hobby");
        hobbyField.setAccessible(true);
        System.out.println(hobbyField.get(p));
        hobbyField.set(p,"sing");
        System.out.println(p);

        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);

        privateMethod.invoke(p);

        useEnum();
        getEnum("COOK");
    }

    public static void printFields(Class clazz){
        System.out.println(clazz.getName()+"里面的field:");
        for(Field field : clazz.getFields()){
            System.out.println(field.getName()+" "+field.getType());
        }
    }


    public static void printMethods(Class clazz){
        System.out.println(clazz.getName()+"里面的method:");
        for(Method method : clazz.getMethods()){
            System.out.println(method.getName()+" "+method.getReturnType());
        }
    }

    public static void useEnum(){
        for(Category category : Category.values()){
            System.out.println("----------"+category.getId()+"----------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }
    }

    public static void getEnum(String name){
        System.out.println("----------"+name+"----------");
        Category category = Category.valueOf(name);
        System.out.println(category.ordinal());
        System.out.println(category.name());
        System.out.println(category.toString());
    }
}