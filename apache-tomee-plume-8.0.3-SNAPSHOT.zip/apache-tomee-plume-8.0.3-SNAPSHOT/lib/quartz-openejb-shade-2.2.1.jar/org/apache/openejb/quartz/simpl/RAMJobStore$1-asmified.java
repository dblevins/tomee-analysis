package asm.org.apache.openejb.quartz.simpl;
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
public class RAMJobStore$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER | ACC_SYNTHETIC, "org/apache/openejb/quartz/simpl/RAMJobStore$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/openejb/quartz/simpl/RAMJobStore", null, null);

classWriter.visitInnerClass("org/apache/openejb/quartz/simpl/RAMJobStore$1", "org/apache/openejb/quartz/simpl/RAMJobStore", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "org/apache/openejb/quartz/impl/matchers/StringMatcher", "StringOperatorName", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$quartz$impl$matchers$StringMatcher$StringOperatorName", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "values", "()[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/simpl/RAMJobStore$1", "$SwitchMap$org$quartz$impl$matchers$StringMatcher$StringOperatorName", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/simpl/RAMJobStore$1", "$SwitchMap$org$quartz$impl$matchers$StringMatcher$StringOperatorName", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
