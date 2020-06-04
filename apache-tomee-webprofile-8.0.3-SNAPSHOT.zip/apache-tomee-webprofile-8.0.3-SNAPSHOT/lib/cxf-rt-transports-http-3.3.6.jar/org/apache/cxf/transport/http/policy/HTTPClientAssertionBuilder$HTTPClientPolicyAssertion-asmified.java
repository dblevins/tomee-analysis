package asm.org.apache.cxf.transport.http.policy;
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
public class HTTPClientAssertionBuilder$HTTPClientPolicyAssertionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "Lorg/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion<Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;>;", "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion", null);

classWriter.visitInnerClass("org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder", "HTTPClientPolicyAssertion", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "this$0", "Lorg/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator", "getDataClassName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion", "<init>", "(Ljavax/xml/namespace/QName;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Lorg/apache/neethi/PolicyComponent;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/PolicyComponent", "getType", "()S", true);
methodVisitor.visitInsn(ICONST_5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/neethi/Assertion");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/neethi/Assertion");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/neethi/Assertion");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion", "cast", "(Lorg/apache/neethi/Assertion;)Lorg/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "getData", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transports/http/configuration/HTTPClientPolicy");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion", "getData", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transports/http/configuration/HTTPClientPolicy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/impl/ClientPolicyCalculator", "equals", "(Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clone", "(Z)Lorg/apache/neethi/Assertion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "this$0", "Lorg/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "<init>", "(Lorg/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "getData", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/HTTPClientAssertionBuilder$HTTPClientPolicyAssertion", "setData", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
