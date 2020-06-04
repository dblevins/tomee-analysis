package asm.org.apache.johnzon.core;
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
public class JohnzonJsonParser$JohnzonJsonParserWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", null, "java/lang/Object", new String[] { "org/apache/johnzon/core/JohnzonJsonParser" });

classWriter.visitInnerClass("org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "org/apache/johnzon/core/JohnzonJsonParser", "JohnzonJsonParserWrapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/json/stream/JsonParser$Event", "jakarta/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jsonParser", "Ljakarta/json/stream/JsonParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/json/stream/JsonParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFitLong", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/johnzon/core/JohnzonJsonParser;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/johnzon/core/JohnzonJsonParser;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/core/JohnzonJsonParser");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/core/JohnzonJsonParser", "isFitLong", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotTooLong", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljakarta/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "next", "()Ljakarta/json/stream/JsonParser$Event;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getString", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIntegralNumber", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "isIntegralNumber", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getInt", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLong", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getLong", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBigDecimal", "()Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getBigDecimal", "()Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocation", "()Ljakarta/json/stream/JsonLocation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getLocation", "()Ljakarta/json/stream/JsonLocation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObject", "()Ljakarta/json/JsonObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getObject", "()Ljakarta/json/JsonObject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljakarta/json/JsonValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getValue", "()Ljakarta/json/JsonValue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getArray", "()Ljakarta/json/JsonArray;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getArray", "()Ljakarta/json/JsonArray;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getArrayStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljakarta/json/JsonValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getArrayStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljava/util/Map$Entry<Ljava/lang/String;Ljakarta/json/JsonValue;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getObjectStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljakarta/json/JsonValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "getValueStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipArray", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "skipArray", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipObject", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JohnzonJsonParser$JohnzonJsonParserWrapper", "jsonParser", "Ljakarta/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonParser", "skipObject", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
