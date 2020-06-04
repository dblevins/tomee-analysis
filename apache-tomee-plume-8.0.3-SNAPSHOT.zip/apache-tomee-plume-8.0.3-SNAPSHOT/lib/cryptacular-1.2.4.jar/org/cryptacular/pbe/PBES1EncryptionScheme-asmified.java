package asm.org.cryptacular.pbe;
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
public class PBES1EncryptionSchemeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/pbe/PBES1EncryptionScheme", null, "org/cryptacular/pbe/AbstractEncryptionScheme", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_LENGTH", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IV_LENGTH", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/cryptacular/pbe/PBES1Algorithm;Lorg/bouncycastle/asn1/pkcs/PBEParameter;[C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/AbstractEncryptionScheme", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PBEParameter", "getSalt", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PBEParameter", "getIterationCount", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "intValue", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/generators/PKCS5S1ParametersGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/PBES1Algorithm", "getDigestSpec", "()Lorg/cryptacular/spec/DigestSpec;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/spec/DigestSpec", "newInstance", "()Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/generators/PKCS5S1ParametersGenerator", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/PBEParametersGenerator", "PKCS5PasswordToUTF8Bytes", "([C)[B", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/PKCS5S1ParametersGenerator", "init", "([B[BI)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/PBES1Algorithm", "getCipherSpec", "()Lorg/cryptacular/spec/BufferedBlockCipherSpec;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "newInstance", "()Lorg/bouncycastle/crypto/BufferedBlockCipher;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/PBES1EncryptionScheme", "setCipher", "(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/generators/PKCS5S1ParametersGenerator", "generateDerivedParameters", "(II)Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/PBES1EncryptionScheme", "setCipherParameters", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
