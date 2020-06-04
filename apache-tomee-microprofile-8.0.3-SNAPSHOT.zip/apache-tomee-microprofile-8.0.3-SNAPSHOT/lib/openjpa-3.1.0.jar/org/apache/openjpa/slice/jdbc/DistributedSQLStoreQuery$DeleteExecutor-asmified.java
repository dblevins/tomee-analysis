package asm.org.apache.openjpa.slice.jdbc;
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
public class DistributedSQLStoreQuery$DeleteExecutorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Number;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/kernel/StoreQuery", "Executor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery", "DeleteExecutor", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "query", "Lorg/apache/openjpa/kernel/StoreQuery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "executor", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "params", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/lang/Number;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "executor", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "params", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "executeDelete", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$DeleteExecutor", "call", "()Ljava/lang/Number;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
