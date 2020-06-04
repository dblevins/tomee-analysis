package asm.org.apache.openjpa.ee;
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
public class RegistryManagedRuntime$TransactionManagerRegistryFacadeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", null, "java/lang/Object", new String[] { "javax/transaction/TransactionManager", "javax/transaction/Transaction" });

classWriter.visitInnerClass("org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "org/apache/openjpa/ee/RegistryManagedRuntime", "TransactionManagerRegistryFacade", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/ee/RegistryManagedRuntime;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/ee/RegistryManagedRuntime;Ljavax/transaction/TransactionSynchronizationRegistry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "this$0", "Lorg/apache/openjpa/ee/RegistryManagedRuntime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransaction", "()Ljavax/transaction/Transaction;", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerSynchronization", "(Ljavax/transaction/Synchronization;)V", null, new String[] { "javax/transaction/RollbackException", "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/TransactionSynchronizationRegistry", "registerInterposedSynchronization", "(Ljavax/transaction/Synchronization;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRollbackOnly", "()V", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/TransactionSynchronizationRegistry", "setRollbackOnly", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatus", "()I", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/TransactionSynchronizationRegistry", "getTransactionStatus", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/RegistryManagedRuntime$TransactionManagerRegistryFacade", "_registry", "Ljavax/transaction/TransactionSynchronizationRegistry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/transaction/TransactionSynchronizationRegistry", "getTransactionKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "()V", null, new String[] { "javax/transaction/NotSupportedException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/NotSupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/NotSupportedException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, new String[] { "javax/transaction/RollbackException", "javax/transaction/HeuristicMixedException", "javax/transaction/SystemException", "javax/transaction/HeuristicRollbackException", "java/lang/SecurityException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resume", "(Ljavax/transaction/Transaction;)V", null, new String[] { "javax/transaction/InvalidTransactionException", "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, new String[] { "java/lang/IllegalStateException", "java/lang/SecurityException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionTimeout", "(I)V", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "suspend", "()Ljavax/transaction/Transaction;", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delistResource", "(Ljavax/transaction/xa/XAResource;I)Z", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enlistResource", "(Ljavax/transaction/xa/XAResource;)Z", null, new String[] { "javax/transaction/RollbackException", "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/transaction/SystemException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/SystemException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
