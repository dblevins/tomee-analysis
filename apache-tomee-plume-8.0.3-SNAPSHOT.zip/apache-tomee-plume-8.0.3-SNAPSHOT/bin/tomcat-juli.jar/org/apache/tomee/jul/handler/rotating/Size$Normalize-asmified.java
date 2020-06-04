package asm.org.apache.tomee.jul.handler.rotating;
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
public class Size$NormalizeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/tomee/jul/handler/rotating/Size$Normalize", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "org/apache/tomee/jul/handler/rotating/Size", "SizeUnit", ACC_PRIVATE | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$Normalize", "org/apache/tomee/jul/handler/rotating/Size", "Normalize", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "a", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "b", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "base", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "lowest", "(Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "base", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize", "org/apache/tomee/jul/handler/rotating/Size", "org/apache/tomee/jul/handler/rotating/Size"}, 1, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "base", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "convert", "(JLorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;)J", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize", "org/apache/tomee/jul/handler/rotating/Size", "org/apache/tomee/jul/handler/rotating/Size"}, 2, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize", Opcodes.LONG});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "a", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "base", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "convert", "(JLorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;)J", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize", "org/apache/tomee/jul/handler/rotating/Size", "org/apache/tomee/jul/handler/rotating/Size"}, 2, new Object[] {"org/apache/tomee/jul/handler/rotating/Size$Normalize", Opcodes.LONG});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "b", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "lowest", "(Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$100", "(Lorg/apache/tomee/jul/handler/rotating/Size;)J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "values", "()[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "ordinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/jul/handler/rotating/Size", "access$000", "(Lorg/apache/tomee/jul/handler/rotating/Size;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "ordinal", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "<init>", "(Lorg/apache/tomee/jul/handler/rotating/Size;Lorg/apache/tomee/jul/handler/rotating/Size;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/tomee/jul/handler/rotating/Size$Normalize;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "a", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/tomee/jul/handler/rotating/Size$Normalize;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "b", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/tomee/jul/handler/rotating/Size$Normalize;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/jul/handler/rotating/Size$Normalize", "base", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
