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
public class MemoryPersistenceManagerService$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$1", "Ljava/util/concurrent/CopyOnWriteArrayList<Ljavax/batch/runtime/BatchStatus;>;", "java/util/concurrent/CopyOnWriteArrayList", null);

classWriter.visitOuterClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService", null, null);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STOPPING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
