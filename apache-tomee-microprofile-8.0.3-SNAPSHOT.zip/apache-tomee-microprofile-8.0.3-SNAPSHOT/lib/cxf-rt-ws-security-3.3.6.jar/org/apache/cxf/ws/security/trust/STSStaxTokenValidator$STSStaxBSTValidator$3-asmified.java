package asm.org.apache.cxf.ws.security.trust;
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
public class STSStaxTokenValidator$STSStaxBSTValidator$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", null, "org/apache/wss4j/stax/impl/securityToken/KerberosServiceSecurityTokenImpl", null);

classWriter.visitOuterClass("org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator", "validate", "(Lorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;Lorg/apache/wss4j/stax/validate/TokenContext;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator", "org/apache/cxf/ws/security/trust/STSStaxTokenValidator", "STSStaxBSTValidator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$stsValidated", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$binarySecurityTokenType", "Lorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$bytes", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$message", "Lorg/apache/cxf/binding/soap/SoapMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Ljavax/security/auth/callback/CallbackHandler;[BLjava/lang/String;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;ZLorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;[BLorg/apache/cxf/binding/soap/SoapMessage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "this$0", "Lorg/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$stsValidated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$binarySecurityTokenType", "Lorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$bytes", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$message", "Lorg/apache/cxf/binding/soap/SoapMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/securityToken/KerberosServiceSecurityTokenImpl", "<init>", "(Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Ljavax/security/auth/callback/CallbackHandler;[BLjava/lang/String;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$stsValidated", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/securityToken/KerberosServiceSecurityTokenImpl", "verify", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "this$0", "Lorg/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$binarySecurityTokenType", "Lorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$bytes", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator", "access$100", "(Lorg/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator;Lorg/apache/wss4j/binding/wss10/BinarySecurityTokenType;[B)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator$STSStaxBSTValidator$3", "val$message", "Lorg/apache/cxf/binding/soap/SoapMessage;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSStaxTokenValidator", "access$000", "(Lorg/w3c/dom/Element;Lorg/apache/cxf/binding/soap/SoapMessage;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
