package asm.org.apache.commons.beanutils;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class PropertyUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/beanutils/PropertyUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "INDEXED_DELIM", "C", null, new Integer(91));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "INDEXED_DELIM2", "C", null, new Integer(93));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "MAPPED_DELIM", "C", null, new Integer(40));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "MAPPED_DELIM2", "C", null, new Integer(41));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "NESTED_DELIM", "C", null, new Integer(46));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_DEPRECATED, "debug", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDebug", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/beanutils/PropertyUtils", "debug", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDebug", "(I)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/beanutils/PropertyUtils", "debug", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clearDescriptors", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "clearDescriptors", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "resetBeanIntrospectors", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "resetBeanIntrospectors", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addBeanIntrospector", "(Lorg/apache/commons/beanutils/BeanIntrospector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "addBeanIntrospector", "(Lorg/apache/commons/beanutils/BeanIntrospector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "removeBeanIntrospector", "(Lorg/apache/commons/beanutils/BeanIntrospector;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "removeBeanIntrospector", "(Lorg/apache/commons/beanutils/BeanIntrospector;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copyProperties", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "copyProperties", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "describe", "(Ljava/lang/Object;)Ljava/util/Map;", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "describe", "(Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getMappedPropertyDescriptors", "(Ljava/lang/Class;)Lorg/apache/commons/collections/FastHashMap;", "(Ljava/lang/Class<*>;)Lorg/apache/commons/collections/FastHashMap;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getMappedPropertyDescriptors", "(Ljava/lang/Class;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getMappedPropertyDescriptors", "(Ljava/lang/Object;)Lorg/apache/commons/collections/FastHashMap;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getMappedPropertyDescriptors", "(Ljava/lang/Object;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyDescriptor", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/beans/PropertyDescriptor;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getPropertyDescriptor", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/beans/PropertyDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyDescriptors", "(Ljava/lang/Class;)[Ljava/beans/PropertyDescriptor;", "(Ljava/lang/Class<*>;)[Ljava/beans/PropertyDescriptor;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getPropertyDescriptors", "(Ljava/lang/Class;)[Ljava/beans/PropertyDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyDescriptors", "(Ljava/lang/Object;)[Ljava/beans/PropertyDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getPropertyDescriptors", "(Ljava/lang/Object;)[Ljava/beans/PropertyDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyEditorClass", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getPropertyEditorClass", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPropertyType", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getPropertyType", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getReadMethod", "(Ljava/beans/PropertyDescriptor;)Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getReadMethod", "(Ljava/beans/PropertyDescriptor;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getWriteMethod", "(Ljava/beans/PropertyDescriptor;)Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "getWriteMethod", "(Ljava/beans/PropertyDescriptor;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isReadable", "(Ljava/lang/Object;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "isReadable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isWriteable", "(Ljava/lang/Object;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "isWriteable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/PropertyUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/PropertyUtilsBean", "setSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/beanutils/PropertyUtils", "debug", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
