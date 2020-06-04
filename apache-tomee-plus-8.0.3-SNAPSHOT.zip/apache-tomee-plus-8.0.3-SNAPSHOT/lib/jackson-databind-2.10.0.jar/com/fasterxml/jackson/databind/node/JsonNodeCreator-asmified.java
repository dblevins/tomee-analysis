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
public class JsonNodeCreatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/fasterxml/jackson/databind/node/JsonNodeCreator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "booleanNode", "(Z)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullNode", "()Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(B)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Byte;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(S)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Short;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(I)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Integer;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(J)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Long;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/math/BigInteger;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(F)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Float;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(D)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/lang/Double;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numberNode", "(Ljava/math/BigDecimal;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "textNode", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "binaryNode", "([B)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "binaryNode", "([BII)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pojoNode", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rawValueNode", "(Lcom/fasterxml/jackson/databind/util/RawValue;)Lcom/fasterxml/jackson/databind/node/ValueNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "arrayNode", "()Lcom/fasterxml/jackson/databind/node/ArrayNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "arrayNode", "(I)Lcom/fasterxml/jackson/databind/node/ArrayNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "objectNode", "()Lcom/fasterxml/jackson/databind/node/ObjectNode;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
