package asm.org.apache.commons.pool2;
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
public class PoolUtils$ErodingPerKeyKeyedObjectPoolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/pool2/PoolUtils$ErodingKeyedObjectPool<TK;TV;>;", "org/apache/commons/pool2/PoolUtils$ErodingKeyedObjectPool", null);

classWriter.visitInnerClass("org/apache/commons/pool2/PoolUtils$ErodingFactor", "org/apache/commons/pool2/PoolUtils", "ErodingFactor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "org/apache/commons/pool2/PoolUtils", "ErodingPerKeyKeyedObjectPool", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/pool2/PoolUtils$ErodingKeyedObjectPool", "org/apache/commons/pool2/PoolUtils", "ErodingKeyedObjectPool", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factor", "F", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factors", "Ljava/util/Map;", "Ljava/util/Map<TK;Lorg/apache/commons/pool2/PoolUtils$ErodingFactor;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/pool2/KeyedObjectPool;F)V", "(Lorg/apache/commons/pool2/KeyedObjectPool<TK;TV;>;F)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PoolUtils$ErodingKeyedObjectPool", "<init>", "(Lorg/apache/commons/pool2/KeyedObjectPool;Lorg/apache/commons/pool2/PoolUtils$ErodingFactor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "synchronizedMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factors", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(FLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factor", "F");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getErodingFactor", "(Ljava/lang/Object;)Lorg/apache/commons/pool2/PoolUtils$ErodingFactor;", "(TK;)Lorg/apache/commons/pool2/PoolUtils$ErodingFactor;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factors", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/pool2/PoolUtils$ErodingFactor");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PoolUtils$ErodingFactor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factor", "F");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PoolUtils$ErodingFactor", "<init>", "(F)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factors", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/pool2/PoolUtils$ErodingFactor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ErodingPerKeyKeyedObjectPool{factor=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "factor", "F");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(F)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", keyedPool=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/PoolUtils$ErodingPerKeyKeyedObjectPool", "getKeyedPool", "()Lorg/apache/commons/pool2/KeyedObjectPool;", false);
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
