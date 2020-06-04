package asm.com.fasterxml.jackson.dataformat.yaml;
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
public class YAMLFactoryBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "Lcom/fasterxml/jackson/core/TSFBuilder<Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;>;", "com/fasterxml/jackson/core/TSFBuilder", null);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_formatGeneratorFeatures", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/TSFBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "DEFAULT_YAML_GENERATOR_FEATURE_FLAGS", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/TSFBuilder", "<init>", "(Lcom/fasterxml/jackson/core/JsonFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "_yamlGeneratorFeatures", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_this", "()Lcom/fasterxml/jackson/core/TSFBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_this", "()Lcom/fasterxml/jackson/core/TSFBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_this", "()Lcom/fasterxml/jackson/core/TSFBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_this", "()Lcom/fasterxml/jackson/core/TSFBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "formatGeneratorFeaturesMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "_formatGeneratorFeatures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "build", "()Lcom/fasterxml/jackson/core/JsonFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactoryBuilder", "build", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
