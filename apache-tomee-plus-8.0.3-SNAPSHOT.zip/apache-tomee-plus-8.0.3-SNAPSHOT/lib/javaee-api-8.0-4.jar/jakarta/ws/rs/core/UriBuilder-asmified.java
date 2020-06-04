package asm.jakarta.ws.rs.core;
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
public class UriBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/ws/rs/core/UriBuilder", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljakarta/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/ext/RuntimeDelegate", "createUriBuilder", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromUri", "(Ljava/net/URI;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "uri", "(Ljava/net/URI;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromUri", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "uri", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromLink", "(Ljakarta/ws/rs/core/Link;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The provider 'link' parameter value is 'null'.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Link", "getUri", "()Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "fromUri", "(Ljava/net/URI;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromPath", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "path", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromResource", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/UriBuilder;", "(Ljava/lang/Class<*>;)Ljakarta/ws/rs/core/UriBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "path", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", "(Ljava/lang/Class<*>;Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/UriBuilder", "newInstance", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "path", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clone", "()Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "uri", "(Ljava/net/URI;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "uri", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheme", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schemeSpecificPart", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "userInfo", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "host", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "port", "(I)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "replacePath", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "path", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "path", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "path", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "path", "(Ljava/lang/reflect/Method;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "segment", "([Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "replaceMatrix", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "matrixParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "replaceMatrixParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "replaceQuery", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "queryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "replaceQueryParam", "(Ljava/lang/String;[Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fragment", "(Ljava/lang/String;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplate", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplate", "(Ljava/lang/String;Ljava/lang/Object;Z)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplateFromEncoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/UriBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplates", "(Ljava/util/Map;)Ljakarta/ws/rs/core/UriBuilder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/ws/rs/core/UriBuilder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplates", "(Ljava/util/Map;Z)Ljakarta/ws/rs/core/UriBuilder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Z)Ljakarta/ws/rs/core/UriBuilder;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveTemplatesFromEncoded", "(Ljava/util/Map;)Ljakarta/ws/rs/core/UriBuilder;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/ws/rs/core/UriBuilder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildFromMap", "(Ljava/util/Map;)Ljava/net/URI;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljava/net/URI;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildFromMap", "(Ljava/util/Map;Z)Ljava/net/URI;", "(Ljava/util/Map<Ljava/lang/String;*>;Z)Ljava/net/URI;", new String[] { "java/lang/IllegalArgumentException", "jakarta/ws/rs/core/UriBuilderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildFromEncodedMap", "(Ljava/util/Map;)Ljava/net/URI;", "(Ljava/util/Map<Ljava/lang/String;*>;)Ljava/net/URI;", new String[] { "java/lang/IllegalArgumentException", "jakarta/ws/rs/core/UriBuilderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "build", "([Ljava/lang/Object;)Ljava/net/URI;", null, new String[] { "java/lang/IllegalArgumentException", "jakarta/ws/rs/core/UriBuilderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "([Ljava/lang/Object;Z)Ljava/net/URI;", null, new String[] { "java/lang/IllegalArgumentException", "jakarta/ws/rs/core/UriBuilderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "buildFromEncoded", "([Ljava/lang/Object;)Ljava/net/URI;", null, new String[] { "java/lang/IllegalArgumentException", "jakarta/ws/rs/core/UriBuilderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toTemplate", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/UriBuilder", "clone", "()Ljakarta/ws/rs/core/UriBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
