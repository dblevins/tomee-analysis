package asm.org.eclipse.jdt.internal.compiler.util;
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
public class SimpleLookupTableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", null, "java/lang/Object", new String[] { "java/lang/Cloneable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "keyTable", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "valueTable", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "elementSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "threshold", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2F);
methodVisitor.visitLdcInsn(new Float("1.5"));
methodVisitor.visitInsn(FMUL);
methodVisitor.visitInsn(F2I);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsKey", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keyForValue", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(DUP_X2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "rehash", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_0);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object", "java/lang/Object"}, 1, new Object[] {"[Ljava/lang/Object;"});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitInsn(AALOAD);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "rehash", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeValue", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_0);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 1, new Object[] {"[Ljava/lang/Object;"});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/Object"}, 2, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "rehash", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "rehash", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", Opcodes.TOP, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, -1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "elementSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "threshold", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/String", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "valueTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "keyTable", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" -> ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/String", "java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/jdt/internal/compiler/util/SimpleLookupTable", "java/lang/String", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
