package asm.jakarta.ws.rs.client;
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
public class WebTargetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/client/WebTarget", "Ljava/lang/Object;Ljakarta/ws/rs/core/Configurable<Ljakarta/ws/rs/client/WebTarget;>;", "java/lang/Object", new String[] { "jakarta/ws/rs/core/Configurable" });

classWriter.visitInnerClass("jakarta/ws/rs/client/Invocation$Builder", "jakarta/ws/rs/client/Invocation", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUri", "()Ljava/net/URI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUriBuilder", "()Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "path", "(Ljava/lang/String;)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplate", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplate", "(Ljava/lang/String;Ljava/lang/Object;Z)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplateFromEncoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplates", "(Ljava/util/Map;)Ljakarta/ws/rs/client/WebTarget;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/ws/rs/client/WebTarget;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplates", "(Ljava/util/Map;Z)Ljakarta/ws/rs/client/WebTarget;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Z)Ljakarta/ws/rs/client/WebTarget;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplatesFromEncoded", "(Ljava/util/Map;)Ljakarta/ws/rs/client/WebTarget;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/ws/rs/client/WebTarget;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "matrixParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "queryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/client/WebTarget;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "request", "()Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "request", "([Ljava/lang/String;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "request", "([Ljakarta/ws/rs/core/MediaType;)Ljakarta/ws/rs/client/Invocation$Builder;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
