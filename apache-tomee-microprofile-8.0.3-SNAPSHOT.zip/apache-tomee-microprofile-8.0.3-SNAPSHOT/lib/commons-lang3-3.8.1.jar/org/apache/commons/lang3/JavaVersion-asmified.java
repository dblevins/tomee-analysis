package asm.org.apache.commons.lang3;
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
public class JavaVersionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/lang3/JavaVersion", "Ljava/lang/Enum<Lorg/apache/commons/lang3/JavaVersion;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_0_9", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_1", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_2", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_3", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_4", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_5", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_6", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_7", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_1_8", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM | ACC_DEPRECATED, "JAVA_1_9", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_9", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_10", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_11", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_RECENT", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "F", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/lang3/JavaVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "$VALUES", "[Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/lang3/JavaVersion;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/lang3/JavaVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/lang3/JavaVersion;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", "(FLjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(FLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/JavaVersion", "value", "F");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/JavaVersion", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "atLeast", "(Lorg/apache/commons/lang3/JavaVersion;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/JavaVersion", "value", "F");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/JavaVersion", "value", "F");
methodVisitor.visitInsn(FCMPL);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getJavaVersion", "(Ljava/lang/String;)Lorg/apache/commons/lang3/JavaVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "get", "(Ljava/lang/String;)Lorg/apache/commons/lang3/JavaVersion;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "get", "(Ljava/lang/String;)Lorg/apache/commons/lang3/JavaVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("0.9");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_0_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_1", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.2");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_2", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.3");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_3", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.4");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_4", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_5", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.6");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_6", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.7");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_7", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("1.8");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_8", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("9");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("10");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_10", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("11");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_11", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label12);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "toFloatVersion", "(Ljava/lang/String;)F", false);
methodVisitor.visitVarInsn(FSTORE, 1);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitInsn(F2D);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DCMPG);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFGE, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(II)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "parseFloat", "(Ljava/lang/String;)F", false);
methodVisitor.visitLdcInsn(new Float("0.9"));
methodVisitor.visitInsn(FCMPL);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFLE, label14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_RECENT", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.FLOAT}, 0, null);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitLdcInsn(new Float("10.0"));
methodVisitor.visitInsn(FCMPL);
methodVisitor.visitJumpInsn(IFLE, label15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_RECENT", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/JavaVersion", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "maxVersion", "()F", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("java.specification.version");
methodVisitor.visitLdcInsn("99.0");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "toFloatVersion", "(Ljava/lang/String;)F", false);
methodVisitor.visitVarInsn(FSTORE, 0);
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitInsn(FCONST_0);
methodVisitor.visitInsn(FCMPL);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(FLOAD, 0);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.FLOAT}, 0, null);
methodVisitor.visitLdcInsn(new Float("99.0"));
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "toFloatVersion", "(Ljava/lang/String;)F", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn(new Float("-1.0"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/math/NumberUtils", "toFloat", "(Ljava/lang/String;F)F", false);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Float("-1.0"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/math/NumberUtils", "toFloat", "(Ljava/lang/String;F)F", false);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(new Float("-1.0"));
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_0_9");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(new Float("1.5"));
methodVisitor.visitLdcInsn("0.9");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_0_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_1");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(new Float("1.1"));
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_1", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_2");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(new Float("1.2"));
methodVisitor.visitLdcInsn("1.2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_2", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_3");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Float("1.3"));
methodVisitor.visitLdcInsn("1.3");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_3", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_4");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(new Float("1.4"));
methodVisitor.visitLdcInsn("1.4");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_4", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_5");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(new Float("1.5"));
methodVisitor.visitLdcInsn("1.5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_5", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_6");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn(new Float("1.6"));
methodVisitor.visitLdcInsn("1.6");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_6", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_7");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn(new Float("1.7"));
methodVisitor.visitLdcInsn("1.7");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_7", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_8");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn(new Float("1.8"));
methodVisitor.visitLdcInsn("1.8");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_8", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_1_9");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn(new Float("9.0"));
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_9");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn(new Float("9.0"));
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_10");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn(new Float("10.0"));
methodVisitor.visitLdcInsn("10");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_10", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_11");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn(new Float("11.0"));
methodVisitor.visitLdcInsn("11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_11", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_RECENT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "maxVersion", "()F", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "maxVersion", "()F", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "toString", "(F)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/JavaVersion", "<init>", "(Ljava/lang/String;IFLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_RECENT", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/lang3/JavaVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_0_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_1", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_2", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_3", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_4", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_5", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_6", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_7", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_8", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_1_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_9", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_10", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_11", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/JavaVersion", "JAVA_RECENT", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/JavaVersion", "$VALUES", "[Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
