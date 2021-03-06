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
public class AbstractSTSClient$1InternalProtectionTokenDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/trust/AbstractSTSClient$1InternalProtectionToken", null, "org/apache/wss4j/policy/model/ProtectionToken", null);

classWriter.visitOuterClass("org/apache/cxf/ws/security/trust/AbstractSTSClient", "cancel", "(Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;)Lorg/apache/cxf/ws/security/trust/AbstractSTSClient$STSResponse;");

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$SPVersion", "org/apache/wss4j/policy/SPConstants", "SPVersion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/AbstractSTSClient$1InternalProtectionToken", null, "InternalProtectionToken", 0);

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/AbstractSTSClient$STSResponse", "org/apache/cxf/ws/security/trust/AbstractSTSClient", "STSResponse", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$secureConversationToken", "Lorg/apache/wss4j/policy/model/SecureConversationToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/trust/AbstractSTSClient;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/trust/AbstractSTSClient;Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;Lorg/apache/wss4j/policy/model/SecureConversationToken;)V", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/AbstractSTSClient$1InternalProtectionToken", "this$0", "Lorg/apache/cxf/ws/security/trust/AbstractSTSClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/trust/AbstractSTSClient$1InternalProtectionToken", "val$secureConversationToken", "Lorg/apache/wss4j/policy/model/SecureConversationToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/ProtectionToken", "<init>", "(Lorg/apache/wss4j/policy/SPConstants$SPVersion;Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/trust/AbstractSTSClient$1InternalProtectionToken", "val$secureConversationToken", "Lorg/apache/wss4j/policy/model/SecureConversationToken;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/ProtectionToken", "setToken", "(Lorg/apache/wss4j/policy/model/AbstractToken;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
