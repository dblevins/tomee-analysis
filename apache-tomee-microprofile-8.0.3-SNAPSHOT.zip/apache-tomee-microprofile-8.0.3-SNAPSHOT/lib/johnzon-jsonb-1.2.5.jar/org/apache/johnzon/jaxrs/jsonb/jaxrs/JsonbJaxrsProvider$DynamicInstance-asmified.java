package asm.org.apache.johnzon.jaxrs.jsonb.jaxrs;
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
public class JsonbJaxrsProvider$DynamicInstanceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "Ljava/lang/Object;Ljava/util/function/Function<Ljava/lang/Class<*>;Ljakarta/json/bind/Jsonb;>;", "java/lang/Object", new String[] { "java/util/function/Function" });

classWriter.visitInnerClass("org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider", "DynamicInstance", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contextResolver", "Ljakarta/ws/rs/ext/ContextResolver;", "Ljakarta/ws/rs/ext/ContextResolver<Ljakarta/json/bind/Jsonb;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/ws/rs/ext/ContextResolver;)V", "(Ljakarta/ws/rs/ext/ContextResolver<Ljakarta/json/bind/Jsonb;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "contextResolver", "Ljakarta/ws/rs/ext/ContextResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljava/lang/Class;)Ljakarta/json/bind/Jsonb;", "(Ljava/lang/Class<*>;)Ljakarta/json/bind/Jsonb;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "contextResolver", "Ljakarta/ws/rs/ext/ContextResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/ext/ContextResolver", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/bind/Jsonb");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "apply", "(Ljava/lang/Class;)Ljakarta/json/bind/Jsonb;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/ws/rs/ext/ContextResolver;Lorg/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jaxrs/jsonb/jaxrs/JsonbJaxrsProvider$DynamicInstance", "<init>", "(Ljakarta/ws/rs/ext/ContextResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
