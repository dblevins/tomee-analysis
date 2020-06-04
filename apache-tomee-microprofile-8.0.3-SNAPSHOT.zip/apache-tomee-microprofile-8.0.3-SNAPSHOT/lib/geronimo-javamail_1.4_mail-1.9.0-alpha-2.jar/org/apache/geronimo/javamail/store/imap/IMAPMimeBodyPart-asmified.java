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
public class IMAPMimeBodyPartDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", null, "javax/mail/internet/MimeBodyPart", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "section", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "headersLoaded", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/internet/MimeBodyPart", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headersLoaded", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "section", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "bodySize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLineCount", "()I", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "lines", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentType", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "mimeType", "Ljavax/mail/internet/ContentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentType", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMimeType", "(Ljava/lang/String;)Z", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "mimeType", "Ljavax/mail/internet/ContentType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentType", "match", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDisposition", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "disposition", "Ljavax/mail/internet/ContentDisposition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentDisposition", "getDisposition", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDisposition", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP message parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoding", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "transferEncoding", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentID", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "contentID", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentID", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP message parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentMD5", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "md5Hash", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContentMD5", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP message parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescription", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "contentDescription", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/mail/internet/MimeUtility", "unfold", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/mail/internet/MimeUtility", "decodeText", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDescription", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP message parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFileName", "()Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "disposition", "Ljavax/mail/internet/ContentDisposition;");
methodVisitor.visitLdcInsn("filename");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentDisposition", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "mimeType", "Ljavax/mail/internet/ContentType;");
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentType", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitLdcInsn("mail.mime.decodefilename");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/mail/util/SessionUtil", "getBooleanProperty", "(Ljava/lang/String;Z)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/mail/internet/MimeUtility", "decodeText", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/mail/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to decode filename");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/MessagingException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFileName", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP message parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getContentStream", "()Ljava/io/InputStream;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "content", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "checkValidity", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadContent", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/internet/MimeBodyPart", "getContentStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getDataHandler", "()Ljavax/activation/DataHandler;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "dh", "Ljavax/activation/DataHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "isMultipart", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/activation/DataHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/imap/IMAPMultipartDataSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "section", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/IMAPMultipartDataSource", "<init>", "(Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;Ljavax/mail/internet/MimePart;Ljava/lang/String;Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/activation/DataHandler", "<init>", "(Ljavax/activation/DataSource;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "dh", "Ljavax/activation/DataHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "dh", "Ljavax/activation/DataHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "isAttachedMessage", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/activation/DataHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/imap/IMAPAttachedMessage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "section", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "nestedEnvelope", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPEnvelope;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "nestedBody", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/imap/IMAPAttachedMessage", "<init>", "(Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;Ljava/lang/String;Lorg/apache/geronimo/javamail/store/imap/connection/IMAPEnvelope;Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "bodyStructure", "Lorg/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/connection/IMAPBodyStructure", "mimeType", "Ljavax/mail/internet/ContentType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/ContentType", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/activation/DataHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "dh", "Ljavax/activation/DataHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "dh", "Ljavax/activation/DataHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/internet/MimeBodyPart", "getDataHandler", "()Ljavax/activation/DataHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataHandler", "(Ljavax/activation/DataHandler;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP body parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContent", "(Ljava/lang/Object;Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP body parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContent", "(Ljavax/mail/Multipart;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP body parts are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeader", "(Ljava/lang/String;)[Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getHeader", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeader", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getHeader", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllHeaders", "()Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getAllHeaders", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMatchingHeaders", "([Ljava/lang/String;)Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getMatchingHeaders", "([Ljava/lang/String;)Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNonMatchingHeaders", "([Ljava/lang/String;)Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getNonMatchingHeaders", "([Ljava/lang/String;)Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllHeaderLines", "()Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getAllHeaderLines", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMatchingHeaderLines", "([Ljava/lang/String;)Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getMatchingHeaderLines", "([Ljava/lang/String;)Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNonMatchingHeaderLines", "([Ljava/lang/String;)Ljava/util/Enumeration;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "loadHeaders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/internet/InternetHeaders", "getNonMatchingHeaderLines", "([Ljava/lang/String;)Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addHeader", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP messages are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP messages are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeHeader", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP messages are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addHeaderLine", "(Ljava/lang/String;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/mail/IllegalWriteException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMAP messages are read-only");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/IllegalWriteException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "loadHeaders", "()V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "getConnection", "()Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "getSequenceNumber", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "section", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/connection/IMAPConnection", "fetchHeaders", "(ILjava/lang/String;)Ljavax/mail/internet/InternetHeaders;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "headers", "Ljavax/mail/internet/InternetHeaders;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "loadContent", "()V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "content", "[B");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "getConnection", "()Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "getSequenceNumber", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "section", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/connection/IMAPConnection", "fetchContent", "(ILjava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "content", "[B");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/imap/IMAPMimeBodyPart", "message", "Lorg/apache/geronimo/javamail/store/imap/IMAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/imap/IMAPMessage", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/imap/connection/IMAPConnection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
