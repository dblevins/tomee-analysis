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
public class ConvertUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/beanutils/ConvertUtils", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultBoolean", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultBoolean", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultBoolean", "(Z)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultBoolean", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultByte", "()B", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultByte", "()B", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultByte", "(B)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultByte", "(B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultCharacter", "()C", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultCharacter", "()C", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultCharacter", "(C)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultCharacter", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultDouble", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultDouble", "()D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultDouble", "(D)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultDouble", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultFloat", "()F", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultFloat", "()F", false);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultFloat", "(F)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultFloat", "(F)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultInteger", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultInteger", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultInteger", "(I)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultInteger", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultLong", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultLong", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultLong", "(J)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultLong", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "getDefaultShort", "()S", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "getDefaultShort", "()S", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "setDefaultShort", "(S)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "setDefaultShort", "(S)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convert", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "convert", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convert", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "convert", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convert", "([Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "([Ljava/lang/String;Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "convert", "([Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convert", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "convert", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "deregister", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "deregister", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "deregister", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "deregister", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookup", "(Ljava/lang/Class;)Lorg/apache/commons/beanutils/Converter;", "(Ljava/lang/Class<*>;)Lorg/apache/commons/beanutils/Converter;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "lookup", "(Ljava/lang/Class;)Lorg/apache/commons/beanutils/Converter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookup", "(Ljava/lang/Class;Ljava/lang/Class;)Lorg/apache/commons/beanutils/Converter;", "(Ljava/lang/Class<*>;Ljava/lang/Class<*>;)Lorg/apache/commons/beanutils/Converter;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "lookup", "(Ljava/lang/Class;Ljava/lang/Class;)Lorg/apache/commons/beanutils/Converter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "register", "(Lorg/apache/commons/beanutils/Converter;Ljava/lang/Class;)V", "(Lorg/apache/commons/beanutils/Converter;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/ConvertUtilsBean", "getInstance", "()Lorg/apache/commons/beanutils/ConvertUtilsBean;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/beanutils/ConvertUtilsBean", "register", "(Lorg/apache/commons/beanutils/Converter;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "primitiveToWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/lang/Class<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isPrimitive", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label6);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label9);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
