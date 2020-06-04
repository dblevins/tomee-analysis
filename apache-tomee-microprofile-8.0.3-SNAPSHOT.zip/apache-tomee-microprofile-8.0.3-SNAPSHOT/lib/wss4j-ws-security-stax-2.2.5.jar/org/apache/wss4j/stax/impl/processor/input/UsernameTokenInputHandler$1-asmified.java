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
public class UsernameTokenInputHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "Ljava/lang/Object;Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider<Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/securityToken/SecurityTokenProvider" });

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler", "handle", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Ljava/util/Deque;Ljava/lang/Integer;)V");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$usernameSecurityToken", "Lorg/apache/wss4j/stax/securityToken/UsernameSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$usernameTokenType", "Lorg/apache/wss4j/binding/wss10/UsernameTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler;Lorg/apache/wss4j/stax/securityToken/UsernameSecurityToken;Lorg/apache/wss4j/binding/wss10/UsernameTokenType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "val$usernameSecurityToken", "Lorg/apache/wss4j/stax/securityToken/UsernameSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "val$usernameTokenType", "Lorg/apache/wss4j/binding/wss10/UsernameTokenType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "val$usernameSecurityToken", "Lorg/apache/wss4j/stax/securityToken/UsernameSecurityToken;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/securityToken/InboundSecurityToken");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "val$usernameTokenType", "Lorg/apache/wss4j/binding/wss10/UsernameTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wss10/UsernameTokenType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Ljava/lang/Object;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/input/UsernameTokenInputHandler$1", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
