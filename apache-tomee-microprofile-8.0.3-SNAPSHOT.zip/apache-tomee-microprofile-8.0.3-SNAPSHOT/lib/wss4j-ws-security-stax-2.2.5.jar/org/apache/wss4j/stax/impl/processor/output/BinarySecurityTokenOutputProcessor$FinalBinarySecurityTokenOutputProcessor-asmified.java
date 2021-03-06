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
public class BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", null, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor", "FinalBinarySecurityTokenOutputProcessor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Action", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "addAfterProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getActor", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "isSecurityHeaderElement", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_BINARY_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENCRYPT_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SIGNATURE_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/output/OutputProcessorUtils", "updateSecurityHeaderOrder", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "createSubChain", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)Lorg/apache/xml/security/stax/ext/OutputProcessorChain;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_ENCODING_TYPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_NULL_VALUE_TYPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ATT_WSU_ID", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createStartElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;ZLjava/util/List;)Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/KerberosClientSecurityToken", "getTicket", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "encodeToString", "([B)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createCharactersAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "createEndElementAndOutputAsEvent", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "ENCRYPT_WITH_KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityConstants$Action", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_xenc_ReferenceList", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/output/OutputProcessorUtils", "updateSecurityHeaderOrder", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "createReferenceListStructureForEncryption", "(Lorg/apache/xml/security/stax/ext/AbstractOutputProcessor;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getAction", "()Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/processor/output/OutputProcessorUtils", "updateSecurityHeaderOrder", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljavax/xml/namespace/QName;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$Action;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "createSubChain", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)Lorg/apache/xml/security/stax/ext/OutputProcessorChain;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityProperties", "isUseSingleCert", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/BinarySecurityTokenOutputProcessor$FinalBinarySecurityTokenOutputProcessor", "securityToken", "Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/OutboundSecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "createBinarySecurityTokenStructure", "(Lorg/apache/xml/security/stax/ext/AbstractOutputProcessor;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;Ljava/lang/String;[Ljava/security/cert/X509Certificate;Z)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "removeProcessor", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
