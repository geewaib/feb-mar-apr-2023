package com.herbalife.examples;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("com.herbalife.examples.Car");
        System.out.println(cls.getName());
        System.out.println(cls.getSuperclass().getName());

        System.out.println("*****FIELDS****");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("*****METHODS****");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getParameterTypes()[0]);
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaredAnnotations()[0].annotationType().getName());
        }
        System.out.println("**** Creating an instance ****");
        Object carObj = cls.getConstructor().newInstance();
        System.out.println(carObj);

        Field modelField = cls.getDeclaredField("model");
        modelField.setAccessible(true); //Enable access to private fields
        modelField.set(carObj, "BMW");
        cls.getDeclaredMethod("drive", int.class).invoke(carObj, 100);

    }
}
