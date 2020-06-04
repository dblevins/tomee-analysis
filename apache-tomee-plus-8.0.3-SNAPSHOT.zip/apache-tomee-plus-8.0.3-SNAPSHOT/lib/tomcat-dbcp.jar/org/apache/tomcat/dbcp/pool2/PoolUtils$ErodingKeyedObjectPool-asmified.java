package asm.org.apache.tomcat.dbcp.pool2;
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
public class PoolUtils$ErodingKeyedObjectPoolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool<TK;TV;>;", "java/lang/Object", new String[] { "org/apache/tomcat/dbcp/pool2/KeyedObjectPool" });

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor", "org/apache/tomcat/dbcp/pool2/PoolUtils", "ErodingFactor", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "org/apache/tomcat/dbcp/pool2/PoolUtils", "ErodingKeyedObjectPool", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "erodingFactor", "Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;F)V", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool<TK;TV;>;F)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(FLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor", "<init>", "(F)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;)V", "(Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool<TK;TV;>;Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("keyedPool must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "erodingFactor", "Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "borrowObject", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TV;", new String[] { "java/lang/Exception", "java/util/NoSuchElementException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "borrowObject", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(TK;TV;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/Exception");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "getErodingFactor", "(Ljava/lang/Object;)Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor", "getNextShrink", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCMP);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFGE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "getNumIdle", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFLE, label8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "java/lang/Object", "java/lang/Object", Opcodes.INTEGER, Opcodes.LONG, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor", "java/lang/Object", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor", "update", "(JI)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "invalidateObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "returnObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getErodingFactor", "(Ljava/lang/Object;)Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;", "(TK;)Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "erodingFactor", "Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invalidateObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(TK;TV;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "invalidateObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addObject", "(Ljava/lang/Object;)V", "(TK;)V", new String[] { "java/lang/Exception", "java/lang/IllegalStateException", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "addObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumIdle", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "getNumIdle", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumIdle", "(Ljava/lang/Object;)I", "(TK;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "getNumIdle", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumActive", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "getNumActive", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumActive", "(Ljava/lang/Object;)I", "(TK;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "getNumActive", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, new String[] { "java/lang/Exception", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "(Ljava/lang/Object;)V", "(TK;)V", new String[] { "java/lang/Exception", "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "clear", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/KeyedObjectPool", "close", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getKeyedPool", "()Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;", "()Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ErodingKeyedObjectPool{factor=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "erodingFactor", "Lorg/apache/tomcat/dbcp/pool2/PoolUtils$ErodingFactor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", keyedPool=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/PoolUtils$ErodingKeyedObjectPool", "keyedPool", "Lorg/apache/tomcat/dbcp/pool2/KeyedObjectPool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
