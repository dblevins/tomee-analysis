package asm.org.apache.tomcat.util.net;
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
public class NioEndpoint$SocketProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "Lorg/apache/tomcat/util/net/SocketProcessorBase<Lorg/apache/tomcat/util/net/NioChannel;>;", "org/apache/tomcat/util/net/SocketProcessorBase", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "org/apache/tomcat/util/net/NioEndpoint", "SocketProcessor", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler", "org/apache/tomcat/util/net/AbstractEndpoint", "Handler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "SocketState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioEndpoint$Poller", "org/apache/tomcat/util/net/NioEndpoint", "Poller", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/net/NioEndpoint;Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)V", "(Lorg/apache/tomcat/util/net/SocketWrapperBase<Lorg/apache/tomcat/util/net/NioChannel;>;Lorg/apache/tomcat/util/net/SocketEvent;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SocketProcessorBase", "<init>", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doRun", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/nio/channels/CancelledKeyException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/nio/channels/CancelledKeyException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label7, "java/lang/VirtualMachineError");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label8, "java/lang/Throwable");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label9, null);
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label6, label10, label9, null);
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label7, label11, label9, null);
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label8, label12, label9, null);
Label label13 = new Label();
methodVisitor.visitTryCatchBlock(label9, label13, label9, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "getSocket", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/NioChannel");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/NioEndpoint", "access$300", "(Lorg/apache/tomcat/util/net/NioEndpoint;)Lorg/apache/tomcat/util/net/NioEndpoint$Poller;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/tomcat/util/net/NioChannel", "org/apache/tomcat/util/net/NioEndpoint$Poller"}, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "isHandshakeComplete", "()Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "STOP", "Lorg/apache/tomcat/util/net/SocketEvent;");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "DISCONNECT", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "ERROR", "Lorg/apache/tomcat/util/net/SocketEvent;");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_READ", "Lorg/apache/tomcat/util/net/SocketEvent;");
Label label17 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label17);
methodVisitor.visitInsn(ICONST_1);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/tomcat/util/net/NioChannel"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "org/apache/tomcat/util/net/NioChannel", "org/apache/tomcat/util/net/NioEndpoint$Poller", Opcodes.INTEGER}, 2, new Object[] {"org/apache/tomcat/util/net/NioChannel", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_WRITE", "Lorg/apache/tomcat/util/net/SocketEvent;");
Label label19 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label19);
methodVisitor.visitInsn(ICONST_1);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "org/apache/tomcat/util/net/NioChannel", "org/apache/tomcat/util/net/NioEndpoint$Poller", Opcodes.INTEGER}, 2, new Object[] {"org/apache/tomcat/util/net/NioChannel", Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "org/apache/tomcat/util/net/NioChannel", "org/apache/tomcat/util/net/NioEndpoint$Poller", Opcodes.INTEGER}, 3, new Object[] {"org/apache/tomcat/util/net/NioChannel", Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "handshake", "(ZZ)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_READ", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/NioEndpoint", "access$100", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isDebugEnabled", "()Z", true);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label22);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/NioEndpoint", "access$100", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitLdcInsn("Error during SSL handshake");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/CancelledKeyException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFNE, label23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "OPEN", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
Label label24 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label24);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_READ", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label25 = new Label();
methodVisitor.visitJumpInsn(GOTO, label25);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
Label label26 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label26);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "getIOChannel", "()Ljava/nio/channels/SocketChannel;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "getSelector", "()Ljava/nio/channels/Selector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "keyFor", "(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "cancelledKey", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label27);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "CONNECT_FAIL", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "getIOChannel", "()Ljava/nio/channels/SocketChannel;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "getSelector", "()Ljava/nio/channels/Selector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "keyFor", "(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "cancelledKey", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label28 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label28);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "registerReadInterest", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "registerWriteInterest", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "running", "Z");
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/CancelledKeyException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "getIOChannel", "()Ljava/nio/channels/SocketChannel;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "getSelector", "()Ljava/nio/channels/Selector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "keyFor", "(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "cancelledKey", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "running", "Z");
methodVisitor.visitJumpInsn(IFEQ, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/VirtualMachineError"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/ExceptionUtils", "handleThrowable", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "running", "Z");
methodVisitor.visitJumpInsn(IFEQ, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/NioEndpoint", "access$100", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("endpoint.processing.fail");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioChannel", "getIOChannel", "()Ljava/nio/channels/SocketChannel;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "getSelector", "()Ljava/nio/channels/Selector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "keyFor", "(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioEndpoint$Poller", "cancelledKey", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "running", "Z");
methodVisitor.visitJumpInsn(IFEQ, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label29);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "running", "Z");
Label label30 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label30);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label30);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label30);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/NioEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
