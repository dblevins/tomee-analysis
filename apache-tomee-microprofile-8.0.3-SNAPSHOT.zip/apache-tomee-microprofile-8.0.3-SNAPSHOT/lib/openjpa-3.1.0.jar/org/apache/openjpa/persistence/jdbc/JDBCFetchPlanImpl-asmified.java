package asm.org.apache.openjpa.persistence.jdbc;
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
public class JDBCFetchPlanImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", null, "org/apache/openjpa/persistence/FetchPlanImpl", new String[] { "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/HintValueConverter$StringToInteger", "org/apache/openjpa/persistence/HintValueConverter", "StringToInteger", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/HintValueConverter$EnumToInteger", "org/apache/openjpa/persistence/HintValueConverter", "EnumToInteger", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger", "org/apache/openjpa/persistence/HintValueConverter", "OpenJPAEnumToInteger", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/FetchConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "<init>", "(Lorg/apache/openjpa/kernel/FetchConfiguration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newDelegatingFetchConfiguration", "(Lorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/kernel/DelegatingFetchConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/PersistenceExceptions", "TRANSLATOR", "Lorg/apache/openjpa/util/RuntimeExceptionTranslator;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "<init>", "(Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/util/RuntimeExceptionTranslator;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEagerFetchMode", "()Lorg/apache/openjpa/persistence/jdbc/FetchMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getEagerFetchMode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/FetchMode", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/FetchMode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEagerFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/FetchMode", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setEagerFetchMode", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEagerFetchMode", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setEagerFetchMode", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubclassFetchMode", "()Lorg/apache/openjpa/persistence/jdbc/FetchMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getSubclassFetchMode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/FetchMode", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/FetchMode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSubclassFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/FetchMode", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setSubclassFetchMode", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSubclassFetchMode", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setSubclassFetchMode", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResultSetType", "()Lorg/apache/openjpa/persistence/jdbc/ResultSetType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getResultSetType", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/ResultSetType", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/ResultSetType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResultSetType", "(Lorg/apache/openjpa/persistence/jdbc/ResultSetType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/ResultSetType", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setResultSetType", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResultSetType", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setResultSetType", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetchDirection", "()Lorg/apache/openjpa/persistence/jdbc/FetchDirection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getFetchDirection", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/FetchDirection", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/FetchDirection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchDirection", "(Lorg/apache/openjpa/persistence/jdbc/FetchDirection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/FetchDirection", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setFetchDirection", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchDirection", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setFetchDirection", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLRSSizeAlgorithm", "()Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getLRSSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLRSSizeAlgorithm", "(Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setLRSSize", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLRSSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getLRSSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLRSSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setLRSSize", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoinSyntax", "()Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getJoinSyntax", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JoinSyntax", "fromKernelConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJoinSyntax", "(Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JoinSyntax", "toKernelConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setJoinSyntax", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJoinSyntax", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setJoinSyntax", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIsolation", "()Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getIsolation", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/IsolationLevel", "fromConnectionConstant", "(I)Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIsolation", "(Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/IsolationLevel", "getConnectionConstant", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setIsolation", "(I)Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "clearFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearFields", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "clearFields", "()Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "resetFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/FetchPlanImpl", "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIgnoreDfgForFkSelect", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "getIgnoreDfgForFkSelect", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIgnoreDfgForFkSelect", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "_fetch", "Lorg/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/kernel/DelegatingJDBCFetchConfiguration", "setIgnoreDfgForFkSelect", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clearFields", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "clearFields", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resetFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "resetFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clearFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "clearFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setJoinSyntax", "(Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setJoinSyntax", "(Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setLRSSizeAlgorithm", "(Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setLRSSizeAlgorithm", "(Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFetchDirection", "(Lorg/apache/openjpa/persistence/jdbc/FetchDirection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setFetchDirection", "(Lorg/apache/openjpa/persistence/jdbc/FetchDirection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setResultSetType", "(Lorg/apache/openjpa/persistence/jdbc/ResultSetType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setResultSetType", "(Lorg/apache/openjpa/persistence/jdbc/ResultSetType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setSubclassFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setSubclassFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setEagerFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "setEagerFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.EagerFetchMode");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.EagerFetchMode");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("0");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("join");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("parallel");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("2");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger", "<init>", "([Ljava/lang/String;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/FetchMode;"));
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger", "<init>", "(Ljava/lang/Class;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.JoinSyntax");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.JoinSyntax");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.JoinSyntax");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;"));
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger", "<init>", "(Ljava/lang/Class;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("sql92");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("0");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("traditional");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("database");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("2");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger", "<init>", "([Ljava/lang/String;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchDirection");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.FetchDirection");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.FetchDirection");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/jdbc/FetchDirection;"));
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 1001);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(SIPUSH, 1002);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$EnumToInteger", "<init>", "(Ljava/lang/Class;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("forward");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("reverse");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(SIPUSH, 1001);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("unknown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 1002);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(SIPUSH, 1001);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(SIPUSH, 1001);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 1002);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 1002);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$StringToInteger", "<init>", "([Ljava/lang/String;[I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.Isolation");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.TransactionIsolation");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/IsolationLevel", "DEFAULT", "Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger", "<init>", "(Lorg/apache/openjpa/persistence/OpenJPAEnum;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.LRSSizeAlgorithm");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.LRSSize");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("openjpa.jdbc.LRSSize");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm", "QUERY", "Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger", "<init>", "(Lorg/apache/openjpa/persistence/OpenJPAEnum;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.ResultSetType");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.ResultSetType");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/ResultSetType", "FORWARD_ONLY", "Lorg/apache/openjpa/persistence/jdbc/ResultSetType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger", "<init>", "(Lorg/apache/openjpa/persistence/OpenJPAEnum;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("openjpa.FetchPlan.SubclassFetchMode");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("openjpa.jdbc.SubclassFetchMode");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/HintValueConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/jdbc/FetchMode", "NONE", "Lorg/apache/openjpa/persistence/jdbc/FetchMode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/HintValueConverter$OpenJPAEnumToInteger", "<init>", "(Lorg/apache/openjpa/persistence/OpenJPAEnum;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlanImpl", "registerHint", "([Ljava/lang/String;[Lorg/apache/openjpa/persistence/HintValueConverter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
