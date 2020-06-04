package asm.org.eclipse.microprofile.openapi.models.media;
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
public class MediaTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/microprofile/openapi/models/media/MediaType", "Ljava/lang/Object;Lorg/eclipse/microprofile/openapi/models/Constructible;Lorg/eclipse/microprofile/openapi/models/Extensible<Lorg/eclipse/microprofile/openapi/models/media/MediaType;>;", "java/lang/Object", new String[] { "org/eclipse/microprofile/openapi/models/Constructible", "org/eclipse/microprofile/openapi/models/Extensible" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchema", "()Lorg/eclipse/microprofile/openapi/models/media/Schema;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSchema", "(Lorg/eclipse/microprofile/openapi/models/media/Schema;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schema", "(Lorg/eclipse/microprofile/openapi/models/media/Schema;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/media/MediaType", "setSchema", "(Lorg/eclipse/microprofile/openapi/models/media/Schema;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExamples", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/examples/Example;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExamples", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/examples/Example;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "examples", "(Ljava/util/Map;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/examples/Example;>;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/media/MediaType", "setExamples", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addExample", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/examples/Example;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeExample", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExample", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExample", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "example", "(Ljava/lang/Object;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/media/MediaType", "setExample", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncoding", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Encoding;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEncoding", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Encoding;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encoding", "(Ljava/util/Map;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Encoding;>;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/media/MediaType", "setEncoding", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addEncoding", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/media/Encoding;)Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeEncoding", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
