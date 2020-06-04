package asm.com.fasterxml.jackson.databind.ser.std;
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
public class NumberSerializers$BaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "<T:Ljava/lang/Object;>Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer<TT;>;Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;", "com/fasterxml/jackson/databind/ser/std/StdScalarSerializer", new String[] { "com/fasterxml/jackson/databind/ser/ContextualSerializer" });

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonParser$NumberType", "com/fasterxml/jackson/core/JsonParser", "NumberType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "com/fasterxml/jackson/databind/ser/std/NumberSerializers", "Base", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Value", "com/fasterxml/jackson/annotation/JsonFormat", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/NumberSerializers$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Shape", "com/fasterxml/jackson/annotation/JsonFormat", "Shape", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_numberType", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_schemaType", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_isInt", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/Class;Lcom/fasterxml/jackson/core/JsonParser$NumberType;Ljava/lang/String;)V", "(Ljava/lang/Class<*>;Lcom/fasterxml/jackson/core/JsonParser$NumberType;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/StdScalarSerializer", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_numberType", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_schemaType", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$NumberType", "INT", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$NumberType", "LONG", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$NumberType", "BIG_INTEGER", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "java/lang/Class", "com/fasterxml/jackson/core/JsonParser$NumberType", "java/lang/String"}, 1, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base"});
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "java/lang/Class", "com/fasterxml/jackson/core/JsonParser$NumberType", "java/lang/String"}, 2, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_isInt", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchema", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JsonNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_schemaType", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "createSchemaNode", "(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptJsonFormatVisitor", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;)V", null, new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_isInt", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_numberType", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "visitIntFormat", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser$NumberType;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "_numberType", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "visitFloatFormat", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser$NumberType;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContextual", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>;", new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "handledType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "findFormatOverrides", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$1", "$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonFormat$Value", "getShape", "()Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label0, new int[] { 1 }, new Label[] { label1 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/annotation/JsonFormat$Value"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializers$Base", "handledType", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "bigDecimalAsStringSerializer", "()Lcom/fasterxml/jackson/databind/JsonSerializer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "instance", "Lcom/fasterxml/jackson/databind/ser/std/ToStringSerializer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
