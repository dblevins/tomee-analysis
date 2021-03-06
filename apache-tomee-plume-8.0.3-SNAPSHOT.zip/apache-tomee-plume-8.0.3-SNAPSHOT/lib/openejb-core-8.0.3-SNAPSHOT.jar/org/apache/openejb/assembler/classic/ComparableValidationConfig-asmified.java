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
public class ComparableValidationConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/assembler/classic/ComparableValidationConfig", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "providerClassName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageInterpolatorClass", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "traversableResolverClass", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constraintFactoryClass", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parameterNameProviderClass", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "version", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "propertyTypes", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constraintMappings", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "executableValidationEnabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validatedTypes", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "hash", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Properties;Ljava/util/List;ZLjava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Properties;Ljava/util/List<Ljava/lang/String;>;ZLjava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "providerClassName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "messageInterpolatorClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "traversableResolverClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintFactoryClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "parameterNameProviderClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "version", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "propertyTypes", "Ljava/util/Properties;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintMappings", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "executableValidationEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "validatedTypes", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "hashCode", "()I", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "hashCode", "()I", true);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitInsn(ICONST_1);
Label label17 = new Label();
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label18);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "hashCode", "()I", true);
Label label19 = new Label();
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Properties", "java/util/List", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "hash", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 12);
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
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ComparableValidationConfig");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "executableValidationEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "executableValidationEnabled", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/assembler/classic/ComparableValidationConfig"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintFactoryClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintFactoryClass", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintMappings", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "constraintMappings", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "messageInterpolatorClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "messageInterpolatorClass", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "parameterNameProviderClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "parameterNameProviderClass", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "propertyTypes", "Ljava/util/Properties;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "propertyTypes", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "providerClassName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "providerClassName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "traversableResolverClass", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "traversableResolverClass", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "validatedTypes", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "validatedTypes", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "version", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "version", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ComparableValidationConfig", "hash", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
