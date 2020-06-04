package asm.org.apache.cxf.rt.security.saml.xacml2;
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
public class XACMLAuthorizingInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rt/security/saml/xacml2/XACMLAuthorizingInterceptor", null, "org/apache/cxf/rt/security/saml/xacml2/AbstractXACMLAuthorizingInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pdp", "Lorg/apache/cxf/rt/security/saml/xacml2/PolicyDecisionPoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rt/security/saml/xacml2/PolicyDecisionPoint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rt/security/saml/xacml2/AbstractXACMLAuthorizingInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rt/security/saml/xacml2/XACMLAuthorizingInterceptor", "pdp", "Lorg/apache/cxf/rt/security/saml/xacml2/PolicyDecisionPoint;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "performRequest", "(Lorg/opensaml/xacml/ctx/RequestType;Lorg/apache/cxf/message/Message;)Lorg/opensaml/xacml/ctx/ResponseType;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rt/security/saml/xacml2/XACMLAuthorizingInterceptor", "pdp", "Lorg/apache/cxf/rt/security/saml/xacml2/PolicyDecisionPoint;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/rt/security/saml/xacml2/PolicyDecisionPoint", "evaluate", "(Lorg/opensaml/xacml/ctx/RequestType;)Lorg/opensaml/xacml/ctx/ResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
