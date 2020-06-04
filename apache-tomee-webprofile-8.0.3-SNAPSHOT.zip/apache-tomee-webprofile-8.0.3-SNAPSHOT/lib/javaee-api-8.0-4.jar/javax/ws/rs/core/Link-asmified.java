package asm.javax.ws.rs.core;
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
public class LinkDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "javax/ws/rs/core/Link", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/ws/rs/core/Link$JaxbAdapter", "javax/ws/rs/core/Link", "JaxbAdapter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/ws/rs/core/Link$JaxbLink", "javax/ws/rs/core/Link", "JaxbLink", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/ws/rs/core/Link$Builder", "javax/ws/rs/core/Link", "Builder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TITLE", "Ljava/lang/String;", null, "title");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL", "Ljava/lang/String;", null, "rel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE", "Ljava/lang/String;", null, "type");
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUri", "()Ljava/net/URI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUriBuilder", "()Ljavax/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRel", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRels", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTitle", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getType", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParams", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/ws/rs/core/Link;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljavax/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/ext/RuntimeDelegate", "createLinkBuilder", "()Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "link", "(Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "build", "([Ljava/lang/Object;)Ljavax/ws/rs/core/Link;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromUri", "(Ljava/net/URI;)Ljavax/ws/rs/core/Link$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljavax/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/ext/RuntimeDelegate", "createLinkBuilder", "()Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "uri", "(Ljava/net/URI;)Ljavax/ws/rs/core/Link$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromUri", "(Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljavax/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/ext/RuntimeDelegate", "createLinkBuilder", "()Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "uri", "(Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromUriBuilder", "(Ljavax/ws/rs/core/UriBuilder;)Ljavax/ws/rs/core/Link$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljavax/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/ext/RuntimeDelegate", "createLinkBuilder", "()Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "uriBuilder", "(Ljavax/ws/rs/core/UriBuilder;)Ljavax/ws/rs/core/Link$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromLink", "(Ljavax/ws/rs/core/Link;)Ljavax/ws/rs/core/Link$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljavax/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/ext/RuntimeDelegate", "createLinkBuilder", "()Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/ws/rs/core/Link$Builder", "link", "(Ljavax/ws/rs/core/Link;)Ljavax/ws/rs/core/Link$Builder;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromPath", "(Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/UriBuilder", "fromPath", "(Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Link", "fromUriBuilder", "(Ljavax/ws/rs/core/UriBuilder;)Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromResource", "(Ljava/lang/Class;)Ljavax/ws/rs/core/Link$Builder;", "(Ljava/lang/Class<*>;)Ljavax/ws/rs/core/Link$Builder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/UriBuilder", "fromResource", "(Ljava/lang/Class;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Link", "fromUriBuilder", "(Ljavax/ws/rs/core/UriBuilder;)Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", "(Ljava/lang/Class<*>;Ljava/lang/String;)Ljavax/ws/rs/core/Link$Builder;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/UriBuilder", "fromMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljavax/ws/rs/core/UriBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Link", "fromUriBuilder", "(Ljavax/ws/rs/core/UriBuilder;)Ljavax/ws/rs/core/Link$Builder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
