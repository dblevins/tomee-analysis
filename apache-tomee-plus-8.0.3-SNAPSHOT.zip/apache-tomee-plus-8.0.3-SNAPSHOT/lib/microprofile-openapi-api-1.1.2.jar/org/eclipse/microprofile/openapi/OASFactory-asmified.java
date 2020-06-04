package asm.org.eclipse.microprofile.openapi;
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
public class OASFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/microprofile/openapi/OASFactory", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", "<T::Lorg/eclipse/microprofile/openapi/models/Constructible;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/spi/OASFactoryResolver", "instance", "()Lorg/eclipse/microprofile/openapi/spi/OASFactoryResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/microprofile/openapi/spi/OASFactoryResolver", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createComponents", "()Lorg/eclipse/microprofile/openapi/models/Components;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/Components;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/Components");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createExternalDocumentation", "()Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/ExternalDocumentation;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/ExternalDocumentation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createOpenAPI", "()Lorg/eclipse/microprofile/openapi/models/OpenAPI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/OpenAPI;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/OpenAPI");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createOperation", "()Lorg/eclipse/microprofile/openapi/models/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/Operation;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/Operation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPathItem", "()Lorg/eclipse/microprofile/openapi/models/PathItem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/PathItem;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/PathItem");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPaths", "()Lorg/eclipse/microprofile/openapi/models/Paths;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/Paths;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/Paths");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCallback", "()Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/callbacks/Callback;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/callbacks/Callback");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createExample", "()Lorg/eclipse/microprofile/openapi/models/examples/Example;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/examples/Example;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/examples/Example");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createHeader", "()Lorg/eclipse/microprofile/openapi/models/headers/Header;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/headers/Header;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/headers/Header");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createContact", "()Lorg/eclipse/microprofile/openapi/models/info/Contact;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/info/Contact;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/info/Contact");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createInfo", "()Lorg/eclipse/microprofile/openapi/models/info/Info;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/info/Info;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/info/Info");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createLicense", "()Lorg/eclipse/microprofile/openapi/models/info/License;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/info/License;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/info/License");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createLink", "()Lorg/eclipse/microprofile/openapi/models/links/Link;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/links/Link;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/links/Link");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createContent", "()Lorg/eclipse/microprofile/openapi/models/media/Content;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/Content;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/Content");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createDiscriminator", "()Lorg/eclipse/microprofile/openapi/models/media/Discriminator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/Discriminator;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/Discriminator");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEncoding", "()Lorg/eclipse/microprofile/openapi/models/media/Encoding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/Encoding;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/Encoding");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMediaType", "()Lorg/eclipse/microprofile/openapi/models/media/MediaType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/MediaType;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/MediaType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSchema", "()Lorg/eclipse/microprofile/openapi/models/media/Schema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/Schema;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/Schema");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createXML", "()Lorg/eclipse/microprofile/openapi/models/media/XML;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/media/XML;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/media/XML");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParameter", "()Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/parameters/Parameter;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/parameters/Parameter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRequestBody", "()Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/parameters/RequestBody;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/parameters/RequestBody");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAPIResponse", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/responses/APIResponse;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponse");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAPIResponses", "()Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/responses/APIResponses;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/responses/APIResponses");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createOAuthFlow", "()Lorg/eclipse/microprofile/openapi/models/security/OAuthFlow;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/security/OAuthFlow;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/security/OAuthFlow");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createOAuthFlows", "()Lorg/eclipse/microprofile/openapi/models/security/OAuthFlows;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/security/OAuthFlows;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/security/OAuthFlows");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createScopes", "()Lorg/eclipse/microprofile/openapi/models/security/Scopes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/security/Scopes;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/security/Scopes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSecurityRequirement", "()Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/security/SecurityRequirement;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/security/SecurityRequirement");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSecurityScheme", "()Lorg/eclipse/microprofile/openapi/models/security/SecurityScheme;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/security/SecurityScheme;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/security/SecurityScheme");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createServer", "()Lorg/eclipse/microprofile/openapi/models/servers/Server;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/servers/Server;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/servers/Server");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createServerVariable", "()Lorg/eclipse/microprofile/openapi/models/servers/ServerVariable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/servers/ServerVariable;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/servers/ServerVariable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "createServerVariables", "()Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/servers/ServerVariables;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/servers/ServerVariables");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createTag", "()Lorg/eclipse/microprofile/openapi/models/tags/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/models/tags/Tag;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/microprofile/openapi/OASFactory", "createObject", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/openapi/models/Constructible;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/models/tags/Tag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
