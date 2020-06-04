package asm.org.apache.cxf.ws.addressing.policy;
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
public class AddressingAssertionBuilder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", null, "org/apache/neethi/builders/xml/XMLPrimitiveAssertionBuilder", null);

classWriter.visitOuterClass("org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder", "build", "(Lorg/w3c/dom/Element;Lorg/apache/neethi/AssertionBuilderFactory;)Lorg/apache/neethi/Assertion;");

classWriter.visitInnerClass("org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", "this$0", "Lorg/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/xml/XMLPrimitiveAssertionBuilder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newPrimitiveAssertion", "(Lorg/w3c/dom/Element;Ljava/util/Map;)Lorg/apache/neethi/Assertion;", "(Lorg/w3c/dom/Element;Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/String;>;)Lorg/apache/neethi/Assertion;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/policy/builder/primitive/PrimitiveAssertion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/addressing/policy/MetadataConstants", "ADDRESSING_ASSERTION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", "isOptional", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", "isIgnorable", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/builder/primitive/PrimitiveAssertion", "<init>", "(Ljavax/xml/namespace/QName;ZZLjava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newPolicyContainingAssertion", "(Lorg/w3c/dom/Element;Ljava/util/Map;Lorg/apache/neethi/Policy;)Lorg/apache/neethi/Assertion;", "(Lorg/w3c/dom/Element;Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/String;>;Lorg/apache/neethi/Policy;)Lorg/apache/neethi/Assertion;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/neethi/builders/PolicyContainingPrimitiveAssertion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/addressing/policy/MetadataConstants", "ADDRESSING_ASSERTION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", "isOptional", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/policy/AddressingAssertionBuilder$1", "isIgnorable", "(Lorg/w3c/dom/Element;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/builders/PolicyContainingPrimitiveAssertion", "<init>", "(Ljavax/xml/namespace/QName;ZZLjava/util/Map;Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
