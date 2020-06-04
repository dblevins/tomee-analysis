package asm.org.metatype.sxc.util;
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
public class XoXMLStreamReaderImpl$ChildElementsIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/metatype/sxc/util/XoXMLStreamReader;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "org/metatype/sxc/util/XoXMLStreamReaderImpl", "ChildElementsIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "targetDepth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mixed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "moveToNext", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hasMoreEvents", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "access$200", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "targetDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "moveToNext", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "mixed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "access$200", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "targetDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "moveToNext", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "mixed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "moveToNext", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "advanceToNext", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "hasMoreEvents", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/metatype/sxc/util/XoXMLStreamReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "moveToNext", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "advanceToNext", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "javax/xml/stream/XMLStreamException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "moveToNext", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "hasNext", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "hasMoreEvents", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "next", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label4);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/RuntimeXMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/RuntimeXMLStreamException", "<init>", "(Ljavax/xml/stream/XMLStreamException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "atNext", "(I)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "hasMoreEvents", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "access$200", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "targetDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "hasMoreEvents", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "atNext", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "access$200", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "targetDepth", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "mixed", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "access$200", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "targetDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitInsn(ICONST_1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "next", "()Lorg/metatype/sxc/util/XoXMLStreamReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;ZLorg/metatype/sxc/util/XoXMLStreamReaderImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$ChildElementsIterator", "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
