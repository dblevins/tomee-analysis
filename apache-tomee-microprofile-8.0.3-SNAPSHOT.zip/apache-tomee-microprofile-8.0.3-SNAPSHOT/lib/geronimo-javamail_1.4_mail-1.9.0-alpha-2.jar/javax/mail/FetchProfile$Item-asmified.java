package asm.javax.mail;
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
public class FetchProfile$ItemDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "javax/mail/FetchProfile$Item", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/mail/FetchProfile$Item", "javax/mail/FetchProfile", "Item", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTENT_INFO", "Ljavax/mail/FetchProfile$Item;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENVELOPE", "Ljavax/mail/FetchProfile$Item;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLAGS", "Ljavax/mail/FetchProfile$Item;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/FetchProfile$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTENT_INFO");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/FetchProfile$Item", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/mail/FetchProfile$Item", "CONTENT_INFO", "Ljavax/mail/FetchProfile$Item;");
methodVisitor.visitTypeInsn(NEW, "javax/mail/FetchProfile$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENVELOPE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/FetchProfile$Item", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/mail/FetchProfile$Item", "ENVELOPE", "Ljavax/mail/FetchProfile$Item;");
methodVisitor.visitTypeInsn(NEW, "javax/mail/FetchProfile$Item");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLAGS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/FetchProfile$Item", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/mail/FetchProfile$Item", "FLAGS", "Ljavax/mail/FetchProfile$Item;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
