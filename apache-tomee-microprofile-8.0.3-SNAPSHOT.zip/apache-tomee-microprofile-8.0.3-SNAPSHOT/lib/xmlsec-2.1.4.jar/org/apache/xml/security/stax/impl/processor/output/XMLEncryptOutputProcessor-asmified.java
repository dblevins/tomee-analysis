package asm.org.apache.xml.security.stax.impl.processor.output;
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
public class XMLEncryptOutputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", null, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor", "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "AbstractInternalEncryptionOutputProcessor", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/SecurePart$Modifier", "org/apache/xml/security/stax/ext/SecurePart", "Modifier", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Action", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_TRANSIENT, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "getEventType", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "asStartElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "getActiveInternalEncryptionOutputProcessor", "()Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("encryptionParts");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "securePartMatches", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/SecurePart;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Matched encryptionPart for encryption");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/OutboundSecurityContext;", true);
methodVisitor.visitLdcInsn("PROP_USE_THIS_TOKEN_ID_FOR_ENCRYPTION");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutboundSecurityContext", "get", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/OutboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutboundSecurityContext", "getSecurityTokenProvider", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/SecurityTokenProvider", "getSecurityToken", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/impl/EncryptionPartDef");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "setSecurePart", "(Lorg/apache/xml/security/stax/ext/SecurePart;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/SecurePart", "getModifier", "()Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "setModifier", "(Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/util/IDGenerator", "generateID", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "setEncRefId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/SecurityTokenProvider", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "setKeyId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityProperties", "getEncryptionSymAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getSecretKey", "(Ljava/lang/String;)Ljava/security/Key;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/EncryptionPartDef", "setSymmetricKey", "(Ljava/security/Key;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/OutboundSecurityContext;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/stax/impl/EncryptionPartDef;"));
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutboundSecurityContext", "putAsList", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "getDocumentContext", "()Lorg/apache/xml/security/stax/ext/DocumentContext;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/DocumentContext", "getEncoding", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "createInternalEncryptionOutputProcessor", "(Lorg/apache/xml/security/stax/impl/EncryptionPartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;)Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor", "setXMLSecurityProperties", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor", "setAction", "(Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor", "init", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "setActiveInternalEncryptionOutputProcessor", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createInternalEncryptionOutputProcessor", "(Lorg/apache/xml/security/stax/impl/EncryptionPartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;)Lorg/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor$1", "<init>", "(Lorg/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor;Lorg/apache/xml/security/stax/impl/EncryptionPartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractEncryptOutputProcessor$AbstractInternalEncryptionOutputProcessor", "getAfterProcessors", "()Ljava/util/Set;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/impl/processor/output/XMLEncryptOutputProcessor", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
