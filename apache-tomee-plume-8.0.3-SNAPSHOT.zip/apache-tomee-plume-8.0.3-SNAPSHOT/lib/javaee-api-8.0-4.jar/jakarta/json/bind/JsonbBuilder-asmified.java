package asm.jakarta.json.bind;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/json/bind/JsonbBuilder", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withConfig", "(Ljakarta/json/bind/JsonbConfig;)Ljakarta/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withProvider", "(Ljakarta/json/spi/JsonProvider;)Ljakarta/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "()Ljakarta/json/bind/Jsonb;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "()Ljakarta/json/bind/Jsonb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/bind/spi/JsonbProvider", "provider", "()Ljakarta/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/bind/spi/JsonbProvider", "create", "()Ljakarta/json/bind/JsonbBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/bind/JsonbBuilder", "build", "()Ljakarta/json/bind/Jsonb;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "create", "(Ljakarta/json/bind/JsonbConfig;)Ljakarta/json/bind/Jsonb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/bind/spi/JsonbProvider", "provider", "()Ljakarta/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/bind/spi/JsonbProvider", "create", "()Ljakarta/json/bind/JsonbBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/bind/JsonbBuilder", "withConfig", "(Ljakarta/json/bind/JsonbConfig;)Ljakarta/json/bind/JsonbBuilder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/bind/JsonbBuilder", "build", "()Ljakarta/json/bind/Jsonb;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "()Ljakarta/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/bind/spi/JsonbProvider", "provider", "()Ljakarta/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/bind/spi/JsonbProvider", "create", "()Ljakarta/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "(Ljava/lang/String;)Ljakarta/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/bind/spi/JsonbProvider", "provider", "(Ljava/lang/String;)Ljakarta/json/bind/spi/JsonbProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/bind/spi/JsonbProvider", "create", "()Ljakarta/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newBuilder", "(Ljakarta/json/bind/spi/JsonbProvider;)Ljakarta/json/bind/JsonbBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/bind/spi/JsonbProvider", "create", "()Ljakarta/json/bind/JsonbBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
