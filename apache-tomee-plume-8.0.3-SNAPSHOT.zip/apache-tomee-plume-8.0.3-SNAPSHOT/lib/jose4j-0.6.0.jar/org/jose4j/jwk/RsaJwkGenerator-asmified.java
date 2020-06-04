package asm.org.jose4j.jwk;
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
public class RsaJwkGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwk/RsaJwkGenerator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/jose4j/jwk/PublicJsonWebKey$Factory", "org/jose4j/jwk/PublicJsonWebKey", "Factory", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "generateJwk", "(I)Lorg/jose4j/jwk/RsaJsonWebKey;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwk/RsaJwkGenerator", "generateJwk", "(ILjava/lang/String;Ljava/security/SecureRandom;)Lorg/jose4j/jwk/RsaJsonWebKey;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "generateJwk", "(ILjava/lang/String;Ljava/security/SecureRandom;)Lorg/jose4j/jwk/RsaJsonWebKey;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/RsaKeyUtil");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/RsaKeyUtil", "<init>", "(Ljava/lang/String;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/keys/RsaKeyUtil", "generateKeyPair", "(I)Ljava/security/KeyPair;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyPair", "getPublic", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwk/PublicJsonWebKey$Factory", "newPublicJwk", "(Ljava/security/Key;)Lorg/jose4j/jwk/PublicJsonWebKey;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/jwk/RsaJsonWebKey");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/KeyPair", "getPrivate", "()Ljava/security/PrivateKey;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/RsaJsonWebKey", "setPrivateKey", "(Ljava/security/PrivateKey;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
