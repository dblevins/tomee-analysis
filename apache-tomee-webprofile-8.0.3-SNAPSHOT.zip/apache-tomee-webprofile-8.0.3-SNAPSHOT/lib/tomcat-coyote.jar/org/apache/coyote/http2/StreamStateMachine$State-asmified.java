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
public class StreamStateMachine$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/http2/StreamStateMachine$State", "Ljava/lang/Enum<Lorg/apache/coyote/http2/StreamStateMachine$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/coyote/http2/StreamStateMachine$State", "org/apache/coyote/http2/StreamStateMachine", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESERVED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESERVED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_RST_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_RST_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_FINAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "canRead", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "canWrite", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "canReset", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "connectionErrorForInvalidFrame", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "errorCodeForInvalidFrame", "Lorg/apache/coyote/http2/Http2Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "frameTypesPermitted", "Ljava/util/Set;", "Ljava/util/Set<Lorg/apache/coyote/http2/FrameType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "$VALUES", "[Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/http2/StreamStateMachine$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/http2/StreamStateMachine$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/http2/StreamStateMachine$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", "(ZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canRead", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canWrite", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canReset", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "connectionErrorForInvalidFrame", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "errorCodeForInvalidFrame", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "frameTypesPermitted", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isActive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canWrite", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canRead", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canRead", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canRead", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canWrite", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canWrite", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canReset", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "canReset", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFrameTypePermitted", "(Lorg/apache/coyote/http2/FrameType;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "frameTypesPermitted", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/coyote/http2/StreamStateMachine$State;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "connectionErrorForInvalidFrame", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/coyote/http2/StreamStateMachine$State;)Lorg/apache/coyote/http2/Http2Error;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/http2/StreamStateMachine$State", "errorCodeForInvalidFrame", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDLE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "HEADERS", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPEN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "DATA", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "HEADERS", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PUSH_PROMISE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESERVED_LOCAL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESERVED_REMOTE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "HEADERS", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HALF_CLOSED_LOCAL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "DATA", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "HEADERS", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PUSH_PROMISE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HALF_CLOSED_REMOTE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_RX");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_TX");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_RST_RX");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_RST_TX");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "STREAM_CLOSED", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "DATA", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "HEADERS", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "RST", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PUSH_PROMISE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "WINDOW_UPDATE", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_FINAL");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/Http2Error", "PROTOCOL_ERROR", "Lorg/apache/coyote/http2/Http2Error;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/FrameType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/FrameType", "PRIORITY", "Lorg/apache/coyote/http2/FrameType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/http2/StreamStateMachine$State", "<init>", "(Ljava/lang/String;IZZZZLorg/apache/coyote/http2/Http2Error;[Lorg/apache/coyote/http2/FrameType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_FINAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/http2/StreamStateMachine$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "IDLE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "OPEN", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "RESERVED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_LOCAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "HALF_CLOSED_REMOTE", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_RX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_RST_TX", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "CLOSED_FINAL", "Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http2/StreamStateMachine$State", "$VALUES", "[Lorg/apache/coyote/http2/StreamStateMachine$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(13, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
