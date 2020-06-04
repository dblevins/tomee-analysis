package asm.org.apache.openjpa.kernel;
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
public class DelegatingStoreManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/kernel/DelegatingStoreManager", null, "java/lang/Object", new String[] { "org/apache/openjpa/kernel/StoreManager" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_store", "Lorg/apache/openjpa/kernel/StoreManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_del", "Lorg/apache/openjpa/kernel/DelegatingStoreManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/StoreManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/DelegatingStoreManager");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/DelegatingStoreManager");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_del", "Lorg/apache/openjpa/kernel/DelegatingStoreManager;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/kernel/DelegatingStoreManager", "org/apache/openjpa/kernel/StoreManager"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_del", "Lorg/apache/openjpa/kernel/DelegatingStoreManager;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInnermostDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_del", "Lorg/apache/openjpa/kernel/DelegatingStoreManager;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_del", "Lorg/apache/openjpa/kernel/DelegatingStoreManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/DelegatingStoreManager", "getInnermostDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/kernel/StoreManager"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/DelegatingStoreManager", "getInnermostDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/kernel/DelegatingStoreManager");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/DelegatingStoreManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/DelegatingStoreManager", "getInnermostDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/DelegatingStoreManager", "getInnermostDelegate", "()Lorg/apache/openjpa/kernel/StoreManager;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContext", "(Lorg/apache/openjpa/kernel/StoreContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "setContext", "(Lorg/apache/openjpa/kernel/StoreContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginOptimistic", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "beginOptimistic", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackOptimistic", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "rollbackOptimistic", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "begin", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "commit", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "rollback", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "exists", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "exists", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "syncVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "syncVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/kernel/PCState;Lorg/apache/openjpa/kernel/FetchConfiguration;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "initialize", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/kernel/PCState;Lorg/apache/openjpa/kernel/FetchConfiguration;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/util/BitSet;Lorg/apache/openjpa/kernel/FetchConfiguration;ILjava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/util/BitSet;Lorg/apache/openjpa/kernel/FetchConfiguration;ILjava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadAll", "(Ljava/util/Collection;Lorg/apache/openjpa/kernel/PCState;ILorg/apache/openjpa/kernel/FetchConfiguration;Ljava/lang/Object;)Ljava/util/Collection;", "(Ljava/util/Collection<Lorg/apache/openjpa/kernel/OpenJPAStateManager;>;Lorg/apache/openjpa/kernel/PCState;ILorg/apache/openjpa/kernel/FetchConfiguration;Ljava/lang/Object;)Ljava/util/Collection<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "loadAll", "(Ljava/util/Collection;Lorg/apache/openjpa/kernel/PCState;ILorg/apache/openjpa/kernel/FetchConfiguration;Ljava/lang/Object;)Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeStateChange", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/kernel/PCState;Lorg/apache/openjpa/kernel/PCState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "beforeStateChange", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/kernel/PCState;Lorg/apache/openjpa/kernel/PCState;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "(Ljava/util/Collection;)Ljava/util/Collection;", "(Ljava/util/Collection<Lorg/apache/openjpa/kernel/OpenJPAStateManager;>;)Ljava/util/Collection<Ljava/lang/Exception;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "flush", "(Ljava/util/Collection;)Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "assignObjectId", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "assignObjectId", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Z)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "assignField", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;IZ)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "assignField", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;IZ)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedType", "(Ljava/lang/Object;)Ljava/lang/Class;", "(Ljava/lang/Object;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "getManagedType", "(Ljava/lang/Object;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStoreIdType", "(Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Class;", "(Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "getDataStoreIdType", "(Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyDataStoreId", "(Ljava/lang/Object;Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "copyDataStoreId", "(Ljava/lang/Object;Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newDataStoreId", "(Ljava/lang/Object;Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "newDataStoreId", "(Ljava/lang/Object;Lorg/apache/openjpa/meta/ClassMetaData;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientConnection", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "getClientConnection", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retainConnection", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "retainConnection", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "releaseConnection", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "releaseConnection", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeExtent", "(Lorg/apache/openjpa/meta/ClassMetaData;ZLorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "executeExtent", "(Lorg/apache/openjpa/meta/ClassMetaData;ZLorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newQuery", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/StoreQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "newQuery", "(Ljava/lang/String;)Lorg/apache/openjpa/kernel/StoreQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "newFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "compareVersion", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/lang/Object;Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataStoreIdSequence", "(Lorg/apache/openjpa/meta/ClassMetaData;)Lorg/apache/openjpa/kernel/Seq;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "getDataStoreIdSequence", "(Lorg/apache/openjpa/meta/ClassMetaData;)Lorg/apache/openjpa/kernel/Seq;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueSequence", "(Lorg/apache/openjpa/meta/FieldMetaData;)Lorg/apache/openjpa/kernel/Seq;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "getValueSequence", "(Lorg/apache/openjpa/meta/FieldMetaData;)Lorg/apache/openjpa/kernel/Seq;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancelAll", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "cancelAll", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCached", "(Ljava/util/List;Ljava/util/BitSet;)Z", "(Ljava/util/List<Ljava/lang/Object;>;Ljava/util/BitSet;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/DelegatingStoreManager", "_store", "Lorg/apache/openjpa/kernel/StoreManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/StoreManager", "isCached", "(Ljava/util/List;Ljava/util/BitSet;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
