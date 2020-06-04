package asm.org.eclipse.persistence.internal.jpa;
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
public class QueryHintsHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$AllowNativeSQLQueryHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "AllowNativeSQLQueryHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "AsOfHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfSCNHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "AsOfSCNHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "BatchHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "BatchSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "BatchTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchWriteHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "BatchWriteHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$BindParametersHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "BindParametersHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheRetrieveModeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeLegacyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheRetrieveModeLegacyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStatementHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheStatementHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheStoreModeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeLegacyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheStoreModeLegacyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheUsageHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CacheUsageHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CascadePolicyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CascadePolicyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CompositeMemberHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CompositeMemberHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CursorHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorInitialSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CursorInitialSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorPageSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CursorPageSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "CursorSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ExclusiveHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ExclusiveHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGraphHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGraphHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupAttributeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGroupAttributeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupDefaultHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGroupDefaultHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGroupHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupLoadHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGroupLoadHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupNameHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchGroupNameHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FetchHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$FlushHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "FlushHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "Hint", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$HintHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "HintHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$IndirectionPolicyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "IndirectionPolicyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$InheritanceJoinHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "InheritanceJoinHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFetchSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "JDBCFetchSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFirstResultHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "JDBCFirstResultHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCMaxRowsHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "JDBCMaxRowsHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCTimeoutHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "JDBCTimeoutHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$LeftFetchHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "LeftFetchHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGraphHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "LoadGraphHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupAttributeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "LoadGroupAttributeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "LoadGroupHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$MaintainCacheHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "MaintainCacheHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$NativeConnectionHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "NativeConnectionHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ParameterDelimiterHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ParameterDelimiterHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$PartitioningHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "PartitioningHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "PessimisticLockHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockScope", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "PessimisticLockScope", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockTimeoutHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "PessimisticLockTimeoutHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$PrepareHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "PrepareHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheExpiryHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryTimeOfDayHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheExpiryTimeOfDayHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheIgnoreNullHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheIgnoreNullHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheInvalidateOnChangeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheInvalidateOnChangeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheRandomizedExpiryHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheRandomizedExpiryHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheSizeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheSizeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryCacheTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryTimeoutHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutUnitHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryTimeoutUnitHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "QueryTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReadOnlyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ReadOnlyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$RedirectorHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "RedirectorHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$RefreshHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "RefreshHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultCollectionTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ResultCollectionTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetAccess", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ResultSetAccess", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetConcurrencyHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ResultSetConcurrencyHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ResultSetTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultTypeHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ResultTypeHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReturnNameValuePairsHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ReturnNameValuePairsHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$ScrollableCursorHint", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "ScrollableCursorHint", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/QueryHintsHandler$SerializedObject", "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "SerializedObject", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_HINT_PROPERTY", "Ljava/lang/String;", null, "eclipselink.query.hints");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "verify", "(Ljava/util/Map;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "verify", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "verify", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "shouldUseDefault", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "verify", "(Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "apply", "(Ljava/util/Map;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/Map", "org/eclipse/persistence/queries/DatabaseQuery", "java/lang/ClassLoader", "org/eclipse/persistence/internal/sessions/AbstractSession", "org/eclipse/persistence/queries/DatabaseQuery", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(INSTANCEOF, "[Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"java/util/Map", "org/eclipse/persistence/queries/DatabaseQuery", "java/lang/ClassLoader", "org/eclipse/persistence/internal/sessions/AbstractSession", "org/eclipse/persistence/queries/DatabaseQuery", "java/util/Map$Entry", "java/util/Iterator", "java/lang/String", "[Ljava/lang/Object;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "apply", "(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "apply", "(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/util/Map", "org/eclipse/persistence/queries/DatabaseQuery", "java/lang/ClassLoader", "org/eclipse/persistence/internal/sessions/AbstractSession", "org/eclipse/persistence/queries/DatabaseQuery", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "apply", "(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler", "shouldUseDefault", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "apply", "(Ljava/lang/String;ZLjava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseBooleanHint", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseIntegerHint", "(Ljava/lang/Object;Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NumberFormatException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NumberFormatException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/QueryException", "queryHintContainedInvalidIntegerValue", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/QueryException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "shouldUseDefault", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSupportedHints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getSupportedHints", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
