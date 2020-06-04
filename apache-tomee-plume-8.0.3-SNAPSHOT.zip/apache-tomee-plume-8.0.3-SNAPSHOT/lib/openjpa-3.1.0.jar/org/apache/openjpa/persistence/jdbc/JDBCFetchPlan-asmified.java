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
public class JDBCFetchPlanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", null, "java/lang/Object", new String[] { "org/apache/openjpa/persistence/FetchPlan" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "EAGER_NONE", "I", null, new Integer(0));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "EAGER_JOIN", "I", null, new Integer(1));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "EAGER_PARALLEL", "I", null, new Integer(2));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SIZE_UNKNOWN", "I", null, new Integer(0));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SIZE_LAST", "I", null, new Integer(1));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SIZE_QUERY", "I", null, new Integer(2));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SYNTAX_SQL92", "I", null, new Integer(0));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SYNTAX_TRADITIONAL", "I", null, new Integer(1));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SYNTAX_DATABASE", "I", null, new Integer(2));
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEagerFetchMode", "()Lorg/apache/openjpa/persistence/jdbc/FetchMode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEagerFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSubclassFetchMode", "()Lorg/apache/openjpa/persistence/jdbc/FetchMode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSubclassFetchMode", "(Lorg/apache/openjpa/persistence/jdbc/FetchMode;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultSetType", "()Lorg/apache/openjpa/persistence/jdbc/ResultSetType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setResultSetType", "(Lorg/apache/openjpa/persistence/jdbc/ResultSetType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFetchDirection", "()Lorg/apache/openjpa/persistence/jdbc/FetchDirection;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFetchDirection", "(Lorg/apache/openjpa/persistence/jdbc/FetchDirection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLRSSizeAlgorithm", "()Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLRSSizeAlgorithm", "(Lorg/apache/openjpa/persistence/jdbc/LRSSizeAlgorithm;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoinSyntax", "()Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJoinSyntax", "(Lorg/apache/openjpa/persistence/jdbc/JoinSyntax;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIsolation", "()Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIsolation", "(Lorg/apache/openjpa/persistence/jdbc/IsolationLevel;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearFields", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resetFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setEagerFetchMode", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setSubclassFetchMode", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setResultSetType", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setFetchDirection", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getLRSSize", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setLRSSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setJoinSyntax", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIgnoreDfgForFkSelect", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIgnoreDfgForFkSelect", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setWriteLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setReadLockMode", "(Ljakarta/persistence/LockModeType;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setQueryTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setLockTimeout", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clearFields", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "clearFields", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFields", "(Ljava/lang/Class;Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFields", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFields", "(Ljava/lang/Class;[Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFields", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addField", "(Ljava/lang/Class;Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addField", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resetFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "resetFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clearFetchGroups", "()Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "clearFetchGroups", "()Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "removeFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFetchGroups", "(Ljava/util/Collection;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFetchGroups", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "addFetchGroup", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setQueryResultCacheEnabled", "(Z)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setFetchBatchSize", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/FetchPlan;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/persistence/jdbc/JDBCFetchPlan", "setMaxFetchDepth", "(I)Lorg/apache/openjpa/persistence/jdbc/JDBCFetchPlan;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
