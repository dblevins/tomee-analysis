package asm.org.apache.activemq.store;
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
public class PersistenceAdapterStatisticsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/PersistenceAdapterStatistics", null, "org/apache/activemq/management/StatsImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/TimeStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("writeTime");
methodVisitor.visitLdcInsn("Time to write data to the PersistentAdapter.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/TimeStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/TimeStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("readTime");
methodVisitor.visitLdcInsn("Time to read data from the PersistentAdapter.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/TimeStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("writeTime");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/PersistenceAdapterStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("readTime");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/PersistenceAdapterStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWriteTime", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "addTime", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addReadTime", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "addTime", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriteTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/PersistenceAdapterStatistics", "isDoReset", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "reset", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParent", "(Lorg/apache/activemq/store/PersistenceAdapterStatistics;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "writeTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/PersistenceAdapterStatistics", "readTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
