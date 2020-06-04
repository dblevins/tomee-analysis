package asm.javax.json.bind;
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
public class JsonbBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/json/bind/JsonbBuilder", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withConfig", "(Ljavax/json/bind/JsonbConfig;)Ljavax/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withProvider", "(Ljavax/json/spi/JsonProvider;)Ljavax/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "()Ljavax/json/bind/Jsonb;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "()Ljavax/json/bind/Jsonb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/bind/spi/JsonbProvider", "provider", "()Ljavax/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/spi/JsonbProvider", "create", "()Ljavax/json/bind/JsonbBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/bind/JsonbBuilder", "build", "()Ljavax/json/bind/Jsonb;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljavax/json/bind/JsonbConfig;)Ljavax/json/bind/Jsonb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/bind/spi/JsonbProvider", "provider", "()Ljavax/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/spi/JsonbProvider", "create", "()Ljavax/json/bind/JsonbBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/bind/JsonbBuilder", "withConfig", "(Ljavax/json/bind/JsonbConfig;)Ljavax/json/bind/JsonbBuilder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/bind/JsonbBuilder", "build", "()Ljavax/json/bind/Jsonb;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "()Ljavax/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/bind/spi/JsonbProvider", "provider", "()Ljavax/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/spi/JsonbProvider", "create", "()Ljavax/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "(Ljava/lang/String;)Ljavax/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/bind/spi/JsonbProvider", "provider", "(Ljava/lang/String;)Ljavax/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/spi/JsonbProvider", "create", "()Ljavax/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "(Ljavax/json/bind/spi/JsonbProvider;)Ljavax/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/bind/spi/JsonbProvider", "create", "()Ljavax/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
