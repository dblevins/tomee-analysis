package asm.org.apache.geronimo.javamail.store.imap;
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
public class IMAPFolder$FetchProfileItemDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", null, "javax/mail/FetchProfile$Item", null);

classWriter.visitInnerClass("org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", "org/apache/geronimo/javamail/store/imap/IMAPFolder", "FetchProfileItem", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/mail/FetchProfile$Item", "javax/mail/FetchProfile", "Item", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEADERS", "Lorg/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE", "Lorg/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/FetchProfile$Item", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADERS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", "HEADERS", "Lorg/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem;");
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIZE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem", "SIZE", "Lorg/apache/geronimo/javamail/store/imap/IMAPFolder$FetchProfileItem;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
