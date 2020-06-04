package asm.org.apache.xml.security.keys.content.keyvalues;
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
public class RSAKeyValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", null, "org/apache/xml/security/utils/SignatureElementProxy", new String[] { "org/apache/xml/security/keys/content/keyvalues/KeyValueContent" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/SignatureElementProxy", "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/SignatureElementProxy", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addReturnToSelf", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Modulus");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addBigIntegerElement", "(Ljava/math/BigInteger;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Exponent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addBigIntegerElement", "(Ljava/math/BigInteger;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;Ljava/security/Key;)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/SignatureElementProxy", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addReturnToSelf", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/RSAPublicKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAPublicKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/RSAPublicKey", "getModulus", "()Ljava/math/BigInteger;", true);
methodVisitor.visitLdcInsn("Modulus");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addBigIntegerElement", "(Ljava/math/BigInteger;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/RSAPublicKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/RSAPublicKey", "getPublicExponent", "()Ljava/math/BigInteger;", true);
methodVisitor.visitLdcInsn("Exponent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "addBigIntegerElement", "(Ljava/math/BigInteger;Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "org/w3c/dom/Document", "java/security/Key"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("RSAKeyValue");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyValue.IllegalArgument");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/I18n", "translate", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPublicKey", "()Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/spec/InvalidKeySpecException");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/KeyFactory", "getInstance", "(Ljava/lang/String;)Ljava/security/KeyFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/spec/RSAPublicKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Modulus");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "getBigIntegerFromChildElement", "(Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Exponent");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/keys/content/keyvalues/RSAKeyValue", "getBigIntegerFromChildElement", "(Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/RSAPublicKeySpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyFactory", "generatePublic", "(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/spec/InvalidKeySpecException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseLocalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("RSAKeyValue");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
