package asm.com.fasterxml.jackson.databind;
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
public class ObjectMapper$DefaultTypingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "com/fasterxml/jackson/databind/ObjectMapper", "DefaultTyping", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_LANG_OBJECT", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT_AND_NON_CONCRETE", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_CONCRETE_AND_ARRAYS", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_FINAL", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EVERYTHING", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "$VALUES", "[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_LANG_OBJECT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "JAVA_LANG_OBJECT", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT_AND_NON_CONCRETE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "OBJECT_AND_NON_CONCRETE", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_CONCRETE_AND_ARRAYS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "NON_CONCRETE_AND_ARRAYS", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_FINAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "NON_FINAL", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EVERYTHING");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "EVERYTHING", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "JAVA_LANG_OBJECT", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "OBJECT_AND_NON_CONCRETE", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "NON_CONCRETE_AND_ARRAYS", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "NON_FINAL", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "EVERYTHING", "Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping", "$VALUES", "[Lcom/fasterxml/jackson/databind/ObjectMapper$DefaultTyping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
