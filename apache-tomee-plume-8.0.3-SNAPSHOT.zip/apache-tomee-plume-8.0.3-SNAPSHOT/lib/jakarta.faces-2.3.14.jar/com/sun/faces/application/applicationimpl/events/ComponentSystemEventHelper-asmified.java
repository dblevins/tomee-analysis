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
public class ComponentSystemEventHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/util/Cache$Factory", "com/sun/faces/util/Cache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sourceCache", "Lcom/sun/faces/util/Cache;", "Lcom/sun/faces/util/Cache<Ljava/lang/Class<*>;Lcom/sun/faces/util/Cache<Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Lcom/sun/faces/application/applicationimpl/events/EventInfo;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", "<init>", "(Lcom/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/Cache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/Cache", "<init>", "(Lcom/sun/faces/util/Cache$Factory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper", "sourceCache", "Lcom/sun/faces/util/Cache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventInfo", "(Ljava/lang/Class;Ljava/lang/Class;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Class<*>;)Lcom/sun/faces/application/applicationimpl/events/EventInfo;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper", "sourceCache", "Lcom/sun/faces/util/Cache;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Cache", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/util/Cache");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/Cache", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/applicationimpl/events/EventInfo");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
