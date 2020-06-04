package asm.com.sun.xml.bind.v2.runtime.property;
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
public class SingleMapNodeProperty$StackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "Stack", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parent", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;Ljava/lang/Object;)V", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TT;>;TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "parent", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "push", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)V", "<T:Ljava/lang/Object;>(Ljava/lang/ThreadLocal<Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TT;>;>;TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "<init>", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "pop", "(Ljava/lang/ThreadLocal;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/ThreadLocal<Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack<TT;>;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "parent", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "parent", "Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "push", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Ljava/lang/ThreadLocal;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "pop", "(Ljava/lang/ThreadLocal;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
