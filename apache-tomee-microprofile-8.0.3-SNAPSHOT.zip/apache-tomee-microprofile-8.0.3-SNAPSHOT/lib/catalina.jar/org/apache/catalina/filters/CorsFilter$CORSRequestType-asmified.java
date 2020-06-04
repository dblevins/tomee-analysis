package asm.org.apache.catalina.filters;
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
public class CorsFilter$CORSRequestTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "Ljava/lang/Enum<Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/filters/CorsFilter$CORSRequestType", "org/apache/catalina/filters/CorsFilter", "CORSRequestType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIMPLE", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACTUAL", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_FLIGHT", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "$VALUES", "[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIMPLE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "SIMPLE", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACTUAL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "ACTUAL", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_FLIGHT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "PRE_FLIGHT", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_CORS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "NOT_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_CORS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "INVALID_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/filters/CorsFilter$CORSRequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "SIMPLE", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "ACTUAL", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "PRE_FLIGHT", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "NOT_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "INVALID_CORS", "Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/CorsFilter$CORSRequestType", "$VALUES", "[Lorg/apache/catalina/filters/CorsFilter$CORSRequestType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
