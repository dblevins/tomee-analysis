package asm.org.eclipse.persistence.internal.indirection;
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
public class BatchValueHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/indirection/BatchValueHolder", null, "org/eclipse/persistence/internal/indirection/QueryBasedValueHolder", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "originalQuery", "Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "parentCacheKey", "Lorg/eclipse/persistence/internal/identitymaps/CacheKey;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/queries/ReadQuery;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;Lorg/eclipse/persistence/internal/identitymaps/CacheKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ObjectLevelReadQuery", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/QueryBasedValueHolder", "<init>", "(Lorg/eclipse/persistence/queries/ReadQuery;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "originalQuery", "Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "parentCacheKey", "Lorg/eclipse/persistence/internal/identitymaps/CacheKey;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMapping", "()Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "instantiate", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/EclipseLinkException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "query", "Lorg/eclipse/persistence/queries/ReadQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "parentCacheKey", "Lorg/eclipse/persistence/internal/identitymaps/CacheKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "row", "Lorg/eclipse/persistence/internal/sessions/AbstractRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "originalQuery", "Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "extractResultFromBatchQuery", "(Lorg/eclipse/persistence/queries/ReadQuery;Lorg/eclipse/persistence/internal/identitymaps/CacheKey;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getBatchQueries", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "query", "Lorg/eclipse/persistence/queries/ReadQuery;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/ReadQuery");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "query", "Lorg/eclipse/persistence/queries/ReadQuery;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/queries/ReadQuery", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/queries/ReadQuery");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getBatchQueries", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "query", "Lorg/eclipse/persistence/queries/ReadQuery;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "org/eclipse/persistence/queries/ReadQuery"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "parentCacheKey", "Lorg/eclipse/persistence/internal/identitymaps/CacheKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "row", "Lorg/eclipse/persistence/internal/sessions/AbstractRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "originalQuery", "Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "extractResultFromBatchQuery", "(Lorg/eclipse/persistence/queries/ReadQuery;Lorg/eclipse/persistence/internal/identitymaps/CacheKey;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEasilyInstantiated", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "isInstantiated", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resetFields", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/QueryBasedValueHolder", "resetFields", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "originalQuery", "Lorg/eclipse/persistence/queries/ObjectLevelReadQuery;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setMapping", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/BatchValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
