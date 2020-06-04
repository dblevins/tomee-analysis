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
public class JsonWebTokenValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "org/jose4j/jwa/AlgorithmConstraints", "ConstraintType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VALIDATION", "Lorg/apache/openejb/util/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validation", "Ljava/util/function/Predicate;", "Ljava/util/function/Predicate<Lorg/eclipse/microprofile/jwt/JsonWebToken;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "verificationKey", "Ljava/security/Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "verificationKeys", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/security/Key;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "issuer", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "allowNoExpiryClaim", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/function/Predicate;Ljava/security/Key;Ljava/lang/String;Ljava/util/Map;Z)V", "(Ljava/util/function/Predicate<Lorg/eclipse/microprofile/jwt/JsonWebToken;>;Ljava/security/Key;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/security/Key;>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "allowNoExpiryClaim", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "validation", "Ljava/util/function/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "verificationKey", "Ljava/security/Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "verificationKeys", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "issuer", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "allowNoExpiryClaim", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Ljava/lang/String;)Lorg/eclipse/microprofile/jwt/JsonWebToken;", null, new String[] { "org/apache/tomee/microprofile/jwt/ParseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/jose4j/jwt/consumer/InvalidJwtException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/jose4j/jwt/MalformedClaimException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "verificationKey", "Ljava/security/Key;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "verificationKey", "Ljava/security/Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "issuer", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "allowNoExpiryClaim", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "authConfiguration", "(Ljava/security/Key;Ljava/lang/String;Z)Lorg/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration;", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "verificationKeys", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "issuer", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "allowNoExpiryClaim", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "authConfiguration", "(Ljava/util/Map;Ljava/lang/String;Z)Lorg/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration;", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/JwtConsumerBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setRelaxVerificationKeyValidation", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setRequireSubject", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setSkipDefaultAudienceValidation", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwa/AlgorithmConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jose4j/jwa/AlgorithmConstraints$ConstraintType", "WHITELIST", "Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("RS256");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("RS384");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("RS512");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwa/AlgorithmConstraints", "<init>", "(Lorg/jose4j/jwa/AlgorithmConstraints$ConstraintType;[Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setJwsAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getIssuer", "()Ljava/lang/String;", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getIssuer", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setExpectedIssuer", "(Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", Opcodes.TOP, "org/jose4j/jwt/consumer/JwtConsumerBuilder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getExpGracePeriodSecs", "()I", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFLE, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getExpGracePeriodSecs", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setAllowedClockSkewInSeconds", "(I)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(POP);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jwt/NumericDate", "fromSeconds", "(J)Lorg/jose4j/jwt/NumericDate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setEvaluationTime", "(Lorg/jose4j/jwt/NumericDate;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "isSingleKey", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getPublicKey", "()Ljava/security/Key;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setVerificationKey", "(Ljava/security/Key;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(POP);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/keys/resolvers/JwksVerificationKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", "getPublicKeys", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/keys/resolvers/JwksVerificationKeyResolver", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setVerificationKeyResolver", "(Lorg/jose4j/keys/resolvers/VerificationKeyResolver;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "build", "()Lorg/jose4j/jwt/consumer/JwtConsumer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "process", "(Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtContext;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtContext", "getJoseObjects", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jose4j/jwx/JsonWebStructure");
methodVisitor.visitLdcInsn("typ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwx/JsonWebStructure", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "processContext", "(Lorg/jose4j/jwt/consumer/JwtContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtContext", "getJwtClaims", "()Lorg/jose4j/jwt/JwtClaims;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("upn");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/JwtClaims", "getClaimValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("preferred_username");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/JwtClaims", "getClaimValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/JwtClaims", "getSubject", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "java/lang/String", "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration", Opcodes.TOP, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "org/jose4j/jwt/consumer/JwtConsumer", "org/jose4j/jwt/consumer/JwtContext", "java/lang/String", "org/jose4j/jwt/JwtClaims", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "raw_token", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/jwt/Claims", "name", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/JwtClaims", "setClaim", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/principal/JWTCallerPrincipal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/principal/JWTCallerPrincipal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/jose4j/jwt/JwtClaims;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "java/lang/String", "org/apache/tomee/microprofile/jwt/config/JWTAuthConfiguration"}, 1, new Object[] {"org/jose4j/jwt/consumer/InvalidJwtException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "VALIDATION", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/InvalidJwtException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/ParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Failed to verify token");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/ParseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/jose4j/jwt/MalformedClaimException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "VALIDATION", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/MalformedClaimException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/ParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Failed to verify token claims");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/ParseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomee/microprofile/jwt/principal/JWTCallerPrincipal"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "builder", "()Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator$Builder", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "CONSTRAINT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomee/microprofile/jwt/JsonWebTokenValidator;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/Class;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JsonWebTokenValidator", "VALIDATION", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
