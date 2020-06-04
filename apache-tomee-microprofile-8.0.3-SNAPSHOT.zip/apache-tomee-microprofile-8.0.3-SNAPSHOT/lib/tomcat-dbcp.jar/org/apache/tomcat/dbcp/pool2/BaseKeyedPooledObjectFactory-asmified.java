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
public class BaseKeyedPooledObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/tomcat/dbcp/pool2/BaseKeyedPooledObjectFactory", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/tomcat/dbcp/pool2/BaseObject;Lorg/apache/tomcat/dbcp/pool2/KeyedPooledObjectFactory<TK;TV;>;", "org/apache/tomcat/dbcp/pool2/BaseObject", new String[] { "org/apache/tomcat/dbcp/pool2/KeyedPooledObjectFactory" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/BaseObject", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrap", "(Ljava/lang/Object;)Lorg/apache/tomcat/dbcp/pool2/PooledObject;", "(TV;)Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "makeObject", "(Ljava/lang/Object;)Lorg/apache/tomcat/dbcp/pool2/PooledObject;", "(TK;)Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/BaseKeyedPooledObjectFactory", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/BaseKeyedPooledObjectFactory", "wrap", "(Ljava/lang/Object;)Lorg/apache/tomcat/dbcp/pool2/PooledObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroyObject", "(Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(TK;Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateObject", "(Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/PooledObject;)Z", "(TK;Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "activateObject", "(Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(TK;Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "passivateObject", "(Ljava/lang/Object;Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(TK;Lorg/apache/tomcat/dbcp/pool2/PooledObject<TV;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
