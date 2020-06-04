package asm.org.apache.neethi;
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
public class PolicyEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/neethi/PolicyEngine", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POLICY_NAMESPACE", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2004/09/policy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POLICY", "Ljava/lang/String;", null, "Policy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXACTLY_ONE", "Ljava/lang/String;", null, "ExactlyOne");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALL", "Ljava/lang/String;", null, "All");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POLICY_REF", "Ljava/lang/String;", null, "PolicyReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "builder", "Lorg/apache/neethi/PolicyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNCHRONIZED, "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/neethi/PolicyEngine", "builder", "Lorg/apache/neethi/PolicyBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/neethi/PolicyBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/neethi/PolicyBuilder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/neethi/PolicyEngine", "builder", "Lorg/apache/neethi/PolicyBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/neethi/PolicyEngine", "builder", "Lorg/apache/neethi/PolicyBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "registerBuilder", "(Ljavax/xml/namespace/QName;Lorg/apache/neethi/builders/AssertionBuilder;)V", "(Ljavax/xml/namespace/QName;Lorg/apache/neethi/builders/AssertionBuilder<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getAssertionBuilderFactory", "()Lorg/apache/neethi/AssertionBuilderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/AssertionBuilderFactory", "registerBuilder", "(Ljavax/xml/namespace/QName;Lorg/apache/neethi/builders/AssertionBuilder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicy", "(Ljava/io/InputStream;)Lorg/apache/neethi/Policy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicy", "(Ljava/io/InputStream;)Lorg/apache/neethi/Policy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicyReferene", "(Ljava/io/InputStream;)Lorg/apache/neethi/PolicyReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicyReference", "(Ljava/io/InputStream;)Lorg/apache/neethi/PolicyReference;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicy", "(Lorg/apache/axiom/om/OMElement;)Lorg/apache/neethi/Policy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicy", "(Ljava/lang/Object;)Lorg/apache/neethi/Policy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicy", "(Ljava/lang/Object;)Lorg/apache/neethi/Policy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicy", "(Ljava/lang/Object;)Lorg/apache/neethi/Policy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicyReference", "(Lorg/apache/axiom/om/OMElement;)Lorg/apache/neethi/PolicyReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicyReference", "(Ljava/lang/Object;)Lorg/apache/neethi/PolicyReference;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPolicyReference", "(Ljava/lang/Object;)Lorg/apache/neethi/PolicyReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/neethi/PolicyEngine", "getBuilder", "()Lorg/apache/neethi/PolicyBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/neethi/PolicyBuilder", "getPolicyReference", "(Ljava/lang/Object;)Lorg/apache/neethi/PolicyReference;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
