package asm.org.apache.batchee.container.services.persistence;
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
public class MemoryPersistenceManagerService$StructuresDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService", "Structures", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$StepExecutionInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "StepExecutionInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$ExecutionInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "ExecutionInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$JobInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "JobInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
