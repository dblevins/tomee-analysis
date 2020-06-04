package asm.com.sun.faces.application.applicationimpl.events;
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
public class SystemEventHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/applicationimpl/events/SystemEventHelper", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/applicationimpl/events/SystemEventHelper$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/util/Cache$Factory", "com/sun/faces/util/Cache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "systemEventInfoCache", "Lcom/sun/faces/util/Cache;", "Lcom/sun/faces/util/Cache<Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Lcom/sun/faces/application/applicationimpl/events/SystemEventInfo;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/Cache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/events/SystemEventHelper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/events/SystemEventHelper$1", "<init>", "(Lcom/sun/faces/application/applicationimpl/events/SystemEventHelper;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/Cache", "<init>", "(Lcom/sun/faces/util/Cache$Factory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/applicationimpl/events/SystemEventHelper", "systemEventInfoCache", "Lcom/sun/faces/util/Cache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventInfo", "(Ljava/lang/Class;Ljava/lang/Class;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Class<*>;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/events/SystemEventHelper", "systemEventInfoCache", "Lcom/sun/faces/util/Cache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Cache", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/applicationimpl/events/SystemEventInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/events/SystemEventInfo", "getEventInfo", "(Ljava/lang/Class;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/sun/faces/application/applicationimpl/events/EventInfo", "com/sun/faces/application/applicationimpl/events/SystemEventInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventInfo", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Class;Z)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Object;Ljava/lang/Class<*>;Z)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Void;"));
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/events/SystemEventHelper", "getEventInfo", "(Ljava/lang/Class;Ljava/lang/Class;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
