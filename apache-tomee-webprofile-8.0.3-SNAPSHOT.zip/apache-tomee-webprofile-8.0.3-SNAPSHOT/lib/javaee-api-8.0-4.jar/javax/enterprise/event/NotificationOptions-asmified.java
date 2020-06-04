package asm.javax.enterprise.event;
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
public class NotificationOptionsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/event/NotificationOptions", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/enterprise/event/NotificationOptions$Builder", "javax/enterprise/event/NotificationOptions", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/enterprise/event/ImmutableNotificationOptions$Builder", "javax/enterprise/event/ImmutableNotificationOptions", "Builder", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExecutor", "()Ljava/util/concurrent/Executor;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ofExecutor", "(Ljava/util/concurrent/Executor;)Ljavax/enterprise/event/NotificationOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/event/NotificationOptions", "builder", "()Ljavax/enterprise/event/NotificationOptions$Builder;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/NotificationOptions$Builder", "setExecutor", "(Ljava/util/concurrent/Executor;)Ljavax/enterprise/event/NotificationOptions$Builder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/NotificationOptions$Builder", "build", "()Ljavax/enterprise/event/NotificationOptions;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "of", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/enterprise/event/NotificationOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/event/NotificationOptions", "builder", "()Ljavax/enterprise/event/NotificationOptions$Builder;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/NotificationOptions$Builder", "set", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/enterprise/event/NotificationOptions$Builder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/event/NotificationOptions$Builder", "build", "()Ljavax/enterprise/event/NotificationOptions;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "builder", "()Ljavax/enterprise/event/NotificationOptions$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/ImmutableNotificationOptions$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/ImmutableNotificationOptions$Builder", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
