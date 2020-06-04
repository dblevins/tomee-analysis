package asm.org.apache.tomcat.util.http;
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
public class Parameters$FailReasonDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/http/Parameters$FailReason", "Ljava/lang/Enum<Lorg/apache/tomcat/util/http/Parameters$FailReason;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/http/Parameters$FailReason", "org/apache/tomcat/util/http/Parameters", "FailReason", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLIENT_DISCONNECT", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MULTIPART_CONFIG_INVALID", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_CONTENT_TYPE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IO_ERROR", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_NAME", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_TOO_LARGE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_BODY_INCOMPLETE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOO_MANY_PARAMETERS", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "URL_DECODING", "Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "$VALUES", "[Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/http/Parameters$FailReason;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/http/Parameters$FailReason;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/http/Parameters$FailReason;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/http/Parameters$FailReason");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLIENT_DISCONNECT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "CLIENT_DISCONNECT", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MULTIPART_CONFIG_INVALID");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "MULTIPART_CONFIG_INVALID", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_CONTENT_TYPE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "INVALID_CONTENT_TYPE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IO_ERROR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "IO_ERROR", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_NAME");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "NO_NAME", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_TOO_LARGE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "POST_TOO_LARGE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_BODY_INCOMPLETE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "REQUEST_BODY_INCOMPLETE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOO_MANY_PARAMETERS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "TOO_MANY_PARAMETERS", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "UNKNOWN", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("URL_DECODING");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/Parameters$FailReason", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "URL_DECODING", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/http/Parameters$FailReason");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "CLIENT_DISCONNECT", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "MULTIPART_CONFIG_INVALID", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "INVALID_CONTENT_TYPE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "IO_ERROR", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "NO_NAME", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "POST_TOO_LARGE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "REQUEST_BODY_INCOMPLETE", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "TOO_MANY_PARAMETERS", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "UNKNOWN", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "URL_DECODING", "Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/Parameters$FailReason", "$VALUES", "[Lorg/apache/tomcat/util/http/Parameters$FailReason;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
