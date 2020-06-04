package asm.jakarta.validation.constraints;
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
public class Pattern$FlagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/validation/constraints/Pattern$Flag", "Ljava/lang/Enum<Ljakarta/validation/constraints/Pattern$Flag;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/validation/constraints/Pattern$Flag", "jakarta/validation/constraints/Pattern", "Flag", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNIX_LINES", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CASE_INSENSITIVE", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMENTS", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MULTILINE", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DOTALL", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNICODE_CASE", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANON_EQ", "Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/validation/constraints/Pattern$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/validation/constraints/Pattern$Flag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "$VALUES", "[Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/validation/constraints/Pattern$Flag;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/validation/constraints/Pattern$Flag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/constraints/Pattern$Flag;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/validation/constraints/Pattern$Flag", "value", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/validation/constraints/Pattern$Flag", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNIX_LINES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "UNIX_LINES", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CASE_INSENSITIVE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "CASE_INSENSITIVE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMENTS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "COMMENTS", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MULTILINE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "MULTILINE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOTALL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "DOTALL", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNICODE_CASE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "UNICODE_CASE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANON_EQ");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/constraints/Pattern$Flag", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "CANON_EQ", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/validation/constraints/Pattern$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "UNIX_LINES", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "CASE_INSENSITIVE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "COMMENTS", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "MULTILINE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "DOTALL", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "UNICODE_CASE", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/constraints/Pattern$Flag", "CANON_EQ", "Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/validation/constraints/Pattern$Flag", "$VALUES", "[Ljakarta/validation/constraints/Pattern$Flag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
