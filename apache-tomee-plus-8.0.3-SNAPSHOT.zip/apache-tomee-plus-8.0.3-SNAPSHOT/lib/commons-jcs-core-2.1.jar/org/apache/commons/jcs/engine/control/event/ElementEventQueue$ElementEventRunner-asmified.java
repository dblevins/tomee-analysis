package asm.org.apache.commons.jcs.engine.control.event;
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
public class ElementEventQueue$ElementEventRunnerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", null, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$AbstractElementEventRunner", null);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "org/apache/commons/jcs/engine/control/event/ElementEventQueue", "ElementEventRunner", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/control/event/ElementEventQueue$AbstractElementEventRunner", "org/apache/commons/jcs/engine/control/event/ElementEventQueue", "AbstractElementEventRunner", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "hand", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "event", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent;", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/engine/control/event/ElementEventQueue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/jcs/engine/control/event/ElementEventQueue;Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler;Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent;)V", "(Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler;Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent<*>;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "this$0", "Lorg/apache/commons/jcs/engine/control/event/ElementEventQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$AbstractElementEventRunner", "<init>", "(Lorg/apache/commons/jcs/engine/control/event/ElementEventQueue;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/event/ElementEventQueue", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/event/ElementEventQueue", "access$000", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Constructing ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "org/apache/commons/jcs/engine/control/event/ElementEventQueue", "org/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler", "org/apache/commons/jcs/engine/control/event/behavior/IElementEvent"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "hand", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "event", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doRun", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "hand", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/control/event/ElementEventQueue$ElementEventRunner", "event", "Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/control/event/behavior/IElementEventHandler", "handleElementEvent", "(Lorg/apache/commons/jcs/engine/control/event/behavior/IElementEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
