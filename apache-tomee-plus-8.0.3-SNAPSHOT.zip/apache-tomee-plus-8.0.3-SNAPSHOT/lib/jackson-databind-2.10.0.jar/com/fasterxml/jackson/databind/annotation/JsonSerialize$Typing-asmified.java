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
public class JsonSerialize$TypingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "com/fasterxml/jackson/databind/annotation/JsonSerialize", "Typing", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DYNAMIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STATIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT_TYPING", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DYNAMIC");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "DYNAMIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STATIC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "STATIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT_TYPING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "DEFAULT_TYPING", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "DYNAMIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "STATIC", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "DEFAULT_TYPING", "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing", "$VALUES", "[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
