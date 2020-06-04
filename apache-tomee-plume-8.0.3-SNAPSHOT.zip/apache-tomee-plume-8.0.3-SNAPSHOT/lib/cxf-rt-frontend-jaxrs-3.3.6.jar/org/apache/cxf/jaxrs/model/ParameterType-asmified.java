package asm.org.apache.cxf.jaxrs.model;
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
public class ParameterTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/jaxrs/model/ParameterType", "Ljava/lang/Enum<Lorg/apache/cxf/jaxrs/model/ParameterType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATH", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERY", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MATRIX", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COOKIE", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FORM", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEAN", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_BODY", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONTEXT", "Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "$VALUES", "[Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/jaxrs/model/ParameterType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/model/ParameterType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/model/ParameterType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/model/ParameterType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATH");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "PATH", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "QUERY", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MATRIX");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "MATRIX", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "HEADER", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COOKIE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "COOKIE", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FORM");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "FORM", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEAN");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "BEAN", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_BODY");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "REQUEST_BODY", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTEXT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/model/ParameterType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "CONTEXT", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/jaxrs/model/ParameterType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "PATH", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "QUERY", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "MATRIX", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "HEADER", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "COOKIE", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "FORM", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "BEAN", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "REQUEST_BODY", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "CONTEXT", "Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/model/ParameterType", "$VALUES", "[Lorg/apache/cxf/jaxrs/model/ParameterType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
