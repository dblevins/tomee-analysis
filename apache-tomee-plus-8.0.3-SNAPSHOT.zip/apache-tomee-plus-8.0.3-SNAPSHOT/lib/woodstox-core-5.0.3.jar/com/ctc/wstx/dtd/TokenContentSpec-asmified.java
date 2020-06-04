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
public class TokenContentSpecDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/dtd/TokenContentSpec", null, "com/ctc/wstx/dtd/ContentSpec", null);

classWriter.visitInnerClass("com/ctc/wstx/dtd/TokenContentSpec$Validator", "com/ctc/wstx/dtd/TokenContentSpec", "Validator", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sDummy", "Lcom/ctc/wstx/dtd/TokenContentSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mElemName", "Lcom/ctc/wstx/util/PrefixedName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(CLcom/ctc/wstx/util/PrefixedName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/ContentSpec", "<init>", "(C)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "construct", "(CLcom/ctc/wstx/util/PrefixedName;)Lcom/ctc/wstx/dtd/TokenContentSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/TokenContentSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/TokenContentSpec", "<init>", "(CLcom/ctc/wstx/util/PrefixedName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDummySpec", "()Lcom/ctc/wstx/dtd/TokenContentSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/dtd/TokenContentSpec", "sDummy", "Lcom/ctc/wstx/dtd/TokenContentSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLeaf", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitIntInsn(BIPUSH, 32);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Lcom/ctc/wstx/util/PrefixedName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSimpleValidator", "()Lcom/ctc/wstx/dtd/StructValidator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/TokenContentSpec$Validator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/TokenContentSpec$Validator", "<init>", "(CLcom/ctc/wstx/util/PrefixedName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rewrite", "()Lcom/ctc/wstx/dtd/ModelNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/TokenModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/TokenModel", "<init>", "(Lcom/ctc/wstx/util/PrefixedName;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitIntInsn(BIPUSH, 42);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/StarModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/StarModel", "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/ctc/wstx/dtd/TokenModel"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitIntInsn(BIPUSH, 63);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/OptionalModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/OptionalModel", "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitIntInsn(BIPUSH, 43);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/ConcatModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/StarModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/TokenModel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/TokenModel", "<init>", "(Lcom/ctc/wstx/util/PrefixedName;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/StarModel", "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/ConcatModel", "<init>", "(Lcom/ctc/wstx/dtd/ModelNode;Lcom/ctc/wstx/dtd/ModelNode;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitIntInsn(BIPUSH, 32);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/PrefixedName", "toString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mElemName", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/PrefixedName", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/TokenContentSpec", "mArity", "C");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/dtd/TokenContentSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/util/PrefixedName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("*");
methodVisitor.visitLdcInsn("*");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/util/PrefixedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/TokenContentSpec", "<init>", "(CLcom/ctc/wstx/util/PrefixedName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/dtd/TokenContentSpec", "sDummy", "Lcom/ctc/wstx/dtd/TokenContentSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
