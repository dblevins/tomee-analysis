package asm.org.eclipse.persistence.internal.sessions.coordination.rmi.iiop;
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
public class _RMIRemoteCommandConnectionImpl_TieDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", null, "org/omg/CORBA_2_3/portable/ObjectImpl", new String[] { "javax/rmi/CORBA/Tie" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "orb", "Lorg/omg/CORBA/ORB;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_type_ids", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("RMI:org.eclipse.persistence.internal.sessions.coordination.rmi.RMIRemoteCommandConnection:0000000000000000");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "_type_ids", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA_2_3/portable/ObjectImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "orb", "Lorg/omg/CORBA/ORB;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTarget", "(Ljava/rmi/Remote;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTarget", "()Ljava/rmi/Remote;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "thisObject", "()Lorg/omg/CORBA/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deactivate", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "orb", "Lorg/omg/CORBA/ORB;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "orb", "Lorg/omg/CORBA/ORB;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "disconnect", "(Lorg/omg/CORBA/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "_set_delegate", "(Lorg/omg/CORBA/portable/Delegate;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orb", "()Lorg/omg/CORBA/ORB;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "_orb", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orb", "(Lorg/omg/CORBA/ORB;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "connect", "(Lorg/omg/CORBA/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_set_delegate", "(Lorg/omg/CORBA/portable/Delegate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA_2_3/portable/ObjectImpl", "_set_delegate", "(Lorg/omg/CORBA/portable/Delegate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "_orb", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "orb", "Lorg/omg/CORBA/ORB;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "orb", "Lorg/omg/CORBA/ORB;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_ids", "()[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "_type_ids", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljava/lang/String;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_invoke", "(Ljava/lang/String;Lorg/omg/CORBA/portable/InputStream;Lorg/omg/CORBA/portable/ResponseHandler;)Lorg/omg/CORBA/portable/OutputStream;", null, new String[] { "org/omg/CORBA/SystemException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/omg/CORBA/SystemException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "org/omg/CORBA/SystemException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label5, label2, label2, "org/omg/CORBA/SystemException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label6, "java/lang/Throwable");
methodVisitor.visitTryCatchBlock(label3, label4, label6, "java/lang/Throwable");
methodVisitor.visitTryCatchBlock(label5, label2, label6, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/omg/CORBA_2_3/portable/InputStream");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label7 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 43, 69 }, new Label[] { label7, label3 });
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/omg/CORBA_2_3/portable/InputStream"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("executeCommand__org_omg_boxedRMI_seq1_octet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "executeCommand__org_omg_boxedRMI_seq1_octet", "(Lorg/omg/CORBA_2_3/portable/InputStream;Lorg/omg/CORBA/portable/ResponseHandler;)Lorg/omg/CORBA/portable/OutputStream;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("executeCommand__org_eclipse_persistence_sessions_coordination_Command");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "executeCommand__org_eclipse_persistence_sessions_coordination_Command", "(Lorg/omg/CORBA_2_3/portable/InputStream;Lorg/omg/CORBA/portable/ResponseHandler;)Lorg/omg/CORBA/portable/OutputStream;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/BAD_OPERATION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/BAD_OPERATION", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "java/lang/String", "org/omg/CORBA/portable/InputStream", "org/omg/CORBA/portable/ResponseHandler"}, 1, new Object[] {"org/omg/CORBA/SystemException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/portable/UnknownException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/portable/UnknownException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "executeCommand__org_eclipse_persistence_sessions_coordination_Command", "(Lorg/omg/CORBA_2_3/portable/InputStream;Lorg/omg/CORBA/portable/ResponseHandler;)Lorg/omg/CORBA/portable/OutputStream;", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/coordination/Command;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA_2_3/portable/InputStream", "read_value", "(Ljava/lang/Class;)Ljava/io/Serializable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/coordination/Command");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl", "executeCommand", "(Lorg/eclipse/persistence/sessions/coordination/Command;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/omg/CORBA/portable/ResponseHandler", "createReply", "()Lorg/omg/CORBA/portable/OutputStream;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/rmi/CORBA/Util", "writeAny", "(Lorg/omg/CORBA/portable/OutputStream;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "executeCommand__org_omg_boxedRMI_seq1_octet", "(Lorg/omg/CORBA_2_3/portable/InputStream;Lorg/omg/CORBA/portable/ResponseHandler;)Lorg/omg/CORBA/portable/OutputStream;", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA_2_3/portable/InputStream", "read_value", "(Ljava/lang/Class;)Ljava/io/Serializable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/_RMIRemoteCommandConnectionImpl_Tie", "target", "Lorg/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/rmi/iiop/RMIRemoteCommandConnectionImpl", "executeCommand", "([B)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/omg/CORBA/portable/ResponseHandler", "createReply", "()Lorg/omg/CORBA/portable/OutputStream;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/rmi/CORBA/Util", "writeAny", "(Lorg/omg/CORBA/portable/OutputStream;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
