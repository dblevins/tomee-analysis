package asm.org.apache.cxf.transport.https.httpclient;
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
public class DefaultHostnameVerifier$HostNameTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "Ljava/lang/Enum<Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier", "HostNameType", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IPv4", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IPv6", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DNS", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "subjectType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "$VALUES", "[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "subjectType", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IPv4");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "IPv4", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IPv6");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "IPv6", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DNS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "DNS", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "IPv4", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "IPv6", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "DNS", "Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType", "$VALUES", "[Lorg/apache/cxf/transport/https/httpclient/DefaultHostnameVerifier$HostNameType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
