package asm.org.w3c.dom.ranges;
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
public class RangeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_1, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/w3c/dom/ranges/Range", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_TO_START", "S", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_TO_END", "S", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_TO_END", "S", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_TO_START", "S", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStartContainer", "()Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStartOffset", "()I", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEndContainer", "()Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEndOffset", "()I", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCollapsed", "()Z", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCommonAncestorContainer", "()Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStart", "(Lorg/w3c/dom/Node;I)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEnd", "(Lorg/w3c/dom/Node;I)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStartBefore", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStartAfter", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEndBefore", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEndAfter", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "collapse", "(Z)V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNode", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNodeContents", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/ranges/RangeException", "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "compareBoundaryPoints", "(SLorg/w3c/dom/ranges/Range;)S", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteContents", "()V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "extractContents", "()Lorg/w3c/dom/DocumentFragment;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cloneContents", "()Lorg/w3c/dom/DocumentFragment;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertNode", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/DOMException", "org/w3c/dom/ranges/RangeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "surroundContents", "(Lorg/w3c/dom/Node;)V", null, new String[] { "org/w3c/dom/DOMException", "org/w3c/dom/ranges/RangeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cloneRange", "()Lorg/w3c/dom/ranges/Range;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toString", "()Ljava/lang/String;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "detach", "()V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
