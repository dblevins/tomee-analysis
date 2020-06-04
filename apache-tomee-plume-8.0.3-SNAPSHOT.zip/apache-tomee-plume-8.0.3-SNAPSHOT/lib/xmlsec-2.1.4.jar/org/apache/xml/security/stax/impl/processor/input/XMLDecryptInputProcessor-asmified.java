package asm.org.apache.xml.security.stax.impl.processor.input;
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
public class XMLDecryptInputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor", null, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor$DecryptedEventReaderInputProcessor", "org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor", "DecryptedEventReaderInputProcessor", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "AbstractDecryptedEventReaderInputProcessor", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/SecurePart$Modifier", "org/apache/xml/security/stax/ext/SecurePart", "Modifier", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "<init>", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newDecryptedEventReaderInputProcessor", "(ZLorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor$DecryptedEventReaderInputProcessor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor", "getSecurityProperties", "()Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "getType", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/SecurePart$Modifier", "getModifier", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor$DecryptedEventReaderInputProcessor", "<init>", "(Lorg/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;ZLorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Lorg/apache/xml/security/stax/impl/processor/input/XMLDecryptInputProcessor;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleSecurityToken", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage_Encryption", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "addTokenUsage", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "createTokenSecurityEvent", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Ljava/lang/String;)Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleEncryptedContent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getDocumentContext", "()Lorg/apache/xml/security/stax/ext/DocumentContext;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "getElementPath", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/DocumentContext", "getProtectionOrder", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent", "<init>", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;ZLjava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent", "setElementPath", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent", "setXmlSecEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent", "setSecurityToken", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/ContentEncryptedElementSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleCipherReference", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Ljavax/crypto/Cipher;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("errorMessages.NotYetImplementedException");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleXOPInclude", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Ljava/lang/String;Ljavax/crypto/Cipher;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)Ljava/io/InputStream;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("errorMessages.NotYetImplementedException");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
