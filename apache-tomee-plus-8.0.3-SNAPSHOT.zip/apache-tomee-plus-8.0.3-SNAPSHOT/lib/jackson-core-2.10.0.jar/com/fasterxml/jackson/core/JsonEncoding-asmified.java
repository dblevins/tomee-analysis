package asm.com.fasterxml.jackson.core;
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
public class JsonEncodingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/core/JsonEncoding", "Ljava/lang/Enum<Lcom/fasterxml/jackson/core/JsonEncoding;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF8", "Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF16_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF16_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF32_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF32_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_javaName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_bigEndian", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_bits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "$VALUES", "[Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/core/JsonEncoding;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonEncoding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/JsonEncoding;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", "(Ljava/lang/String;ZI)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_javaName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_bigEndian", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_bits", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_javaName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBigEndian", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_bigEndian", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bits", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/JsonEncoding", "_bits", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF8");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonEncoding", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF8", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF16_BE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("UTF-16BE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonEncoding", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF16_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF16_LE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("UTF-16LE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonEncoding", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF16_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF32_BE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("UTF-32BE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonEncoding", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF32_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF32_LE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("UTF-32LE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonEncoding", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF32_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/JsonEncoding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF8", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF16_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF16_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF32_BE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "UTF32_LE", "Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonEncoding", "$VALUES", "[Lcom/fasterxml/jackson/core/JsonEncoding;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
