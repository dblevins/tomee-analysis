package asm.org.eclipse.persistence.platform.database.oracle.dcn;
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
public class OracleChangeNotificationListener$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", null, "org/eclipse/persistence/descriptors/DescriptorEventAdapter", null);

classWriter.visitOuterClass("org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "initialize", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V");

classWriter.visitInnerClass("org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$rowIdQuery", "Lorg/eclipse/persistence/queries/ValueReadQuery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "val$index", "Lorg/eclipse/persistence/descriptors/CacheIndex;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/queries/ValueReadQuery;Lorg/eclipse/persistence/descriptors/CacheIndex;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$rowIdQuery", "Lorg/eclipse/persistence/queries/ValueReadQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$index", "Lorg/eclipse/persistence/descriptors/CacheIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/descriptors/DescriptorEventAdapter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postMerge", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getChangeSet", "()Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getChangeSet", "()Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/ObjectChangeSet", "hasChanges", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getChangeSet", "()Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/ObjectChangeSet", "getId", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getChangeSet", "()Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/ObjectChangeSet", "getActiveCacheKey", "()Lorg/eclipse/persistence/internal/identitymaps/CacheKey;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getParent", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getIdentityMapAccessorInstance", "()Lorg/eclipse/persistence/internal/sessions/IdentityMapAccessor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/IdentityMapAccessor", "getIdentityMapManager", "()Lorg/eclipse/persistence/internal/identitymaps/IdentityMapManager;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/IdentityMapManager", "getCacheKeyForObject", "(Ljava/lang/Object;Ljava/lang/Class;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)Lorg/eclipse/persistence/internal/identitymaps/CacheKey;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/eclipse/persistence/internal/identitymaps/CacheKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "ORA_TRANSACTION_ID", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/CacheKey", "setTransactionId", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getChangeSet", "()Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/ObjectChangeSet", "isNew", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getObjectBuilder", "()Lorg/eclipse/persistence/internal/descriptors/ObjectBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/ObjectBuilder", "buildRowFromPrimaryKeyValues", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/internal/sessions/AbstractRecord;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$rowIdQuery", "Lorg/eclipse/persistence/queries/ValueReadQuery;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "executeQuery", "(Lorg/eclipse/persistence/queries/DatabaseQuery;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/identitymaps/CacheId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/identitymaps/CacheId", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getParent", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getIdentityMapAccessorInstance", "()Lorg/eclipse/persistence/internal/sessions/IdentityMapAccessor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/IdentityMapAccessor", "getIdentityMapManager", "()Lorg/eclipse/persistence/internal/identitymaps/IdentityMapManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$index", "Lorg/eclipse/persistence/descriptors/CacheIndex;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "val$descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/identitymaps/IdentityMapManager", "putCacheKeyByIndex", "(Lorg/eclipse/persistence/descriptors/CacheIndex;Lorg/eclipse/persistence/internal/identitymaps/CacheId;Lorg/eclipse/persistence/internal/identitymaps/CacheKey;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postUpdate", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "ORA_TRANSACTION_ID", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener$2", "this$0", "Lorg/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "transactionIdQuery", "Lorg/eclipse/persistence/queries/ValueReadQuery;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "executeQuery", "(Lorg/eclipse/persistence/queries/DatabaseQuery;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/oracle/dcn/OracleChangeNotificationListener", "ORA_TRANSACTION_ID", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
