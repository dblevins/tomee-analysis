package asm.org.apache.openejb.util;
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
public class Pool$ReplaceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/Pool$Replace", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Entry", "org/apache/openejb/util/Pool", "Entry", ACC_PUBLIC | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Replace", "org/apache/openejb/util/Pool", "Replace", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Supplier", "org/apache/openejb/util/Pool", "Supplier", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Stats", "org/apache/openejb/util/Pool", "Stats", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "expired", "Lorg/apache/openejb/util/Pool$Entry;", "Lorg/apache/openejb/util/Pool<TT;>.Entry;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "offset", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/util/Pool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;)V", "(Lorg/apache/openejb/util/Pool<TT;>.Entry;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Replace", "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;J)V", "(Lorg/apache/openejb/util/Pool<TT;>.Entry;J)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Replace", "expired", "Lorg/apache/openejb/util/Pool$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Replace", "offset", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "running", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "expired", "Lorg/apache/openejb/util/Pool$Entry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "discard", "(Lorg/apache/openejb/util/Pool$Entry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$3300", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Supplier;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/Pool$Supplier", "create", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "expired", "Lorg/apache/openejb/util/Pool$Entry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "discard", "(Lorg/apache/openejb/util/Pool$Entry;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/Pool$Entry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "offset", "J");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Entry", "<init>", "(Lorg/apache/openejb/util/Pool;Ljava/lang/Object;JLorg/apache/openejb/util/Pool$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "expired", "Lorg/apache/openejb/util/Pool$Entry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool$Entry", "hasHardReference", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool$Entry", "harden", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/util/Pool$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "push", "(Lorg/apache/openejb/util/Pool$Entry;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3400", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "expired", "Lorg/apache/openejb/util/Pool$Entry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "discard", "(Lorg/apache/openejb/util/Pool$Entry;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3400", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Replace", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3400", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;Lorg/apache/openejb/util/Pool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Replace", "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;JLorg/apache/openejb/util/Pool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Replace", "<init>", "(Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Pool$Entry;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
