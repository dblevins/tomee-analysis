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
public class YAMLMapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", null, "com/fasterxml/jackson/databind/ObjectMapper", null);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature", "com/fasterxml/jackson/dataformat/yaml/YAMLParser", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper", "<init>", "(Lcom/fasterxml/jackson/core/JsonFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ObjectMapper", "<init>", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "builder", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "builder", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper$Builder", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_checkInvalidCopy", "(Ljava/lang/Class;)V", false);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "<init>", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/dataformat/yaml/YAMLMapper"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;Z)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/dataformat/yaml/YAMLMapper"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_jsonFactory", "Lcom/fasterxml/jackson/core/JsonFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_jsonFactory", "Lcom/fasterxml/jackson/core/JsonFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "enable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_jsonFactory", "Lcom/fasterxml/jackson/core/JsonFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_jsonFactory", "Lcom/fasterxml/jackson/core/JsonFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory", "disable", "(Lcom/fasterxml/jackson/dataformat/yaml/YAMLParser$Feature;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getFactory", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "_jsonFactory", "Lcom/fasterxml/jackson/core/JsonFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getFactory", "()Lcom/fasterxml/jackson/core/JsonFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "getFactory", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLMapper", "copy", "()Lcom/fasterxml/jackson/dataformat/yaml/YAMLMapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
