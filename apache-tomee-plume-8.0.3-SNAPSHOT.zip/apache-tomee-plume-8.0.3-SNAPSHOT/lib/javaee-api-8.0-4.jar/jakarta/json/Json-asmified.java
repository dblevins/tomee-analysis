package asm.jakarta.json;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "jakarta/json/Json", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParser", "(Ljava/io/Reader;)Ljakarta/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createParser", "(Ljava/io/Reader;)Ljakarta/json/stream/JsonParser;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParser", "(Ljava/io/InputStream;)Ljakarta/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createParser", "(Ljava/io/InputStream;)Ljakarta/json/stream/JsonParser;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGenerator", "(Ljava/io/Writer;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createGenerator", "(Ljava/io/Writer;)Ljakarta/json/stream/JsonGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGenerator", "(Ljava/io/OutputStream;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createGenerator", "(Ljava/io/OutputStream;)Ljakarta/json/stream/JsonGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParserFactory", "(Ljava/util/Map;)Ljakarta/json/stream/JsonParserFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/json/stream/JsonParserFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createParserFactory", "(Ljava/util/Map;)Ljakarta/json/stream/JsonParserFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGeneratorFactory", "(Ljava/util/Map;)Ljakarta/json/stream/JsonGeneratorFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/json/stream/JsonGeneratorFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createGeneratorFactory", "(Ljava/util/Map;)Ljakarta/json/stream/JsonGeneratorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriter", "(Ljava/io/Writer;)Ljakarta/json/JsonWriter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createWriter", "(Ljava/io/Writer;)Ljakarta/json/JsonWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriter", "(Ljava/io/OutputStream;)Ljakarta/json/JsonWriter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createWriter", "(Ljava/io/OutputStream;)Ljakarta/json/JsonWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReader", "(Ljava/io/Reader;)Ljakarta/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createReader", "(Ljava/io/Reader;)Ljakarta/json/JsonReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReader", "(Ljava/io/InputStream;)Ljakarta/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createReader", "(Ljava/io/InputStream;)Ljakarta/json/JsonReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createReaderFactory", "(Ljava/util/Map;)Ljakarta/json/JsonReaderFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/json/JsonReaderFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createReaderFactory", "(Ljava/util/Map;)Ljakarta/json/JsonReaderFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createWriterFactory", "(Ljava/util/Map;)Ljakarta/json/JsonWriterFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/json/JsonWriterFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createWriterFactory", "(Ljava/util/Map;)Ljakarta/json/JsonWriterFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "()Ljakarta/json/JsonArrayBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createArrayBuilder", "()Ljakarta/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "()Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createObjectBuilder", "()Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "(Ljakarta/json/JsonObject;)Ljakarta/json/JsonObjectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createObjectBuilder", "(Ljakarta/json/JsonObject;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObjectBuilder", "(Ljava/util/Map;)Ljakarta/json/JsonObjectBuilder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/json/JsonObjectBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createObjectBuilder", "(Ljava/util/Map;)Ljakarta/json/JsonObjectBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createBuilderFactory", "(Ljava/util/Map;)Ljakarta/json/JsonBuilderFactory;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljakarta/json/JsonBuilderFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createBuilderFactory", "(Ljava/util/Map;)Ljakarta/json/JsonBuilderFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonArrayBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createArrayBuilder", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createArrayBuilder", "(Ljava/util/Collection;)Ljakarta/json/JsonArrayBuilder;", "(Ljava/util/Collection<*>;)Ljakarta/json/JsonArrayBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createArrayBuilder", "(Ljava/util/Collection;)Ljakarta/json/JsonArrayBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/lang/String;)Ljakarta/json/JsonString;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(Ljava/lang/String;)Ljakarta/json/JsonString;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(I)Ljakarta/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(I)Ljakarta/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(J)Ljakarta/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(J)Ljakarta/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(D)Ljakarta/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(D)Ljakarta/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/math/BigDecimal;)Ljakarta/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(Ljava/math/BigDecimal;)Ljakarta/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createValue", "(Ljava/math/BigInteger;)Ljakarta/json/JsonNumber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createValue", "(Ljava/math/BigInteger;)Ljakarta/json/JsonNumber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatch", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonPatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createPatch", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonPatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createDiff", "(Ljakarta/json/JsonStructure;Ljakarta/json/JsonStructure;)Ljakarta/json/JsonPatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createDiff", "(Ljakarta/json/JsonStructure;Ljakarta/json/JsonStructure;)Ljakarta/json/JsonPatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatchBuilder", "()Ljakarta/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createPatchBuilder", "()Ljakarta/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPatchBuilder", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonPatchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createPatchBuilder", "(Ljakarta/json/JsonArray;)Ljakarta/json/JsonPatchBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMergePatch", "(Ljakarta/json/JsonValue;)Ljakarta/json/JsonMergePatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createMergePatch", "(Ljakarta/json/JsonValue;)Ljakarta/json/JsonMergePatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMergeDiff", "(Ljakarta/json/JsonValue;Ljakarta/json/JsonValue;)Ljakarta/json/JsonMergePatch;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createMergeDiff", "(Ljakarta/json/JsonValue;Ljakarta/json/JsonValue;)Ljakarta/json/JsonMergePatch;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPointer", "(Ljava/lang/String;)Ljakarta/json/JsonPointer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/spi/JsonProvider", "provider", "()Ljakarta/json/spi/JsonProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/spi/JsonProvider", "createPointer", "(Ljava/lang/String;)Ljakarta/json/JsonPointer;", false);
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
