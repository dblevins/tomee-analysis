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
public class AuthenticationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DSS", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "aNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ECDH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KRB5", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ECDSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PSK", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GOST94", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GOST01", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SRP", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "RSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DSS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "DSS", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("aNULL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "aNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DH");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "DH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ECDH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KRB5");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "KRB5", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ECDSA");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PSK");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "PSK", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GOST94");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "GOST94", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GOST01");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "GOST01", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FZA");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SRP");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "SRP", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ANY", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Authentication");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "RSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "DSS", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "aNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "DH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDH", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "KRB5", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ECDSA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "PSK", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "GOST94", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "GOST01", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "SRP", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "ANY", "Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Authentication", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Authentication;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
