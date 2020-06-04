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
public class JDBCXAConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/jdbc/pool/JDBCXAConnection", null, "org/hsqldb/jdbc/pool/JDBCPooledConnection", new String[] { "javax/sql/XAConnection" });

{
fieldVisitor = classWriter.visitField(0, "xaResource", "Lorg/hsqldb/jdbc/pool/JDBCXAResource;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/jdbc/pool/JDBCXADataSource;Lorg/hsqldb/jdbc/JDBCConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCPooledConnection", "<init>", "(Lorg/hsqldb/jdbc/JDBCConnection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/pool/JDBCXAResource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAResource", "<init>", "(Lorg/hsqldb/jdbc/pool/JDBCXADataSource;Lorg/hsqldb/jdbc/JDBCConnection;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "xaResource", "Lorg/hsqldb/jdbc/pool/JDBCXAResource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXAResource", "()Ljavax/transaction/xa/XAResource;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "xaResource", "Lorg/hsqldb/jdbc/pool/JDBCXAResource;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getConnection", "()Ljava/sql/Connection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "isInUse", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/sql/SQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Connection in use");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/SQLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "isInUse", "Z");
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/jdbc/pool/JDBCXAConnectionWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "xaResource", "Lorg/hsqldb/jdbc/pool/JDBCXAResource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/jdbc/pool/JDBCXAConnection", "connection", "Lorg/hsqldb/jdbc/JDBCConnection;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCXAConnectionWrapper", "<init>", "(Lorg/hsqldb/jdbc/pool/JDBCXAResource;Lorg/hsqldb/jdbc/pool/JDBCXAConnection;Lorg/hsqldb/jdbc/JDBCConnection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/jdbc/pool/JDBCPooledConnection", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
