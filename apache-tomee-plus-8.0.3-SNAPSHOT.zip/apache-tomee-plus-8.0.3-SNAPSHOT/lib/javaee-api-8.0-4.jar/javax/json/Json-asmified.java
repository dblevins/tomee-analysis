package asm.javax.json;
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
public class JsonDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/json/Json", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParser", "(Ljava/io/Reader;)Ljavax/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createParser", "(Ljava/io/Reader;)Ljavax/json/stream/JsonParser;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParser", "(Ljava/io/InputStream;)Ljavax/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createParser", "(Ljava/io/InputStream;)Ljavax/json/stream/JsonParser;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGenerator", "(Ljava/io/Writer;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createGenerator", "(Ljava/io/Writer;)Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGenerator", "(Ljava/io/OutputStream;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createGenerator", "(Ljava/io/OutputStream;)Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParserFactory", "(Ljava/util/Map;)Ljavax/json/stream/JsonParserFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/json/stream/JsonParserFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createParserFactory", "(Ljava/util/Map;)Ljavax/json/stream/JsonParserFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGeneratorFactory", "(Ljava/util/Map;)Ljavax/json/stream/JsonGeneratorFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/json/stream/JsonGeneratorFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createGeneratorFactory", "(Ljava/util/Map;)Ljavax/json/stream/JsonGeneratorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriter", "(Ljava/io/Writer;)Ljavax/json/JsonWriter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createWriter", "(Ljava/io/Writer;)Ljavax/json/JsonWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriter", "(Ljava/io/OutputStream;)Ljavax/json/JsonWriter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createWriter", "(Ljava/io/OutputStream;)Ljavax/json/JsonWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReader", "(Ljava/io/Reader;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createReader", "(Ljava/io/Reader;)Ljavax/json/JsonReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReader", "(Ljava/io/InputStream;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createReader", "(Ljava/io/InputStream;)Ljavax/json/JsonReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReaderFactory", "(Ljava/util/Map;)Ljavax/json/JsonReaderFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/json/JsonReaderFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createReaderFactory", "(Ljava/util/Map;)Ljavax/json/JsonReaderFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriterFactory", "(Ljava/util/Map;)Ljavax/json/JsonWriterFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/json/JsonWriterFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createWriterFactory", "(Ljava/util/Map;)Ljavax/json/JsonWriterFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "()Ljavax/json/JsonArrayBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createArrayBuilder", "()Ljavax/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "()Ljavax/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createObjectBuilder", "()Ljavax/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "(Ljavax/json/JsonObject;)Ljavax/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createObjectBuilder", "(Ljavax/json/JsonObject;)Ljavax/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "(Ljava/util/Map;)Ljavax/json/JsonObjectBuilder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljavax/json/JsonObjectBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createObjectBuilder", "(Ljava/util/Map;)Ljavax/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createBuilderFactory", "(Ljava/util/Map;)Ljavax/json/JsonBuilderFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljavax/json/JsonBuilderFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createBuilderFactory", "(Ljava/util/Map;)Ljavax/json/JsonBuilderFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "(Ljavax/json/JsonArray;)Ljavax/json/JsonArrayBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createArrayBuilder", "(Ljavax/json/JsonArray;)Ljavax/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "(Ljava/util/Collection;)Ljavax/json/JsonArrayBuilder;", "(Ljava/util/Collection<*>;)Ljavax/json/JsonArrayBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createArrayBuilder", "(Ljava/util/Collection;)Ljavax/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/lang/String;)Ljavax/json/JsonString;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(Ljava/lang/String;)Ljavax/json/JsonString;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(I)Ljavax/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(I)Ljavax/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(J)Ljavax/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(J)Ljavax/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(D)Ljavax/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(D)Ljavax/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/math/BigDecimal;)Ljavax/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(Ljava/math/BigDecimal;)Ljavax/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/math/BigInteger;)Ljavax/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createValue", "(Ljava/math/BigInteger;)Ljavax/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatch", "(Ljavax/json/JsonArray;)Ljavax/json/JsonPatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createPatch", "(Ljavax/json/JsonArray;)Ljavax/json/JsonPatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createDiff", "(Ljavax/json/JsonStructure;Ljavax/json/JsonStructure;)Ljavax/json/JsonPatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createDiff", "(Ljavax/json/JsonStructure;Ljavax/json/JsonStructure;)Ljavax/json/JsonPatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatchBuilder", "()Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createPatchBuilder", "()Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatchBuilder", "(Ljavax/json/JsonArray;)Ljavax/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createPatchBuilder", "(Ljavax/json/JsonArray;)Ljavax/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMergePatch", "(Ljavax/json/JsonValue;)Ljavax/json/JsonMergePatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createMergePatch", "(Ljavax/json/JsonValue;)Ljavax/json/JsonMergePatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMergeDiff", "(Ljavax/json/JsonValue;Ljavax/json/JsonValue;)Ljavax/json/JsonMergePatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createMergeDiff", "(Ljavax/json/JsonValue;Ljavax/json/JsonValue;)Ljavax/json/JsonMergePatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPointer", "(Ljava/lang/String;)Ljavax/json/JsonPointer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/spi/JsonProvider", "provider", "()Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createPointer", "(Ljava/lang/String;)Ljavax/json/JsonPointer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "encodePointer", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("~");
methodVisitor.visitLdcInsn("~0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitLdcInsn("~1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "decodePointer", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("~1");
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("~0");
methodVisitor.visitLdcInsn("~");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
