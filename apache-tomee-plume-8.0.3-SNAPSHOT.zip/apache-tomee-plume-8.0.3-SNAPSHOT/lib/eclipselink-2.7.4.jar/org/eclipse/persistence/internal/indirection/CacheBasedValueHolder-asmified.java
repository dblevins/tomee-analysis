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
public class CacheBasedValueHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", null, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "references", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "shouldAllowInstantiationDeferral", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "shouldAllowInstantiationDeferral", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "row", "Lorg/eclipse/persistence/internal/sessions/AbstractRecord;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCachedPKs", "()[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "isCollectionMapping", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getIdentityMapAccessorInstance", "()Lorg/eclipse/persistence/internal/sessions/IdentityMapAccessor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "getReferenceDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/IdentityMapAccessor", "getAllFromIdentityMapWithEntityPK", "([Ljava/lang/Object;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/queries/ContainerPolicy;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ContainerPolicy", "containerInstance", "(I)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "java/util/Collection", "org/eclipse/persistence/internal/queries/ContainerPolicy", "java/lang/Object", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ContainerPolicy", "addInto", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getIdentityMapAccessorInstance", "()Lorg/eclipse/persistence/internal/sessions/IdentityMapAccessor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "getReferenceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/IdentityMapAccessor", "getFromIdentityMap", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "instantiate", "()Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "instantiate", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "instantiate", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "instantiatingValueholderWithNullSession", "()Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "references", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "row", "Lorg/eclipse/persistence/internal/sessions/AbstractRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ForeignReferenceMapping", "valueFromPKList", "([Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "instantiate", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPessimisticLockingValueHolder", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setShouldAllowInstantiationDeferral", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "shouldAllowInstantiationDeferral", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldAllowInstantiationDeferral", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/CacheBasedValueHolder", "shouldAllowInstantiationDeferral", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
