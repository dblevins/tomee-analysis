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
public class PrefixArray$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "com/sun/xml/fastinfoset/util/PrefixArray$2", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("com/sun/xml/fastinfoset/util/PrefixArray", "getPrefixesFromNamespace", "(Ljava/lang/String;)Ljava/util/Iterator;");

classWriter.visitInnerClass("com/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry", "com/sun/xml/fastinfoset/util/PrefixArray", "NamespaceEntry", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/util/PrefixArray$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "_namespaceName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "_position", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$namespaceName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/fastinfoset/util/PrefixArray;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/fastinfoset/util/PrefixArray;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "this$0", "Lcom/sun/xml/fastinfoset/util/PrefixArray;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "val$namespaceName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "val$namespaceName", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_namespaceName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_position", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/PrefixArray$2", "moveToNext", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_position", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "this$0", "Lcom/sun/xml/fastinfoset/util/PrefixArray;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray", "_size", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry", "access$100", "(Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/PrefixArray$2", "moveToNext", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "moveToNext", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_position", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_position", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "this$0", "Lcom/sun/xml/fastinfoset/util/PrefixArray;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray", "_size", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "this$0", "Lcom/sun/xml/fastinfoset/util/PrefixArray;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/PrefixArray", "access$1000", "(Lcom/sun/xml/fastinfoset/util/PrefixArray;)[Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_position", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_namespaceName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry", "access$200", "(Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/util/PrefixArray$2", "_ne", "Lcom/sun/xml/fastinfoset/util/PrefixArray$NamespaceEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
