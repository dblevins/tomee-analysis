package asm.org.apache.jcp.xml.dsig.internal.dom;
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
public class DOMUtils$NodeSet$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/w3c/dom/Node;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "NodeSet", ACC_STATIC);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "this$0", "Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "this$0", "Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "access$000", "(Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;)Lorg/w3c/dom/NodeList;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "index", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "index", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NodeList", "item", "(I)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "this$0", "Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "access$000", "(Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;)Lorg/w3c/dom/NodeList;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NodeList", "getLength", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "next", "()Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
