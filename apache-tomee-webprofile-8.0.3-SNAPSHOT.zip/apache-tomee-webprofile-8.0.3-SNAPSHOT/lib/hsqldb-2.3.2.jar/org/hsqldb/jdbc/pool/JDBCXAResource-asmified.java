package asm.org.hsqldb.jdbc.pool;
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
public class JDBCXAResourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/jdbc/pool/JDBCXAResource", null, "java/lang/Object", new String[] { "javax/transaction/xa/XAResource" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connection", "Lorg/hsqldb/jdbc/JDBCConnection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "originalAutoCommitMode", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "XA_STATE_INITIAL", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "XA_STATE_STARTED", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "XA_STATE_ENDED", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "XA_STATE_PREPARED", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "XA_STATE_DISPOSED", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "state", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "xid", "Ljavax/transaction/xa/Xid;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withinGlobalTransaction", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_STARTED", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validateXid", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Null Xid");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("There is no live transaction for this XAResource");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Given Xid is not that associated with this XAResource object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/jdbc/pool/JDBCXADataSource;Lorg/hsqldb/jdbc/JDBCConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_INITIAL", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getXADataSource", "()Lorg/hsqldb/jdbc/pool/JDBCXADataSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "(Ljavax/transaction/xa/Xid;Z)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "getResource", "(Ljavax/transaction/xa/Xid;)Lorg/hsqldb/jdbc/pool/JDBCXAResource;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The XADataSource has no such Xid:  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/jdbc/pool/JDBCXAResource"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "commitThis", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitThis", "(Z)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transaction is in a 2-phase state when 1-phase is requested");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Attempt to do a 2-phase commit when transaction is not prepared");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "commit", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "dispose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "dispose", "()V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_DISPOSED", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "removeResource", "(Ljavax/transaction/xa/Xid;)Lorg/hsqldb/jdbc/pool/JDBCXAResource;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "originalAutoCommitMode", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "end", "(Ljavax/transaction/xa/Xid;I)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "validateXid", "(Ljavax/transaction/xa/Xid;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_STARTED", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid XAResource state");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLdcInsn(new Integer(67108864));
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_ENDED", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forget", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "validateXid", "(Ljavax/transaction/xa/Xid;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Attempted to forget a XAResource that is not in a heuristically completed state");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "dispose", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_INITIAL", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionTimeout", "()I", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transaction timeouts not implemented yet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSameRM", "(Ljavax/transaction/xa/XAResource;)Z", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/hsqldb/jdbc/pool/JDBCXAResource");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/jdbc/pool/JDBCXAResource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "getXADataSource", "()Lorg/hsqldb/jdbc/pool/JDBCXADataSource;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepare", "(Ljavax/transaction/xa/Xid;)I", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "getResource", "(Ljavax/transaction/xa/Xid;)Lorg/hsqldb/jdbc/pool/JDBCXAResource;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The XADataSource has no such Xid:  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/jdbc/pool/JDBCXAResource"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "prepareThis", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareThis", "()I", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/hsqldb/HsqlException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_ENDED", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid XAResource state");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "getSession", "()Lorg/hsqldb/SessionInterface;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/SessionInterface", "prepareCommit", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/hsqldb/HsqlException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/HsqlException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recover", "(I)[Ljavax/transaction/xa/Xid;", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "getPreparedXids", "()[Ljavax/transaction/xa/Xid;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "getResource", "(Ljavax/transaction/xa/Xid;)Lorg/hsqldb/jdbc/pool/JDBCXAResource;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The XADataSource has no such Xid in prepared state:  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/jdbc/pool/JDBCXAResource"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "rollbackThis", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackThis", "()V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_ENDED", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid XAResource state");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "rollback", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "dispose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionTimeout", "(I)Z", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "(Ljavax/transaction/xa/Xid;I)V", null, new String[] { "javax/transaction/xa/XAException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_INITIAL", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_DISPOSED", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid XAResource state");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JDBCXAResource has not been associated with a XADataSource");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Null Xid");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "getAutoCommit", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "originalAutoCommitMode", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/JDBCConnection", "setAutoCommit", "(Z)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/transaction/xa/XAException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/xa/XAException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_STARTED", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "state", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xaDataSource", "Lorg/hsqldb/jdbc/pool/JDBCXADataSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "xid", "Ljavax/transaction/xa/Xid;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/jdbc/pool/JDBCXADataSource", "addResource", "(Ljavax/transaction/xa/Xid;Lorg/hsqldb/jdbc/pool/JDBCXAResource;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getConnection", "()Lorg/hsqldb/jdbc/JDBCConnection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setConnection", "(Lorg/hsqldb/jdbc/JDBCConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAResource", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_INITIAL", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_STARTED", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_ENDED", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_PREPARED", "I");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/hsqldb/jdbc/pool/JDBCXAResource", "XA_STATE_DISPOSED", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
