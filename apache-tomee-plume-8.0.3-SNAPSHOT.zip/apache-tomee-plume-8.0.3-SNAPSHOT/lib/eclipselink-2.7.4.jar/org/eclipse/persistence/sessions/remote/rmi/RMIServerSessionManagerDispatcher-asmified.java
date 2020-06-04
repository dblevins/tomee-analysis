package asm.org.eclipse.persistence.sessions.remote.rmi;
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
public class RMIServerSessionManagerDispatcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", null, "java/rmi/server/UnicastRemoteObject", new String[] { "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManager" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "session", "Lorg/eclipse/persistence/sessions/Session;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "controllerClassName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/Session;)V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/rmi/server/UnicastRemoteObject", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "session", "Lorg/eclipse/persistence/sessions/Session;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRemoteSessionController", "()Lorg/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionController;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/rmi/RemoteException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "getSession", "()Lorg/eclipse/persistence/sessions/Session;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/Session", "isServerSession", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionControllerDispatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "getSession", "()Lorg/eclipse/persistence/sessions/Session;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/server/ServerSession");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/server/ServerSession", "acquireClientSession", "()Lorg/eclipse/persistence/sessions/server/ClientSession;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionControllerDispatcher", "<init>", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionController"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionControllerDispatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "getSession", "()Lorg/eclipse/persistence/sessions/Session;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/remote/rmi/RMIRemoteSessionControllerDispatcher", "<init>", "(Lorg/eclipse/persistence/sessions/Session;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/rmi/RemoteException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error in invocation ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/rmi/RemoteException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSession", "()Lorg/eclipse/persistence/sessions/Session;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "session", "Lorg/eclipse/persistence/sessions/Session;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setSession", "(Lorg/eclipse/persistence/sessions/Session;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/remote/rmi/RMIServerSessionManagerDispatcher", "session", "Lorg/eclipse/persistence/sessions/Session;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
