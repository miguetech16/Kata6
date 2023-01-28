package javaapplication14;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class NewClass {
    
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Class c = Phonetic.class;
        Phonetic phonetic = new Phonetic();     
        Field[] fields = c.getDeclaredFields();
        int i = 10;
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType() == String.class)
                field.set(phonetic, String.valueOf(i));
            i+=10;
        }
        System.out.println(new Gson().toJson(phonetic));
    }

}
