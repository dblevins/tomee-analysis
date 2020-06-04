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
public class AbstractStaxBindingHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", null, "org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken", null);

classWriter.visitOuterClass("org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler", "addKerberosToken", "(Lorg/apache/wss4j/policy/model/KerberosToken;ZZZ)Lorg/apache/xml/security/stax/ext/SecurePart;");

classWriter.visitInnerClass("org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$secToken", "Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;[BLjava/security/Key;Ljava/lang/String;Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", "this$0", "Lorg/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", "val$secToken", "Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken", "<init>", "([BLjava/security/Key;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecretKey", "(Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", "val$secToken", "Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/tokenstore/SecurityToken", "getSecret", "()[B", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", "val$secToken", "Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/tokenstore/SecurityToken", "getSecret", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/KeyUtils", "prepareSecretKey", "(Ljava/lang/String;[B)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler$1", "val$secToken", "Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/tokenstore/SecurityToken", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
