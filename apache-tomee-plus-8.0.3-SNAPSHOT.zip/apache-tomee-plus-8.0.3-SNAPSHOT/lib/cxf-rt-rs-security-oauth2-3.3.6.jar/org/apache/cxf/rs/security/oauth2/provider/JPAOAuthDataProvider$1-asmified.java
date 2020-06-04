package asm.org.apache.cxf.rs.security.oauth2.provider;
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
public class JPAOAuthDataProvider$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", "Ljava/lang/Object;Lorg/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation<Lorg/apache/cxf/rs/security/oauth2/common/Client;>;", "java/lang/Object", new String[] { "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation" });

classWriter.visitOuterClass("org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider", "doGetClient", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/oauth2/common/Client;");

classWriter.visitInnerClass("org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation", "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider", "EntityManagerOperation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$clientId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", "this$0", "Lorg/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", "val$clientId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Ljavax/persistence/EntityManager;)Lorg/apache/cxf/rs/security/oauth2/common/Client;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/Client;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", "val$clientId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/oauth2/common/Client");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "execute", "(Ljavax/persistence/EntityManager;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$1", "execute", "(Ljavax/persistence/EntityManager;)Lorg/apache/cxf/rs/security/oauth2/common/Client;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
