package asm.javax.ws.rs.sse;
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
public class SseEventSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/ws/rs/sse/SseEventSource", null, "java/lang/Object", new String[] { "java/lang/AutoCloseable" });

classWriter.visitInnerClass("javax/ws/rs/sse/SseEventSource$Builder", "javax/ws/rs/sse/SseEventSource", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/util/function/Consumer;)V", "(Ljava/util/function/Consumer<Ljavax/ws/rs/sse/InboundSseEvent;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)V", "(Ljava/util/function/Consumer<Ljavax/ws/rs/sse/InboundSseEvent;>;Ljava/util/function/Consumer<Ljava/lang/Throwable;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/lang/Runnable;)V", "(Ljava/util/function/Consumer<Ljavax/ws/rs/sse/InboundSseEvent;>;Ljava/util/function/Consumer<Ljava/lang/Throwable;>;Ljava/lang/Runnable;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "target", "(Ljavax/ws/rs/client/WebTarget;)Ljavax/ws/rs/sse/SseEventSource$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/sse/SseEventSource$Builder", "newBuilder", "()Ljavax/ws/rs/sse/SseEventSource$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/sse/SseEventSource$Builder", "target", "(Ljavax/ws/rs/client/WebTarget;)Ljavax/ws/rs/sse/SseEventSource$Builder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "open", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isOpen", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/sse/SseEventSource", "close", "(JLjava/util/concurrent/TimeUnit;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "close", "(JLjava/util/concurrent/TimeUnit;)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
