package asm.com.sun.xml.messaging.saaj.packaging.mime.internet;
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
public class MimePullMultipartDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", null, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimeMultipart", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "in", "Ljava/io/InputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "boundary", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mm", "Lorg/jvnet/mimepull/MIMEMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dataSource", "Ljavax/activation/DataSource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "startParam", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "soapPart", "Lorg/jvnet/mimepull/MIMEPart;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/activation/DataSource;Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;)V", null, new String[] { "com/sun/xml/messaging/saaj/packaging/mime/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimeMultipart", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "boundary", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "mm", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "dataSource", "Ljavax/activation/DataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "startParam", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "parsed", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/packaging/mime/internet/ContentType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/activation/DataSource", "getContentType", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/ContentType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "javax/activation/DataSource", "com/sun/xml/messaging/saaj/packaging/mime/internet/ContentType"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "dataSource", "Ljavax/activation/DataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;");
methodVisitor.visitLdcInsn("boundary");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/ContentType", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "boundary", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readAndReturnSOAPPart", "()Lorg/jvnet/mimepull/MIMEPart;", null, new String[] { "com/sun/xml/messaging/saaj/packaging/mime/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/packaging/mime/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Inputstream from datasource was already consumed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/packaging/mime/MessagingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "readSOAPPart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readSOAPPart", "()V", null, new String[] { "com/sun/xml/messaging/saaj/packaging/mime/MessagingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "dataSource", "Ljavax/activation/DataSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/activation/DataSource", "getInputStream", "()Ljava/io/InputStream;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "in", "Ljava/io/InputStream;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEConfig", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEMessage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "in", "Ljava/io/InputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "boundary", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEMessage", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Lorg/jvnet/mimepull/MIMEConfig;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "mm", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "contType", "Lcom/sun/xml/messaging/saaj/packaging/mime/internet/ContentType;");
methodVisitor.visitLdcInsn("start");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/ContentType", "getParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "startParam", "Ljava/lang/String;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "mm", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEMessage", "getPart", "(I)Lorg/jvnet/mimepull/MIMEPart;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/jvnet/mimepull/MIMEConfig", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPLE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "startParam", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "mm", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "startParam", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEMessage", "getPart", "(Ljava/lang/String;)Lorg/jvnet/mimepull/MIMEPart;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/packaging/mime/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No inputstream from datasource");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/packaging/mime/MessagingException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parseAll", "()V", null, new String[] { "com/sun/xml/messaging/saaj/packaging/mime/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "parsed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "readSOAPPart", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "mm", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEMessage", "getAttachments", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jvnet/mimepull/MIMEPart");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "soapPart", "Lorg/jvnet/mimepull/MIMEPart;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/AttachmentPartImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/AttachmentPartImpl", "<init>", "(Lorg/jvnet/mimepull/MIMEPart;)V", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimeBodyPart");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimeBodyPart", "<init>", "(Lorg/jvnet/mimepull/MIMEPart;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "addBodyPart", "(Lcom/sun/xml/messaging/saaj/packaging/mime/internet/MimeBodyPart;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "parsed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "parse", "()V", null, new String[] { "com/sun/xml/messaging/saaj/packaging/mime/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/packaging/mime/internet/MimePullMultipart", "parseAll", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
