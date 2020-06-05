package asm.org.apache.commons.codec.digest;
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
public class MurmurHash3$IncrementalHash32Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "org/apache/commons/codec/digest/MurmurHash3", "IncrementalHash32", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "tail", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "tailLen", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "totalLen", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "hash", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "start", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "totalLen", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "add", "([BII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "totalLen", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "totalLen", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label6, new Label[] { label3, label4, label5 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/codec/digest/MurmurHash3", "access$000", "(BBBB)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/codec/digest/MurmurHash3", "access$000", "(BBBB)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/codec/digest/MurmurHash3", "access$000", "(BBBB)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "(I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitLdcInsn(new Integer(-862048943));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "rotateLeft", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitLdcInsn(new Integer(461845907));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "rotateLeft", "(II)I", false);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitLdcInsn(new Integer(-430675100));
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/codec/digest/MurmurHash3", "access$000", "(BBBB)I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitLdcInsn(new Integer(-862048943));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "rotateLeft", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitLdcInsn(new Integer(461845907));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "rotateLeft", "(II)I", false);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitLdcInsn(new Integer(-430675100));
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label10);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "end", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tailLen", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "tail", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-862048943));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "rotateLeft", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(461845907));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "totalLen", "I");
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitLdcInsn(new Integer(-2048144789));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitLdcInsn(new Integer(-1028477387));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/MurmurHash3$IncrementalHash32", "hash", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}