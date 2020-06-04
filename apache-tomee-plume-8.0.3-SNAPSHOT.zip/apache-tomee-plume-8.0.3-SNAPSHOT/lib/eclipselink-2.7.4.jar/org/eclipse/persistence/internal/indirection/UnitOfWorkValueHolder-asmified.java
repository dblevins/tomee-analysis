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
public class UnitOfWorkValueHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", null, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", new String[] { "org/eclipse/persistence/internal/indirection/WrappingValueHolder" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "backupValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "sourceObject", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "relationshipSourceObject", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "sourceAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "wrappedValueHolderRemoteID", "Ljava/rmi/server/ObjID;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/indirection/ValueHolderInterface;Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "relationshipSourceObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "isRemoteUnitOfWork", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/sessions/remote/RemoteValueHolder");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/remote/RemoteValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteValueHolder", "getID", "()Ljava/rmi/server/ObjID;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolderRemoteID", "Ljava/rmi/server/ObjID;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "org/eclipse/persistence/indirection/ValueHolderInterface", "java/lang/Object", "org/eclipse/persistence/mappings/DatabaseMapping", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceObject", "Ljava/lang/Object;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "buildBackupCloneFor", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildCloneFor", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getBackupValueHolder", "()Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "backupValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRemoteUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSourceAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSourceObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRelationshipSourceObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "relationshipSourceObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValueFromServerObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getRemoteUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "setSession", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSourceObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getId", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getParent", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getIdentityMapAccessor", "()Lorg/eclipse/persistence/sessions/IdentityMapAccessor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSourceObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/IdentityMapAccessor", "getFromIdentityMap", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getParent", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSourceObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "readObject", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getDescriptor", "(Ljava/lang/Object;)Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getObjectBuilder", "()Lorg/eclipse/persistence/internal/descriptors/ObjectBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSourceAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/ObjectBuilder", "getMappingForAttributeName", "(Ljava/lang/String;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getRealAttributeValueFromObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "instantiateImpl", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isEasilyInstantiated", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isPessimisticLockingValueHolder", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getCommitManager", "()Lorg/eclipse/persistence/internal/sessions/CommitManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/CommitManager", "isActive", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "wasTransactionBegunPrematurely", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "beginEarlyTransaction", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/indirection/ValueHolderInterface", "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("transaction");
methodVisitor.visitLdcInsn("instantiate_pl_relationship");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "log", "(ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getCommitManager", "()Lorg/eclipse/persistence/internal/sessions/CommitManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/CommitManager", "isActive", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "wasTransactionBegunPrematurely", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isInstantiated", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "getValue", "(Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/ValueHolderInterface", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "buildCloneFor", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEasilyInstantiated", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "isInstantiated", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isEasilyInstantiated", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPessimisticLockingValueHolder", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/DatabaseValueHolder", "isPessimisticLockingValueHolder", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappedValueHolder", "()Lorg/eclipse/persistence/indirection/ValueHolderInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrappedValueHolderRemoteID", "()Ljava/rmi/server/ObjID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolderRemoteID", "Ljava/rmi/server/ObjID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSerializedRemoteUnitOfWorkValueHolder", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getParent", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "instantiate", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "isSerializedRemoteUnitOfWorkValueHolder", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getValueFromServerObject", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "buildCloneFor", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "getUnitOfWork", "()Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "instantiatingValueholderWithNullSession", "()Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "instantiateImpl", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", Opcodes.TOP, "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "backupValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "backupValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "buildBackupCloneFor", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/ValueHolderInterface", "setValue", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateForUnitOfWorkValueHolder", "(Lorg/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "instantiate", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "releaseWrappedValueHolder", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resetFields", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBackupValueHolder", "(Lorg/eclipse/persistence/indirection/ValueHolderInterface;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "backupValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setRemoteUnitOfWork", "(Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "remoteUnitOfWork", "Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setSourceAttributeName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setSourceObject", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "sourceObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setRelationshipSourceObject", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "relationshipSourceObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setWrappedValueHolder", "(Lorg/eclipse/persistence/internal/indirection/DatabaseValueHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldAllowInstantiationDeferral", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/indirection/UnitOfWorkValueHolder", "wrappedValueHolder", "Lorg/eclipse/persistence/indirection/ValueHolderInterface;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/indirection/WeavedAttributeValueHolderInterface");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/indirection/WeavedAttributeValueHolderInterface", "shouldAllowInstantiationDeferral", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
