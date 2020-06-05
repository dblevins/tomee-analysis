package asm.org.apache.cxf.bus.managers;
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
public class WorkQueueImplMBeanWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", null, "java/lang/Object", new String[] { "org/apache/cxf/management/ManagedComponent" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedResource;", true);
annotationVisitor0.visit("componentName", "WorkQueue");
annotationVisitor0.visit("description", "The CXF work queue");
annotationVisitor0.visit("currencyTimeLimit", new Integer(15));
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visit("persistPeriod", new Integer(200));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TYPE_VALUE", "Ljava/lang/String;", null, "WorkQueues");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "objectName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;Lorg/apache/cxf/workqueue/WorkQueueManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.apache.cxf");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "isShared", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/bus/managers/WorkQueueManagerImpl");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/bus/managers/WorkQueueManagerImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/managers/WorkQueueManagerImpl", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "org/apache/cxf/workqueue/WorkQueueManager", "java/lang/StringBuilder", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("bus.id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("WorkQueueManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Bus.WorkQueueManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("bus.id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("=Shared,");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("WorkQueues");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("instance.id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "objectName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWorkQueueMaxSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueueMaxSize");
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getMaxSize", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWorkQueueSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueue Current size");
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getSize", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLargestPoolSize", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The largest number of threads");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getLargestPoolSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPoolSize", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The current number of threads");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getPoolSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActiveCount", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The number of threads currently busy");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getActiveCount", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueue has nothing to do");
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "isEmpty", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFull", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueue is very busy");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "isFull", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHighWaterMark", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueue HighWaterMark");
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getHighWaterMark", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHighWaterMark", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "setHighWaterMark", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLowWaterMark", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/management/annotation/ManagedAttribute;", true);
annotationVisitor0.visit("description", "The WorkQueue LowWaterMark");
annotationVisitor0.visit("persistPolicy", "OnUpdate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "getLowWaterMark", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLowWaterMark", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "aWorkQueue", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "setLowWaterMark", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectName", "()Ljavax/management/ObjectName;", null, new String[] { "javax/management/JMException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/managers/WorkQueueImplMBeanWrapper", "objectName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
