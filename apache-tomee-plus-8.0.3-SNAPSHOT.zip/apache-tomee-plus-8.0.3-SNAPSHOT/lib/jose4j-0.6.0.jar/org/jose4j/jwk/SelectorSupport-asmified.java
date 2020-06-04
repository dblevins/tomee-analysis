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
public class SelectorSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/jose4j/jwk/SelectorSupport", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VERIFY_OPS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DECRYPT_OPS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "filterForInboundSigned", "(Lorg/jose4j/jws/JsonWebSignature;)Lorg/jose4j/jwk/SimpleJwkFilter;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwk/SelectorSupport", "commonFilterForInbound", "(Lorg/jose4j/jwx/JsonWebStructure;)Lorg/jose4j/jwk/SimpleJwkFilter;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("sig");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setUse", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SelectorSupport", "VERIFY_OPS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setKeyOperations", "([Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "filterForInboundEncrypted", "(Lorg/jose4j/jwe/JsonWebEncryption;)Lorg/jose4j/jwk/SimpleJwkFilter;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwk/SelectorSupport", "commonFilterForInbound", "(Lorg/jose4j/jwx/JsonWebStructure;)Lorg/jose4j/jwk/SimpleJwkFilter;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("enc");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setUse", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SelectorSupport", "DECRYPT_OPS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setKeyOperations", "([Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "commonFilterForInbound", "(Lorg/jose4j/jwx/JsonWebStructure;)Lorg/jose4j/jwk/SimpleJwkFilter;", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwk/SimpleJwkFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwk/SimpleJwkFilter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/JsonWebStructure", "getKeyIdHeaderValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "VALUE_REQUIRED", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setKid", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/jose4j/jwk/SimpleJwkFilter", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/JsonWebStructure", "getX509CertSha1ThumbprintHeaderValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/JsonWebStructure", "getX509CertSha256ThumbprintHeaderValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setAllowFallbackDeriveFromX5cForX5Thumbs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setX5t", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/SimpleJwkFilter", "OMITTED_OKAY", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setX5tS256", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/JsonWebStructure", "getAlgorithmNoConstraintCheck", "()Lorg/jose4j/jwa/Algorithm;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jose4j/jwa/Algorithm", "getKeyType", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwk/SimpleJwkFilter", "setKty", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/KeyOperations", "VERIFY", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/SelectorSupport", "VERIFY_OPS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/KeyOperations", "DECRYPT", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/KeyOperations", "DERIVE_KEY", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwk/KeyOperations", "UNWRAP_KEY", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/SelectorSupport", "DECRYPT_OPS", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
