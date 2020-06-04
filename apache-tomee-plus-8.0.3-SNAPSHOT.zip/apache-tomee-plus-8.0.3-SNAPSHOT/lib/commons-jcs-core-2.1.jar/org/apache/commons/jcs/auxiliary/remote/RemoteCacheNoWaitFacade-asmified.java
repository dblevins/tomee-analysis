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
public class RemoteCacheNoWaitFacadeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade<TK;TV;>;", "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cacheFactory", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;)V", "(Ljava/util/List<Lorg/apache/commons/jcs/engine/behavior/ICache<TK;TV;>;>;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade", "<init>", "(Ljava/util/List;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "cacheFactory", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "noWaits", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "java/util/List", "org/apache/commons/jcs/auxiliary/remote/RemoteCacheAttributes", "org/apache/commons/jcs/engine/behavior/ICompositeCacheManager", "org/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger", "org/apache/commons/jcs/engine/behavior/IElementSerializer", "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait", "getRemoteCache", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheClient;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/remote/RemoteCache");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCache", "setFacade", "(Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteCacheNoWaitFacade;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "noWaits", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "failover", "(Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait;)V", "(Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("in failover for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "getAuxiliaryCacheAttributes", "()Lorg/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/auxiliary/remote/behavior/IRemoteCacheAttributes", "getRemoteType", "()Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType", "LOCAL", "Lorg/apache/commons/jcs/auxiliary/remote/server/behavior/RemoteType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWait", "getStatus", "()Lorg/apache/commons/jcs/engine/CacheStatus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/CacheStatus", "ERROR", "Lorg/apache/commons/jcs/engine/CacheStatus;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFailoverRunner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "cacheFactory", "Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFailoverRunner", "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade;Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFailoverRunner", "setDaemon", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFailoverRunner", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheFailoverRunner", "notifyError", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "getCacheEventLogger", "()Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "getCacheEventLogger", "()Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;", false);
methodVisitor.visitLdcInsn("RemoteCacheNoWaitFacade");
methodVisitor.visitLdcInsn("InitiatedFailover");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" was in error.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger", "logApplicationEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isInfoEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitLdcInsn("The noWait is not in error");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/remote/RemoteCacheNoWaitFacade", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
