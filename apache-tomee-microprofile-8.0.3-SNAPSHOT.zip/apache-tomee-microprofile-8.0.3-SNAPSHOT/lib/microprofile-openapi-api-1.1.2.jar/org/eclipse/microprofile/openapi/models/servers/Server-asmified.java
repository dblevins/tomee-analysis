package asm.org.eclipse.microprofile.openapi.models.servers;
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
public class ServerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/microprofile/openapi/models/servers/Server", "Ljava/lang/Object;Lorg/eclipse/microprofile/openapi/models/Constructible;Lorg/eclipse/microprofile/openapi/models/Extensible<Lorg/eclipse/microprofile/openapi/models/servers/Server;>;", "java/lang/Object", new String[] { "org/eclipse/microprofile/openapi/models/Constructible", "org/eclipse/microprofile/openapi/models/Extensible" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUrl", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "url", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/servers/Server;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/servers/Server", "setUrl", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDescription", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDescription", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "description", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/servers/Server;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/servers/Server", "setDescription", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVariables", "()Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setVariables", "(Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVariables", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/servers/ServerVariable;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "variables", "(Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;)Lorg/eclipse/microprofile/openapi/models/servers/Server;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/servers/Server", "setVariables", "(Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "variables", "(Ljava/util/Map;)Lorg/eclipse/microprofile/openapi/models/servers/Server;", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/servers/ServerVariable;>;)Lorg/eclipse/microprofile/openapi/models/servers/Server;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/servers/Server", "setVariables", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
