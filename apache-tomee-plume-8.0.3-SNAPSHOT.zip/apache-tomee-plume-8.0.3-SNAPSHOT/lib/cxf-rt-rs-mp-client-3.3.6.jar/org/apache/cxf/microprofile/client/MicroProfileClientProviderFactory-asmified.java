package asm.org.apache.cxf.microprofile.client;
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
public class MicroProfileClientProviderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", null, "org/apache/cxf/jaxrs/provider/ProviderFactory", null);

classWriter.visitInnerClass("org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "ResponseExceptionMapperComparator", ACC_PRIVATE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLIENT_FACTORY_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "responseExceptionMappers", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/cxf/jaxrs/model/ProviderInfo<Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper<*>;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "asyncInvocationInterceptorFactories", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/cxf/jaxrs/model/ProviderInfo<Ljava/lang/Object;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "comparator", "Ljava/util/Comparator;", "Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator;)V", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "<init>", "(Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createInstance", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/BusFactory", "getThreadDefaultBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "<init>", "(Lorg/apache/cxf/Bus;Ljava/util/Comparator;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "initFactory", "(Lorg/apache/cxf/jaxrs/provider/ProviderFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "setBusProviders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getEndpoint", "()Lorg/apache/cxf/endpoint/Endpoint;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "getInstance", "(Lorg/apache/cxf/endpoint/Endpoint;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Lorg/apache/cxf/endpoint/Endpoint;)Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "CLIENT_FACTORY_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "createComparator", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientFactoryBean;)Ljava/util/Comparator;", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientFactoryBean;)Ljava/util/Comparator<Lorg/apache/cxf/jaxrs/model/ProviderInfo<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("compare", "()Ljava/util/Comparator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)I"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ProviderFactory", "compareCustomStatus", "(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)I", false), Type.getType("(Lorg/apache/cxf/jaxrs/model/ProviderInfo;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)I")});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/ContractComparator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/ContractComparator", "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientFactoryBean;Ljava/util/Comparator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_VARARGS, "setProviders", "(ZZ[Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "prepareProviders", "(ZZ[Ljava/lang/Object;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "setCommonProviders", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/model/ProviderInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/ProviderInfo", "getProvider", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/ClassHelper", "getRealClass", "(Lorg/apache/cxf/Bus;Ljava/lang/Object;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;"));
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "addProviderToList", "(Ljava/util/List;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/jaxrs/model/ProviderInfo", "java/lang/Class"}, 0, null);
methodVisitor.visitLdcInsn("org.eclipse.microprofile.rest.client.ext.AsyncInvocationInterceptorFactory");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/classloader/ClassLoaderUtils", "loadClass", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "addProviderToList", "(Ljava/util/List;Lorg/apache/cxf/jaxrs/model/ProviderInfo;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINEST", "Ljava/util/logging/Level;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInvokeDynamicInsn("get", "()Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "lambda$setProviders$0", "()Ljava/lang/String;", false), Type.getType("()Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/Throwable;Ljava/util/function/Supplier;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "sort", "(Ljava/util/Comparator;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "comparator", "Ljava/util/Comparator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "sort", "(Ljava/util/Comparator;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/Collection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "injectContextProxies", "([Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/util/Collection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "injectContextProxies", "([Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResponseExceptionMapper", "(Lorg/apache/cxf/message/Message;Ljava/lang/Class;)Ljava/util/List;", "(Lorg/apache/cxf/message/Message;Ljava/lang/Class<*>;)Ljava/util/List<Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/ProviderInfo", "getProvider", "()Ljava/lang/Object;", false), Type.getType("(Lorg/apache/cxf/jaxrs/model/ProviderInfo;)Lorg/eclipse/microprofile/rest/client/ext/ResponseExceptionMapper;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$ResponseExceptionMapperComparator", "<init>", "(Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "sorted", "(Ljava/util/Comparator;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsyncInvocationInterceptorFactories", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/cxf/jaxrs/model/ProviderInfo<Ljava/lang/Object;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearProviders", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/ProviderFactory", "clearProviders", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "responseExceptionMappers", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "asyncInvocationInterceptorFactories", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "(Lorg/apache/cxf/message/Message;)Ljavax/ws/rs/core/Configuration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getOutMessage", "()Lorg/apache/cxf/message/Message;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Configuration;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContextualProperty", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Configuration");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$setProviders$0", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("Caught ClassNotFoundException - expected if using MP Rest Client 1.0 APIs");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "CLIENT_FACTORY_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/microprofile/client/MicroProfileClientProviderFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/microprofile/client/MicroProfileClientProviderFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
