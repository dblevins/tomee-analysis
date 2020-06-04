package asm.org.apache.commons.jcs;
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
public class JCSDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/jcs/JCS", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "configFilename", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "configProps", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "defineRegion", "(Ljava/lang/String;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "defineRegion", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "defineRegion", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setConfigFilename", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "configFilename", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setConfigProperties", "(Ljava/util/Properties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "configProps", "Ljava/util/Properties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", null, new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/JCS;"));
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "isInitialized", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "configProps", "Ljava/util/Properties;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getUnconfiguredInstance", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "configProps", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "configure", "(Ljava/util/Properties;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "configFilename", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getUnconfiguredInstance", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "configFilename", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "configure", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getInstance", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/JCS", "cacheMgr", "Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/CacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/CacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/CacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/CacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getGroupCacheInstance", "(Ljava/lang/String;)Lorg/apache/commons/jcs/access/GroupCacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/jcs/access/GroupCacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/GroupCacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/GroupCacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getGroupCacheInstance", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/GroupCacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/access/GroupCacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/GroupCacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/GroupCacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getGroupCacheInstance", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/GroupCacheAccess;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/access/GroupCacheAccess<TK;TV;>;", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/JCS", "getCacheManager", "()Lorg/apache/commons/jcs/engine/control/CompositeCacheManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/control/CompositeCacheManager", "getCache", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/access/GroupCacheAccess");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/access/GroupCacheAccess", "<init>", "(Lorg/apache/commons/jcs/engine/control/CompositeCache;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "configFilename", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/JCS", "configProps", "Ljava/util/Properties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
