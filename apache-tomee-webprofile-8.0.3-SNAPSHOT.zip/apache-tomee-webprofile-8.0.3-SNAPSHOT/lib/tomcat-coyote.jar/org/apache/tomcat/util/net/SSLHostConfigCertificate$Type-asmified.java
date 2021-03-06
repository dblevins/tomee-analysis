package asm.org.apache.tomcat.util.net;
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
public class SSLHostConfigCertificate$TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "org/apache/tomcat/util/net/SSLHostConfigCertificate", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNDEFINED", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EC", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "compatibleAuthentications", "Ljava/util/Set;", "Ljava/util/Set<Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "$VALUES", "[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "<init>", "(Ljava/lang/String;I[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", "([Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "compatibleAuthentications", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "compatibleAuthentications", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "java/lang/String", Opcodes.INTEGER, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCompatibleWith", "(Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "compatibleAuthentications", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNDEFINED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "<init>", "(Ljava/lang/String;I[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "UNDEFINED", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "RSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "<init>", "(Ljava/lang/String;I[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "RSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DSA");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "DSS", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "<init>", "(Ljava/lang/String;I[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "DSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "<init>", "(Ljava/lang/String;I[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "EC", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "UNDEFINED", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "RSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "DSA", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "EC", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "$VALUES", "[Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
