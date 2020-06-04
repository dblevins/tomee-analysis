package asm.com.fasterxml.jackson.core.format;
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
public class MatchStrengthDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/core/format/MatchStrength", "Ljava/lang/Enum<Lcom/fasterxml/jackson/core/format/MatchStrength;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCONCLUSIVE", "Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEAK_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SOLID_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FULL_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "$VALUES", "[Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/core/format/MatchStrength;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/format/MatchStrength;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/format/MatchStrength;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/core/format/MatchStrength");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_MATCH");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/format/MatchStrength", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "NO_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCONCLUSIVE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/format/MatchStrength", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "INCONCLUSIVE", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEAK_MATCH");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/format/MatchStrength", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "WEAK_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SOLID_MATCH");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/format/MatchStrength", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "SOLID_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FULL_MATCH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/format/MatchStrength", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "FULL_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/format/MatchStrength");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "NO_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "INCONCLUSIVE", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "WEAK_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "SOLID_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "FULL_MATCH", "Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/format/MatchStrength", "$VALUES", "[Lcom/fasterxml/jackson/core/format/MatchStrength;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
