package asm.org.apache.tomcat.util.collections;
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
public class ManagedConcurrentWeakHashMap$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1", "Ljava/util/AbstractSet<Ljava/util/Map$Entry<TK;TV;>;>;", "java/util/AbstractSet", null);

classWriter.visitOuterClass("org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap", "entrySet", "()Ljava/util/Set;");

classWriter.visitInnerClass("org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1", null, null, 0);

classWriter.visitInnerClass("org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1", "this$0", "Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1", "this$0", "Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap", "access$000", "(Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;)Ljava/util/concurrent/ConcurrentMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "isEmpty", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1", "this$0", "Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap", "access$000", "(Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap;)Ljava/util/concurrent/ConcurrentMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1$1", "<init>", "(Lorg/apache/tomcat/util/collections/ManagedConcurrentWeakHashMap$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
