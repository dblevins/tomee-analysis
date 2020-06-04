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
public class QueryHintsHandler$HintDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", null, "java/lang/Object", null);

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
fieldVisitor = classWriter.visitField(ACC_STATIC, "mainMap", "Ljava/util/HashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "valueArray", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "valueMap", "Ljava/util/HashMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "defaultValue", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "defaultValueToApply", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "valueToApplyMayBeNull", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "mainMap", "Ljava/util/HashMap;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BindParametersHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BindParametersHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheUsageHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheUsageHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeLegacyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheRetrieveModeLegacyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeLegacyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStoreModeLegacyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockScope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockScope", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockTimeoutHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PessimisticLockTimeoutHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$RefreshHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$RefreshHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CascadePolicyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CascadePolicyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LeftFetchHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LeftFetchHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReadOnlyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReadOnlyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCTimeoutHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCTimeoutHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutUnitHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutUnitHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryTimeoutHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFetchSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFetchSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCMaxRowsHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCMaxRowsHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFirstResultHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$JDBCFirstResultHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultCollectionTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultCollectionTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$RedirectorHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$RedirectorHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PartitioningHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PartitioningHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryTimeOfDayHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheExpiryTimeOfDayHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$MaintainCacheHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$MaintainCacheHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PrepareHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$PrepareHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStatementHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CacheStatementHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FlushHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FlushHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$HintHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$HintHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$NativeConnectionHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$NativeConnectionHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorInitialSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorInitialSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorPageSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorPageSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ScrollableCursorHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ScrollableCursorHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorSizeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CursorSizeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGraphHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGraphHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupNameHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupNameHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupDefaultHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupDefaultHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupAttributeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupAttributeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupLoadHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$FetchGroupLoadHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupAttributeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGroupAttributeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGraphHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$LoadGraphHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ExclusiveHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ExclusiveHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$InheritanceJoinHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$InheritanceJoinHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfSCNHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AsOfSCNHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetConcurrencyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetConcurrencyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$IndirectionPolicyHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$IndirectionPolicyHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheTypeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheTypeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheIgnoreNullHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheIgnoreNullHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheInvalidateOnChangeHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheInvalidateOnChangeHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheRandomizedExpiryHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$QueryCacheRandomizedExpiryHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ParameterDelimiterHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ParameterDelimiterHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CompositeMemberHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$CompositeMemberHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AllowNativeSQLQueryHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$AllowNativeSQLQueryHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchWriteHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$BatchWriteHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ResultSetAccess", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$SerializedObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$SerializedObject", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReturnNameValuePairsHint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$ReturnNameValuePairsHint", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "defaultValue", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "applyToDatabaseQuery", "(Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "verify", "(Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "mainMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("query");
methodVisitor.visitLdcInsn("unknown_query_hint");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "log", "(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "verify", "(Ljava/lang/Object;ZLjava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "verify", "(Ljava/lang/Object;ZLjava/lang/String;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "defaultValue", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("query");
methodVisitor.visitLdcInsn("query_hint");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "log", "(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getUpperCaseString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ejb30-wrong-query-hint-value");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "apply", "(Ljava/lang/String;ZLjava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "mainMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("eclipselink.query.hints");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "getProperty", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("eclipselink.query.hints");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "setProperty", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "apply", "(Ljava/lang/Object;ZLorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "apply", "(Ljava/lang/Object;ZLorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "defaultValueToApply", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getUpperCaseString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueToApplyMayBeNull", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "containsKey", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_0);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ejb30-wrong-query-hint-value");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getQueryId", "(Lorg/eclipse/persistence/queries/DatabaseQuery;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "applyToDatabaseQuery", "(Ljava/lang/Object;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/queries/DatabaseQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getQueryId", "(Lorg/eclipse/persistence/queries/DatabaseQuery;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/DatabaseQuery", "getEJBQLString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getPrintValue", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("null");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getUpperCaseString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "loadClass", "(Ljava/lang/String;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/ClassLoader;)Ljava/lang/Class;", null, new String[] { "org/eclipse/persistence/exceptions/QueryException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/PrivilegedActionException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label1, label4, "java/lang/ClassNotFoundException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label4, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedClassForName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedClassForName", "<init>", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/QueryException", "classNotFoundWhileUsingQueryHint", "(Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/Object;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/QueryException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/QueryException", "classNotFoundWhileUsingQueryHint", "(Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/Object;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/QueryException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "newInstance", "(Ljava/lang/Class;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/security/PrivilegedNewInstanceFromClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/security/PrivilegedNewInstanceFromClass", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "newInstanceFromClass", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/QueryException", "errorInstantiatedClassForQueryHint", "(Ljava/lang/Exception;Lorg/eclipse/persistence/queries/DatabaseQuery;Ljava/lang/Class;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/QueryException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "[[Ljava/lang/Object;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "[[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[[Ljava/lang/Object;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getUpperCaseString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueToApplyMayBeNull", "Z");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "getUpperCaseString", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueToApplyMayBeNull", "Z");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "valueMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "defaultValue", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "defaultValueToApply", "Ljava/lang/Object;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "addHint", "(Lorg/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "initialize", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "mainMap", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getSupportedHints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/QueryHintsHandler$Hint", "mainMap", "Ljava/util/HashMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "keySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
