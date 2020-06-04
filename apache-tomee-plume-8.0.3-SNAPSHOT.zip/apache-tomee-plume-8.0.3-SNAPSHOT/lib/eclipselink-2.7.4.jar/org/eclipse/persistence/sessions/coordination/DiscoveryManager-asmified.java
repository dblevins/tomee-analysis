package asm.org.eclipse.persistence.sessions.coordination;
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
public class DiscoveryManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MULTICAST_GROUP", "Ljava/lang/String;", null, "226.10.12.64");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MULTICAST_PORT", "I", null, new Integer(3121));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_PACKET_TIME_TO_LIVE", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ANNOUNCEMENT_DELAY", "I", null, new Integer(1000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "multicastGroupAddress", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "multicastPort", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "communicationSocket", "Ljava/net/MulticastSocket;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "packetTimeToLive", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "stopListening", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "announcementDelay", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("226.10.12.64");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 3121);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "packetTimeToLive", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;ILorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "<init>", "(Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;IILorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "<init>", "(Ljava/lang/String;ILorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "announceSession", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("sending_announcement");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logDebug", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "<init>", "(Lorg/eclipse/persistence/sessions/coordination/ServiceId;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "toBytes", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/net/DatagramPacket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getByName", "(Ljava/lang/String;)Ljava/net/InetAddress;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/DatagramPacket", "<init>", "([BILjava/net/InetAddress;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "getCommunicationSocket", "()Ljava/net/MulticastSocket;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "send", "(Ljava/net/DatagramPacket;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("announcement_sent");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logInfo", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/sessions/coordination/DiscoveryManager", "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "[B"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DiscoveryException", "errorSendingAnnouncement", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DiscoveryException;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "handleException", "(Ljava/lang/RuntimeException;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDiscovery", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getCommandProcessor", "()Lorg/eclipse/persistence/sessions/coordination/CommandProcessor;", false);
methodVisitor.visitLdcInsn("Info:CacheCoordinationStatus");
methodVisitor.visitLdcInsn("Started");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/coordination/CommandProcessor", "updateProfile", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "isDiscoveryStopped", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getServerPlatform", "()Lorg/eclipse/persistence/platform/server/ServerPlatform;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/platform/server/ServerPlatform", "launchContainerRunnable", "(Ljava/lang/Runnable;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stopDiscovery", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getCommandProcessor", "()Lorg/eclipse/persistence/sessions/coordination/CommandProcessor;", false);
methodVisitor.visitLdcInsn("Info:CacheCoordinationStatus");
methodVisitor.visitLdcInsn("Stopped");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/coordination/CommandProcessor", "updateProfile", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(new Long(500L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "sleep", "(J)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDiscoveryStopped", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
Label label0 = new Label();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCommunicationSocket", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("initializing_discovery_resources");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logDebug", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/net/MulticastSocket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/MulticastSocket", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "getPacketTimeToLive", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "setTimeToLive", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getByName", "(Ljava/lang/String;)Ljava/net/InetAddress;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "joinGroup", "(Ljava/net/InetAddress;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/sessions/coordination/DiscoveryManager", "[Ljava/lang/Object;"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DiscoveryException", "errorJoiningMulticastGroup", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DiscoveryException;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "handleException", "(Ljava/lang/RuntimeException;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCommunicationSocket", "()Ljava/net/MulticastSocket;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "communicationSocket", "Ljava/net/MulticastSocket;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "createCommunicationSocket", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getTransportManager", "()Lorg/eclipse/persistence/sessions/coordination/TransportManager;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/TransportManager", "createLocalConnection", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "sleep", "(J)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announceSession", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "startListening", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startListening", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("discovery_manager_active");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logInfo", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/net/DatagramPacket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/DatagramPacket", "<init>", "([BI)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "getCommunicationSocket", "()Ljava/net/MulticastSocket;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "receive", "(Ljava/net/DatagramPacket;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/sessions/coordination/DiscoveryManager", "[B", "java/net/DatagramPacket"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "Z");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("discovery_manager_stopped");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logInfo", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/sessions/coordination/DiscoveryManager", "[B", "java/net/DatagramPacket", Opcodes.TOP, "java/io/IOException"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DiscoveryException", "errorReceivingAnnouncement", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DiscoveryException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "handleException", "(Ljava/lang/RuntimeException;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/sessions/coordination/DiscoveryManager", "[B", "java/net/DatagramPacket"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/DatagramPacket", "getData", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("received_corrupt_announcement");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logWarning", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/ServiceId", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/ServiceId", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/ServiceId", "getChannel", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/ServiceId", "getChannel", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/ServiceAnnouncement", "getServiceId", "()Lorg/eclipse/persistence/sessions/coordination/ServiceId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "receivedAnnouncement", "(Lorg/eclipse/persistence/sessions/coordination/ServiceId;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "Z");
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stopListening", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "stopListening", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "getCommunicationSocket", "()Ljava/net/MulticastSocket;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "getCommunicationSocket", "()Ljava/net/MulticastSocket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/MulticastSocket", "close", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "receivedAnnouncement", "(Lorg/eclipse/persistence/sessions/coordination/ServiceId;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitLdcInsn("announcement_received");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "logInfo", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/coordination/RemoteCommandManager", "newServiceDiscovered", "(Lorg/eclipse/persistence/sessions/coordination/ServiceId;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAnnouncementDelay", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnouncementDelay", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMulticastGroupAddress", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMulticastGroupAddress", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMulticastPort", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMulticastPort", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "shallowCopy", "(Lorg/eclipse/persistence/sessions/coordination/DiscoveryManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastGroupAddress", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "multicastPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "announcementDelay", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "rcm", "Lorg/eclipse/persistence/sessions/coordination/RemoteCommandManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPacketTimeToLive", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "packetTimeToLive", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPacketTimeToLive", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sessions/coordination/DiscoveryManager", "packetTimeToLive", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
