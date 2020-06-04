package asm.org.apache.cxf.jaxrs.impl;
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
public class ProvidersImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/impl/ProvidersImpl", null, "java/lang/Object", new String[] { "javax/ws/rs/ext/Providers" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m", "Lorg/apache/cxf/message/Message;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/message/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageBodyReader", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/MessageBodyReader;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/MessageBodyReader<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "getInstance", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/jaxrs/provider/ProviderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "getGenericType", "(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "createMessageBodyReader", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;Lorg/apache/cxf/message/Message;)Ljavax/ws/rs/ext/MessageBodyReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageBodyWriter", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/MessageBodyWriter;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/MessageBodyWriter<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "getInstance", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/jaxrs/provider/ProviderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "getGenericType", "(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "createMessageBodyWriter", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljavax/ws/rs/core/MediaType;Lorg/apache/cxf/message/Message;)Ljavax/ws/rs/ext/MessageBodyWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContextResolver", "(Ljava/lang/Class;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/ContextResolver;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/ContextResolver<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "getInstance", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/jaxrs/provider/ProviderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "createContextResolver", "(Ljava/lang/reflect/Type;Lorg/apache/cxf/message/Message;Ljavax/ws/rs/core/MediaType;)Ljavax/ws/rs/ext/ContextResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionMapper", "(Ljava/lang/Class;)Ljavax/ws/rs/ext/ExceptionMapper;", "<T:Ljava/lang/Throwable;>(Ljava/lang/Class<TT;>;)Ljavax/ws/rs/ext/ExceptionMapper<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ServerProviderFactory", "getInstance", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/jaxrs/provider/ServerProviderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/impl/ProvidersImpl", "m", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/provider/ServerProviderFactory", "createExceptionMapper", "(Ljava/lang/Class;Lorg/apache/cxf/message/Message;)Ljavax/ws/rs/ext/ExceptionMapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getGenericType", "(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "(Ljava/lang/Class<*>;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/Type"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
