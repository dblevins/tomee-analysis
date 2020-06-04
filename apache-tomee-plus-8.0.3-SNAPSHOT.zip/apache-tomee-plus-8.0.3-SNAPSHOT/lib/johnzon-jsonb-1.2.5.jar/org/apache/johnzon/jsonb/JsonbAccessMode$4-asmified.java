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
public class JsonbAccessMode$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JsonbAccessMode$4", null, "java/lang/Object", new String[] { "org/apache/johnzon/mapper/access/AccessMode$Reader" });

classWriter.visitOuterClass("org/apache/johnzon/jsonb/JsonbAccessMode", "findReaders", "(Ljava/lang/Class;)Ljava/util/Map;");

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "org/apache/johnzon/jsonb/JsonbAccessMode", "WriterConverters", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Reader", "org/apache/johnzon/mapper/access/AccessMode", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonbAccessMode$4", null, null, 0);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/ObjectConverter", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$reader", "Ljava/util/function/Function;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$writerConverters", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$type", "Ljava/lang/reflect/Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$finalReader", "Lorg/apache/johnzon/mapper/access/AccessMode$Reader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$isNillable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode;Ljava/util/function/Function;Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;Ljava/lang/reflect/Type;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "this$0", "Lorg/apache/johnzon/jsonb/JsonbAccessMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$reader", "Ljava/util/function/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$writerConverters", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$type", "Ljava/lang/reflect/Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$finalReader", "Lorg/apache/johnzon/mapper/access/AccessMode$Reader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$isNillable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$reader", "Ljava/util/function/Function;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findObjectConverterWriter", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", "()Lorg/apache/johnzon/mapper/ObjectConverter$Writer<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$writerConverters", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "access$000", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;)Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$type", "Ljava/lang/reflect/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$finalReader", "Lorg/apache/johnzon/mapper/access/AccessMode$Reader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$Reader", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassOrPackageAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$finalReader", "Lorg/apache/johnzon/mapper/access/AccessMode$Reader;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode$Reader", "getClassOrPackageAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findConverter", "()Lorg/apache/johnzon/mapper/Adapter;", "()Lorg/apache/johnzon/mapper/Adapter<**>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$writerConverters", "Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters", "access$100", "(Lorg/apache/johnzon/jsonb/JsonbAccessMode$WriterConverters;)Lorg/apache/johnzon/mapper/Adapter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNillable", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JsonbAccessMode$4", "val$isNillable", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
