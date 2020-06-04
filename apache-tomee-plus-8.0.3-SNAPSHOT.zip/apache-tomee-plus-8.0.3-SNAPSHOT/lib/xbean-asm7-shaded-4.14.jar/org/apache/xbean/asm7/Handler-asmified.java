package asm.org.apache.xbean.asm7;
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
public class HandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/apache/xbean/asm7/Handler", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "startPc", "Lorg/apache/xbean/asm7/Label;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "endPc", "Lorg/apache/xbean/asm7/Label;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "handlerPc", "Lorg/apache/xbean/asm7/Label;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "catchType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "catchTypeDescriptor", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextHandler", "Lorg/apache/xbean/asm7/Handler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;ILjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "startPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "endPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "handlerPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "catchType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "catchTypeDescriptor", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "handlerPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "catchType", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "catchTypeDescriptor", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/Handler", "<init>", "(Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;ILjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "removeRange", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)Lorg/apache/xbean/asm7/Handler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Handler", "removeRange", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)Lorg/apache/xbean/asm7/Handler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "startPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "endPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLdcInsn(new Integer(2147483647));
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/Handler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "endPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/Handler", "<init>", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/Handler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "startPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/Handler", "<init>", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/Handler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "endPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/Handler", "<init>", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/Handler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "startPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/Handler", "<init>", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/Label;Lorg/apache/xbean/asm7/Label;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getExceptionTableLength", "(Lorg/apache/xbean/asm7/Handler;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getExceptionTableSize", "(Lorg/apache/xbean/asm7/Handler;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Handler", "getExceptionTableLength", "(Lorg/apache/xbean/asm7/Handler;)I", false);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "putExceptionTable", "(Lorg/apache/xbean/asm7/Handler;Lorg/apache/xbean/asm7/ByteVector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Handler", "getExceptionTableLength", "(Lorg/apache/xbean/asm7/Handler;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "startPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "endPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "handlerPc", "Lorg/apache/xbean/asm7/Label;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Label", "bytecodeOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "catchType", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/ByteVector", "putShort", "(I)Lorg/apache/xbean/asm7/ByteVector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/Handler", "nextHandler", "Lorg/apache/xbean/asm7/Handler;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
