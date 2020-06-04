package asm.com.sun.faces.context.flash;
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
public class ELFlash$LifetimeMarkerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "Ljava/lang/Enum<Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/context/flash/ELFlash$LifetimeMarker", "com/sun/faces/context/flash/ELFlash", "LifetimeMarker", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FirstTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SecondTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IsRedirect", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IsNormal", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "FIRST_TIME_THRU", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "SECOND_TIME_THRU", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "IS_REDIRECT", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "IS_NORMAL", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
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
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encode", "()C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "decode", "(C)Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FirstTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FIRST_TIME_THRU", "C");
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FirstTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/context/flash/ELFlash$LifetimeMarker"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "SECOND_TIME_THRU", "C");
methodVisitor.visitVarInsn(ILOAD, 0);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "SecondTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IS_REDIRECT", "C");
methodVisitor.visitVarInsn(ILOAD, 0);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsRedirect", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IS_NORMAL", "C");
methodVisitor.visitVarInsn(ILOAD, 0);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsNormal", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("class invariant failed: invalid lifetime marker");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FirstTimeThru");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("f");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FirstTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecondTimeThru");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("s");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "SecondTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IsRedirect");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("r");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsRedirect", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IsNormal");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("n");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsNormal", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/context/flash/ELFlash$LifetimeMarker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FirstTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "SecondTimeThru", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsRedirect", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IsNormal", "Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$LifetimeMarker;");
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "FIRST_TIME_THRU", "C");
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "SECOND_TIME_THRU", "C");
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IS_REDIRECT", "C");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$LifetimeMarker", "IS_NORMAL", "C");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
