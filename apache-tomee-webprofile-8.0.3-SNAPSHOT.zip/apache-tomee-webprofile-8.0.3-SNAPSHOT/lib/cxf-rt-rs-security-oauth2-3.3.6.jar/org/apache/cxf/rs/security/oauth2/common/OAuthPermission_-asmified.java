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
public class OAuthPermission_Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/common/OAuthPermission_", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/persistence/metamodel/StaticMetamodel;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;"));
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "defaultPermission", "Ljavax/persistence/metamodel/SingularAttribute;", "Ljavax/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/Boolean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "description", "Ljavax/persistence/metamodel/SingularAttribute;", "Ljavax/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "httpVerbs", "Ljavax/persistence/metamodel/ListAttribute;", "Ljavax/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "invisibleToClient", "Ljavax/persistence/metamodel/SingularAttribute;", "Ljavax/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/Boolean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "permission", "Ljavax/persistence/metamodel/SingularAttribute;", "Ljavax/persistence/metamodel/SingularAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC | ACC_VOLATILE, "uris", "Ljavax/persistence/metamodel/ListAttribute;", "Ljavax/persistence/metamodel/ListAttribute<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;Ljava/lang/String;>;", null);
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
