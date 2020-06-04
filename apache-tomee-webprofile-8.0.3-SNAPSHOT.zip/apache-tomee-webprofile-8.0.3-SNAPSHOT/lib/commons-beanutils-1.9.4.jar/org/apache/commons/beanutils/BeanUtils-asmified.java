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
public class BeanUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/beanutils/BeanUtils", null, "java/lang/Object", null);

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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/beanutils/BeanUtils", "debug", "I");
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
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/beanutils/BeanUtils", "debug", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cloneBean", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/InstantiationException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "cloneBean", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copyProperties", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "copyProperties", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copyProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "copyProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "describe", "(Ljava/lang/Object;)Ljava/util/Map;", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "describe", "(Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getArrayProperty", "(Ljava/lang/Object;Ljava/lang/String;)[Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getArrayProperty", "(Ljava/lang/Object;Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getIndexedProperty", "(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getMappedProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getNestedProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "getSimpleProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "populate", "(Ljava/lang/Object;Ljava/util/Map;)V", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;)V", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "populate", "(Ljava/lang/Object;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/BeanUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/BeanUtilsBean", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCache", "()Ljava/util/Map;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>()Ljava/util/Map<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/beanutils/WeakFastHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/beanutils/WeakFastHashMap", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCacheFast", "(Ljava/util/Map;)Z", "(Ljava/util/Map<**>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/beanutils/WeakFastHashMap");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/beanutils/WeakFastHashMap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/WeakFastHashMap", "getFast", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setCacheFast", "(Ljava/util/Map;Z)V", "(Ljava/util/Map<**>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/beanutils/WeakFastHashMap");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/beanutils/WeakFastHashMap");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/WeakFastHashMap", "setFast", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/beanutils/BeanUtils", "debug", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
