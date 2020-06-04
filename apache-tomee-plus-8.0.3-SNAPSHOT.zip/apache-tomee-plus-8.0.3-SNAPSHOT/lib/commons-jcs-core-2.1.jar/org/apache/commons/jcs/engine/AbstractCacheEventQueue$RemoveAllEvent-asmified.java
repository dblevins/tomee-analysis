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
public class AbstractCacheEventQueue$RemoveAllEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/engine/AbstractCacheEventQueue$RemoveAllEvent", "Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue<TK;TV;>.AbstractCacheEvent;", "org/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent", null);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/AbstractCacheEventQueue$RemoveAllEvent", "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "RemoveAllEvent", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent", "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "AbstractCacheEvent", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/AbstractCacheEventQueue$RemoveAllEvent", "this$0", "Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/AbstractCacheEventQueue$AbstractCacheEvent", "<init>", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doRun", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/AbstractCacheEventQueue$RemoveAllEvent", "this$0", "Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "access$300", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;)Lorg/apache/commons/jcs/engine/behavior/ICacheListener;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/engine/AbstractCacheEventQueue$RemoveAllEvent", "this$0", "Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/engine/AbstractCacheEventQueue", "access$400", "(Lorg/apache/commons/jcs/engine/AbstractCacheEventQueue;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/jcs/engine/behavior/ICacheListener", "handleRemoveAll", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("RemoveAllEvent");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
