package asm.org.apache.commons.jcs.access;
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
public class AbstractCacheAccessDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/jcs/access/AbstractCacheAccess", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/jcs/access/behavior/ICacheAccessManagement;", "java/lang/Object", new String[] { "org/apache/commons/jcs/access/behavior/ICacheAccessManagement" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cacheControl", "Lorg/apache/commons/jcs/engine/control/CompositeCache;", "Lorg/apache/commons/jcs/engine/control/CompositeCache<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", "(Lorg/apache/commons/jcs/engine/control/CompositeCache<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/access/AbstractCacheAccess", "cacheControl", "Lorg/apache/commons/jcs/engine/control/CompositeCache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "removeAll", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/exception/CacheException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/exception/CacheException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultElementAttributes", "(Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)V", null, new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "setElementAttributes", "(Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultElementAttributes", "()Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;", null, new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getElementAttributes", "()Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/ICacheStats;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getStatistics", "()Lorg/apache/commons/jcs/engine/stats/behavior/ICacheStats;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStats", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getStats", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "dispose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheAttributes", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getCacheAttributes", "()Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheAttributes", "(Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "setCacheAttributes", "(Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freeMemoryElements", "(I)I", null, new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/access/AbstractCacheAccess", "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCache", "getMemoryCache", "()Lorg/apache/commons/jcs/engine/memory/behavior/IMemoryCache;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/memory/behavior/IMemoryCache", "freeElements", "(I)I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/jcs/access/AbstractCacheAccess", Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn("Failure freeing memory elements.");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/exception/CacheException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/exception/CacheException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheControl", "()Lorg/apache/commons/jcs/engine/control/CompositeCache;", "()Lorg/apache/commons/jcs/engine/control/CompositeCache<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/access/AbstractCacheAccess", "cacheControl", "Lorg/apache/commons/jcs/engine/control/CompositeCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
