package asm.org.apache.openejb.resource;
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
public class GeronimoTransactionManagerFactory$TransactionManagerMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/jmx/MBean;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/internal/Internal;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Transaction manager statistics");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "org/apache/openejb/resource/GeronimoTransactionManagerFactory", "TransactionManagerMBean", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "defaultTransactionTimeout", "Lorg/apache/openejb/util/Duration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "txLog", "Lorg/apache/geronimo/transaction/manager/TransactionLog;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;Lorg/apache/openejb/util/Duration;Lorg/apache/geronimo/transaction/manager/TransactionLog;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "defaultTransactionTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "txLog", "Lorg/apache/geronimo/transaction/manager/TransactionLog;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActive", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Number of active transactions");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/transaction/manager/GeronimoTransactionManager", "getActiveCount", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCommits", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Number of committed transactions");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/transaction/manager/GeronimoTransactionManager", "getTotalCommits", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRollbacks", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Number of rolled back transactions");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/transaction/manager/GeronimoTransactionManager", "getTotalRollbacks", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetStatistics", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedOperation;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Reset statistics counters");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "transactionManager", "Lorg/apache/geronimo/transaction/manager/GeronimoTransactionManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/transaction/manager/GeronimoTransactionManager", "resetStatistics", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultTransactionTimeout", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/ManagedAttribute;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/api/jmx/Description;", true);
annotationVisitor0.visit("value", "Display the default transaction timeout");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/GeronimoTransactionManagerFactory$TransactionManagerMBean", "defaultTransactionTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Duration", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
