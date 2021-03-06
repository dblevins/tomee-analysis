package asm.org.apache.openejb.persistence;
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
public class QueryLogEntityManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/persistence/QueryLogEntityManager", null, "java/lang/Object", new String[] { "jakarta/persistence/EntityManager" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/persistence/EntityManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "level", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/persistence/EntityManager;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "level", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "persist", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "persist", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "merge", "(Ljava/lang/Object;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(TT;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "merge", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "remove", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljakarta/persistence/LockModeType;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;Ljakarta/persistence/LockModeType;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljakarta/persistence/LockModeType;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReference", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/Object;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getReference", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "flush", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlushMode", "(Ljakarta/persistence/FlushModeType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "setFlushMode", "(Ljakarta/persistence/FlushModeType;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlushMode", "()Ljakarta/persistence/FlushModeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getFlushMode", "()Ljakarta/persistence/FlushModeType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lock", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "lock", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lock", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)V", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "lock", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "refresh", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "refresh", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "refresh", "(Ljava/lang/Object;Ljava/util/Map;)V", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "refresh", "(Ljava/lang/Object;Ljava/util/Map;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "refresh", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "refresh", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "refresh", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)V", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "refresh", "(Ljava/lang/Object;Ljakarta/persistence/LockModeType;Ljava/util/Map;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "detach", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "detach", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLockMode", "(Ljava/lang/Object;)Ljakarta/persistence/LockModeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getLockMode", "(Ljava/lang/Object;)Ljakarta/persistence/LockModeType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperties", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getProperties", "()Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljakarta/persistence/criteria/CriteriaQuery;)Ljakarta/persistence/TypedQuery;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/CriteriaQuery<TT;>;)Ljakarta/persistence/TypedQuery<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/CriteriaLogQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createQuery", "(Ljakarta/persistence/criteria/CriteriaQuery;)Ljakarta/persistence/TypedQuery;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "level", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/CriteriaLogQuery", "<init>", "(Ljakarta/persistence/TypedQuery;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljakarta/persistence/criteria/CriteriaUpdate;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createQuery", "(Ljakarta/persistence/criteria/CriteriaUpdate;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljakarta/persistence/criteria/CriteriaDelete;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createQuery", "(Ljakarta/persistence/criteria/CriteriaDelete;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/TypedQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Ljakarta/persistence/TypedQuery<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNamedQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNamedQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNamedQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/TypedQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Ljakarta/persistence/TypedQuery<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNamedQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/TypedQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNativeQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNativeQuery", "(Ljava/lang/String;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNativeQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNativeQuery", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNativeQuery", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNativeQuery", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNamedStoredProcedureQuery", "(Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createNamedStoredProcedureQuery", "(Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStoredProcedureQuery", "(Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createStoredProcedureQuery", "(Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createStoredProcedureQuery", "(Ljava/lang/String;[Ljava/lang/Class;)Ljakarta/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createStoredProcedureQuery", "(Ljava/lang/String;[Ljava/lang/Class;)Ljakarta/persistence/StoredProcedureQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "createStoredProcedureQuery", "(Ljava/lang/String;[Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createStoredProcedureQuery", "(Ljava/lang/String;[Ljava/lang/String;)Ljakarta/persistence/StoredProcedureQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "joinTransaction", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "joinTransaction", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isJoinedToTransaction", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "isJoinedToTransaction", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getDelegate", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOpen", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "isOpen", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransaction", "()Ljakarta/persistence/EntityTransaction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getTransaction", "()Ljakarta/persistence/EntityTransaction;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityManagerFactory", "()Ljakarta/persistence/EntityManagerFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getEntityManagerFactory", "()Ljakarta/persistence/EntityManagerFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCriteriaBuilder", "()Ljakarta/persistence/criteria/CriteriaBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getCriteriaBuilder", "()Ljakarta/persistence/criteria/CriteriaBuilder;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetamodel", "()Ljakarta/persistence/metamodel/Metamodel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getMetamodel", "()Ljakarta/persistence/metamodel/Metamodel;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityGraph", "(Ljava/lang/Class;)Ljakarta/persistence/EntityGraph;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/EntityGraph<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createEntityGraph", "(Ljava/lang/Class;)Ljakarta/persistence/EntityGraph;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityGraph", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph;", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "createEntityGraph", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityGraph", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph;", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getEntityGraph", "(Ljava/lang/String;)Ljakarta/persistence/EntityGraph;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityGraphs", "(Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<Ljakarta/persistence/EntityGraph<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/QueryLogEntityManager", "delegate", "Ljakarta/persistence/EntityManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/EntityManager", "getEntityGraphs", "(Ljava/lang/Class;)Ljava/util/List;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
