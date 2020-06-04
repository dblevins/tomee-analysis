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
public class NumberSerializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "Lcom/fasterxml/jackson/databind/ser/std/StdScalarSerializer<Ljava/lang/Number;>;Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;", "com/fasterxml/jackson/databind/ser/std/StdScalarSerializer", new String[] { "com/fasterxml/jackson/databind/ser/ContextualSerializer" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lcom/fasterxml/jackson/databind/annotation/JacksonStdImpl;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/NumberSerializer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/NumberSerializer$BigDecimalAsStringSerializer", "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "BigDecimalAsStringSerializer", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Value", "com/fasterxml/jackson/annotation/JsonFormat", "Value", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Shape", "com/fasterxml/jackson/annotation/JsonFormat", "Shape", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonParser$NumberType", "com/fasterxml/jackson/core/JsonParser", "NumberType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "instance", "Lcom/fasterxml/jackson/databind/ser/std/NumberSerializer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "MAX_BIG_DECIMAL_SCALE", "I", null, new Integer(9999));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_isInt", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<+Ljava/lang/Number;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/StdScalarSerializer", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer", "java/lang/Class"}, 1, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer", "java/lang/Class"}, 2, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "_isInt", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContextual", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>;", new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "handledType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "findFormatOverrides", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;Ljava/lang/Class;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/NumberSerializer$1", "$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonFormat$Value", "getShape", "()Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/annotation/JsonFormat$Shape", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label0, new int[] { 1 }, new Label[] { label1 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/annotation/JsonFormat$Value"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "handledType", "()Ljava/lang/Class;", false);
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serialize", "(Ljava/lang/Number;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/math/BigDecimal");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigDecimal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(Ljava/math/BigDecimal;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/math/BigInteger");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Long");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(J)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Double");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "doubleValue", "()D", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(D)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Float");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "floatValue", "()F", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(F)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Integer");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Byte");
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Short");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator", "writeNumber", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchema", "(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JsonNode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "_isInt", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("integer");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer"});
methodVisitor.visitLdcInsn("number");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer", "com/fasterxml/jackson/databind/SerializerProvider", "java/lang/reflect/Type"}, 2, new Object[] {"com/fasterxml/jackson/databind/ser/std/NumberSerializer", "java/lang/String"});
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "createSchemaNode", "(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptJsonFormatVisitor", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;)V", null, new String[] { "com/fasterxml/jackson/databind/JsonMappingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "_isInt", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$NumberType", "BIG_INTEGER", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "visitIntFormat", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser$NumberType;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "handledType", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$NumberType", "BIG_DECIMAL", "Lcom/fasterxml/jackson/core/JsonParser$NumberType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "visitFloatFormat", "(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/core/JsonParser$NumberType;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatVisitorWrapper", "expectNumberFormat", "(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonNumberFormatVisitor;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "bigDecimalAsStringSerializer", "()Lcom/fasterxml/jackson/databind/JsonSerializer;", "()Lcom/fasterxml/jackson/databind/JsonSerializer<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/NumberSerializer$BigDecimalAsStringSerializer", "BD_INSTANCE", "Lcom/fasterxml/jackson/databind/ser/std/NumberSerializer$BigDecimalAsStringSerializer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "serialize", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Number");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "serialize", "(Ljava/lang/Number;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/NumberSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Number;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/ser/std/NumberSerializer", "instance", "Lcom/fasterxml/jackson/databind/ser/std/NumberSerializer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
