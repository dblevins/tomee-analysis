package asm.org.apache.openjpa.jdbc.kernel;
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
public class JDBCStoreManager$RefCountConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", null, "org/apache/openjpa/lib/jdbc/DelegatingConnection", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "RefCountConnection", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_retain", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_refs", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_freed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Ljava/sql/Connection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "<init>", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_retain", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_freed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRetain", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_retain", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetain", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_retain", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "free", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_retain", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ref", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$100", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;)Lorg/apache/openjpa/kernel/StoreContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "lock", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_refs", "I");
methodVisitor.visitJumpInsn(IFGT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_retain", "Z");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "free", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$100", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;)Lorg/apache/openjpa/kernel/StoreContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "unlock", "()V", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$100", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;)Lorg/apache/openjpa/kernel/StoreContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreContext", "unlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "free", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_freed", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "getDelegate", "()Ljava/sql/Connection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "close", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/sql/SQLException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "_freed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$202", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection;)Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createStatement", "(Z)Ljava/sql/Statement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "createStatement", "(Z)Ljava/sql/Statement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$300", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Ljava/sql/Statement;Ljava/sql/Connection;)Ljava/sql/Statement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createStatement", "(IIZ)Ljava/sql/Statement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "createStatement", "(IIZ)Ljava/sql/Statement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$300", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Ljava/sql/Statement;Ljava/sql/Connection;)Ljava/sql/Statement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$400", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Ljava/sql/PreparedStatement;Ljava/sql/Connection;)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager$RefCountConnection", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreManager", "access$400", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreManager;Ljava/sql/PreparedStatement;Ljava/sql/Connection;)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
