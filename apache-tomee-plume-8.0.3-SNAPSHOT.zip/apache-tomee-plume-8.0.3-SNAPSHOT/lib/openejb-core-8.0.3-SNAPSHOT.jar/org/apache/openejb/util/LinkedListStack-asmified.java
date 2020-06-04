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
public class LinkedListStackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/util/LinkedListStack", null, "java/lang/Object", new String[] { "org/apache/openejb/util/Stack" });

classWriter.visitInnerClass("org/apache/openejb/util/LinkedListStack$LinkedEntry", "org/apache/openejb/util/LinkedListStack", "LinkedEntry", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/util/LinkedListStack", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LinkedListStack$LinkedEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "<init>", "(Ljava/lang/Object;Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "push", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LinkedListStack$LinkedEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "<init>", "(Ljava/lang/Object;Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "next", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "set", "(Ljava/lang/Object;Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;)Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "pop", "()Ljava/lang/Object;", null, new String[] { "java/util/EmptyStackException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/util/LinkedListStack$LinkedEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "next", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "occupiedEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "value", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LinkedListStack$LinkedEntry", "set", "(Ljava/lang/Object;Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;)Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "vacantEntries", "Lorg/apache/openejb/util/LinkedListStack$LinkedEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LinkedListStack", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LinkedListStack", "size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
