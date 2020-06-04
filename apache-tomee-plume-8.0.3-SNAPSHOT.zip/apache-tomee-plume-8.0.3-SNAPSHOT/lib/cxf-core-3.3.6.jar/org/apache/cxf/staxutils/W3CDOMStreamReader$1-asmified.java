package asm.org.apache.cxf.staxutils;
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
public class W3CDOMStreamReader$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/staxutils/W3CDOMStreamReader$1", "Lorg/apache/cxf/staxutils/AbstractDOMStreamReader$ElementFrame<Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;>;", "org/apache/cxf/staxutils/AbstractDOMStreamReader$ElementFrame", null);

classWriter.visitOuterClass("org/apache/cxf/staxutils/W3CDOMStreamReader", "<init>", "(Lorg/w3c/dom/Document;)V");

classWriter.visitInnerClass("org/apache/cxf/staxutils/W3CDOMStreamReader$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/staxutils/AbstractDOMStreamReader$ElementFrame", "org/apache/cxf/staxutils/AbstractDOMStreamReader", "ElementFrame", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/w3c/dom/Node;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/AbstractDOMStreamReader$ElementFrame", "<init>", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDocument", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
