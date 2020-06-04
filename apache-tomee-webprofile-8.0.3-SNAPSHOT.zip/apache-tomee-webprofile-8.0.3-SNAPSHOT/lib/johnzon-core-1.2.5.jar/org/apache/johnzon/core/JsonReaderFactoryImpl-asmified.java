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
public class JsonReaderFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/core/JsonReaderFactoryImpl", null, "org/apache/johnzon/core/AbstractJsonFactory", new String[] { "javax/json/JsonReaderFactory" });

classWriter.visitInnerClass("org/apache/johnzon/core/BufferStrategy$BufferProvider", "org/apache/johnzon/core/BufferStrategy", "BufferProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonReaderFactoryImpl", "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonParserFactoryImpl", "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/AbstractJsonFactory", "<init>", "(Ljava/util/Map;Ljava/util/Collection;Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonParserFactoryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "internalConfig", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Ljava/io/Reader;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "createInternalParser", "(Ljava/io/Reader;)Lorg/apache/johnzon/core/JsonStreamParserImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "getValueBufferProvider", "()Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonReaderImpl", "<init>", "(Ljavax/json/stream/JsonParser;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Ljava/io/InputStream;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "createInternalParser", "(Ljava/io/InputStream;)Lorg/apache/johnzon/core/JsonStreamParserImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "getValueBufferProvider", "()Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonReaderImpl", "<init>", "(Ljavax/json/stream/JsonParser;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "createInternalParser", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lorg/apache/johnzon/core/JsonStreamParserImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "getValueBufferProvider", "()Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonReaderImpl", "<init>", "(Ljavax/json/stream/JsonParser;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Ljavax/json/stream/JsonParser;)Ljavax/json/JsonReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "parserFactory", "Lorg/apache/johnzon/core/JsonParserFactoryImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/core/JsonParserFactoryImpl", "getValueBufferProvider", "()Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonReaderImpl", "<init>", "(Ljavax/json/stream/JsonParser;Lorg/apache/johnzon/core/BufferStrategy$BufferProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfigInUse", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonReaderFactoryImpl", "internalConfig", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonReaderFactoryImpl", "SUPPORTED_CONFIG_KEYS", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
