package asm.org.apache.cxf.jaxrs.client.cache;
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
public class CacheControlClientRequestFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", null, "java/lang/Object", new String[] { "jakarta/ws/rs/client/ClientRequestFilter" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/Priority;", true);
annotationVisitor0.visit("value", new Integer(4999));
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NO_CACHE_PROPERTY", "Ljava/lang/String;", null, "no_client_cache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CACHED_ENTITY_PROPERTY", "Ljava/lang/String;", null, "client_cached_entity");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLIENT_ACCEPTS", "Ljava/lang/String;", null, "client_accepts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLIENT_CACHE_CONTROL", "Ljava/lang/String;", null, "client_cache_control");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cache", "Ljavax/cache/Cache;", "Ljavax/cache/Cache<Lorg/apache/cxf/jaxrs/client/cache/Key;Lorg/apache/cxf/jaxrs/client/cache/Entry;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/cache/Cache;)V", "(Ljavax/cache/Cache<Lorg/apache/cxf/jaxrs/client/cache/Key;Lorg/apache/cxf/jaxrs/client/cache/Entry;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", "cache", "Ljavax/cache/Cache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filter", "(Ljakarta/ws/rs/client/ClientRequestContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("GET");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getMethod", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("no_client_cache");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getUri", "()Ljava/net/URI;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Accept");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getHeaderString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/cache/Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/cache/Key", "<init>", "(Ljava/net/URI;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", "cache", "Ljavax/cache/Cache;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/Cache", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/client/cache/Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "isOutDated", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getCacheHeaders", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("If-None-Match");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getCacheHeaders", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("If-Modified-Since");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", "cache", "Ljavax/cache/Cache;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/cache/Cache", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", "jakarta/ws/rs/client/ClientRequestContext", "java/net/URI", "java/lang/String", "org/apache/cxf/jaxrs/client/cache/Key", "org/apache/cxf/jaxrs/client/cache/Entry", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", true);
methodVisitor.visitLdcInsn("If-None-Match");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/MultivaluedMap", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", true);
methodVisitor.visitLdcInsn("If-Modified-Since");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/MultivaluedMap", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("client_cached_entity");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getData", "()Ljava/io/Serializable;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getData", "()Ljava/io/Serializable;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "ok", "(Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/cache/Entry", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/MultivaluedMap", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/Object", "jakarta/ws/rs/core/Response$ResponseBuilder", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("client_cached_entity");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "abortWith", "(Ljakarta/ws/rs/core/Response;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("client_accepts");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("client_cache_control");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Cache-Control");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "getHeaderString", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/client/ClientRequestContext", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCache", "(Ljavax/cache/Cache;)Lorg/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter;", "(Ljavax/cache/Cache<Lorg/apache/cxf/jaxrs/client/cache/Key;Lorg/apache/cxf/jaxrs/client/cache/Entry;>;)Lorg/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/cache/CacheControlClientRequestFilter", "cache", "Ljavax/cache/Cache;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
