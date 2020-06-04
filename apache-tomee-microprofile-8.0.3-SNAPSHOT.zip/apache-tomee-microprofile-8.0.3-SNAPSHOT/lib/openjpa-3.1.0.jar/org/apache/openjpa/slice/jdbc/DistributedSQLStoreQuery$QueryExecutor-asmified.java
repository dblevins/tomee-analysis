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
public class DistributedSQLStoreQuery$QueryExecutorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lorg/apache/openjpa/lib/rop/ResultObjectProvider;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/kernel/StoreQuery", "Executor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/kernel/StoreQuery", "Range", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery", "QueryExecutor", ACC_STATIC);

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
fieldVisitor = classWriter.visitField(0, "range", "Lorg/apache/openjpa/kernel/StoreQuery$Range;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "executor", "Lorg/apache/openjpa/kernel/StoreQuery$Executor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "query", "Lorg/apache/openjpa/kernel/StoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "params", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "range", "Lorg/apache/openjpa/kernel/StoreQuery$Range;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", "executeQuery", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/DistributedSQLStoreQuery$QueryExecutor", "call", "()Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
