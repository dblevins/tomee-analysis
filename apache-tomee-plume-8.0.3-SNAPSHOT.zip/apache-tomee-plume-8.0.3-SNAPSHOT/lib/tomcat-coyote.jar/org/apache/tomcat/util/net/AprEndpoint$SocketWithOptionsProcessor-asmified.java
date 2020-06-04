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
public class AprEndpoint$SocketWithOptionsProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "org/apache/tomcat/util/net/AprEndpoint", "SocketWithOptionsProcessor", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler", "org/apache/tomcat/util/net/AbstractEndpoint", "Handler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "SocketState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AprEndpoint$Poller", "org/apache/tomcat/util/net/AprEndpoint", "Poller", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;", "Lorg/apache/tomcat/util/net/SocketWrapperBase<Ljava/lang/Long;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/net/AprEndpoint;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", "(Lorg/apache/tomcat/util/net/SocketWrapperBase<Ljava/lang/Long;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "deferAccept", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "setSocketOptions", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getPoller", "()Lorg/apache/tomcat/util/net/AprEndpoint$Poller;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "getSocket", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getConnectionTimeout", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/AprEndpoint$Poller", "access$400", "(Lorg/apache/tomcat/util/net/AprEndpoint$Poller;JJI)V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "CONNECT_FAIL", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "setSocketOptions", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "CONNECT_FAIL", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_READ", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketWithOptionsProcessor", "socket", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
