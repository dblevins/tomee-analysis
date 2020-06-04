package asm.org.apache.tomcat.websocket;
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
public class WsRemoteEndpointImplBase$StateMachineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "StateMachine", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsRemoteEndpointImplBase$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "streamStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "writeStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "binaryPartialStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "binaryStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "textPartialStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "textStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "complete", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUG: This code should never be called");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "checkState", "([Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("wsRemoteEndpoint.wrongState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "state", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$StateMachine", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
