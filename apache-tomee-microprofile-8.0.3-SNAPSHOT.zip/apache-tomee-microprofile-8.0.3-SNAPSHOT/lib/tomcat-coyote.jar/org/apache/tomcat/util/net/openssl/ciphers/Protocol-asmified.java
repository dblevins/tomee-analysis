package asm.org.apache.tomcat.util.net.openssl.ciphers;
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
public class ProtocolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SSLv3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SSLv2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TLSv1", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TLSv1_2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TLSv1_3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "openSSLName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "openSSLName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getOpenSSLName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "openSSLName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SSLv3");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("SSLv3");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "SSLv3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SSLv2");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("SSLv2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "SSLv2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TLSv1");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("TLSv1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TLSv1_2");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("TLSv1.2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1_2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TLSv1_3");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("TLSv1.3");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1_3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Protocol");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "SSLv3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "SSLv2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1_2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "TLSv1_3", "Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Protocol", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Protocol;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
