package asm.org.apache.openejb.core.stateful;
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
public class StatefulContainer$SessionSynchronizationCoordinator$SynchronizationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator", "org/apache/openejb/core/stateful/StatefulContainer", "SessionSynchronizationCoordinator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator", "Synchronization", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instance", "Lorg/apache/openejb/core/stateful/Instance;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "callSessionSynchronization", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator;Lorg/apache/openejb/core/stateful/Instance;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "this$1", "Lorg/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "instance", "Lorg/apache/openejb/core/stateful/Instance;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "isCallSessionSynchronization", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "callSessionSynchronization", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setCallSessionSynchronization", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "callSessionSynchronization", "Z");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "callSessionSynchronization", "Z");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization;)Lorg/apache/openejb/core/stateful/Instance;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateful/StatefulContainer$SessionSynchronizationCoordinator$Synchronization", "instance", "Lorg/apache/openejb/core/stateful/Instance;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
