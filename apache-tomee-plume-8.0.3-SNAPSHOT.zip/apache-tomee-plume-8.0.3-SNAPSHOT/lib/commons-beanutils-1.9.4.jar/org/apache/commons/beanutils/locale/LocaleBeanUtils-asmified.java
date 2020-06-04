package asm.org.apache.commons.beanutils.locale;
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
public class LocaleBeanUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/beanutils/locale/LocaleBeanUtils", null, "org/apache/commons/beanutils/BeanUtils", null);

classWriter.visitInnerClass("org/apache/commons/beanutils/locale/LocaleBeanUtils$Descriptor", "org/apache/commons/beanutils/locale/LocaleBeanUtils", "Descriptor", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "Descriptor", ACC_PROTECTED);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/beanutils/BeanUtils", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDefaultLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getDefaultLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setDefaultLocale", "(Ljava/util/Locale;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "setDefaultLocale", "(Ljava/util/Locale;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getApplyLocalized", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getApplyLocalized", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setApplyLocalized", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "setApplyLocalized", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedPropertyLocale", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getMappedPropertyLocale", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "definePropertyType", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "definePropertyType", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "convert", "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/Class<*>;ILjava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "convert", "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "convert", "(Ljava/lang/Class;ILjava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Class<*>;ILjava/lang/Object;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "convert", "(Ljava/lang/Class;ILjava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "invokeSetter", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "invokeSetter", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC | ACC_DEPRECATED, "calculate", "(Ljava/lang/Object;Ljava/lang/String;)Lorg/apache/commons/beanutils/locale/LocaleBeanUtils$Descriptor;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "getLocaleBeanUtilsInstance", "()Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean", "calculate", "(Ljava/lang/Object;Ljava/lang/String;)Lorg/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/beanutils/locale/LocaleBeanUtils$Descriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "getTarget", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "getPropName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "getKey", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/locale/LocaleBeanUtilsBean$Descriptor", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/beanutils/locale/LocaleBeanUtils$Descriptor", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
