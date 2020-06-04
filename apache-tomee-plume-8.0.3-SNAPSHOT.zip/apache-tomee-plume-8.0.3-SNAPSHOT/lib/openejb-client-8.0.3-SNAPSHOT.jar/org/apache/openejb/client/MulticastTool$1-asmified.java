package asm.org.apache.openejb.client;
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
public class MulticastTool$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/client/MulticastTool$1", null, "org/apache/openejb/client/CommandParser", null);

classWriter.visitOuterClass("org/apache/openejb/client/MulticastTool", null, null);

classWriter.visitInnerClass("org/apache/openejb/client/MulticastTool$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/CommandParser$Arguments", "org/apache/openejb/client/CommandParser", "Arguments", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/CommandParser$Option", "org/apache/openejb/client/CommandParser", "Option", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Options");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "category", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn("host");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("239.255.3.2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Address of the multicast channel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitLdcInsn("port");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitIntInsn(SIPUSH, 6142);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Port of the multicast channel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("date-format");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("HH:mm:ss");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Date format to use for log lines");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Sending");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "category", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitLdcInsn("send");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Optional message to broadcast to the channel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitLdcInsn("rate");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(CLjava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "value", "(Ljava/lang/Object;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("Resend every N milliseconds. Zero sends just once");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Advanced");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "category", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("broadcast");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setBroadcast");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("loopback-mode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setLoopbackMode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("receive-buffer-size");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setReceiveBufferSize");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("reuse-address");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setReuseAddress");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("send-buffer-size");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setSendBufferSize");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("so-timeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setSoTimeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("time-to-live");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setTimeToLive");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("traffic-class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/MulticastTool$1", "opt", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "type", "(Ljava/lang/Class;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitLdcInsn("java.net.MulticastSocket#setTrafficClass");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/CommandParser$Option", "description", "(Ljava/lang/String;)Lorg/apache/openejb/client/CommandParser$Option;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "validate", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List;", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "validate", "(Lorg/apache/openejb/client/CommandParser$Arguments;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "usage", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/CommandParser", "usage", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
