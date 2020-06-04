package asm.org.apache.coyote.http2;
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
public class StreamStateMachineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/coyote/http2/StreamStateMachine", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/coyote/http2/StreamStateMachine$State", "org/apache/coyote/http2/StreamStateMachine", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "stream", "Lorg/apache/coyote/http2/Stream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/coyote/http2/Stream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "sentPushPromise", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "sentHeaders", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "receivedStartOfHeaders", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "sentEndOfStream", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "receivedEndOfStream", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "sendReset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("streamStateMachine.debug.change");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getIdentifier", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine$State", "canReset", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "receivedReset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("streamStateMachine.debug.change");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getIdentifier", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "checkFrameType", "(Lorg/apache/coyote/http2/FrameType;)V", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine", "isFrameTypePermitted", "(Lorg/apache/coyote/http2/FrameType;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "access$000", "(Lorg/apache/coyote/http2/StreamStateMachine$State;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/ConnectionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("streamStateMachine.invalidFrame");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getIdentifier", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "access$100", "(Lorg/apache/coyote/http2/StreamStateMachine$State;)Lorg/apache/coyote/http2/Http2Error;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/ConnectionException", "<init>", "(Ljava/lang/String;Lorg/apache/coyote/http2/Http2Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("streamStateMachine.invalidFrame");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getIdentifier", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "access$100", "(Lorg/apache/coyote/http2/StreamStateMachine$State;)Lorg/apache/coyote/http2/Http2Error;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "stream", "Lorg/apache/coyote/http2/Stream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/Stream", "getIdAsInt", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamException", "<init>", "(Ljava/lang/String;Lorg/apache/coyote/http2/Http2Error;I)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "isFrameTypePermitted", "(Lorg/apache/coyote/http2/FrameType;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine$State", "isFrameTypePermitted", "(Lorg/apache/coyote/http2/FrameType;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "isActive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine$State", "isActive", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "canRead", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine$State", "canRead", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "canWrite", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http2/StreamStateMachine$State", "canWrite", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "isClosedFinal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine", "state", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_FINAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL | ACC_SYNCHRONIZED, "closeIfIdle", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_FINAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine", "stateChange", "(Lorg/apache/coyote/http2/StreamStateMachine$State;Lorg/apache/coyote/http2/StreamStateMachine$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http2/StreamStateMachine;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http2/StreamStateMachine;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
