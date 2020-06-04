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
public class DOMUtils$NodeSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "Ljava/util/AbstractSet<Lorg/w3c/dom/Node;>;", "java/util/AbstractSet", null);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "NodeSet", ACC_STATIC);

classWriter.visitInnerClass("org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nl", "Lorg/w3c/dom/NodeList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/NodeList;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "nl", "Lorg/w3c/dom/NodeList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "nl", "Lorg/w3c/dom/NodeList;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NodeList", "getLength", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/w3c/dom/Node;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet$1", "<init>", "(Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet;)Lorg/w3c/dom/NodeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils$NodeSet", "nl", "Lorg/w3c/dom/NodeList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
