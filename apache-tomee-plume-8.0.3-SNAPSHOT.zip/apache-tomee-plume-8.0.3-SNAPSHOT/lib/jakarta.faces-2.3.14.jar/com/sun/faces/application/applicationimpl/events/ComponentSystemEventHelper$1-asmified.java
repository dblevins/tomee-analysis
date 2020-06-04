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
public class ComponentSystemEventHelper$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", "Ljava/lang/Object;Lcom/sun/faces/util/Cache$Factory<Ljava/lang/Class<*>;Lcom/sun/faces/util/Cache<Ljava/lang/Class<+Ljakarta/faces/event/SystemEvent;>;Lcom/sun/faces/application/applicationimpl/events/EventInfo;>;>;", "java/lang/Object", new String[] { "com/sun/faces/util/Cache$Factory" });

classWriter.visitOuterClass("com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper", "<init>", "()V");

classWriter.visitInnerClass("com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/util/Cache$Factory", "com/sun/faces/util/Cache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", "this$0", "Lcom/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "(Ljava/lang/Class;)Lcom/sun/faces/util/Cache;", "(Ljava/lang/Class<*>;)Lcom/sun/faces/util/Cache<Ljava/lang/Class<+Ljakarta/faces/event/SystemEvent;>;Lcom/sun/faces/application/applicationimpl/events/EventInfo;>;", new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1$1", "<init>", "(Lcom/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/Cache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/Cache", "<init>", "(Lcom/sun/faces/util/Cache$Factory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/events/ComponentSystemEventHelper$1", "newInstance", "(Ljava/lang/Class;)Lcom/sun/faces/util/Cache;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
