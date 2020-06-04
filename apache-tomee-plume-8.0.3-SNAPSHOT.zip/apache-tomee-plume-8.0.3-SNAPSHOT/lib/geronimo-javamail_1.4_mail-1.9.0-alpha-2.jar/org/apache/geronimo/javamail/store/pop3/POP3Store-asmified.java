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
public class POP3StoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/javamail/store/pop3/POP3Store", null, "javax/mail/Store", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "DEFAULT_POP3_PORT", "I", null, new Integer(110));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "DEFAULT_POP3_SSL_PORT", "I", null, new Integer(995));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "props", "Lorg/apache/geronimo/javamail/util/ProtocolProperties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "debugStream", "Ljava/io/PrintStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "debug", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "root", "Lorg/apache/geronimo/javamail/store/pop3/POP3RootFolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "closedForBusiness", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "openFolders", "Ljava/util/LinkedList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/mail/Session;Ljavax/mail/URLName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("pop3");
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "<init>", "(Ljavax/mail/Session;Ljavax/mail/URLName;Ljava/lang/String;IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/mail/Session;Ljavax/mail/URLName;Ljava/lang/String;IZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/Store", "<init>", "(Ljavax/mail/Session;Ljavax/mail/URLName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "closedForBusiness", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "openFolders", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/util/ProtocolProperties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/util/ProtocolProperties", "<init>", "(Ljavax/mail/Session;Ljava/lang/String;ZI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "props", "Lorg/apache/geronimo/javamail/util/ProtocolProperties;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/Session", "getDebugOut", "()Ljava/io/PrintStream;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugStream", "Ljava/io/PrintStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/Session", "getDebug", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debug", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "props", "Lorg/apache/geronimo/javamail/util/ProtocolProperties;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "<init>", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Store;Lorg/apache/geronimo/javamail/util/ProtocolProperties;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultFolder", "()Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "checkConnectionStatus", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "root", "Lorg/apache/geronimo/javamail/store/pop3/POP3RootFolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/javamail/store/pop3/POP3RootFolder", "<init>", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Store;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "root", "Lorg/apache/geronimo/javamail/store/pop3/POP3RootFolder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFolder", "(Ljava/lang/String;)Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "getDefaultFolder", "()Ljavax/mail/Folder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/Folder", "getFolder", "(Ljava/lang/String;)Ljavax/mail/Folder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFolder", "(Ljavax/mail/URLName;)Ljavax/mail/Folder;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "getDefaultFolder", "()Ljavax/mail/Folder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/URLName", "getFile", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/mail/Folder", "getFolder", "(Ljava/lang/String;)Ljavax/mail/Folder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "protocolConnect", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debug", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Connecting to server ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" for user ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugOut", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "protocolConnect", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "closedForBusiness", "Z");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getConnection", "()Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "getConnection", "()Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "releaseConnection", "(Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "getFolderConnection", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Folder;)Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "getConnection", "()Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "openFolders", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "releaseFolderConnection", "(Lorg/apache/geronimo/javamail/store/pop3/POP3Folder;Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "openFolders", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/LinkedList", "remove", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "closeOpenFolders", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "javax/mail/MessagingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "closedForBusiness", "Z");
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "openFolders", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "openFolders", "Ljava/util/LinkedList;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/javamail/store/pop3/POP3Folder");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Folder", "close", "(Z)V", false);
methodVisitor.visitLabel(label5);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label12);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConnected", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/mail/MessagingException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label0, label6, label5, "javax/mail/MessagingException");
methodVisitor.visitTryCatchBlock(label2, label5, label5, "javax/mail/MessagingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/Store", "isConnected", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "getConnection", "()Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3Connection", "pingServer", "()V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "releaseConnection", "(Lorg/apache/geronimo/javamail/store/pop3/connection/POP3Connection;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "close", "()V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "closedForBusiness", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "closeOpenFolders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "connectionPool", "Lorg/apache/geronimo/javamail/store/pop3/connection/POP3ConnectionPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/Store", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkConnectionStatus", "()V", null, new String[] { "javax/mail/MessagingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "isConnected", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "javax/mail/MessagingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not connected ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/MessagingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "debugOut", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugStream", "Ljava/io/PrintStream;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("POP3Store DEBUG: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "debugOut", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Received exception -> ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugOut", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Exception message -> ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugOut", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/javamail/store/pop3/POP3Store", "debugStream", "Ljava/io/PrintStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "printStackTrace", "(Ljava/io/PrintStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "finalize", "()V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/mail/Store", "finalize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/javamail/store/pop3/POP3Store", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
