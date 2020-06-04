package asm.org.apache.cxf.ws.security.sts.provider;
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
public class SecurityTokenServiceImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", null, "java/lang/Object", new String[] { "org/apache/cxf/ws/security/sts/provider/SecurityTokenService" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cancelOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/CancelOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "issueOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "issueSingleOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyExchangeTokenOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "renewOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RenewOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestCollectionOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validateOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/ValidateOperation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Ljakarta/xml/ws/WebServiceContext;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Resource;", true);
annotationVisitor0.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCancelOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/CancelOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "cancelOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/CancelOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIssueOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/IssueOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIssueSingleOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueSingleOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setKeyExchangeTokenOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "keyExchangeTokenOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRenewOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/RenewOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "renewOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RenewOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequestCollectionOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "requestCollectionOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidateOperation", "(Lorg/apache/cxf/ws/security/sts/provider/operation/ValidateOperation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "validateOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/ValidateOperation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "validateOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/ValidateOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Validate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "validateOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/ValidateOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/ValidateOperation", "validate", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requestCollection", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenCollectionType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "requestCollectionOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RequestCollection");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "requestCollectionOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/RequestCollectionOperation", "requestCollection", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenCollectionType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keyExchangeToken", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "keyExchangeTokenOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("KeyExchangeToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "keyExchangeTokenOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/KeyExchangeTokenOperation", "keyExchangeToken", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "issue", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Issue");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/IssueOperation", "issue", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "issueSingle", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueSingleOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("IssueSingle");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "issueSingleOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/IssueSingleOperation", "issueSingle", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancel", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "cancelOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/CancelOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Cancel");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "cancelOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/CancelOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/CancelOperation", "cancel", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "renew", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "renewOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RenewOperation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Renew");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "throwUnsupportedOperation", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "renewOperation", "Lorg/apache/cxf/ws/security/sts/provider/operation/RenewOperation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getPrincipal", "()Ljava/security/Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "getMessageContext", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/security/sts/provider/operation/RenewOperation", "renew", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;Ljava/security/Principal;Ljava/util/Map;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "context", "Ljakarta/xml/ws/WebServiceContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/ws/WebServiceContext", "getUserPrincipal", "()Ljava/security/Principal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMessageContext", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/SecurityTokenServiceImpl", "context", "Ljakarta/xml/ws/WebServiceContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/ws/WebServiceContext", "getMessageContext", "()Ljakarta/xml/ws/handler/MessageContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "throwUnsupportedOperation", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "jakarta/xml/soap/SOAPException");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/saaj/SAAJFactoryResolver", "createSOAPFactory", "(Lorg/apache/cxf/binding/soap/SoapVersion;)Ljakarta/xml/soap/SOAPFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPFactory", "createFault", "()Ljakarta/xml/soap/SOAPFault;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsupported operation ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPFault", "setFaultString", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/soap/SOAPFaultException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/soap/SOAPFaultException", "<init>", "(Ljakarta/xml/soap/SOAPFault;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
