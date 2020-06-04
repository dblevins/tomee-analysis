package asm.org.apache.cxf.rs.security.jose.jws;
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
public class JwsJwtCompactProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/jose/jws/JwsJwtCompactProducer", null, "org/apache/cxf/rs/security/jose/jws/JwsCompactProducer", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsJwtCompactProducer", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtToken;Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsHeaders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsHeaders", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsJwtCompactProducer", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwt/JwtToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwt/JwtToken", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsJwtCompactProducer", "<init>", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtToken;Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtToken;Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsHeaders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwt/JwtToken", "getJwsHeaders", "()Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsHeaders", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwt/JwtToken", "getClaims", "()Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwt/JwtUtils", "claimsToJson", "(Lorg/apache/cxf/rs/security/jose/jwt/JwtClaims;Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsCompactProducer", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsHeaders;Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
