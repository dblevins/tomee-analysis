package asm.com.sun.faces.config;
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
public class WebConfiguration$DisableUnicodeEscapingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "Ljava/lang/Enum<Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "com/sun/faces/config/WebConfiguration", "DisableUnicodeEscaping", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "True", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "False", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Auto", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByValue", "(Ljava/lang/String;)Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "values", "()[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "value", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("True");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "True", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("False");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "False", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Auto");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("auto");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "Auto", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "True", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "False", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "Auto", "Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/config/WebConfiguration$DisableUnicodeEscaping", "$VALUES", "[Lcom/sun/faces/config/WebConfiguration$DisableUnicodeEscaping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
