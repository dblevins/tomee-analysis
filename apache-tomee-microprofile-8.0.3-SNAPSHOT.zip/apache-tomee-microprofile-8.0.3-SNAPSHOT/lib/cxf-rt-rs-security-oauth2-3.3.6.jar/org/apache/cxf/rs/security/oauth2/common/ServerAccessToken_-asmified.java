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
public class ServerAccessToken_Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/common/ServerAccessToken_", null, "org/apache/cxf/rs/security/oauth2/common/AccessToken_", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/persistence/metamodel/StaticMetamodel;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;"));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "audiences", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "client", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Lorg/apache/cxf/rs/security/oauth2/common/Client;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "clientCodeVerifier", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "extraProperties", "Ljakarta/persistence/metamodel/MapAttribute;", "Ljakarta/persistence/metamodel/MapAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "grantCode", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "grantType", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "nonce", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "responseType", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "scopes", "Ljakarta/persistence/metamodel/ListAttribute;", "Ljakarta/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "subject", "Ljakarta/persistence/metamodel/SingularAttribute;", "Ljakarta/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/ServerAccessToken;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/common/AccessToken_", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
