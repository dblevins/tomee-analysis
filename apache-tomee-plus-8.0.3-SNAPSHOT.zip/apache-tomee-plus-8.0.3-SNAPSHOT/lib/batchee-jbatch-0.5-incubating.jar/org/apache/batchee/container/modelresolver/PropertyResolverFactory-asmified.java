package asm.org.apache.batchee.container.modelresolver;
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
public class PropertyResolverFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/modelresolver/PropertyResolverFactory", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createJobPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/JSLJob;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/JobPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/JobPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createStepPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Step;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/StepPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/StepPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createBatchletPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Batchlet;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/BatchletPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/BatchletPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSplitPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Split;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/SplitPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/SplitPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createFlowPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Flow;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/FlowPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/FlowPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createChunkPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Chunk;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ChunkPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ChunkPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createTransitionElementPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/container/jsl/TransitionElement;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ControlElementPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ControlElementPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createDecisionPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Decision;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/DecisionPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/DecisionPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createListenerPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Listener;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ListenerPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ListenerPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPartitionPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Partition;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/PartitionPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPartitionMapperPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/PartitionMapper;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/PartitionMapperPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/PartitionMapperPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPartitionPlanPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/PartitionPlan;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/PartitionPlanPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/PartitionPlanPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPartitionReducerPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/PartitionReducer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/PartitionReducerPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/PartitionReducerPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCheckpointAlgorithmPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/impl/CheckpointAlgorithmPropertyResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/CheckpointAlgorithmPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/CheckpointAlgorithmPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCollectorPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Collector;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/CollectorPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/CollectorPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAnalyzerPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/Analyzer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/AnalyzerPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/AnalyzerPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReaderPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ItemReader;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ItemReaderPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ItemReaderPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createProcessorPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ItemProcessor;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ItemProcessorPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ItemProcessorPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriterPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ItemWriter;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ItemWriterPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ItemWriterPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSkippableExceptionClassesPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ExceptionClassFilter;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRetryableExceptionClassesPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ExceptionClassFilter;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createNoRollbackExceptionClassesPropertyResolver", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver;", "(Z)Lorg/apache/batchee/container/modelresolver/PropertyResolver<Lorg/apache/batchee/jaxb/ExceptionClassFilter;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/modelresolver/impl/ExceptionClassesPropertyResolver", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
