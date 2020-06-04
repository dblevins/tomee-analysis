package asm.org.apache.cxf.phase;
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
public class PhaseInterceptorChain$PhaseInterceptorIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "Ljava/lang/Object;Ljava/util/ListIterator<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", "java/lang/Object", new String[] { "java/util/ListIterator" });

classWriter.visitInnerClass("org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "org/apache/cxf/phase/PhaseInterceptorChain", "InterceptorHolder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "org/apache/cxf/phase/PhaseInterceptorChain", "PhaseInterceptorIterator", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "heads", "[Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "([Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "heads", "[Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "findFirst", "()Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "findFirst", "()Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findFirst", "()Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "heads", "[Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "heads", "[Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "heads", "[Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/cxf/interceptor/Interceptor;", "()Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextInterceptorHolder", "()Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "first", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasPrevious", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previous", "()Lorg/apache/cxf/interceptor/Interceptor;", "()Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Lorg/apache/cxf/interceptor/Interceptor;)V", "(Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Lorg/apache/cxf/interceptor/Interceptor;)V", "(Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "add", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Interceptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "add", "(Lorg/apache/cxf/interceptor/Interceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "set", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Interceptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "set", "(Lorg/apache/cxf/interceptor/Interceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "previous", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "previous", "()Lorg/apache/cxf/interceptor/Interceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain$PhaseInterceptorIterator", "next", "()Lorg/apache/cxf/interceptor/Interceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
