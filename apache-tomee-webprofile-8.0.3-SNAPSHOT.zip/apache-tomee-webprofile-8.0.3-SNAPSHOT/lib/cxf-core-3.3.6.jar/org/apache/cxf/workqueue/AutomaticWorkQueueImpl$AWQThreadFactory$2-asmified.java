package asm.org.apache.cxf.workqueue;
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
public class AutomaticWorkQueueImpl$AWQThreadFactory$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Ljava/lang/Boolean;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;");

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "org/apache/cxf/workqueue/AutomaticWorkQueueImpl", "AWQThreadFactory", 0);

classWriter.visitInnerClass("org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$t", "Ljava/lang/Thread;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;Ljava/lang/Thread;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "val$t", "Ljava/lang/Thread;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "val$t", "Ljava/lang/Thread;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "this$1", "Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory", "loader", "Ljava/lang/ClassLoader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/workqueue/AutomaticWorkQueueImpl$AWQThreadFactory$2", "run", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
