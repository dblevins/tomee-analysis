package asm.org.apache.tomee.microprofile.config;
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
public class TomEEOpenAPIExtension$MethodElementImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", null, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", new String[] { "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedMethodElement" });

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension", "MethodElementImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension", "TypeElementImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension", "ElementImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;", "Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", "<init>", "(Ljakarta/enterprise/inject/spi/Annotated;Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReturnType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getGenericReturnType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaringClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedMethod", "getDeclaringType", "()Ljakarta/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "()[Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedTypeElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "delegate", "Ljakarta/enterprise/inject/spi/AnnotatedMethod;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedMethod", "getParameters", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "lambda$getParameters$0", "(Ljakarta/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;", false), Type.getType("(Ljakarta/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "lambda$getParameters$1", "(I)[Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;", false), Type.getType("(I)[Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "toArray", "(Ljava/util/function/IntFunction;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedTypeElement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getParameters$1", "(I)[Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getParameters$0", "(Ljakarta/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/AnnotatedParameter", "getBaseType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "<init>", "(Ljava/lang/reflect/Type;Ljakarta/enterprise/inject/spi/Annotated;Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$MethodElementImpl", "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
