package asm.org.apache.openejb.server.httpd;
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
public class HttpRequest$MethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/server/httpd/HttpRequest$Method", "Ljava/lang/Enum<Lorg/apache/openejb/server/httpd/HttpRequest$Method;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/HttpRequest$Method", "org/apache/openejb/server/httpd/HttpRequest", "Method", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIONS", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GET", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEAD", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PUT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DELETE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRACE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATCH", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "$VALUES", "[Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/server/httpd/HttpRequest$Method;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/server/httpd/HttpRequest$Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/server/httpd/HttpRequest$Method;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/server/httpd/HttpRequest$Method");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "OPTIONS", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "GET", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "HEAD", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "POST", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "PUT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "DELETE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "TRACE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "CONNECT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATCH");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "PATCH", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/HttpRequest$Method", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "UNSUPPORTED", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/server/httpd/HttpRequest$Method");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "OPTIONS", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "GET", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "HEAD", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "POST", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "PUT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "DELETE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "TRACE", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "CONNECT", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "PATCH", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "UNSUPPORTED", "Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/httpd/HttpRequest$Method", "$VALUES", "[Lorg/apache/openejb/server/httpd/HttpRequest$Method;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
