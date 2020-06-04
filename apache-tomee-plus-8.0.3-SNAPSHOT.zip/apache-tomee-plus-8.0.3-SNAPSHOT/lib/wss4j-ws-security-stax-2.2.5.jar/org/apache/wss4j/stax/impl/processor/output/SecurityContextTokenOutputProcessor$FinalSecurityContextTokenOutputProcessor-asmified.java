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
public class SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", null, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor", "FinalSecurityContextTokenOutputProcessor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Action", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "identifier", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "use200512Namespace", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;Ljava/lang/String;Z)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "identifier", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "use200512Namespace", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getActor", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "isSecurityHeaderElement", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "getHeaderElementName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/output/OutputProcessorUtils", "updateSecurityHeaderOrder", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "createSubChain", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)Lorg/apache/xml/security/stax/ext/OutputProcessorChain;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_WSU_ID", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "getIdentifierName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createStartElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;ZLjava/util/List;)Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createStartElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;ZLjava/util/List;)Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "identifier", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createCharactersAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createEndElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "createEndElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "removeProcessor", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getHeaderElementName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "use200512Namespace", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_SCT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_SCT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getIdentifierName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SecurityContextTokenOutputProcessor$FinalSecurityContextTokenOutputProcessor", "use200512Namespace", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0512_IDENTIFIER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSC0502_IDENTIFIER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
