package asm.org.apache.commons.jcs.auxiliary.remote.http.client;
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
public class RemoteHttpCacheFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", null, "org/apache/commons/jcs/auxiliary/AbstractAuxiliaryCacheFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/AbstractAuxiliaryCacheFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCache", "(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/AuxiliaryCache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/AuxiliaryCache<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType", "LOCAL", "Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "setRemoteType", "(Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpClientListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpClientListener", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "createRemoteHttpCacheClientForAttributes", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;)Lorg/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCache", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheListener;Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheClient", "setCacheEventLogger", "(Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;)V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheClient", "setElementSerializer", "(Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheClient;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait", "setCacheEventLogger", "(Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait", "setElementSerializer", "(Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createRemoteHttpCacheClientForAttributes", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;)Lorg/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient;", "<V:Ljava/lang/Object;K:Ljava/lang/Object;>(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;)Lorg/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getRemoteHttpClientClassName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/utils/config/OptionConverter", "instantiateByClassName", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Creating the default client for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes", "getCacheName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheClient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheClient", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/http/client/behavior/IRemoteHttpCacheClient", "initialize", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheAttributes;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/AbstractAuxiliaryCacheFactory", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor", "setDaemon", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor", "start", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor", "notifyShutdown", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitLdcInsn(new Long(5000L));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor", "join", "(J)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheMonitor;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/AbstractAuxiliaryCacheFactory", "dispose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/remote/http/client/RemoteHttpCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
