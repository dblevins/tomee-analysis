package asm.org.apache.batchee.container.modelresolver.impl;
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
public class PartitionPropertyResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "Lorg/apache/batchee/container/modelresolver/impl/AbstractPropertyResolver<Lorg/apache/batchee/jaxb/Partition;>;", "org/apache/batchee/container/modelresolver/impl/AbstractPropertyResolver", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/AbstractPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substituteProperties", "(Lorg/apache/batchee/jaxb/Partition;Ljava/util/Properties;Ljava/util/Properties;)Lorg/apache/batchee/jaxb/Partition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getMapper", "()Lorg/apache/batchee/jaxb/PartitionMapper;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "isPartitionedStep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", "createPartitionMapperPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getMapper", "()Lorg/apache/batchee/jaxb/PartitionMapper;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/modelresolver/PropertyResolver", "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getPlan", "()Lorg/apache/batchee/jaxb/PartitionPlan;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "isPartitionedStep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", "createPartitionPlanPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getPlan", "()Lorg/apache/batchee/jaxb/PartitionPlan;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/modelresolver/PropertyResolver", "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getCollector", "()Lorg/apache/batchee/jaxb/Collector;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "isPartitionedStep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", "createCollectorPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getCollector", "()Lorg/apache/batchee/jaxb/Collector;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/modelresolver/PropertyResolver", "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getAnalyzer", "()Lorg/apache/batchee/jaxb/Analyzer;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "isPartitionedStep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", "createAnalyzerPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getAnalyzer", "()Lorg/apache/batchee/jaxb/Analyzer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/modelresolver/PropertyResolver", "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getReducer", "()Lorg/apache/batchee/jaxb/PartitionReducer;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "isPartitionedStep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", "createPartitionReducerPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getReducer", "()Lorg/apache/batchee/jaxb/PartitionReducer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/modelresolver/PropertyResolver", "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "substituteProperties", "(Ljava/lang/Object;Ljava/util/Properties;Ljava/util/Properties;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/jaxb/Partition");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "substituteProperties", "(Lorg/apache/batchee/jaxb/Partition;Ljava/util/Properties;Ljava/util/Properties;)Lorg/apache/batchee/jaxb/Partition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
