package asm.org.apache.commons.jcs.engine;
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
public class ZombieCacheWatchDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/engine/ZombieCacheWatch", null, "java/lang/Object", new String[] { "org/apache/commons/jcs/engine/behavior/ICacheObserver", "org/apache/commons/jcs/engine/behavior/IZombie" });

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addCacheListener", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICacheListener;)V", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addCacheListener", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;)V", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeCacheListener", "(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICacheListener;)V", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeCacheListener", "(Lorg/apache/commons/jcs/engine/behavior/ICacheListener;)V", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lorg/apache/commons/jcs/engine/behavior/ICacheListener<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
