package asm.com.fasterxml.jackson.databind;
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
public class ObjectMapper$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/fasterxml/jackson/databind/ObjectMapper$1", null, "java/lang/Object", new String[] { "com/fasterxml/jackson/databind/Module$SetupContext" });

classWriter.visitOuterClass("com/fasterxml/jackson/databind/ObjectMapper", "registerModule", "(Lcom/fasterxml/jackson/databind/Module;)Lcom/fasterxml/jackson/databind/ObjectMapper;");

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ObjectMapper$1", null, null, 0);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonFactory$Feature", "com/fasterxml/jackson/core/JsonFactory", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonParser$Feature", "com/fasterxml/jackson/core/JsonParser", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonGenerator$Feature", "com/fasterxml/jackson/core/JsonGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/Module$SetupContext", "com/fasterxml/jackson/databind/Module", "SetupContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapperVersion", "()Lcom/fasterxml/jackson/core/Version;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "version", "()Lcom/fasterxml/jackson/core/Version;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOwner", "()Lcom/fasterxml/jackson/core/ObjectCodec;", "<C:Lcom/fasterxml/jackson/core/ObjectCodec;>()TC;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeFactory", "()Lcom/fasterxml/jackson/databind/type/TypeFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/databind/MapperFeature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/databind/DeserializationFeature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/databind/SerializationFeature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/databind/SerializationFeature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/core/JsonFactory$Feature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/core/JsonFactory$Feature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/core/JsonParser$Feature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "isEnabled", "(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/MutableConfigOverride;", "(Ljava/lang/Class<*>;)Lcom/fasterxml/jackson/databind/cfg/MutableConfigOverride;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "configOverride", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/cfg/MutableConfigOverride;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDeserializers", "(Lcom/fasterxml/jackson/databind/deser/Deserializers;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "_factory", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DeserializerFactory", "withAdditionalDeserializers", "(Lcom/fasterxml/jackson/databind/deser/Deserializers;)Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "with", "(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addKeyDeserializers", "(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "_factory", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DeserializerFactory", "withAdditionalKeyDeserializers", "(Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;)Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "with", "(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBeanDeserializerModifier", "(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "_factory", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DeserializerFactory", "withDeserializerModifier", "(Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;)Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "with", "(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSerializers", "(Lcom/fasterxml/jackson/databind/ser/Serializers;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/SerializerFactory", "withAdditionalSerializers", "(Lcom/fasterxml/jackson/databind/ser/Serializers;)Lcom/fasterxml/jackson/databind/ser/SerializerFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addKeySerializers", "(Lcom/fasterxml/jackson/databind/ser/Serializers;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/SerializerFactory", "withAdditionalKeySerializers", "(Lcom/fasterxml/jackson/databind/ser/Serializers;)Lcom/fasterxml/jackson/databind/ser/SerializerFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBeanSerializerModifier", "(Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ser/SerializerFactory", "withSerializerModifier", "(Lcom/fasterxml/jackson/databind/ser/BeanSerializerModifier;)Lcom/fasterxml/jackson/databind/ser/SerializerFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializerFactory", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAbstractTypeResolver", "(Lcom/fasterxml/jackson/databind/AbstractTypeResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "_factory", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DeserializerFactory", "withAbstractTypeResolver", "(Lcom/fasterxml/jackson/databind/AbstractTypeResolver;)Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "with", "(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addTypeModifier", "(Lcom/fasterxml/jackson/databind/type/TypeModifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/type/TypeFactory", "withModifier", "(Lcom/fasterxml/jackson/databind/type/TypeModifier;)Lcom/fasterxml/jackson/databind/type/TypeFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "setTypeFactory", "(Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/ObjectMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addValueInstantiators", "(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "_factory", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DeserializerFactory", "withValueInstantiators", "(Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;)Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/deser/DefaultDeserializationContext", "with", "(Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;)Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationContext", "Lcom/fasterxml/jackson/databind/deser/DefaultDeserializationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClassIntrospector", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/DeserializationConfig", "with", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/DeserializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/SerializationConfig", "with", "(Lcom/fasterxml/jackson/databind/introspect/ClassIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/SerializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "insertAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/DeserializationConfig", "withInsertedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/DeserializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/SerializationConfig", "withInsertedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/SerializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/DeserializationConfig", "withAppendedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/DeserializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_deserializationConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/SerializationConfig", "withAppendedAnnotationIntrospector", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/SerializationConfig");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/ObjectMapper", "_serializationConfig", "Lcom/fasterxml/jackson/databind/SerializationConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "registerSubtypes", "([Ljava/lang/Class;)V", "([Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "registerSubtypes", "([Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "registerSubtypes", "([Lcom/fasterxml/jackson/databind/jsontype/NamedType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "registerSubtypes", "([Lcom/fasterxml/jackson/databind/jsontype/NamedType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerSubtypes", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/lang/Class<*>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "registerSubtypes", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMixInAnnotations", "(Ljava/lang/Class;Ljava/lang/Class;)V", "(Ljava/lang/Class<*>;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "addMixIn", "(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDeserializationProblemHandler", "(Lcom/fasterxml/jackson/databind/deser/DeserializationProblemHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "addHandler", "(Lcom/fasterxml/jackson/databind/deser/DeserializationProblemHandler;)Lcom/fasterxml/jackson/databind/ObjectMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamingStrategy", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/ObjectMapper$1", "this$0", "Lcom/fasterxml/jackson/databind/ObjectMapper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "setPropertyNamingStrategy", "(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/ObjectMapper;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
