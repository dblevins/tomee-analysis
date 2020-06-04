package asm.org.apache.tomcat.util.net.openssl;
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
public class OpenSSLEngine$ClientAuthModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "org/apache/tomcat/util/net/openssl/OpenSSLEngine", "ClientAuthMode", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIONAL", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "NONE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIONAL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "OPTIONAL", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "REQUIRE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "NONE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "OPTIONAL", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "REQUIRE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
