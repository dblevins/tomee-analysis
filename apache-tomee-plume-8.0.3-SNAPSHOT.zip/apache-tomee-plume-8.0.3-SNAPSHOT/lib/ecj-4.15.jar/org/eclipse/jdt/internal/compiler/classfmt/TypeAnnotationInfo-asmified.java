package asm.org.eclipse.jdt.internal.compiler.classfmt;
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
public class TypeAnnotationInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", null, "org/eclipse/jdt/internal/compiler/classfmt/ClassFileStruct", new String[] { "org/eclipse/jdt/internal/compiler/env/IBinaryTypeAnnotation" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "targetType", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "info", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "info2", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typePath", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "readOffset", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "([B[II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/ClassFileStruct", "<init>", "([B[II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "([B[IIZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "<init>", "([B[II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTableSwitchInsn(0, 23, label1, new Label[] { label0, label0, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label1, label2, label3, label3, label4, label4, label4, label5, label6 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "[B", "[I", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u2At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info2", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u2At", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Target type not handled ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitVarInsn(ILOAD, 6);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "NO_TYPE_PATH", "[I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "u1At", "(I)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IF_ICMPLT, label11);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "constantPoolOffsets", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "structOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "<init>", "([B[IIZZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "readOffset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "()Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "initialize", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/ClassFileStruct", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/classfmt/BinaryTypeFormatter", "annotationToString", "(Lorg/eclipse/jdt/internal/compiler/env/IBinaryTypeAnnotation;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTargetType", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSupertypeIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeParameterIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBoundIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info2", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethodFormalParameterIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getThrowsTypeIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypePath", "()[I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info2", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "targetType", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info2", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "info2", "I");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "typePath", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals", "([I[I)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/TypeAnnotationInfo", "annotation", "Lorg/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/AnnotationInfo", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}