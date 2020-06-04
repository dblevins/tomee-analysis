package asm.org.apache.geronimo.javamail.store.pop3;
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
public class POP3RootFolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", null, "org/apache/geronimo/javamail/store/pop3/POP3Folder", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "inbox", "Ljavax/mail/Folder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Store;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3Folder", "<init>", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Store;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "folderType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "exists", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "msgCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "()Ljavax/mail/Folder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSeparator", "()C", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "list", "(Ljava/lang/String;)[Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/mail/Folder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "getInbox", "()Ljavax/mail/Folder;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFolder", "(Ljava/lang/String;)Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("INBOX");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "javax/mail/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only the INBOX folder is supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/MessagingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "getInbox", "()Ljavax/mail/Folder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOpen", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "open", "(I)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POP3 root folder cannot be opened");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/MessagingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "open", "(Z)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POP3 root folder cannot be close");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/MessagingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getInbox", "()Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "inbox", "Ljavax/mail/Folder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/pop3/POP3Folder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "store", "Ljavax/mail/Store;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/javamail/store/pop3/POP3Store");
methodVisitor.visitLdcInsn("INBOX");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3Folder", "<init>", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Store;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "inbox", "Ljavax/mail/Folder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "inbox", "Ljavax/mail/Folder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
