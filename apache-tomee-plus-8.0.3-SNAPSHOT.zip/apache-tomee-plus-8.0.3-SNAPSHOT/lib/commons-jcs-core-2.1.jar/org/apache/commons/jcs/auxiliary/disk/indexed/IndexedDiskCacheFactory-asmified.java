package asm.org.apache.commons.jcs.auxiliary.disk.indexed;
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
public class IndexedDiskCacheFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory", null, "org/apache/commons/jcs/auxiliary/AbstractAuxiliaryCacheFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/commons/logging/Log;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCache", "(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheAttributes");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Creating DiskCache for attributes = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheAttributes"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "<init>", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "setCacheEventLogger", "(Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createCache", "(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/AuxiliaryCache;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory", "createCache", "(Lorg/apache/commons/jcs/auxiliary/AuxiliaryCacheAttributes;Lorg/apache/commons/jcs/engine/behavior/ICompositeCacheManager;Lorg/apache/commons/jcs/engine/logging/behavior/ICacheEventLogger;Lorg/apache/commons/jcs/engine/behavior/IElementSerializer;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCacheFactory", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
