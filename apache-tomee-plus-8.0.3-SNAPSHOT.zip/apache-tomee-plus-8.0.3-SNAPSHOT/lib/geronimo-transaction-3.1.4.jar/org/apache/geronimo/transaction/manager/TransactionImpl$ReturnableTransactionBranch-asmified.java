package asm.org.apache.geronimo.transaction.manager;
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
public class TransactionImpl$ReturnableTransactionBranchDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/geronimo/transaction/manager/TransactionImpl$ReturnableTransactionBranch", null, "org/apache/geronimo/transaction/manager/TransactionImpl$TransactionBranch", null);

classWriter.visitInnerClass("org/apache/geronimo/transaction/manager/TransactionImpl$ReturnableTransactionBranch", "org/apache/geronimo/transaction/manager/TransactionImpl", "ReturnableTransactionBranch", ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/transaction/manager/TransactionImpl$TransactionBranch", "org/apache/geronimo/transaction/manager/TransactionImpl", "TransactionBranch", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/transaction/xa/Xid;Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;)V", null, new String[] { "jakarta/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResourceFactory", "getNamedXAResource", "()Lorg/apache/geronimo/transaction/manager/NamedXAResource;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/transaction/manager/TransactionImpl$TransactionBranch", "<init>", "(Ljavax/transaction/xa/XAResource;Ljavax/transaction/xa/Xid;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/TransactionImpl$ReturnableTransactionBranch", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnXAResource", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/TransactionImpl$ReturnableTransactionBranch", "namedXAResourceFactory", "Lorg/apache/geronimo/transaction/manager/NamedXAResourceFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/transaction/manager/TransactionImpl$ReturnableTransactionBranch", "getCommitter", "()Ljavax/transaction/xa/XAResource;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/transaction/manager/NamedXAResource");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/transaction/manager/NamedXAResourceFactory", "returnNamedXAResource", "(Lorg/apache/geronimo/transaction/manager/NamedXAResource;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
