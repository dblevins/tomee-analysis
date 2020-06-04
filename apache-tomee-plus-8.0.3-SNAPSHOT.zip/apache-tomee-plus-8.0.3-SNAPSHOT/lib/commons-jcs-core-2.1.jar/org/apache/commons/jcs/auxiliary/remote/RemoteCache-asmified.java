package asm.org.apache.commons.jcs.auxiliary.remote;
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
public class RemoteCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache<TK;TV;>;", "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheListener;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor;)V", "(Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal<TK;TV;>;Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheListener<TK;TV;>;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRmiSocketFactoryTimeoutMillis", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteUtils", "configureGlobalCustomSocketFactory", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/IStats;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/Stats");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/Stats", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Remote Cache");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "setTypeName", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Remote Host:Port");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getIPAddressForService", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/stats/StatElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Remote Type");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRemoteTypeName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/stats/StatElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/IStats;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "getStatElements", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/stats/behavior/IStats", "setStatElements", "(Ljava/util/List;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setFacade", "(Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;)V", "(Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleException", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Disabling remote cache due to error: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "cacheName", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "logError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheService", "()Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheService", "()Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getZombieQueueMaxSize", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "setRemoteCacheService", "(Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "monitor", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheMonitor", "notifyError", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Initiating failover, rcnwf = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade", "getAuxiliaryCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRemoteType", "()Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType", "LOCAL", "Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitLdcInsn("Found facade, calling failover");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "facade", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade", "getPrimaryServer", "()Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade", "failover", "(Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/io/IOException");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/IOException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("RemoteCache: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "cacheName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" attributes = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventLoggingExtraInfo", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getIPAddressForService", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getIPAddressForService", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("(null)");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRemoteLocation", "()Lorg/apache/commons/jcs/auxiliary/remote/RemoteLocation;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "getRemoteCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRemoteLocation", "()Lorg/apache/commons/jcs/auxiliary/remote/RemoteLocation;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteLocation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/remote/RemoteCache;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
