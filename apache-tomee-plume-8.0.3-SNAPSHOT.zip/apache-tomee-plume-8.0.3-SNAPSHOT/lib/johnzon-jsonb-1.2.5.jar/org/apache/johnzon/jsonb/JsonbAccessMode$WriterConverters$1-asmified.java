package asm.org.apache.johnzon.jsonb;
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
public class JsonbAccessMode$WriterConverters$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", null, "java/lang/Object", new String[] { "org/apache/johnzon/mapper/ObjectConverter$Writer" });

classWriter.visitOuterClass("org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode;Lorg/apache/johnzon/mapper/access/AccessMode$DecoratedType;Lorg/apache/johnzon/core/Types;)V");

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "org/apache/johnzon/jsonb/JsonbAccessMode", "WriterConverters", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", null, null, 0);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/ObjectConverter", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "org/apache/johnzon/mapper/access/AccessMode", "DecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$jsonbSerializer", "Ljavax/json/bind/serializer/JsonbSerializer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$global", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;Lorg/apache/johnzon/jsonb/JsonbAccessMode;Ljavax/json/bind/serializer/JsonbSerializer;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "this$1", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "val$this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "val$jsonbSerializer", "Ljavax/json/bind/serializer/JsonbSerializer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "val$global", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeJson", "(Ljava/lang/Object;Lorg/apache/johnzon/mapper/MappingGenerator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/MappingGenerator", "getJsonGenerator", "()Ljavax/json/stream/JsonGenerator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "val$jsonbSerializer", "Ljavax/json/bind/serializer/JsonbSerializer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/jsonb/serializer/JohnzonSerializationContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/serializer/JohnzonSerializationContext", "<init>", "(Lorg/apache/johnzon/mapper/MappingGenerator;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/bind/serializer/JsonbSerializer", "serialize", "(Ljava/lang/Object;Ljavax/json/stream/JsonGenerator;Ljavax/json/bind/serializer/SerializationContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isGlobal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters$1", "val$global", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
