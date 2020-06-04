package asm.org.apache.tomee.microprofile.jwt;
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
public class JsonWebTokenValidator$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validation", "Ljava/util/function/Predicate;", "Ljava/util/function/Predicate<Lorg/eclipse/microprofile/jwt/JsonWebToken;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "verificationKey", "Ljava/security/Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "verificationKeys", "Ljava/util/List;", "Ljava/util/List<Lorg/jose4j/jwk/JsonWebKey;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "issuer", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "allowNoExpiryClaim", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "lambda$new$0", "(Lorg/eclipse/microprofile/jwt/JsonWebToken;)Z", false), Type.getType("(Lorg/eclipse/microprofile/jwt/JsonWebToken;)Z")});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "validation", "Ljava/util/function/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "allowNoExpiryClaim", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/util/function/Predicate;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", "(Ljava/util/function/Predicate<Lorg/eclipse/microprofile/jwt/JsonWebToken;>;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "and", "(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "validation", "Ljava/util/function/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "publicKey", "(Ljava/lang/String;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/config/PublicKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/config/PublicKeyResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/PublicKeyResolver", "readPublicKeys", "(Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/Key");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKey", "(Ljava/security/Key;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verificationKey", "(Ljava/security/Key;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKey", "Ljava/security/Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verificationKey", "(Ljava/util/Map;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/security/Key;>;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKeys", "Ljava/util/List;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKeys", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "validation", "Ljava/util/function/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKey", "Ljava/security/Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "issuer", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "allowNoExpiryClaim", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "<init>", "(Ljava/util/function/Predicate;Ljava/security/Key;Ljava/lang/String;Ljava/util/Map;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verificationKeys", "(Ljava/util/List;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", "(Ljava/util/List<Lorg/jose4j/jwk/JsonWebKey;>;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "verificationKeys", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "issuer", "(Ljava/lang/String;)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "issuer", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allowNoExpiryClaim", "(Z)Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "allowNoExpiryClaim", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(Lorg/eclipse/microprofile/jwt/JsonWebToken;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
