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
public class RMIRemoteSessionControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/sessions/remote/rmi/iiop/RMIRemoteSessionController", null, "java/lang/Object", new String[] { "java/rmi/Remote" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processCommand", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginEarlyTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commitRootUnitOfWork", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commitTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cursoredStreamClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cursoredStreamNextPage", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cursoredStreamSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cursorSelectObjects", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeNamedQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeQuery", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultReadOnlyClasses", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDescriptor", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDescriptorForAlias", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLogin", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSequenceNumberNamed", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initializeIdentityMapsOnServerSession", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "instantiateRemoteValueHolderOnServer", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rollbackTransaction", "()Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorAbsolute", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorClose", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorCurrentIndex", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorIsAfterLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorIsBeforeFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorIsFirst", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorIsLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorLast", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorNextObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorPreviousObject", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorRelative", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;I)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scrollableCursorSize", "(Lorg/eclipse/persistence/internal/sessions/remote/Transporter;)Lorg/eclipse/persistence/internal/sessions/remote/Transporter;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
