package asm.org.eclipse.microprofile.openapi.models;
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
public class PathItem$HttpMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "Ljava/lang/Enum<Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "org/eclipse/microprofile/openapi/models/PathItem", "HttpMethod", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GET", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PUT", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATCH", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DELETE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEAD", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIONS", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRACE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "$VALUES", "[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
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
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "POST", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "GET", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PUT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "PUT", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATCH");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "PATCH", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DELETE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "DELETE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEAD");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "HEAD", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIONS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "OPTIONS", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "TRACE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "POST", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "GET", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "PUT", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "PATCH", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "DELETE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "HEAD", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "OPTIONS", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "TRACE", "Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/models/PathItem$HttpMethod", "$VALUES", "[Lorg/eclipse/microprofile/openapi/models/PathItem$HttpMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
