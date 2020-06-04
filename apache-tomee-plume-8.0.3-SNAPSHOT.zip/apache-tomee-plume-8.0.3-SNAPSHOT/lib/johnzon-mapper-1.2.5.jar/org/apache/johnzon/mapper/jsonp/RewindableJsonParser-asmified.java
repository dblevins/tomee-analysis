package asm.org.apache.johnzon.mapper.jsonp;
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
public class RewindableJsonParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", null, "java/lang/Object", new String[] { "javax/json/stream/JsonParser" });

classWriter.visitInnerClass("javax/json/stream/JsonParser$Event", "javax/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljavax/json/stream/JsonParser;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "last", "Ljavax/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/json/stream/JsonParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLast", "()Ljavax/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "last", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljavax/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "next", "()Ljavax/json/stream/JsonParser$Event;", true);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "last", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getString", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIntegralNumber", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "isIntegralNumber", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getInt", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLong", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getLong", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBigDecimal", "()Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getBigDecimal", "()Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocation", "()Ljavax/json/stream/JsonLocation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getLocation", "()Ljavax/json/stream/JsonLocation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObject", "()Ljavax/json/JsonObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getObject", "()Ljavax/json/JsonObject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljavax/json/JsonValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getValue", "()Ljavax/json/JsonValue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getArray", "()Ljavax/json/JsonArray;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getArray", "()Ljavax/json/JsonArray;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getArrayStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljavax/json/JsonValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getArrayStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljava/util/Map$Entry<Ljava/lang/String;Ljavax/json/JsonValue;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getObjectStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueStream", "()Ljava/util/stream/Stream;", "()Ljava/util/stream/Stream<Ljavax/json/JsonValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "getValueStream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipArray", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "skipArray", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipObject", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/jsonp/RewindableJsonParser", "delegate", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/stream/JsonParser", "skipObject", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
