package asm.org.apache.commons.jcs.utils.discovery;
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
public class UDPDiscoveryReceiver$MessageHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "MessageHandler", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType", "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "BroadcastType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "this$0", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getRequesterId", "()J", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheInfo", "listenerId", "J");
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitLdcInsn("Ignoring message sent from self");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitLdcInsn("Process message sent from another");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Message = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getHost", "()Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getCacheNames", "()Ljava/util/ArrayList;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getCacheNames", "()Ljava/util/ArrayList;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "isEmpty", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Ignoring invalid message: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "processMessage", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "processMessage", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/discovery/DiscoveredService");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/discovery/DiscoveredService", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/DiscoveredService", "setServiceAddress", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getCacheNames", "()Ljava/util/ArrayList;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/DiscoveredService", "setCacheNames", "(Ljava/util/ArrayList;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getPort", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/DiscoveredService", "setServicePort", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/DiscoveredService", "setLastHearFromTime", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getMessageType", "()Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType", "REQUEST", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitLdcInsn("Message is a Request Broadcast, will have the service handle it.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/utils/discovery/DiscoveredService"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "this$0", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$100", "(Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;)Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryService;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryService", "serviceRequestBroadcast", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "message", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage", "getMessageType", "()Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType", "REMOVE", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryMessage$BroadcastType;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Removing service from set ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "this$0", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$100", "(Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;)Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryService", "removeDiscoveredService", "(Lorg/apache/commons/jcs/utils/discovery/DiscoveredService;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver$MessageHandler", "this$0", "Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver", "access$100", "(Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryReceiver;)Lorg/apache/commons/jcs/utils/discovery/UDPDiscoveryService;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/utils/discovery/UDPDiscoveryService", "addOrUpdateService", "(Lorg/apache/commons/jcs/utils/discovery/DiscoveredService;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}