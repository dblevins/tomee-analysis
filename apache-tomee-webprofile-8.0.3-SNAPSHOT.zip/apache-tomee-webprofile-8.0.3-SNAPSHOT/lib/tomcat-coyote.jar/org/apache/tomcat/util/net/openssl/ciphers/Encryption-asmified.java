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
public class EncryptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES128CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES128CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARIA128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARIA256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CAMELLIA256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CAMELLIA128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CHACHA20POLY1305", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRIPLE_DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDEA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "eGOST2814789CNT", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEED", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RC4", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RC2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "eNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES128");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES128CCM");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES128CCM8");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES128GCM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256CCM");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256CCM8");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256GCM");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARIA128GCM");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "ARIA128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARIA256GCM");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "ARIA256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CAMELLIA256");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CAMELLIA256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CAMELLIA128");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CAMELLIA128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CHACHA20POLY1305");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CHACHA20POLY1305", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRIPLE_DES");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "TRIPLE_DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDEA");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "IDEA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("eGOST2814789CNT");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "eGOST2814789CNT", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEED");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "SEED", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FZA");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC4");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "RC4", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "RC2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("eNULL");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "eNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/openssl/ciphers/Encryption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256CCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256CCM8", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "AES256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "ARIA128GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "ARIA256GCM", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CAMELLIA256", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CAMELLIA128", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "CHACHA20POLY1305", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "TRIPLE_DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "DES", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "IDEA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "eGOST2814789CNT", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "SEED", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "FZA", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "RC4", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "RC2", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "eNULL", "Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/ciphers/Encryption", "$VALUES", "[Lorg/apache/tomcat/util/net/openssl/ciphers/Encryption;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
