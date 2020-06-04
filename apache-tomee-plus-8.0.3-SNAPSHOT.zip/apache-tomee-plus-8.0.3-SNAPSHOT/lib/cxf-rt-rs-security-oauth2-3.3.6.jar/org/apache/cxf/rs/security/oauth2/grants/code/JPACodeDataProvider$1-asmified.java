package asm.org.apache.cxf.rs.security.oauth2.grants.code;
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
public class JPACodeDataProvider$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "Ljava/lang/Object;Lorg/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation<Ljava/lang/Void;>;", "java/lang/Object", new String[] { "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation" });

classWriter.visitOuterClass("org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider", "saveCodeGrant", "(Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;)V");

classWriter.visitInnerClass("org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider$EntityManagerOperation", "org/apache/cxf/rs/security/oauth2/provider/JPAOAuthDataProvider", "EntityManagerOperation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider;Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "this$0", "Lorg/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Ljavax/persistence/EntityManager;)Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getSubject", "()Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getSubject", "()Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/UserSubject", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/oauth2/common/UserSubject");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getSubject", "()Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "persist", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/rs/security/oauth2/common/UserSubject"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getSubject", "()Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "merge", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/oauth2/common/UserSubject");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "setSubject", "(Lorg/apache/cxf/rs/security/oauth2/common/UserSubject;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getClient", "()Lorg/apache/cxf/rs/security/oauth2/common/Client;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/oauth2/common/Client;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "getClient", "()Lorg/apache/cxf/rs/security/oauth2/common/Client;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/common/Client", "getClientId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "find", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/oauth2/common/Client");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant", "setClient", "(Lorg/apache/cxf/rs/security/oauth2/common/Client;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "val$grant", "Lorg/apache/cxf/rs/security/oauth2/grants/code/ServerAuthorizationCodeGrant;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/EntityManager", "persist", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "execute", "(Ljavax/persistence/EntityManager;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/oauth2/grants/code/JPACodeDataProvider$1", "execute", "(Ljavax/persistence/EntityManager;)Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
