package asm.com.ctc.wstx.dtd;
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
public class StarModelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/dtd/StarModel", null, "com/ctc/wstx/dtd/ModelNode", null);

{
fieldVisitor = classWriter.visitField(0, "mModel", "Lcom/ctc/wstx/dtd/ModelNode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/ModelNode", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cloneModel", "()Lcom/ctc/wstx/dtd/ModelNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/StarModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "cloneModel", "()Lcom/ctc/wstx/dtd/ModelNode;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/StarModel", "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNullable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "indexTokens", "(Ljava/util/List;)V", "(Ljava/util/List<Lcom/ctc/wstx/dtd/TokenModel;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "indexTokens", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFirstPos", "(Ljava/util/BitSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "addFirstPos", "(Ljava/util/BitSet;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addLastPos", "(Ljava/util/BitSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "addLastPos", "(Ljava/util/BitSet;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calcFollowPos", "([Ljava/util/BitSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "calcFollowPos", "([Ljava/util/BitSet;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/util/BitSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/BitSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "addFirstPos", "(Ljava/util/BitSet;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/util/BitSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/BitSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/ModelNode", "addLastPos", "(Ljava/util/BitSet;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/BitSet", "java/util/BitSet", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "nextSetBit", "(I)I", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "or", "(Ljava/util/BitSet;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/StarModel", "mModel", "Lcom/ctc/wstx/dtd/ModelNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
