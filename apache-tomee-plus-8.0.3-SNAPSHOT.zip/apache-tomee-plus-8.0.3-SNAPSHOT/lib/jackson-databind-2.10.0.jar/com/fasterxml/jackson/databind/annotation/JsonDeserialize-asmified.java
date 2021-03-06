package asm.com.fasterxml.jackson.databind.annotation;
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
public class JsonDeserializeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE, "com/fasterxml/jackson/databind/annotation/JsonDeserialize", null, "java/lang/Object", new String[] { "java/lang/annotation/Annotation" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Target;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "ANNOTATION_TYPE");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "METHOD");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "FIELD");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "TYPE");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "PARAMETER");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Retention;", true);
annotationVisitor0.visitEnum("value", "Ljava/lang/annotation/RetentionPolicy;", "RUNTIME");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lcom/fasterxml/jackson/annotation/JacksonAnnotation;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("com/fasterxml/jackson/databind/JsonDeserializer$None", "com/fasterxml/jackson/databind/JsonDeserializer", "None", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/KeyDeserializer$None", "com/fasterxml/jackson/databind/KeyDeserializer", "None", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/util/Converter$None", "com/fasterxml/jackson/databind/util/Converter", "None", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "using", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lcom/fasterxml/jackson/databind/JsonDeserializer;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Lcom/fasterxml/jackson/databind/JsonDeserializer$None;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contentUsing", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lcom/fasterxml/jackson/databind/JsonDeserializer;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Lcom/fasterxml/jackson/databind/JsonDeserializer$None;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "keyUsing", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lcom/fasterxml/jackson/databind/KeyDeserializer;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Lcom/fasterxml/jackson/databind/KeyDeserializer$None;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "builder", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Ljava/lang/Void;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "converter", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lcom/fasterxml/jackson/databind/util/Converter;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Lcom/fasterxml/jackson/databind/util/Converter$None;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contentConverter", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lcom/fasterxml/jackson/databind/util/Converter;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Lcom/fasterxml/jackson/databind/util/Converter$None;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "as", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Ljava/lang/Void;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "keyAs", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Ljava/lang/Void;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contentAs", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, Type.getType("Ljava/lang/Void;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
