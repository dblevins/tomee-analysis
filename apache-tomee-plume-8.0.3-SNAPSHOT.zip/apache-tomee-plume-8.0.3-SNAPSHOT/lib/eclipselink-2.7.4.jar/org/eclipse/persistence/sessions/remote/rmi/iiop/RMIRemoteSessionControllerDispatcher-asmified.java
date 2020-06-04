package asm.org.eclipse.persistence.sessions.remote.rmi.iiop;
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
public class RMIRemoteSessionControllerDispatcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", null, "javax/rmi/PortableRemoteObject", new String[] { "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionController" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "controller", "Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/rmi/PortableRemoteObject", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "<init>", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "controller", "Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/Session;)V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/AbstractSession");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "<init>", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processCommand", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "processCommand", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginEarlyTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "beginEarlyTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "beginTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitRootUnitOfWork", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "commitRootUnitOfWork", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "commitTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cursoredStreamClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "cursoredStreamClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cursoredStreamNextPage", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "cursoredStreamNextpage", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cursoredStreamSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "cursoredStreamSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cursorSelectObjects", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "cursorSelectObjects", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeNamedQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "executeNamedQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "executeQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "controller", "Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptor", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "getDescriptor", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptorForAlias", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "getDescriptorForAlias", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultReadOnlyClasses", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "getDefaultReadOnlyClasses", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogin", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "getLogin", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSequenceNumberNamed", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "getSequenceNumberNamed", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializeIdentityMapsOnServerSession", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "initializeIdentityMapsOnServerSession", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateRemoteValueHolderOnServer", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "instantiateRemoteValueHolderOnServer", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "rollbackTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorAbsolute", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorAbsolute", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorCurrentIndex", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorCurrentIndex", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorIsAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorIsAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorIsBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorIsBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorIsFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorIsFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorIsLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorIsLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorNextObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorNextObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorPreviousObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorPreviousObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorRelative", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorRelative", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "scrollableCursorSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "getController", "()Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/remote/RemoteSessionController", "scrollableCursorSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setController", "(Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionControllerDispatcher", "controller", "Lorg/eclipse/persistence/internal/sessions/remote/RemoteSessionController;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
