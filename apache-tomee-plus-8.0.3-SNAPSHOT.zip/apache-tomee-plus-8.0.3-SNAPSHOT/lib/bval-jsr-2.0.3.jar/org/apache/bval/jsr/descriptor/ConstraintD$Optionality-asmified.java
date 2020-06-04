package asm.org.apache.bval.jsr.descriptor;
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
public class ConstraintD$OptionalityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "Ljava/lang/Enum<Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "org/apache/bval/jsr/descriptor/ConstraintD", "Optionality", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIONAL", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRED", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "$VALUES", "[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOptional", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "OPTIONAL", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIONAL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "OPTIONAL", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "REQUIRED", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "OPTIONAL", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "REQUIRED", "Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/descriptor/ConstraintD$Optionality", "$VALUES", "[Lorg/apache/bval/jsr/descriptor/ConstraintD$Optionality;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
