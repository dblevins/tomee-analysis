package asm.org.apache.geronimo.microprofile.openapi.jaxrs;
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
public class JacksonOpenAPIYamlBodyWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/jaxrs/JacksonOpenAPIYamlBodyWriter", "<T:Ljava/lang/Object;>Lorg/apache/geronimo/microprofile/openapi/jaxrs/BaseOpenAPIYamlBodyWriter<TT;>;", "org/apache/geronimo/microprofile/openapi/jaxrs/BaseOpenAPIYamlBodyWriter", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/ext/Provider;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/context/Dependent;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/ConstrainedTo;", true);
annotationVisitor0.visitEnum("value", "Ljavax/ws/rs/RuntimeType;", "SERVER");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Produces;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "text/vnd.yaml");
annotationVisitor1.visit(null, "text/yaml");
annotationVisitor1.visit(null, "text/x-yaml");
annotationVisitor1.visit(null, "application/vnd.yaml");
annotationVisitor1.visit(null, "application/yaml");
annotationVisitor1.visit(null, "application/x-yaml");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/jaxrs/JacksonOpenAPIYamlBodyWriter$Mapper", "org/apache/geronimo/microprofile/openapi/jaxrs/JacksonOpenAPIYamlBodyWriter", "Mapper", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/openapi/jaxrs/BaseOpenAPIYamlBodyWriter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;Ljavax/ws/rs/core/MultivaluedMap;Ljava/io/OutputStream;)V", "(TT;Ljava/lang/Class<*>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;Ljavax/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/Object;>;Ljava/io/OutputStream;)V", new String[] { "java/io/IOException", "javax/ws/rs/WebApplicationException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/openapi/jaxrs/JacksonOpenAPIYamlBodyWriter$Mapper", "get", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/ObjectMapper", "writeValue", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
