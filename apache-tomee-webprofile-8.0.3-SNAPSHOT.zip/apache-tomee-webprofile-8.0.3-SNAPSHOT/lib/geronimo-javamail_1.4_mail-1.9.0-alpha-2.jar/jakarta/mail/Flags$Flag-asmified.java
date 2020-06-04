package asm.jakarta.mail;
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
public class Flags$FlagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "jakarta/mail/Flags$Flag", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/mail/Flags$Flag", "jakarta/mail/Flags", "Flag", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANSWERED", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETED", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DRAFT", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLAGGED", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECENT", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEEN", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER", "Ljakarta/mail/Flags$Flag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mask", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/mail/Flags$Flag", "mask", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljakarta/mail/Flags$Flag;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/mail/Flags$Flag", "mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "ANSWERED", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "DELETED", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "DRAFT", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "FLAGGED", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "RECENT", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "SEEN", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitTypeInsn(NEW, "jakarta/mail/Flags$Flag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/mail/Flags$Flag", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/mail/Flags$Flag", "USER", "Ljakarta/mail/Flags$Flag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
