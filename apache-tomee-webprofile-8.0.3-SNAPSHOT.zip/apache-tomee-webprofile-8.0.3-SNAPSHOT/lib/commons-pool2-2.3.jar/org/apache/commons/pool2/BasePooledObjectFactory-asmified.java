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
public class BasePooledObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/pool2/BasePooledObjectFactory", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/pool2/PooledObjectFactory<TT;>;", "java/lang/Object", new String[] { "org/apache/commons/pool2/PooledObjectFactory" });

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "create", "()Ljava/lang/Object;", "()TT;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrap", "(Ljava/lang/Object;)Lorg/apache/commons/pool2/PooledObject;", "(TT;)Lorg/apache/commons/pool2/PooledObject<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "makeObject", "()Lorg/apache/commons/pool2/PooledObject;", "()Lorg/apache/commons/pool2/PooledObject<TT;>;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/BasePooledObjectFactory", "create", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/BasePooledObjectFactory", "wrap", "(Ljava/lang/Object;)Lorg/apache/commons/pool2/PooledObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroyObject", "(Lorg/apache/commons/pool2/PooledObject;)V", "(Lorg/apache/commons/pool2/PooledObject<TT;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateObject", "(Lorg/apache/commons/pool2/PooledObject;)Z", "(Lorg/apache/commons/pool2/PooledObject<TT;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "activateObject", "(Lorg/apache/commons/pool2/PooledObject;)V", "(Lorg/apache/commons/pool2/PooledObject<TT;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "passivateObject", "(Lorg/apache/commons/pool2/PooledObject;)V", "(Lorg/apache/commons/pool2/PooledObject<TT;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
