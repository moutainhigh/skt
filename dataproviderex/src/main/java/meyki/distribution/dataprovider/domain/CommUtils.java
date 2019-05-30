package meyki.distribution.dataprovider.domain;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by Fernflower decompiler)
//

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CommUtils {
 public CommUtils() {
 }

 public static String addtoString(Object entity, String[] fieldName) {
     Class cls = entity.getClass();
     StringBuffer buffer = new StringBuffer(cls.getSimpleName() + ":[");

     try {
         Method[] e = cls.getMethods();
         if(fieldName != null && fieldName.length != 0) {
             for(int var14 = 0; var14 < fieldName.length; ++var14) {
                 PropertyDescriptor var15 = new PropertyDescriptor(fieldName[var14], cls);
                 Method var16 = var15.getReadMethod();
                 if(var16.invoke(entity, new Object[0]) == null) {
                     buffer.append(fieldName[var14].toString() + "=" + "\'\'" + " ,");
                 } else {
                     String var17 = var16.invoke(entity, new Object[0]).toString();
                     buffer.append(fieldName[var14].toString() + "=" + var17 + " ,");
                 }
             }
         } else {
             Field[] fields = cls.getDeclaredFields();
             Field[] var9 = fields;
             int value = fields.length;

             for(int getmethod = 0; getmethod < value; ++getmethod) {
                 Field field = var9[getmethod];
                 PropertyDescriptor pd = new PropertyDescriptor(field.getName(), cls);
                 Method getmethod1 = pd.getReadMethod();
                 if(getmethod1.invoke(entity, new Object[0]) == null) {
                     buffer.append(field.getName().toString() + "=" + "\'\'" + " ,");
                 } else {
                     String value1 = getmethod1.invoke(entity, new Object[0]).toString();
                     buffer.append(field.getName().toString() + "=" + value1 + " ,");
                 }
             }
         }
     } catch (Exception var13) {
         var13.printStackTrace();
     }

     return buffer.substring(0, buffer.length() - 1).toString() + "]";
 }

 public static String addtoString(Object entity) {
     return addtoString(entity, new String[0]);
 }
}
