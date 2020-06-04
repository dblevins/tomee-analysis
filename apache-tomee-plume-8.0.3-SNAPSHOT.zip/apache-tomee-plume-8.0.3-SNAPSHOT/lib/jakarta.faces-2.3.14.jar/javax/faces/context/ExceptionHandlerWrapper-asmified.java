package asm.javax.faces.context;
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
public class ExceptionHandlerWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "javax/faces/context/ExceptionHandlerWrapper", "Ljavax/faces/context/ExceptionHandler;Ljavax/faces/FacesWrapper<Ljavax/faces/context/ExceptionHandler;>;", "javax/faces/context/ExceptionHandler", new String[] { "javax/faces/FacesWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wrapped", "Ljavax/faces/context/ExceptionHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/context/ExceptionHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/context/ExceptionHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/context/ExceptionHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/context/ExceptionHandlerWrapper", "wrapped", "Ljavax/faces/context/ExceptionHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/context/ExceptionHandlerWrapper", "wrapped", "Ljavax/faces/context/ExceptionHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandledExceptionQueuedEvent", "()Ljavax/faces/event/ExceptionQueuedEvent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "getHandledExceptionQueuedEvent", "()Ljavax/faces/event/ExceptionQueuedEvent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handle", "()V", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "handle", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isListenerForSource", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "isListenerForSource", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Ljavax/faces/event/SystemEvent;)V", null, new String[] { "javax/faces/event/AbortProcessingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "processEvent", "(Ljavax/faces/event/SystemEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRootCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "getRootCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandledExceptionQueuedEvents", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Ljavax/faces/event/ExceptionQueuedEvent;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "getHandledExceptionQueuedEvents", "()Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnhandledExceptionQueuedEvents", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Ljavax/faces/event/ExceptionQueuedEvent;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandler", "getUnhandledExceptionQueuedEvents", "()Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExceptionHandlerWrapper", "getWrapped", "()Ljavax/faces/context/ExceptionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
