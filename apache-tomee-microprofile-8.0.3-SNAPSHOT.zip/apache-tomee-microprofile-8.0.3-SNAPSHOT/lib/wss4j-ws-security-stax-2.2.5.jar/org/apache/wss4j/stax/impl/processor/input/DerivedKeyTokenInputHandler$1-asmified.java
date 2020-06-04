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
public class DerivedKeyTokenInputHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "Ljava/lang/Object;Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider<Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/securityToken/SecurityTokenProvider" });

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler", "handle", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Ljava/util/Deque;Ljava/lang/Integer;)V");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", null, null, 0);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", null, null, 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$securityProperties", "Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$elementPath", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$responsibleXMLSecStartXMLEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler;Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Ljava/util/List;Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$securityProperties", "Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$elementPath", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$responsibleXMLSecStartXMLEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$inputProcessorChain", "Lorg/apache/xml/security/stax/ext/InputProcessorChain;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSInboundSecurityContext");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KEYIDENTIFIER_SECURITY_TOKEN_DIRECT_REFERENCE", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1$1", "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$elementPath", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "setElementPath", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$responsibleXMLSecStartXMLEvent", "Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "setXMLSecEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "derivedKeySecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "val$derivedKeyTokenType", "Lorg/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/binding/wssc/AbstractDerivedKeyTokenType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Ljava/lang/Object;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/input/DerivedKeyTokenInputHandler$1", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
