package asm.org.apache.openejb.core.managed;
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
public class CacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/core/managed/Cache", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/core/managed/Cache$CacheFilter", "org/apache/openejb/core/managed/Cache", "CacheFilter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/core/managed/Cache$CacheListener", "org/apache/openejb/core/managed/Cache", "CacheListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getListener", "()Lorg/apache/openejb/core/managed/Cache$CacheListener;", "()Lorg/apache/openejb/core/managed/Cache$CacheListener<TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setListener", "(Lorg/apache/openejb/core/managed/Cache$CacheListener;)V", "(Lorg/apache/openejb/core/managed/Cache$CacheListener<TV;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(TK;TV;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkOut", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkIn", "(Ljava/lang/Object;)V", "(TK;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TV;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeAll", "(Lorg/apache/openejb/core/managed/Cache$CacheFilter;)V", "(Lorg/apache/openejb/core/managed/Cache$CacheFilter<TV;>;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
