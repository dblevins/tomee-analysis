package asm.com.fasterxml.jackson.databind.annotation;
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
public class JsonSerialize$InclusionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM | ACC_DEPRECATED, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "com/fasterxml/jackson/databind/annotation/JsonSerialize", "Inclusion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALWAYS", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_NULL", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_DEFAULT", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_EMPTY", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT_INCLUSION", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALWAYS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "ALWAYS", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_NULL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_NULL", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_DEFAULT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_DEFAULT", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_EMPTY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_EMPTY", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT_INCLUSION");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "DEFAULT_INCLUSION", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "ALWAYS", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_NULL", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_DEFAULT", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "NON_EMPTY", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "DEFAULT_INCLUSION", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion", "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
