package asm.com.fasterxml.jackson.dataformat.yaml.snakeyaml.error;
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
public class MarkedYAMLExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", null, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/YAMLException", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/core/JsonParser;Lorg/yaml/snakeyaml/error/MarkedYAMLException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/YAMLException", "<init>", "(Lcom/fasterxml/jackson/core/JsonParser;Lorg/yaml/snakeyaml/error/YAMLException;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "from", "(Lcom/fasterxml/jackson/core/JsonParser;Lorg/yaml/snakeyaml/error/MarkedYAMLException;)Lcom/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "<init>", "(Lcom/fasterxml/jackson/core/JsonParser;Lorg/yaml/snakeyaml/error/MarkedYAMLException;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/error/MarkedYAMLException", "getContext", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContextMark", "()Lcom/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/error/MarkedYAMLException", "getContextMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark", "from", "(Lorg/yaml/snakeyaml/error/Mark;)Lcom/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProblem", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/error/MarkedYAMLException", "getProblem", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProblemMark", "()Lcom/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/MarkedYAMLException", "_source", "Lorg/yaml/snakeyaml/error/MarkedYAMLException;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/error/MarkedYAMLException", "getProblemMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark", "from", "(Lorg/yaml/snakeyaml/error/Mark;)Lcom/fasterxml/jackson/dataformat/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
