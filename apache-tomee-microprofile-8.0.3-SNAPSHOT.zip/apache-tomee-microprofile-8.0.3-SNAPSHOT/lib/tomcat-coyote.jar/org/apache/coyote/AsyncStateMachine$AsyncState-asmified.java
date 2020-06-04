package asm.org.apache.coyote;
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
public class AsyncStateMachine$AsyncStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/AsyncStateMachine$AsyncState", "Ljava/lang/Enum<Lorg/apache/coyote/AsyncStateMachine$AsyncState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/coyote/AsyncStateMachine$AsyncState", "org/apache/coyote/AsyncStateMachine", "AsyncState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCHED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MUST_COMPLETE", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPLETE_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPLETING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMING_OUT", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MUST_DISPATCH", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCH_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCHING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_WRITE_OP", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MUST_ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "isAsync", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "isStarted", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "isCompleting", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "isDispatching", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "$VALUES", "[Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/AsyncStateMachine$AsyncState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/AsyncStateMachine$AsyncState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/AsyncStateMachine$AsyncState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZZZZ)V", "(ZZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isAsync", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isStarted", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isCompleting", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isDispatching", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isAsync", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isAsync", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isStarted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isStarted", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isDispatching", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isDispatching", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isCompleting", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/coyote/AsyncStateMachine$AsyncState", "isCompleting", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCHED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCHED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "STARTING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "STARTED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MUST_COMPLETE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_COMPLETE", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPLETE_PENDING");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "COMPLETE_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPLETING");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "COMPLETING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMING_OUT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "TIMING_OUT", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MUST_DISPATCH");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_DISPATCH", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCH_PENDING");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCH_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCHING");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCHING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_WRITE_OP");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "READ_WRITE_OP", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MUST_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/AsyncStateMachine$AsyncState", "<init>", "(Ljava/lang/String;IZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/AsyncStateMachine$AsyncState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCHED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "STARTING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "STARTED", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_COMPLETE", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "COMPLETE_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "COMPLETING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "TIMING_OUT", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_DISPATCH", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCH_PENDING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "DISPATCHING", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "READ_WRITE_OP", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "MUST_ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "ERROR", "Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/AsyncStateMachine$AsyncState", "$VALUES", "[Lorg/apache/coyote/AsyncStateMachine$AsyncState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
