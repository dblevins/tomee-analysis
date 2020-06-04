package asm.org.apache.wss4j.stax.impl.processor.input;
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
public class SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "Ljava/lang/Object;Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider<Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/securityToken/SecurityTokenProvider" });

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "processNextEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler", "InternalSecurityTokenReferenceInputProcessor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "securityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;Lorg/apache/xml/security/stax/ext/InputProcessorChain;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "securityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "securityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "access$000", "(Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "getSecurityTokenProvider", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/SecurityTokenProvider", "getSecurityToken", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/securityToken/InboundSecurityToken");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "access$100", "(Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;)Ljava/util/ArrayDeque;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSInboundSecurityContext");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "access$200", "(Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "<init>", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Ljava/util/Deque;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;)V", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "securityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor", "access$200", "(Lorg/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Ljava/lang/Object;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/input/SecurityTokenReferenceInputHandler$InternalSecurityTokenReferenceInputProcessor$1", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
