package asm.org.apache.wss4j.dom.message;
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
public class WSSecDerivedKeyBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", null, "org/apache/wss4j/dom/message/WSSecSignatureBase", null);

classWriter.visitInnerClass("org/apache/wss4j/common/derivedKey/ConversationConstants$DerivationAlgorithm", "org/apache/wss4j/common/derivedKey/ConversationConstants", "DerivationAlgorithm", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/common/crypto/CryptoType$TYPE", "org/apache/wss4j/common/crypto/CryptoType", "TYPE", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ephemeralKey", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "clientLabel", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "serviceLabel", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenIdentifier", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenIdDirectId", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "strElem", "Lorg/w3c/dom/Element;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dktId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "derivedKeyBytes", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wscVersion", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "customValueType", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "useThisCert", "Ljava/security/cert/X509Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecSignatureBase", "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WS-SecureConversation");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "clientLabel", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WS-SecureConversation");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "serviceLabel", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "wscVersion", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "setKeyIdentifierType", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecSignatureBase", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WS-SecureConversation");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "clientLabel", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WS-SecureConversation");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "serviceLabel", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "wscVersion", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "setKeyIdentifierType", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getDerivedKeyLength", "()I", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExternalKey", "([BLjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "ephemeralKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExternalKey", "([BLorg/w3c/dom/Element;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "ephemeralKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "strElem", "Lorg/w3c/dom/Element;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenIdentifier", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX509Certificate", "(Ljava/security/cert/X509Certificate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "useThisCert", "Ljava/security/cert/X509Certificate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dktId", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClientLabel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "clientLabel", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setServiceLabel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "serviceLabel", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepare", "()V", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getDerivedKeyLength", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "clientLabel", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "serviceLabel", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/util/WSSecurityUtil", "generateNonce", "(I)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/derivedKey/AlgoFactory", "getInstance", "(Ljava/lang/String;)Lorg/apache/wss4j/common/derivedKey/DerivationAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "ephemeralKey", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "ephemeralKey", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/wss4j/dom/message/WSSecDerivedKeyBase", Opcodes.INTEGER, Opcodes.INTEGER, "[B", "java/lang/String", "[B", "[B", "org/apache/wss4j/common/derivedKey/DerivationAlgorithm"}, 0, new Object[] {});
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No ephemeral key is supplied for id: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "ephemeralKey", "[B");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/derivedKey/DerivationAlgorithm", "createKey", "([B[BIJ)[B", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "derivedKeyBytes", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/message/token/DerivedKeyToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "wscVersion", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "<init>", "(ILorg/w3c/dom/Document;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitLdcInsn("DK-");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/dom/WsuIdAllocator", "createId", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dktId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setOffset", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setLength", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "encodeToString", "([B)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setNonce", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dktId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "addWSUNamespace", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "addWSUNamespace", "()V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "strElem", "Lorg/w3c/dom/Element;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/token/SecurityTokenReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/token/SecurityTokenReference", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitLdcInsn("STR-");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/dom/WsuIdAllocator", "createSecureId", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "addWSUNamespace", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addWSUNamespace", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/common/token/SecurityTokenReference", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getSigningCerts", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "keyIdentifierType", "I");
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTableSwitchInsn(3, 12, label7, new Label[] { label5, label6, label7, label7, label7, label8, label7, label7, label7, label9 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/security/cert/X509Certificate;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setKeyIdentifier", "(Ljava/security/cert/X509Certificate;)V", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setKeyIdentifierSKI", "(Ljava/security/cert/X509Certificate;Lorg/apache/wss4j/common/crypto/Crypto;)V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setKeyIdentifierThumb", "(Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setKeyIdentifier", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0#SAMLAssertionID");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/token/Reference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/token/Reference", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdDirectId", "Z");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setURI", "(Ljava/lang/String;)V", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/token/Reference"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("#");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdentifier", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label15);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0#SAMLAssertionID");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setValueType", "(Ljava/lang/String;)V", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label19);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/message/token/KerberosSecurity", "isKerberosToken", "(Ljava/lang/String;)Z", false);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label20);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/ws/2005/02/sc/sct");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNE, label21);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/sct");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/Reference", "setValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#UsernameToken");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label17);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "addTokenType", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/token/SecurityTokenReference", "setReference", "(Lorg/apache/wss4j/common/token/Reference;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setSecurityTokenReference", "(Lorg/apache/wss4j/common/token/SecurityTokenReference;)V", false);
Label label23 = new Label();
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "strElem", "Lorg/w3c/dom/Element;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "setSecurityTokenReference", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prependDKElementToHeader", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getSecurityHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecHeader", "getSecurityHeaderElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/util/WSSecurityUtil", "prependChildElement", "(Lorg/w3c/dom/Element;Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendDKElementToHeader", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "getSecurityHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecHeader", "getSecurityHeaderElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWscVersion", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "wscVersion", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWscVersion", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "wscVersion", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getdktElement", "()Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "dkt", "Lorg/apache/wss4j/dom/message/token/DerivedKeyToken;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/DerivedKeyToken", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCustomValueType", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "customValueType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTokenIdDirectId", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "tokenIdDirectId", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSigningCerts", "()[Ljava/security/cert/X509Certificate;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "keyIdentifierType", "I");
methodVisitor.visitInsn(ICONST_2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "keyIdentifierType", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "keyIdentifierType", "I");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "keyIdentifierType", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/security/cert/X509Certificate;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "useThisCert", "Ljava/security/cert/X509Certificate;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/crypto/CryptoType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/crypto/CryptoType$TYPE", "ALIAS", "Lorg/apache/wss4j/common/crypto/CryptoType$TYPE;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/crypto/CryptoType", "<init>", "(Lorg/apache/wss4j/common/crypto/CryptoType$TYPE;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "user", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/crypto/CryptoType", "setAlias", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("noSigCryptoFile");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/common/crypto/CryptoType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/crypto/Crypto", "getX509Certificates", "(Lorg/apache/wss4j/common/crypto/CryptoType;)[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/security/cert/X509Certificate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "useThisCert", "Ljava/security/cert/X509Certificate;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFGT, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitLdcInsn("noUserCertsFound");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "user", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("signature");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCrypto", "(Lorg/apache/wss4j/common/crypto/Crypto;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "crypto", "Lorg/apache/wss4j/common/crypto/Crypto;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getDerivedKey", "(Ljava/lang/String;)Ljavax/crypto/SecretKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "derivedKeyBytes", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/KeyUtils", "prepareSecretKey", "(Ljava/lang/String;[B)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/dom/message/WSSecDerivedKeyBase;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/dom/message/WSSecDerivedKeyBase", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
