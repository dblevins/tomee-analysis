package asm.com.sun.xml.fastinfoset.util;
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
public class DuplicateAttributeVerifierDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "Entry", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAP_SIZE", "I", null, new Integer(256));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "_currentIteration", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "_poolHead", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_poolTail", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "<init>", "()V", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolHead", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolTail", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_currentIteration", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolHead", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$002", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$100", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolHead", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "increasePool", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolHead", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolTail", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolTail", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$102", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolTail", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$100", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "checkForDuplicateAttribute", "(II)V", null, new String[] { "org/jvnet/fastinfoset/FastInfosetException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "increasePool", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$100", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_poolCurrent", "Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$000", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_currentIteration", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$202", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_currentIteration", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$002", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$302", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", false);
methodVisitor.visitInsn(POP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$300", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)I", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "reset", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/FastInfosetException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/CommonResourceBundle", "getInstance", "()Lcom/sun/xml/fastinfoset/CommonResourceBundle;", false);
methodVisitor.visitLdcInsn("message.duplicateAttribute");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/CommonResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/FastInfosetException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$200", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$202", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;)Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_map", "[Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier", "_currentIteration", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$002", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry", "access$302", "(Lcom/sun/xml/fastinfoset/util/DuplicateAttributeVerifier$Entry;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
