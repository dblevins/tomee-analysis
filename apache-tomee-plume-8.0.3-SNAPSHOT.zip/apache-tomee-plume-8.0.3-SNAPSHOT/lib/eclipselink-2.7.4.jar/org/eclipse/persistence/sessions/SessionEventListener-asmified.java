package asm.org.eclipse.persistence.sessions;
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
public class SessionEventListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/sessions/SessionEventListener", null, "java/lang/Object", new String[] { "org/eclipse/persistence/core/sessions/CoreSessionEventListener" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "missingDescriptor", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "moreRowsDetected", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "noRowsModified", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "outputParametersDetected", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postAcquireClientSession", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postAcquireConnection", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postAcquireExclusiveConnection", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postAcquireUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postBeginTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preCalculateUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postCalculateUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postCommitTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postCommitUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postConnect", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postExecuteQuery", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postReleaseClientSession", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postReleaseUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postResumeUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postRollbackTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postDistributedMergeUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postMergeUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preBeginTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preCommitTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preCommitUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preExecuteQuery", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prepareUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preReleaseClientSession", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preReleaseConnection", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preReleaseExclusiveConnection", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preReleaseUnitOfWork", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preRollbackTransaction", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preDistributedMergeUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preMergeUnitOfWorkChangeSet", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preLogin", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postLogin", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preLogout", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postLogout", "(Lorg/eclipse/persistence/sessions/SessionEvent;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
