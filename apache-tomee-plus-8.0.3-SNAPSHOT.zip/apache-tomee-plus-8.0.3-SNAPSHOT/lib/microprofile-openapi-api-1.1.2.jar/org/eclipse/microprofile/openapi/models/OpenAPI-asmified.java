package asm.org.eclipse.microprofile.openapi.models;
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
public class OpenAPIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "Ljava/lang/Object;Lorg/eclipse/microprofile/openapi/models/Constructible;Lorg/eclipse/microprofile/openapi/models/Extensible<Lorg/eclipse/microprofile/openapi/models/OpenAPI;>;", "java/lang/Object", new String[] { "org/eclipse/microprofile/openapi/models/Constructible", "org/eclipse/microprofile/openapi/models/Extensible" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOpenapi", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setOpenapi", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "openapi", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setOpenapi", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInfo", "()Lorg/eclipse/microprofile/openapi/models/info/Info;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInfo", "(Lorg/eclipse/microprofile/openapi/models/info/Info;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Lorg/eclipse/microprofile/openapi/models/info/Info;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setInfo", "(Lorg/eclipse/microprofile/openapi/models/info/Info;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExternalDocs", "()Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExternalDocs", "(Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "externalDocs", "(Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setExternalDocs", "(Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServers", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/servers/Server;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setServers", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/servers/Server;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "servers", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/servers/Server;>;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setServers", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addServer", "(Lorg/eclipse/microprofile/openapi/models/servers/Server;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeServer", "(Lorg/eclipse/microprofile/openapi/models/servers/Server;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSecurity", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSecurity", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "security", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;>;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setSecurity", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSecurityRequirement", "(Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeSecurityRequirement", "(Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTags", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/tags/Tag;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTags", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/tags/Tag;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tags", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/tags/Tag;>;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setTags", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTag", "(Lorg/eclipse/microprofile/openapi/models/tags/Tag;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTag", "(Lorg/eclipse/microprofile/openapi/models/tags/Tag;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPaths", "()Lorg/eclipse/microprofile/openapi/models/Paths;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPaths", "(Lorg/eclipse/microprofile/openapi/models/Paths;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "paths", "(Lorg/eclipse/microprofile/openapi/models/Paths;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setPaths", "(Lorg/eclipse/microprofile/openapi/models/Paths;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "path", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/PathItem;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getComponents", "()Lorg/eclipse/microprofile/openapi/models/Components;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setComponents", "(Lorg/eclipse/microprofile/openapi/models/Components;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "components", "(Lorg/eclipse/microprofile/openapi/models/Components;)Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/OpenAPI", "setComponents", "(Lorg/eclipse/microprofile/openapi/models/Components;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
