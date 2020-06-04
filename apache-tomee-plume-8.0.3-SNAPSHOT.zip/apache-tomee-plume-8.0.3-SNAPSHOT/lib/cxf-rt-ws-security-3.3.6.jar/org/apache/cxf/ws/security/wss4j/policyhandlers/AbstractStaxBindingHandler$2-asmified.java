package asm.org.apache.cxf.ws.security.wss4j.policyhandlers;
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
public class AbstractStaxBindingHandler$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "Ljava/lang/Object;Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider<Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/securityToken/SecurityTokenProvider" });

classWriter.visitOuterClass("org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler", "addKerberosToken", "(Lorg/apache/wss4j/policy/model/KerberosToken;ZZZ)Lorg/apache/xml/security/stax/ext/SecurePart;");

classWriter.visitInnerClass("org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$wss4jToken", "Lorg/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;Lorg/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "this$0", "Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "val$wss4jToken", "Lorg/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "val$wss4jToken", "Lorg/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "val$wss4jToken", "Lorg/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Ljava/lang/Object;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$2", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
