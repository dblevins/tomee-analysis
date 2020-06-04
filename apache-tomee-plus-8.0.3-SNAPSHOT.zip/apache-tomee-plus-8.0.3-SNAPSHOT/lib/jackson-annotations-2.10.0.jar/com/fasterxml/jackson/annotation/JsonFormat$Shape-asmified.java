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
public class JsonFormat$ShapeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "Ljava/lang/Enum<Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Shape", "com/fasterxml/jackson/annotation/JsonFormat", "Shape", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NATURAL", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SCALAR", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER_FLOAT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER_INT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRING", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOOLEAN", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNumeric", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_INT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_FLOAT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStructured", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "OBJECT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ANY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NATURAL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NATURAL", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SCALAR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "SCALAR", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "OBJECT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER_FLOAT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_FLOAT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER_INT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_INT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRING");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "STRING", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "BOOLEAN", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "BINARY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/annotation/JsonFormat$Shape");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ANY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NATURAL", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "SCALAR", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "OBJECT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_FLOAT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "NUMBER_INT", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "STRING", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "BOOLEAN", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "BINARY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
