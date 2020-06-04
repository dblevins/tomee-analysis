package asm.org.apache.cxf.rs.security.oauth2.services;
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
public class ImplicitGrantServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/rs/security/oauth2/services/ImplicitGrantService", null, "org/apache/cxf/rs/security/oauth2/services/AbstractImplicitGrantService", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "/authorize-implicit");
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("token");
methodVisitor.visitLdcInsn("implicit");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/AbstractImplicitGrantService", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/Set;)V", "(Ljava/util/Set<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("implicit");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/AbstractImplicitGrantService", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "(Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/AbstractImplicitGrantService", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createAuthorizationData", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljakarta/ws/rs/core/MultivaluedMap;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljakarta/ws/rs/core/MultivaluedMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;>;Ljava/util/List<Lorg/apache/cxf/rs/security/oauth2/common/OAuthPermission;>;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/oauth2/services/AbstractImplicitGrantService", "createAuthorizationData", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;Ljakarta/ws/rs/core/MultivaluedMap;Ljava/lang/String;Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;Ljava/util/List;Ljava/util/List;Z)Lorg/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/OAuthAuthorizationData", "setImplicitFlow", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
