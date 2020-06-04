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
public class DistributedJDBCStoreManager$FlusherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/util/Collection;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitInnerClass("org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$StateManagerSet", "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager", "StateManagerSet", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager", "Flusher", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "store", "Lorg/apache/openjpa/slice/jdbc/SliceStoreManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "toFlush", "Lorg/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$StateManagerSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/slice/jdbc/SliceStoreManager;Lorg/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$StateManagerSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "store", "Lorg/apache/openjpa/slice/jdbc/SliceStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "toFlush", "Lorg/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$StateManagerSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/util/Collection;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "store", "Lorg/apache/openjpa/slice/jdbc/SliceStoreManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "toFlush", "Lorg/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$StateManagerSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/SliceStoreManager", "flush", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/DistributedJDBCStoreManager$Flusher", "call", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
