package asm.org.apache.catalina.tribes.group;
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
public class ChannelInterceptorBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/catalina/tribes/group/ChannelInterceptorBase", null, "java/lang/Object", new String[] { "org/apache/catalina/tribes/ChannelInterceptor" });

classWriter.visitInnerClass("org/apache/catalina/tribes/ChannelInterceptor$InterceptorEvent", "org/apache/catalina/tribes/ChannelInterceptor", "InterceptorEvent", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "next", "Lorg/apache/catalina/tribes/ChannelInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "previous", "Lorg/apache/catalina/tribes/ChannelInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "channel", "Lorg/apache/catalina/tribes/Channel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "optionFlag", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oname", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "okToProcess", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setNext", "(Lorg/apache/catalina/tribes/ChannelInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "next", "Lorg/apache/catalina/tribes/ChannelInterceptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "next", "Lorg/apache/catalina/tribes/ChannelInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setPrevious", "(Lorg/apache/catalina/tribes/ChannelInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "previous", "Lorg/apache/catalina/tribes/ChannelInterceptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOptionFlag", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "previous", "Lorg/apache/catalina/tribes/ChannelInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOptionFlag", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "optionFlag", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendMessage", "([Lorg/apache/catalina/tribes/Member;Lorg/apache/catalina/tribes/ChannelMessage;Lorg/apache/catalina/tribes/group/InterceptorPayload;)V", null, new String[] { "org/apache/catalina/tribes/ChannelException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "sendMessage", "([Lorg/apache/catalina/tribes/Member;Lorg/apache/catalina/tribes/ChannelMessage;Lorg/apache/catalina/tribes/group/InterceptorPayload;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageReceived", "(Lorg/apache/catalina/tribes/ChannelMessage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "messageReceived", "(Lorg/apache/catalina/tribes/ChannelMessage;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "memberAdded", "(Lorg/apache/catalina/tribes/Member;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "memberAdded", "(Lorg/apache/catalina/tribes/Member;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "memberDisappeared", "(Lorg/apache/catalina/tribes/Member;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getPrevious", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "memberDisappeared", "(Lorg/apache/catalina/tribes/Member;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "heartbeat", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "heartbeat", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasMembers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "hasMembers", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMembers", "()[Lorg/apache/catalina/tribes/Member;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "getMembers", "()[Lorg/apache/catalina/tribes/Member;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMember", "(Lorg/apache/catalina/tribes/Member;)Lorg/apache/catalina/tribes/Member;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "getMember", "(Lorg/apache/catalina/tribes/Member;)Lorg/apache/catalina/tribes/Member;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalMember", "(Z)Lorg/apache/catalina/tribes/Member;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "getLocalMember", "(Z)Lorg/apache/catalina/tribes/Member;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "(I)V", null, new String[] { "org/apache/catalina/tribes/ChannelException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "start", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "channel", "Lorg/apache/catalina/tribes/Channel;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/jmx/JmxRegistry", "getRegistry", "(Lorg/apache/catalina/tribes/Channel;)Lorg/apache/catalina/tribes/jmx/JmxRegistry;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(",component=Interceptor,interceptorName=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/jmx/JmxRegistry", "registerJmx", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/management/ObjectName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/tribes/jmx/JmxRegistry"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "(I)V", null, new String[] { "org/apache/catalina/tribes/ChannelException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "getNext", "()Lorg/apache/catalina/tribes/ChannelInterceptor;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/ChannelInterceptor", "stop", "(I)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "oname", "Ljavax/management/ObjectName;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "channel", "Lorg/apache/catalina/tribes/Channel;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/jmx/JmxRegistry", "getRegistry", "(Lorg/apache/catalina/tribes/Channel;)Lorg/apache/catalina/tribes/jmx/JmxRegistry;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/jmx/JmxRegistry", "unregisterJmx", "(Ljavax/management/ObjectName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "channel", "Lorg/apache/catalina/tribes/Channel;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fireInterceptorEvent", "(Lorg/apache/catalina/tribes/ChannelInterceptor$InterceptorEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChannel", "()Lorg/apache/catalina/tribes/Channel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "channel", "Lorg/apache/catalina/tribes/Channel;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setChannel", "(Lorg/apache/catalina/tribes/Channel;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "channel", "Lorg/apache/catalina/tribes/Channel;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
