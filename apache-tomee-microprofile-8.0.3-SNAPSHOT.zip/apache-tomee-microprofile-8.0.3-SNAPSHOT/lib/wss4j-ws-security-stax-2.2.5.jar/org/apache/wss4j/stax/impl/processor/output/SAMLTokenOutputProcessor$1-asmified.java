package asm.org.apache.wss4j.stax.impl.processor.output;
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
public class SAMLTokenOutputProcessor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", "Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;>;", "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", null);

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor", "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor", "SAMLSecurityTokenProvider", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$securityTokenProvider", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor;Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", "val$securityTokenProvider", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/TokenSecurityEvent", "<init>", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", "val$securityTokenProvider", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/exceptions/XMLSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/exceptions/XMLSecurityException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$1", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
