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
public class JsonGeneratorFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", null, "org/apache/johnzon/core/AbstractJsonFactory", new String[] { "javax/json/stream/JsonGeneratorFactory" });

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategy$BufferProvider", "org/apache/johnzon/core/BufferStrategy", "BufferProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GENERATOR_BUFFER_LENGTH", "Ljava/lang/String;", null, "org.apache.johnzon.default-char-buffer-generator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_GENERATOR_BUFFER_LENGTH", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pretty", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider<[C>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/AbstractJsonFactory", "<init>", "(Ljava/util/Map;Ljava/util/Collection;Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.json.stream.JsonGenerator.prettyPrinting");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "getBool", "(Ljava/lang/String;Z)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "pretty", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.johnzon.default-char-buffer-generator");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "DEFAULT_GENERATOR_BUFFER_LENGTH", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "getInt", "(Ljava/lang/String;I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("buffer length must be greater than zero");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/johnzon/core/JsonGeneratorFactoryImpl", "java/util/Map", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "getBufferProvider", "()Lorg/apache/johnzon/core/BufferStrategy;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/core/BufferStrategy", "newCharProvider", "(I)Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGenerator", "(Ljava/io/Writer;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "pretty", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl", "<init>", "(Ljava/io/Writer;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGenerator", "(Ljava/io/OutputStream;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "pretty", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl", "<init>", "(Ljava/io/OutputStream;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createGenerator", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "bufferProvider", "Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "pretty", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl", "<init>", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfigInUse", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "internalConfig", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.apache.johnzon.default-char-buffer-generator");
methodVisitor.visitLdcInsn(new Integer(65536));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "getInteger", "(Ljava/lang/String;I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "DEFAULT_GENERATOR_BUFFER_LENGTH", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("javax.json.stream.JsonGenerator.prettyPrinting");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.johnzon.default-char-buffer-generator");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("org.apache.johnzon.buffer-strategy");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorFactoryImpl", "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
