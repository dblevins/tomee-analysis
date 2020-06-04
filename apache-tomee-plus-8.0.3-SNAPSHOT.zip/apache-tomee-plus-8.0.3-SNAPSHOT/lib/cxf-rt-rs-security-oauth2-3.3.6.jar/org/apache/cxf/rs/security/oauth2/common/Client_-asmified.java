package asm.org.apache.cxf.rs.security.oauth2.common;
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
public class Client_Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/common/Client_", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/persistence/metamodel/StaticMetamodel;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/Client;"));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "allowedGrantTypes", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationCertificates", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationDescription", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationLogoUri", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationLogoutUri", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationName", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "applicationWebUri", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "clientId", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "clientIpAddress", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "clientSecret", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "confidential", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/Boolean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "homeRealm", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "properties", "Ljakarta/persistence/metamodel/MapAttribute;", "Ljakarta/persistence/metamodel/MapAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "redirectUris", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "registeredAt", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/Long;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "registeredAudiences", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "registeredDynamically", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/Boolean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "registeredScopes", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "resourceOwnerSubject", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "subject", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "tokenEndpointAuthMethod", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
