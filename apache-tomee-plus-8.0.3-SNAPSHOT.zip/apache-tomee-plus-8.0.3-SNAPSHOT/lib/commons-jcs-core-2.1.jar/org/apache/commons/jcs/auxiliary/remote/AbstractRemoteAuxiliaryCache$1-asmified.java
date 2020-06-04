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
public class AbstractRemoteAuxiliaryCache$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitOuterClass("org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "getUsingPool", "(Ljava/lang/Object;)Lorg/apache/commons/jcs/engine/behavior/ICacheElement;");

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$key", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "this$0", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Lorg/apache/commons/jcs/engine/behavior/ICacheElement;", "()Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "this$0", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "getRemoteCacheService", "()Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "this$0", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "cacheName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "this$0", "Lorg/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache", "getListenerId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal", "get", "(Ljava/lang/String;Ljava/lang/Object;J)Lorg/apache/commons/jcs/engine/behavior/ICacheElement;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/remote/AbstractRemoteAuxiliaryCache$1", "call", "()Lorg/apache/commons/jcs/engine/behavior/ICacheElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
