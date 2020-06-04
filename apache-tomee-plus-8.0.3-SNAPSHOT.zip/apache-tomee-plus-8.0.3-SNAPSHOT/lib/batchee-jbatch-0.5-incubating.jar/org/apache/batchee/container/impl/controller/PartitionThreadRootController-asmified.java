package asm.org.apache.batchee.container.impl.controller;
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
public class PartitionThreadRootControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/PartitionThreadRootController", null, "org/apache/batchee/container/impl/controller/JobThreadRootController", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/container/util/PartitionsBuilderConfig;Lorg/apache/batchee/container/services/ServicesManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/PartitionsBuilderConfig", "getAnalyzerQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/JobThreadRootController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Ljava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
