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
public class OperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "Ljava/lang/Object;Lorg/eclipse/microprofile/openapi/models/Constructible;Lorg/eclipse/microprofile/openapi/models/Extensible<Lorg/eclipse/microprofile/openapi/models/Operation;>;", "java/lang/Object", new String[] { "org/eclipse/microprofile/openapi/models/Constructible", "org/eclipse/microprofile/openapi/models/Extensible" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTags", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTags", "(Ljava/util/List;)V", "(Ljava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tags", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/Operation;", "(Ljava/util/List<Ljava/lang/String;>;)Lorg/eclipse/microprofile/openapi/models/Operation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setTags", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTag", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTag", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSummary", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSummary", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "summary", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setSummary", "(Ljava/lang/String;)V", true);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "description", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setDescription", "(Ljava/lang/String;)V", true);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "externalDocs", "(Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setExternalDocs", "(Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOperationId", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setOperationId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "operationId", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setOperationId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setParameters", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameters", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/Operation;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;>;)Lorg/eclipse/microprofile/openapi/models/Operation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setParameters", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addParameter", "(Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeParameter", "(Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequestBody", "()Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setRequestBody", "(Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requestBody", "(Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setRequestBody", "(Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResponses", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setResponses", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "responses", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setResponses", "(Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCallbacks", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCallbacks", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "callbacks", "(Ljava/util/Map;)Lorg/eclipse/microprofile/openapi/models/Operation;", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;>;)Lorg/eclipse/microprofile/openapi/models/Operation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setCallbacks", "(Ljava/util/Map;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addCallback", "(Ljava/lang/String;Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeCallback", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeprecated", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDeprecated", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deprecated", "(Ljava/lang/Boolean;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setDeprecated", "(Ljava/lang/Boolean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "security", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/Operation;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;>;)Lorg/eclipse/microprofile/openapi/models/Operation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setSecurity", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSecurityRequirement", "(Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeSecurityRequirement", "(Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "servers", "(Ljava/util/List;)Lorg/eclipse/microprofile/openapi/models/Operation;", "(Ljava/util/List<Lorg/eclipse/microprofile/openapi/models/servers/Server;>;)Lorg/eclipse/microprofile/openapi/models/Operation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/microprofile/openapi/models/Operation", "setServers", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addServer", "(Lorg/eclipse/microprofile/openapi/models/servers/Server;)Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeServer", "(Lorg/eclipse/microprofile/openapi/models/servers/Server;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
