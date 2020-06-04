package asm.com.fasterxml.jackson.annotation;
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
public class JsonTypeInfo$IdDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "Ljava/lang/Enum<Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "com/fasterxml/jackson/annotation/JsonTypeInfo", "Id", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MINIMAL_CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NAME", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CUSTOM", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_defaultPropertyName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "_defaultPropertyName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultPropertyName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "_defaultPropertyName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "NONE", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLASS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("@class");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MINIMAL_CLASS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("@c");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "MINIMAL_CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NAME");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("@type");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "NAME", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CUSTOM");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "CUSTOM", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "NONE", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "MINIMAL_CLASS", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "NAME", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "CUSTOM", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonTypeInfo$Id", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
