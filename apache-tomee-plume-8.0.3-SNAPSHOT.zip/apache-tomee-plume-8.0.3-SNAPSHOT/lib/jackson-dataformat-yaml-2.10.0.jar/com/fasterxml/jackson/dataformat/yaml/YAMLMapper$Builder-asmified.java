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
public class YAMLMapper$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "Lcom/fasterxml/jackson/databind/cfg/MapperBuilder<Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;>;", "com/fasterxml/jackson/databind/cfg/MapperBuilder", null);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/cfg/MapperBuilder", "<init>", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "enable", "([Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "_mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "disable", "([Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "_mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "_mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "_mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
