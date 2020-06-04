package asm.org.apache.openejb.assembler.classic;
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
public class JndiBuilder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/openejb/assembler/classic/JndiBuilder", null, null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "org/apache/openejb/assembler/classic/JndiBuilder", "JndiNameStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "Interface", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "values", "()[Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "REMOTE_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "LOCAL_HOME", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_LOCAL", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$1", "$SwitchMap$org$apache$openejb$assembler$classic$JndiBuilder$JndiNameStrategy$Interface", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "BUSINESS_REMOTE", "Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
