package asm.com.fasterxml.jackson.databind.node;
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
public class ContainerNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/node/ContainerNode", "<T:Lcom/fasterxml/jackson/databind/node/ContainerNode<TT;>;>Lcom/fasterxml/jackson/databind/node/BaseJsonNode;Lcom/fasterxml/jackson/databind/node/JsonNodeCreator;", "com/fasterxml/jackson/databind/node/BaseJsonNode", new String[] { "com/fasterxml/jackson/databind/node/JsonNodeCreator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/node/BaseJsonNode", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/node/BaseJsonNode", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asToken", "()Lcom/fasterxml/jackson/core/JsonToken;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asText", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(I)Lcom/fasterxml/jackson/databind/JsonNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "booleanNode", "(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "booleanNode", "(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "missingNode", "()Lcom/fasterxml/jackson/databind/JsonNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "missingNode", "()Lcom/fasterxml/jackson/databind/JsonNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "nullNode", "()Lcom/fasterxml/jackson/databind/node/NullNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "nullNode", "()Lcom/fasterxml/jackson/databind/node/NullNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "arrayNode", "()Lcom/fasterxml/jackson/databind/node/ArrayNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "arrayNode", "()Lcom/fasterxml/jackson/databind/node/ArrayNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "arrayNode", "(I)Lcom/fasterxml/jackson/databind/node/ArrayNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "arrayNode", "(I)Lcom/fasterxml/jackson/databind/node/ArrayNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "objectNode", "()Lcom/fasterxml/jackson/databind/node/ObjectNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "objectNode", "()Lcom/fasterxml/jackson/databind/node/ObjectNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(B)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(B)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(S)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(S)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(I)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(I)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(J)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(J)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(F)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(F)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(D)Lcom/fasterxml/jackson/databind/node/NumericNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(D)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Byte;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Byte;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Short;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Short;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Integer;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Integer;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Long;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Long;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "numberNode", "(Ljava/lang/Double;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "numberNode", "(Ljava/lang/Double;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "textNode", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "textNode", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "binaryNode", "([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "binaryNode", "([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "binaryNode", "([BII)Lcom/fasterxml/jackson/databind/node/BinaryNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "binaryNode", "([BII)Lcom/fasterxml/jackson/databind/node/BinaryNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "pojoNode", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "pojoNode", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "rawValueNode", "(Lcom/fasterxml/jackson/databind/util/RawValue;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/node/ContainerNode", "_nodeFactory", "Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/JsonNodeFactory", "rawValueNode", "(Lcom/fasterxml/jackson/databind/util/RawValue;)Lcom/fasterxml/jackson/databind/node/ValueNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeAll", "()Lcom/fasterxml/jackson/databind/node/ContainerNode;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(I)Lcom/fasterxml/jackson/core/TreeNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "get", "(I)Lcom/fasterxml/jackson/databind/JsonNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/TreeNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "get", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "binaryNode", "([BII)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "binaryNode", "([BII)Lcom/fasterxml/jackson/databind/node/BinaryNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "binaryNode", "([B)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "binaryNode", "([B)Lcom/fasterxml/jackson/databind/node/BinaryNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "textNode", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "textNode", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(D)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(D)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(F)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(F)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(J)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(J)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(I)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(I)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(S)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(S)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "numberNode", "(B)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "numberNode", "(B)Lcom/fasterxml/jackson/databind/node/NumericNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "nullNode", "()Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "nullNode", "()Lcom/fasterxml/jackson/databind/node/NullNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "booleanNode", "(Z)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/node/ContainerNode", "booleanNode", "(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
