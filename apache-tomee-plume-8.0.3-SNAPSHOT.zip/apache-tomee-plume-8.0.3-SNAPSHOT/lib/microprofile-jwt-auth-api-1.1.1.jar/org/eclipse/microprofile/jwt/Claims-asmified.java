package asm.org.eclipse.microprofile.jwt;
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
public class ClaimsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/microprofile/jwt/Claims", "Ljava/lang/Enum<Lorg/eclipse/microprofile/jwt/Claims;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "iss", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sub", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "exp", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "iat", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "jti", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "upn", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "groups", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "raw_token", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "aud", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "nbf", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "auth_time", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "updated_at", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "azp", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "nonce", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "at_hash", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "c_hash", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "full_name", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "family_name", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "middle_name", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "nickname", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "given_name", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "preferred_username", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "email", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "email_verified", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "gender", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "birthdate", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "zoneinfo", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "locale", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "phone_number", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "phone_number_verified", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "address", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "acr", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "amr", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sub_jwk", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "cnf", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sip_from_tag", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sip_date", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sip_callid", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sip_cseq_num", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "sip_via_branch", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "orig", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dest", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "mky", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "jwk", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "jwe", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "kid", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "jku", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN", "Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "description", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/microprofile/jwt/Claims;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/microprofile/jwt/Claims;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "$VALUES", "[Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/microprofile/jwt/Claims;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/microprofile/jwt/Claims;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/jwt/Claims;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", "(Ljava/lang/String;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/jwt/Claims", "description", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/jwt/Claims", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescription", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/jwt/Claims", "description", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/jwt/Claims", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("iss");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Issuer");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "iss", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sub");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Subject");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sub", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("exp");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Expiration Time");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "exp", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("iat");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Issued At Time");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "iat", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jti");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("JWT ID");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "jti", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("upn");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("MP-JWT specific unique principal name");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "upn", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("groups");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("MP-JWT specific groups permission grant");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Set;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "groups", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("raw_token");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("MP-JWT specific original bearer token");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "raw_token", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("aud");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("Audience");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Set;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "aud", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("nbf");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("Not Before");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "nbf", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("auth_time");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("Time when the authentication occurred");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "auth_time", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("updated_at");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("Time the information was last updated");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "updated_at", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("azp");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("Authorized party - the party to which the ID Token was issued");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "azp", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("nonce");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("Value used to associate a Client session with an ID Token");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "nonce", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("at_hash");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("Access Token hash value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "at_hash", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("c_hash");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("Code hash value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "c_hash", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("full_name");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("Full name");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "full_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("family_name");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("Surname(s) or last name(s)");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "family_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("middle_name");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("Middle name(s)");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "middle_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("nickname");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("Casual name");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "nickname", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("given_name");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("Given name(s) or first name(s)");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "given_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("preferred_username");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("Shorthand name by which the End-User wishes to be referred to");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "preferred_username", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("email");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("Preferred e-mail address");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "email", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("email_verified");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("True if the e-mail address has been verified; otherwise false");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "email_verified", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("gender");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("Gender");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "gender", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("birthdate");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("Birthday");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "birthdate", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("zoneinfo");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("Time zone");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "zoneinfo", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("locale");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("Locale");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "locale", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("phone_number");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("Preferred telephone number");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "phone_number", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("phone_number_verified");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitLdcInsn("True if the phone number has been verified; otherwise false");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "phone_number_verified", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("address");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("Preferred postal address");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/JsonObject;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "address", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("acr");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("Authentication Context Class Reference");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "acr", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("amr");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitLdcInsn("Authentication Methods References");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "amr", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sub_jwk");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitLdcInsn("Public key used to check the signature of an ID Token");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/JsonObject;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sub_jwk", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cnf");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitLdcInsn("Confirmation");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "cnf", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sip_from_tag");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitLdcInsn("SIP From tag header field parameter value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_from_tag", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sip_date");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitLdcInsn("SIP Date header field value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_date", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sip_callid");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitLdcInsn("SIP Call-Id header field value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_callid", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sip_cseq_num");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitLdcInsn("SIP CSeq numeric header field parameter value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_cseq_num", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sip_via_branch");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitLdcInsn("SIP Via branch header field parameter value");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_via_branch", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("orig");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("Originating Identity String");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "orig", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dest");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitLdcInsn("Destination Identity String");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "dest", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("mky");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("Media Key Fingerprint String");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "mky", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jwk");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitLdcInsn("JSON Web Key Representing Public Key");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/JsonObject;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "jwk", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jwe");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitLdcInsn("Encrypted JSON Web Key");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "jwe", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("kid");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitLdcInsn("Key identifier");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "kid", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jku");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitLdcInsn("JWK Set URL");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "jku", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitLdcInsn("A catch all for any unknown claim");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Void;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/jwt/Claims", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "UNKNOWN", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/microprofile/jwt/Claims");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "iss", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sub", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "exp", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "iat", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "jti", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "upn", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "groups", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "raw_token", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "aud", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "nbf", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "auth_time", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "updated_at", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "azp", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "nonce", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "at_hash", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "c_hash", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "full_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "family_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "middle_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "nickname", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "given_name", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "preferred_username", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "email", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "email_verified", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "gender", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "birthdate", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "zoneinfo", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "locale", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "phone_number", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "phone_number_verified", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "address", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "acr", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "amr", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sub_jwk", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "cnf", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_from_tag", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_date", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_callid", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_cseq_num", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "sip_via_branch", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "orig", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "dest", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "mky", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "jwk", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "jwe", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "kid", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "jku", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/jwt/Claims", "UNKNOWN", "Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/jwt/Claims", "$VALUES", "[Lorg/eclipse/microprofile/jwt/Claims;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
