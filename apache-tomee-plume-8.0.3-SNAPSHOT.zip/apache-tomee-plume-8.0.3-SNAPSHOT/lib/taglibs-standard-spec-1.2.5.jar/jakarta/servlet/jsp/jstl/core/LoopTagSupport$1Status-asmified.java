package asm.jakarta.servlet.jsp.jstl.core;
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
public class LoopTagSupport$1StatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", null, "java/lang/Object", new String[] { "jakarta/servlet/jsp/jstl/core/LoopTagStatus" });

classWriter.visitOuterClass("jakarta/servlet/jsp/jstl/core/LoopTagSupport", "getLoopStatus", "()Ljakarta/servlet/jsp/jstl/core/LoopTagStatus;");

classWriter.visitInnerClass("jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", null, "Status", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCurrent", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "getCurrent", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "access$000", "(Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "begin", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "access$100", "(Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFirst", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "access$000", "(Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLast", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "access$200", "(Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBegin", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "beginSpecified", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "begin", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnd", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "endSpecified", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "end", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStep", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "stepSpecified", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport$1Status", "this$0", "Ljakarta/servlet/jsp/jstl/core/LoopTagSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/servlet/jsp/jstl/core/LoopTagSupport", "step", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
