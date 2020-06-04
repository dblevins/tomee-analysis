package asm.org.apache.catalina.ha.backend;
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
public class MultiCastSenderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/ha/backend/MultiCastSender", null, "java/lang/Object", new String[] { "org/apache/catalina/ha/backend/Sender" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "s", "Ljava/net/MulticastSocket;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "group", "Ljava/net/InetAddress;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "group", "Ljava/net/InetAddress;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Lorg/apache/catalina/ha/backend/HeartbeatListener;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "send", "(Ljava/lang/String;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getGroup", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getByName", "(Ljava/lang/String;)Ljava/net/InetAddress;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "group", "Ljava/net/InetAddress;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getHost", "()Ljava/lang/String;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getByName", "(Ljava/lang/String;)Ljava/net/InetAddress;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getMultiport", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(Ljava/net/InetAddress;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/net/MulticastSocket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/MulticastSocket", "<init>", "(Ljava/net/SocketAddress;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/net/MulticastSocket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getMultiport", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/MulticastSocket", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getTtl", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "setTimeToLive", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "group", "Ljava/net/InetAddress;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "joinGroup", "(Ljava/net/InetAddress;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("multiCastSender.multiCastFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "US_ASCII", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/net/DatagramPacket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "group", "Ljava/net/InetAddress;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "config", "Lorg/apache/catalina/ha/backend/HeartbeatListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ha/backend/HeartbeatListener", "getMultiport", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/DatagramPacket", "<init>", "([BILjava/net/InetAddress;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "send", "(Ljava/net/DatagramPacket;)V", false);
methodVisitor.visitLabel(label4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/catalina/ha/backend/MultiCastSender", "java/lang/String", "[B", "java/net/DatagramPacket"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("multiCastSender.sendFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ha/backend/MultiCastSender", "s", "Ljava/net/MulticastSocket;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/ha/backend/HeartbeatListener;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/ha/backend/MultiCastSender;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/ha/backend/MultiCastSender", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
