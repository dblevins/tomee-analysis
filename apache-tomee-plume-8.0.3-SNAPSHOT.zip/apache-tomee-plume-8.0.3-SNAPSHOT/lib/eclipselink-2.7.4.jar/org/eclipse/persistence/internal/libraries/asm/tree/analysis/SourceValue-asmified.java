package asm.org.eclipse.persistence.internal.libraries.asm.tree.analysis;
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
public class SourceValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Value" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "insns", "Ljava/util/Set;", "Ljava/util/Set<Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "<init>", "(ILjava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ILorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SmallSet", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ILjava/util/Set;)V", "(ILjava/util/Set<Lorg/eclipse/persistence/internal/libraries/asm/tree/AbstractInsnNode;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "size", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "equals", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/SourceValue", "insns", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "hashCode", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
