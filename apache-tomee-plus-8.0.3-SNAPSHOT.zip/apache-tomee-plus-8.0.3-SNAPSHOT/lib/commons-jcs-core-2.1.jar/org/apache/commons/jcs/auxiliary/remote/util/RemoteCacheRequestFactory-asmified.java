package asm.org.apache.commons.jcs.auxiliary.remote.util;
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
public class RemoteCacheRequestFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setCacheName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setRequestType", "(Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setRequesterId", "(J)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Created: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGetRequest", "(Ljava/lang/String;Ljava/lang/Object;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;TK;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "GET", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGetMatchingRequest", "(Ljava/lang/String;Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "GET_MATCHING", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setPattern", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGetMultipleRequest", "(Ljava/lang/String;Ljava/util/Set;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/util/Set<TK;>;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "GET_MULTIPLE", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setKeySet", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRemoveRequest", "(Ljava/lang/String;Ljava/lang/Object;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;TK;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "REMOVE", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createGetKeySetRequest", "(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "GET_KEYSET", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRemoveAllRequest", "(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "REMOVE_ALL", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createDisposeRequest", "(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "DISPOSE", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createUpdateRequest", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "UPDATE", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheElement", "getCacheName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setCacheName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setCacheElement", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheElement", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest", "setKey", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitLdcInsn("Can't create a proper update request for a null cache element.");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "error", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAliveCheckRequest", "(J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType", "ALIVE_CHECK", "Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "createRequest", "(Ljava/lang/String;Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteRequestType;J)Lorg/apache/commons/jcs/auxiliary/remote/value/RemoteCacheRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/remote/util/RemoteCacheRequestFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
