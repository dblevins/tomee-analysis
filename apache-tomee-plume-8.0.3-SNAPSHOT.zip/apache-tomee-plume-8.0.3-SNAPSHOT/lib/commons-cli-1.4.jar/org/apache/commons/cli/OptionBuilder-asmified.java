package asm.org.apache.commons.cli;
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
public class OptionBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_DEPRECATED, "org/apache/commons/cli/OptionBuilder", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "longopt", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "description", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "argName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "required", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "numberOfArgs", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "type", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "optionalArg", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "valuesep", "C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "description", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "argName", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "longopt", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "required", "Z");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "optionalArg", "Z");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "valuesep", "C");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withLongOpt", "(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "longopt", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasArg", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasArg", "(Z)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withArgName", "(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "argName", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isRequired", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "required", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withValueSeparator", "(C)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "valuesep", "C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withValueSeparator", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "valuesep", "C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isRequired", "(Z)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "required", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasArgs", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasArgs", "(I)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasOptionalArg", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "optionalArg", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasOptionalArgs", "()Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "optionalArg", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasOptionalArgs", "(I)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "optionalArg", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "withType", "(Ljava/lang/Object;)Lorg/apache/commons/cli/OptionBuilder;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "withType", "(Ljava/lang/Class;)Lorg/apache/commons/cli/OptionBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withType", "(Ljava/lang/Class;)Lorg/apache/commons/cli/OptionBuilder;", "(Ljava/lang/Class<*>;)Lorg/apache/commons/cli/OptionBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "type", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withDescription", "(Ljava/lang/String;)Lorg/apache/commons/cli/OptionBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "description", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(C)Lorg/apache/commons/cli/Option;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(C)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "create", "(Ljava/lang/String;)Lorg/apache/commons/cli/Option;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "()Lorg/apache/commons/cli/Option;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "longopt", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "reset", "()V", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("must specify longopt");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "create", "(Ljava/lang/String;)Lorg/apache/commons/cli/Option;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljava/lang/String;)Lorg/apache/commons/cli/Option;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/cli/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "description", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/cli/Option", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "longopt", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setLongOpt", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "required", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setRequired", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "optionalArg", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setOptionalArg", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setArgs", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "type", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setType", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "valuesep", "C");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setValueSeparator", "(C)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/cli/OptionBuilder", "argName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/cli/Option", "setArgName", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "reset", "()V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "numberOfArgs", "I");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/cli/OptionBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/cli/OptionBuilder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/cli/OptionBuilder", "INSTANCE", "Lorg/apache/commons/cli/OptionBuilder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/cli/OptionBuilder", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
